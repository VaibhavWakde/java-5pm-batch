package finleHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadOnlyDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/dell/workspace/java 5pm batch/java5pm/src/finleHandling/testReadOnly.txt";
        File file = new File(filePath);
        file.setReadOnly();

        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write("hello write in read only");
        fileWriter.close();
    }
}

package finleHandling;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/dell/workspace/java 5pm batch/java5pm/src/finleHandling/test1.txt";
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("This is a test file");
        bufferedWriter.close();

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int n= bufferedReader.read();
        while (n>0){
            System.out.print((char) n);
            n=bufferedReader.read();
        }
        bufferedReader.close();
    }
}

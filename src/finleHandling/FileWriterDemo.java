package finleHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/dell/workspace/java 5pm batch/java5pm/src/finleHandling/input1.txt";
        try{
            FileWriter fw = new FileWriter("/home/dell/workspace/java 5pm batch/java5pm/src/finleHandling/input1.txt");
            fw.write("Hello");
//            fw.write("\n Welcome to Java File handling");
            fw.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        FileReader fileReader = null;

        try{
            fileReader = new FileReader(fileName);
//            System.out.println(fileReader.read());
            int n = fileReader.read();
            while(n>0){
                System.out.print((char) n);
                n=fileReader.read();
//                System.out.println(n);
            }
            System.out.println();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            fileReader.close();
        }
    }
}

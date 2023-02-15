package finleHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String filePath = "/home/dell/workspace/java 5pm batch/java5pm/src/finleHandling/welcome.txt";
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            String msg = "welcome to java world !!!";
            byte[] arr = msg.getBytes();
            fos.write(arr);
            fos.close();

        }catch (IOException e ){
            System.out.println(e.getMessage());
        }


        try{
            FileInputStream fis = new FileInputStream(filePath);
            int n = fis.read();
            while (n>0){
                System.out.print((char) n);
                n= fis.read();
            }
            System.out.println();
            fis.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

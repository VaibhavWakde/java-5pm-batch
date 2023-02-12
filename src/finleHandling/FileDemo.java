package finleHandling;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("input1.txt");

        try {
            if(file.createNewFile()){
                System.out.println("File Created");
                System.out.println("file Name "+file.getName());
                System.out.println("Absolute Path "+file.getAbsolutePath());
                System.out.println("is file "+file.isFile());
                System.out.println("can read "+file.canRead());
                System.out.println("can write "+file.canWrite());
                System.out.println("can Execute "+file.canExecute());
                System.out.println("length "+file.length());
            }else {
                System.out.println("File Already exits");
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}

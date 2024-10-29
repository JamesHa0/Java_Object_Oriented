package java1029;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws InterruptedException, IOException {
//        File f = new File("D:/HomeWork/Fifth");
//        String[] arr = f.list();
//        for (String s: arr){
//            System.out.println(s);
//        }
//        File[] files = f.listFiles();
//        for(File tmp : files){
//            System.out.println(tmp.getName() + "是一个" + (tmp.isFile()? "文件":"目录"));
//        }

        FileInputStream fis = null;

        fis = new FileInputStream("D:/Desktop/1.c");
        try{
            int b = fis.read();
            while (b != -1){
                char a = (char) b;
                System.out.print(a);
                b = fis.read();
            }
        }catch (FileNotFoundException e){
            throw new FileNotFoundException();
        }finally {
            fis.close();
        }

    }
}

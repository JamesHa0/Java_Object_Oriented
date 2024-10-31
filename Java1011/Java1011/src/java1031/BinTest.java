package java1031;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BinTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            Person p = new Person("James",20);
            File f = new File("D:/Desktop/test.txt");
            fos = new FileOutputStream( f );
            oos = new ObjectOutputStream(fos);
            System.out.println("开始序列化对象");
            oos.writeObject(p);
            oos.flush();
            fos.flush();
            System.out.println("序列化对象结束");

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fos != null){
                fos.close();
            }
        }
    }
}

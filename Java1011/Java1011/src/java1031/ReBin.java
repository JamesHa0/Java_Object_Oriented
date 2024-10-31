package java1031;

import java.io.*;

public class ReBin {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = null;

        fis = new FileInputStream("D:/Desktop/test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object o =ois.readObject();
        Person p = (Person) o;
        p.show();

    }
}

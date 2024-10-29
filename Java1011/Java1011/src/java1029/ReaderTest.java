package java1029;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        Reader reader = null;
        try {
            reader = new FileReader("D:/Desktop/1.c");
            char[] buf = new char[5];
            int num = reader.read(buf);
            while (num != -1) {
                System.out.print(buf);
                num = reader.read(buf);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                reader.close();
                System.out.println("字符流已关闭");
            }
        }
    }
}

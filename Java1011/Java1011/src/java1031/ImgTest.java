package java1031;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class ImgTest {

    public static String newFileName (File f,String destPath){
        Date d = new Date();
        long time = d.getTime();
        int pos = f.getName().lastIndexOf(".");//获取文件的扩展名
        String lastName = "";
        if(pos != -1){
            lastName = f.getName().substring(pos);
        }
        String newFileName = destPath+File.separatorChar+time+lastName;
        System.out.println("目标文件名是："+newFileName);
        return newFileName;
    }
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        File f = new File("D:/Picture/Bliss.jpg");
        try {
            fis = new FileInputStream("D:/Picture/Bliss.jpg");
            String newfilename = ImgTest.newFileName(f,"D:/Desktop");
            fos = new FileOutputStream( newfilename );
            byte[] arr = new byte[1024];
//            int avalable = 0;
            int count = 0;
//            do{
//                fos.write(arr);
//                avalable = fis.available();
//                if(avalable >= arr.length){
//                    count = fis.read(arr);
//                }else {
//                    arr = new byte[avalable];
//                    count = fis.read(arr);
//                }
//                fos.write(arr);
//            }while(count != -1 && avalable > 0);
            while ((count = fis.read(arr))!= -1) {  // 这里修改为使用 read 方法的返回值作为判断条件
                fos.write(arr, 0, count);  // 确保只写入实际读取到的字节数
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
}

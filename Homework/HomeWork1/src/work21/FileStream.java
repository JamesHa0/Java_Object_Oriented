package work21;

import java.io.*;
import java.util.Date;

public class FileStream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("D:\\Homework\\Fifth\\JavaOO\\Homework\\HomeWork1\\src\\work21\\Demo1.txt");
            br = new BufferedReader(fr);
            fw = new FileWriter("D:\\Homework\\Fifth\\JavaOO\\Homework\\HomeWork1\\src\\work21\\Test.txt",true);
            bw = new BufferedWriter(fw);
            //先写入Demo1.txt的内容
            while(true){
                String str = br.readLine();
                if(str != null){
                    bw.write(str);
                }else {
                    break;
                }
            }
            bw.newLine();
            bw.flush();
            //再写入Demo2.txt的内容
            fr = new FileReader("D:\\Homework\\Fifth\\JavaOO\\Homework\\HomeWork1\\src\\work21\\Demo2.txt");
            br = new BufferedReader(fr);
            while(true){
                String str = br.readLine();
                if(str != null){
                    bw.write(str);
                }else {
                    break;
                }
            }
            bw.newLine();
            bw.flush();
        }catch (FileNotFoundException e ){
            throw new RuntimeException(e);
        }finally {
            if(fr != null){
                fr.close();
            }
            if (br != null){
                br.close();
            }
            if (fw != null){
                fw.close();
            }
            if (bw != null){
                bw.close();
            }
        }
    }
}

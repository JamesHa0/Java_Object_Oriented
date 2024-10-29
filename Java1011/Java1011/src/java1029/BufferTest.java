package java1029;

import java.io.*;

public class BufferTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
//        BufferedWriter bw = null;
        FileReader fr = null;
//        FileWriter fw = null;
        try{
            fr = new FileReader("D:/Desktop/1.c");
            br = new BufferedReader(fr);
//            fw = new FileWriter("D:/Desktop/1.c",true);
//            bw = new BufferedWriter(fw);

//            bw.write("test");
//            bw.newLine();
//            bw.write("test111");
//            bw.flush();

            while(true){
                String str = br.readLine();
                if(str != null){
                    System.out.println(str);
                }else {
                    break;
                }
            }
        }catch (FileNotFoundException e ){
            throw new RuntimeException(e);
        }finally {
            if(fr != null){
                fr.close();
            }
            if (br != null){
                br.close();
            }
//            if (fw != null){
//                fw.close();
//            }
//            if (bw != null){
//                bw.close();
//            }
        }
    }
}

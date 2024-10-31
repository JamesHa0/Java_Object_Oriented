package work21;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timer {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        while(true){
            Date date = new Date();
            String time = sdf.format(date);
            System.out.println(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

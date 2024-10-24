package work18;

import java.util.Scanner;

public class work18 {
    public static void main(String[] args) {



        //(2)
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int input1 = scanner.nextInt();
        String str1 = ""+input1;
        StringBuilder sb1 = new StringBuilder(str1);
        String re1 = sb1.reverse().toString();
        if(str1.equals(re1)){
            System.out.println(str1+"是回文");
        }else {
            System.out.println(str1+"不是回文");
        }


    }
}

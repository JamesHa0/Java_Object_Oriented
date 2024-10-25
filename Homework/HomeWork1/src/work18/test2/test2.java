package work18.test2;
//题目2：有一种数叫回文数，正读和反读都一样，如12321便是一个回文数。编写一个程序，从命令行得到一个整数，判断该数是不是回文数。
import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int input = scanner.nextInt();
        String str = ""+input;
        StringBuilder sb = new StringBuilder(str);
        String re = sb.reverse().toString();
        if(str.equals(re)){
            System.out.println(str+"是回文");
        }else {
            System.out.println(str+"不是回文");
        }
    }
}

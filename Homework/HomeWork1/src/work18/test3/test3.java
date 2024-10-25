package work18.test3;
//题目3：分别在控制台输入字符串和子字符串，并计算字符串中子字符串出现的次数。
import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个字符串：");
        String str = scanner.nextLine();
        System.out.print("输入子字符串：");
        String substr = scanner.nextLine();
        int res = 0;
        int index = str.indexOf(substr);
        while(index != -1){
            res ++ ;
            index = str.indexOf(substr,index+substr.length());
        }
        System.out.println(str+"中"+substr+"出现了"+res+"次");

    }
}

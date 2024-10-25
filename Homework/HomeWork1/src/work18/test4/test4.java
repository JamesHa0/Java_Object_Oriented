package work18.test4;

import java.util.HashMap;
import java.util.Scanner;

//题目4：有一个字符串，其中包含英文字符和数字字符，请统计和打印出各个字符的个数
public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个字符串:");
        String str = scanner.nextLine();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : str.toCharArray()){
            if(map.get(c) == null){
                map.put(c,1);
            }else {
                map.put(c,map.get(c)+1);
            }
        }
        map.forEach((key,value) -> System.out.println(key+":"+value));
    }
}

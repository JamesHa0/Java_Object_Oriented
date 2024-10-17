import java.util.Scanner;

public class HomeWork1 {
    public static void main (String args[]){

        //1)

        Scanner scanner = new Scanner(System.in);
        System.out.println("（1）");
        System.out.print("请输入一个0~1000的整数：");
        int input1 = scanner.nextInt();

        int ans1 = 0;
        while(input1 > 0){
            ans1 += input1 % 10;
            input1 /= 10;
        }
        System.out.println("各位数的和为："+ans1);



        //2)
        System.out.println("（2）");
        System.out.print("请输入华氏度的值：");
        float input2 = scanner.nextFloat();
        float ans2 = (input2-32)*5/9;
        System.out.println("转换为摄氏度的值为："+ans2);

        System.out.print("请输入摄氏度的值：");
        float input3 = scanner.nextFloat();
        float ans3 = input3*9/5+32;
        System.out.println("转换为华氏度的值为："+ans3);


        //3)
        System.out.println("（3）");
        System.out.print("请输入一个任意的大写字母A~Z：");
        char input4 = scanner.next().charAt(0);
        char ans4 = (char)(input4+32);
        System.out.println("转换为小写字母为："+ans4);

    }

}

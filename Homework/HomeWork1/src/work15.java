import java.util.Scanner;

public class work15 {
    public static void main(String[] args) {
        //1阶乘
        Scanner scanner = new Scanner(System.in);

        System.out.print("1.输入一个整数:");
        int input1 = scanner.nextInt();
        int ans1 = 1;
        for (int i = 1 ; i <= input1 ; i ++){
            ans1 *= i;
        }
        System.out.println(input1 + "的阶乘是：" + ans1);


        //2闰年
        System.out.print("2.输入一个年份：");
        int input2 = scanner.nextInt();
        if (input2 % 4 == 0 && input2 % 100 != 0 || input2 % 400 == 0){
            System.out.println(input2+"年是闰年");
        }else {
            System.out.println(input2+"年是平年");
        }



        //3质数
        for (int i = 201 ;; i++){
            boolean flag3 = true;
            for (int j = 2 ; j < i ; j++){
                if (i % j == 0){
                    flag3 = false;
                    break;
                }
            }
            if (flag3){
                System.out.println("3.大于200的最小的质数："+i);
                break;
            }
        }



        //4冒泡排序
        int[] arr4 = {2,54,3,42,10,34,75,32,13,5};

        System.out.println("4.冒泡排序：");
        System.out.println("原数组：");
        for(int i = 0 ; i < arr4.length ;i++){
            System.out.print(arr4[i]+" ");
        }
        System.out.println();


        for(int i = 0;i < arr4.length-2;i++){
            boolean flag4 = true;
            for (int j = 0 ; j < arr4.length-1-i;j++){
                if(arr4[j] > arr4[j+1]){
                    int temp = arr4[j];
                    arr4[j] = arr4[j+1];
                    arr4[j+1] = temp;
                    flag4 = false;
                }
            }
            if(flag4){
                break;
            }
        }

        System.out.println("排序后数组：");
        for(int i = 0 ; i < arr4.length ;i++){
            System.out.print(arr4[i]+" ");
        }
        System.out.println();


        //5.abs()
        System.out.print("5.输入一个整数：");
        int input5 = scanner.nextInt();
        System.out.println("这个整数的绝对值："+abs(input5));
        System.out.print("输入一个小数：");
        double input6 = scanner.nextDouble();
        System.out.println("这个小数的绝对值："+abs(input6));
    }
        public static int abs (int a) {
            return a >= 0 ? a : -a;
        }

        public static double abs (double a) {
            return  a >= 0 ? a : -a;
        }


}

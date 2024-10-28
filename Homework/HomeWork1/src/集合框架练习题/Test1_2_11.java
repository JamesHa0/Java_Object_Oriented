package 集合框架练习题;
//1.从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
// 如果该年没有举办世界杯，则输出：没有举办世界杯。
//2. 读入一支球队的名字，输出该球队夺冠的年份列表。
//例如，读入“巴西”，应当输出
//1958 1962 1970 1994 2002
//读入“荷兰”，应当输出
//没有获得过世界杯
import java.util.HashMap;
import java.util.Scanner;

public class Test1_2_11 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1 = new HashMap();
        hm1.put(1930, "乌拉圭");
        hm1.put(1934, "意大利");
        hm1.put(1938, "意大利");
        hm1.put(1950, "乌拉圭");
        hm1.put(1954, "联邦德国");
        hm1.put(1958, "巴西");
        hm1.put(1962, "巴西");
        hm1.put(1966, "英格兰");
        hm1.put(1970, "巴西");
        hm1.put(1974, "联邦德国");
        hm1.put(1978, "阿根廷");
        hm1.put(1982, "意大利");
        hm1.put(1986, "阿根廷");
        hm1.put(1990, "联邦德国");
        hm1.put(1994, "巴西");
        hm1.put(1998, "法国");
        hm1.put(2002, "巴西");
        hm1.put(2006, "意大利");
        hm1.put(2010, "西班牙");
        hm1.put(2014, "德国");
        hm1.put(2018, "法国");
        hm1.put(2022, "阿根廷");
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入年份查询：");
        int year = scanner.nextInt();
        scanner.nextLine();
        if (hm1.containsKey(year)){
            System.out.println(year+"年的世界杯冠军是："+hm1.get(year));
        }else {
            System.out.println("该年没有举办世界杯");
        }

        System.out.print("输入球队查询：");
        String team = scanner.nextLine();
        boolean found = false;
        for(int years : hm1.keySet()){
            if(hm1.get(years).equals(team)){
                System.out.print(years+" ");
                found = true;
            }
        }
        if (!found){
            System.out.println("没有获得过世界杯");
        }
    }
}

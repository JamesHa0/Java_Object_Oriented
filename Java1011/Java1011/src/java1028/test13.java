package java1028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//假设有一个学生分数管理系统，每个学生有一个唯一的ID，以及对应的分数。
//请使用Java中的Map集合来存储和管理这些信息。要求实现以下功能：
//1. 添加学生分数信息。
//2. 查询学生分数信息。
//3. 删除学生分数信息。
//4. 遍历并打印所有学生分数信息。
public class test13 {
    static HashMap<Integer, Integer> scoreManage = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------学生分数管理系统---------");
        System.out.println("1. 添加学生分数信息");
        System.out.println("2. 查询学生分数信息");
        System.out.println("3. 删除学生分数信息");
        System.out.println("4. 遍历并打印所有学生分数信息");
        System.out.println("0. 退出");
        int input = -1;
        while (input != 0) {
            System.out.print("-------请选择操作：");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    addScore();
                    break;
                case 2:
                    queryScore();
                    break;
                case 3:
                    deleteScore();
                    break;
                case 4:
                    printScore();
                    break;
                case 0:
                    System.out.println("已退出");
                    break;
                default:
                    System.out.println("请输入正确的数字");
            }
        }
        scanner.close();
    }

    public static void addScore() {
        System.out.print("输入要添加成绩的学生学号：");
        int sid = scanner.nextInt();
        System.out.print("输入分数：");
        int score = scanner.nextInt();
        scoreManage.put(sid,score);
        System.out.println("学生成绩已添加");
    }

    public static void queryScore() {
        System.out.print("输入要查询成绩的学生学号：");
        int sid = scanner.nextInt();
        if(scoreManage.containsKey(sid)){
            System.out.println("该学生的分数为"+scoreManage.get(sid));
        }else {
            System.out.println("成绩未找到");
        }
    }

    public static void deleteScore() {
        System.out.print("输入要删除成绩的学生学号：");
        int sid = scanner.nextInt();
        scoreManage.remove(sid);
        System.out.println("学生成绩已删除");
    }

    public static void printScore() {
        Set<Map.Entry<Integer,Integer>> entrySet = scoreManage.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            System.out.println("学号："+entry.getKey()+"，分数："+entry.getValue());
        }
    }
}

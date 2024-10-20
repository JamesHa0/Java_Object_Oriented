package work16.test3;

public class Student {
    private String id;
    private String name;
    private String gender;
    private int age;

    public Student(String id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public double getScore(){
        return 0;
    }

    @Override
    public String toString() {
        return  "学号：" + id +
                "姓名：" + name +
                "性别：" + gender +
                "年龄" + age +
                "综合成绩：" + getScore();
    }
}

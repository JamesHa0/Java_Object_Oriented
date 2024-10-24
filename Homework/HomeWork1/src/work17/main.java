package work17;

public class main {
    public static void main(String[] args) {
        String[] hobby1 = {"123", "abc"};
        String[] hobby2 = {"abc", "123"};
        String[] hobby3 = {"abc", "321"};
        Student s1 = new Student("1", "1", hobby1);
        Student s2 = new Student("1", "1", hobby2);
        Student s3 = new Student("1", "1", hobby3);

        System.out.println("输出目标应为：true,false,false");
        System.out.println("s1 ? s2 :" + s1.equals(s2));
        System.out.println("s1 ? s3 :" + s1.equals(s3));
        System.out.println("s2 ? s3 :" + s2.equals(s3));

    }
}

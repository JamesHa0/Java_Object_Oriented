package work16.test3;

public class Student {
    private String studentId;
    private String name;
    private char gender;
    private int age;

    public Student(String studentId, String name, char gender, int age) {
        this.studentId = studentId;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getComprehensiveScore() {
        return 0;
    }

    @Override
    public String toString() {
        return "学号:" + studentId + " 姓名：" + name + " 性别：" + gender + " 年龄：" + age + " 综合成绩：" + getComprehensiveScore();
    }
}

class EnglishDepartmentStudent extends Student {
    private double speechScore;
    private double midtermScore;
    private double finalExamScore;

    public EnglishDepartmentStudent(String studentId, String name, char gender, int age, double speechScore, double midtermScore, double finalExamScore) {
        super(studentId, name, gender, age);
        this.speechScore = speechScore;
        this.midtermScore = midtermScore;
        this.finalExamScore = finalExamScore;
    }

    @Override
    public double getComprehensiveScore() {
        return speechScore * 0.5 + midtermScore * 0.25 + finalExamScore * 0.25;
    }
}

class ComputerDepartmentStudent extends Student {
    private double operationAbilityScore;
    private double englishWritingScore;
    private double midtermScore;
    private double finalExamScore;

    public ComputerDepartmentStudent(String studentId, String name, char gender, int age, double operationAbilityScore, double englishWritingScore, double midtermScore, double finalExamScore) {
        super(studentId, name, gender, age);
        this.operationAbilityScore = operationAbilityScore;
        this.englishWritingScore = englishWritingScore;
        this.midtermScore = midtermScore;
        this.finalExamScore = finalExamScore;
    }

    @Override
    public double getComprehensiveScore() {
        return operationAbilityScore * 0.4 + englishWritingScore * 0.2 + midtermScore * 0.2 + finalExamScore * 0.2;
    }
}

class LiteratureDepartmentStudent extends Student {
    private double speechScore;
    private double workScore;
    private double midtermScore;
    private double finalExamScore;

    public LiteratureDepartmentStudent(String studentId, String name, char gender, int age, double speechScore, double workScore, double midtermScore, double finalExamScore) {
        super(studentId, name, gender, age);
        this.speechScore = speechScore;
        this.workScore = workScore;
        this.midtermScore = midtermScore;
        this.finalExamScore = finalExamScore;
    }

    @Override
    public double getComprehensiveScore() {
        return speechScore * 0.35 + workScore * 0.35 + midtermScore * 0.15 + finalExamScore * 0.15;
    }
}


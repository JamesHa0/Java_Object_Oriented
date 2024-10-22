package work16.test3;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            int randomDepartment = (int) (Math.random() * 3);
            String studentId = generateRandomStudentId();
            String name = generateRandomName();
            char gender = generateRandomGender();
            int age = generateRandomAge();
            switch (randomDepartment) {
                case 0:
                    double speechScoreEnglish = generateRandomScore();
                    double midtermScoreEnglish = generateRandomScore();
                    double finalExamScoreEnglish = generateRandomScore();
                    students[i] = new EnglishDepartmentStudent(studentId, name, gender, age, speechScoreEnglish, midtermScoreEnglish, finalExamScoreEnglish);
                    break;
                case 1:
                    double operationAbilityScoreComputer = generateRandomScore();
                    double englishWritingScoreComputer = generateRandomScore();
                    double midtermScoreComputer = generateRandomScore();
                    double finalExamScoreComputer = generateRandomScore();
                    students[i] = new ComputerDepartmentStudent(studentId, name, gender, age, operationAbilityScoreComputer, englishWritingScoreComputer, midtermScoreComputer, finalExamScoreComputer);
                    break;
                case 2:
                    double speechScoreLiterature = generateRandomScore();
                    double workScoreLiterature = generateRandomScore();
                    double midtermScoreLiterature = generateRandomScore();
                    double finalExamScoreLiterature = generateRandomScore();
                    students[i] = new LiteratureDepartmentStudent(studentId, name, gender, age, speechScoreLiterature, workScoreLiterature, midtermScoreLiterature, finalExamScoreLiterature);
                    break;
            }
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static String generateRandomStudentId() {
        return "ID" + (int) (Math.random() * 10000);
    }

    private static String generateRandomName() {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        return names[(int) (Math.random() * names.length)];
    }

    private static char generateRandomGender() {
        return Math.random() < 0.5? 'M' : 'F';
    }

    private static int generateRandomAge() {
        return (int) (Math.random() * 20) + 18;
    }

    private static double generateRandomScore() {
        return Math.random() * 100;
    }
}

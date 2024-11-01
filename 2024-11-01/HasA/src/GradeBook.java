import java.util.Scanner;

public class GradeBook {
    private String courseName;
    private Student[] students;
    private double[] grades;
    private int numberOfStudents;

    public  GradeBook(String courseName, Student[] students, int numberOfStudents) {
        this.courseName = courseName;
        this.students = students;
        this.numberOfStudents = numberOfStudents;
        this.grades = new double[numberOfStudents];
        displayMessage();
    }

    public void displayMessage() {
        System.out.printf("歡迎使用 %s 成績系統\n", courseName);
    }

    public void processStudentGrades() {
        Scanner input = new Scanner(System.in);
        System.out.println("輸入學生成績：");
        for (int i = 0; i <numberOfStudents; i++) {
            students[i].printData();
            System.out.print(" 的成績：");
            grades[i] = input.nextDouble();
        }
    }

    public double getMaximum() {
        double max = grades[0];
        for (int i = 1; i< numberOfStudents; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    public double getMinimum() {
        double min = grades[0];
        for (int i = 1; i< numberOfStudents; i++) {
            if (grades[i] > min) {
                min = grades[i];
            }
        }
        return min;
    }

    public double getAverage() {
        double sum = 0;
        for (int i = 1; i< numberOfStudents; i++) {
            sum += grades[i];
        }
        return sum / numberOfStudents;
    }
}

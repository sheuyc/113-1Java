public class GradeBookTest {
    public static void main(String[] args) {
        final  int NUMBER_OF_STUDENTS = 3;
        Student[] students = new Student[NUMBER_OF_STUDENTS];
        students[0] = new Student("A112221009","吳其隆");
        students[1] = new Student("A112221010","陳宏銘");
        students[2] = new Student("A112221011","林志玲");
        GradeBook gradeBook = new GradeBook("Java程式設計", students, NUMBER_OF_STUDENTS);
        gradeBook.processStudentGrades();
        gradeBook.displayGradeReport();
    }
}

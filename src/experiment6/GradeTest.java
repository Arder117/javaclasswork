package experiment6;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        System.out.print("输入成绩：");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        Grade grade = new Grade(score);
        try {
            grade.show();
        } catch (FailureException e) {
            System.out.print(e.toString());
        }
    }
}

package experiment2;

import java.util.Scanner;

public class DayTest {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个日期，格式为yyyy-mm-dd");
        System.out.print("请输入第一个日期：");
        String s1 = scanner.nextLine();
        System.out.print("请输入第二个日期：");
        String s2 = scanner.nextLine();
        Day day = new Day(s1, s2);
        day.compare();
    }
}

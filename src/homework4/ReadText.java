// 题目：
//（1）进入程序，首先要求用户输入密码java123，输入正确将读取当前目录下score.txt文本文件。连续三次输入密码不正确程序立刻退出；
//（3）声明Student类，包含name，score1，score2，avgscore属性，将读取到的姓名、成绩依次存入Student类的对象中，并计算每位学生的平均成绩；
//（4）对Student类的对象实现序列化与反序列化。

package homework4;

import java.io.*;
import java.util.Scanner;

public class ReadText {
    static String filename;

    public ReadText(String file) {
        filename = file;
    }

    public static void login() {
        //输入密码, 三次机会
        Scanner sc = new Scanner(System.in);
        String password = "java123";
        String input;
        int count = 0;
        while (count < 3) {
            System.out.print("Please input the password:");
            input = sc.nextLine();
            if (input.equals(password)) {
                break;
            } else {
                count++;
            }
        }
        if (count == 3) {
            System.out.println("You have tried 3 times. Program exits.");
            System.exit(0);
        }
        sc.close();
    }

    public static void read(Student[] students) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/homework4/" + filename));
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("[：，。]");
                students[i++] = new Student(data[1], Integer.parseInt(data[3]), Integer.parseInt(data[5]));
                System.out.println(students[i - 1]);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("IO Exception.");
        }
    }

}

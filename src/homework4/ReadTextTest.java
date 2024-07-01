package homework4;

import java.io.*;

public class ReadTextTest {
    public static void main(String[] args) {
        ReadText rt = new ReadText("score.txt");
        ReadText.login();
        Student[] students = new Student[10];
        ReadText.read(students);

        //序列化
        System.out.println("开始序列化");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("src/homework4/students.txt")));
            for (Student student : students) {
                oos.writeObject(student);
            }
            oos.close();
            System.out.println("对象序列化成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //反序列化
        System.out.println("开始反序列化");
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("src/homework4/students.txt")));
            Student student;
            while ((student = (Student) ois.readObject()) != null) {
                System.out.println(student);
            }
            ois.close();
            System.out.println("对象反序列化成功");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

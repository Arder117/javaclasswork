package homework4;

import java.io.*;

public class Student implements Serializable {
    String name;
    int score1;
    int score2;
    double avgscore;

    public Student(String name, int score1, int score2) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.avgscore = (double) (score1 + score2) / 2;
    }

    public String toString() {
        return "Name: " + name + ", Score1: " + score1 + ", Score2: " + score2 + ", Average Score: " + avgscore;
    }
}

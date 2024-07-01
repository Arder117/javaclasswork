//1. 在D盘根目录创建文本文件Hello.txt，并往里写入若干行文本。从Hello.txt中读取文本并显示在屏幕上。

package experiment7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args) {
        String filename = "Hello.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader("F:/" + filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("IO Exception.");
        }
    }
}

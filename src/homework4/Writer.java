// 题目：分别使用FileWriter和BufferedWriter往文件中写入10万个随机数，比较用时的多少

package homework4;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writer {
    public static void main(String[] args) {
        // 10万个随机数
        int n = 100000;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        // FileWriter
        long startTime = System.currentTimeMillis();
        try {
            FileWriter fileWriter = new FileWriter("random.txt");
            for (int i = 0; i < n; i++) {
                fileWriter.write(nums[i] + " ");
            }
            fileWriter.close();
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("FileWriter: " + (endTime - startTime) + "ms");

        // BufferedWriter
        startTime = System.currentTimeMillis();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("random.txt"));
            for (int i = 0; i < n; i++) {
                bufferedWriter.write(nums[i] + " ");
            }
            bufferedWriter.close();
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
        endTime = System.currentTimeMillis();
        System.out.println("BufferedWriter: " + (endTime - startTime) + "ms");
    }
}

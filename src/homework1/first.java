//题目：一个数如果恰好等于它的因子之和，这个数就称为“完数”。编写一个Java程序，求1000之内的所有完数
package homework1;

public class first {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}

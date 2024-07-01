//题目：编写一个Java程序，实现两个30位以内的大整数加法。
//提示：用数组存放大整数

package homework1;

public class third {
    public static void main(String[] args) {
        System.out.printf("输入大整数a: ");
        String a = System.console().readLine();
        System.out.printf("输入大整数b: ");
        String b = System.console().readLine();
        System.out.println("a + b = " + add(a, b));
    }

    private static String add(String a, String b) {
        int[] result = new int[30];
        int[] aArray = new int[30];
        int[] bArray = new int[30];
        int[] aArrayReverse = new int[30];
        int[] bArrayReverse = new int[30];
        int[] resultReverse = new int[30];
        int carry = 0;
        int i = 0;
        for (char c : a.toCharArray()) {
            aArray[i] = c - '0';
            i++;
        }
        i = 0;
        for (char c : b.toCharArray()) {
            bArray[i] = c - '0';
            i++;
        }
        for (int j = 0; j < 30; j++) {
            aArrayReverse[j] = aArray[29 - j];
            bArrayReverse[j] = bArray[29 - j];
        }
        for (int j = 0; j < 30; j++) {
            resultReverse[j] = aArrayReverse[j] + bArrayReverse[j] + carry;
            carry = resultReverse[j] / 10;
            resultReverse[j] %= 10;
        }
        for (int j = 0; j < 30; j++) {
            result[j] = resultReverse[29 - j];
        }
        StringBuilder resultString = new StringBuilder();
        for (int j = 0; j < 30; j++) {
            resultString.append(result[j]);
        }
        return resultString.toString();
    }
}

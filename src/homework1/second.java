//题目：编写一个Java程序，在主类的main方法中实现以下功能：
//1）程序随机分配给用户一个1-100之间的整数
//2）用户输入自己的猜测
//3）程序返回提示信息：“猜大了”、“猜小了”或“猜对了”
//4）用户根据提示信息再次输入猜测，直到猜对为止。
//输出样例：
//给你一个1到100之间的整数，请猜测这个数...
// 输入你的猜测：50
//猜大了，再输入你的猜测：25
//猜对了！

package homework1;

public class second {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;
        int guess = 0;
        System.out.println("给你一个1到100之间的整数，请猜测这个数...");
        System.out.print("输入你的猜测：");
        while (true) {
            guess = new java.util.Scanner(System.in).nextInt();
            if (guess > num) {
                System.out.print("猜大了，再输入你的猜测：");
            } else if (guess < num) {
                System.out.print("猜小了，再输入你的猜测：");
            } else {
                System.out.print("猜对了！");
                break;
            }
        }
    }
}

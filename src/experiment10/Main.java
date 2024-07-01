// 编写线程程序，在新线程中完成计算某个整数的阶乘。分别用Thread类和Runnable接口实现

package experiment10;

public class Main {
    public static void main(String[] args) {
        System.out.println("主进程开始");
        FactorialThread ft = new FactorialThread(5);
        ft.start();
        RunnableThread rt = new RunnableThread(4);
        new Thread(rt).start();
        System.out.println("主进程结束");
    }
}





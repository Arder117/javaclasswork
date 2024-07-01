package experiment10;

public class RunnableThread implements Runnable {
    int num;

    public RunnableThread(int i) {
        this.num = i;
    }

    @Override
    public void run() {
        System.out.println("新线程开始");
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println(num + "的阶乘是：" + result);
        System.out.println("新线程结束");
    }
}

// 1. 用两个线程模拟存票、售票过程。
// 假定开始售票处并没有票，一个线程往里存票，另外一个线程则往外卖票,新建一个票类对象，让存票和售票线程都访问它。
// 本例采用两个线程共享,同一个数据对象来实现对同一份数据的操作

package experiment11;

public class tickets extends Thread implements Runnable {
    int size; // 总票数
    int number = 0; // 当前票数
    int i = 0; // 票号
    int j;
    boolean available = false;

    public tickets(int size) {
        this.size = size;
    }

    public synchronized void produceTicket() {
        if (number <= size) {
            System.out.println("产票成功，产出票号：" + ++j + "; " + "当前票数为：" + ++number);
        }
        available = true;
    }

    public synchronized void sellTicket() {
        if (available && number > 0) {
            System.out.println("售票成功，卖出票号：" + ++i + "; " + "当前票数为：" + --number);
        }
        if (i == j) {
            available = false;
        }
    }
}

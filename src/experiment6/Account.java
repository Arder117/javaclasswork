// 1. 异常的捕获和抛出
//（1）编写帐户类Account：属性：账号、余额,
// 存钱方法save(double d)，增加收入后，打印输出余额,
// 取钱方法pay(double d)，减少收入后，打印输出余额
//（2）在取钱方法中，做异常处理，当余额小于0时，抛出余额不足的异常BalanceNotEnoughException；
//（3）编写测试类，调用取钱方法时，捕获余额不足的异常，并输出异常信息“余额不足！”

package experiment6;

public class Account {
    String account;
    double balance;

    public Account(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public Account() {
        this.account = null;
        this.balance = 0;
    }

    public void save(double d) {
        balance += d;
        System.out.println("余额：" + balance);
    }

    public void pay(double d) throws BalanceNotEnoughException {
        balance -= d;
        if (balance < 0) {
            throw new BalanceNotEnoughException();
        }
        System.out.println("余额：" + balance);
    }
}

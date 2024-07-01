package experiment6;

public class BalanceNotEnoughException extends Exception {
    public BalanceNotEnoughException() {
        super("余额不足！");
    }
}

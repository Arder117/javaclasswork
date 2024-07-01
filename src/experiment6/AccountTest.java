package experiment6;

public class AccountTest extends Account {
    public static void main(String[] args) {
        Account account = new Account("2022158885", 100);
        account.save(100);
        try {
            account.pay(300);
        } catch (BalanceNotEnoughException e) {
            System.out.println(e.toString());
        }
    }
}






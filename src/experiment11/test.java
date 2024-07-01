package experiment11;

public class test {
    public static void main(String[] args) {
        tickets t = new tickets(100);
        new produce(t).start();
        new sell(t).start();

    }
}

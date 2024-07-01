package experiment11;

public class sell extends Thread implements Runnable {
    tickets t = null;

    public sell(tickets t) {
        this.t = t;
    }

    @Override
    public void run() {
        while (t.i < t.j) {
            t.sellTicket();
        }
    }
}

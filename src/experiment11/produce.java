package experiment11;

public class produce extends Thread {
    tickets t = null;

    public produce(tickets t) {
        this.t = t;
    }

    @Override
    public void run() {
        while (t.number < t.size) {
            t.produceTicket();
        }
    }
}

package experiment6;

public class FailureException extends Exception {
    public FailureException() {
        super("不及格！");
    }
}

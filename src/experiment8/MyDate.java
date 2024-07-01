package experiment8;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return year + "-" + month + "-" + day;
    }

    public int getYear() {
        return year;
    }

    public int setYear(int year) {
        return this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int setMonth(int month) {
        return this.month = month;
    }

    public int getDay() {
        return day;
    }

    public int setDay(int day) {
        return this.day = day;
    }

}

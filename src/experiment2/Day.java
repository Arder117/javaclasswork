//2. 输入两个日期，格式为yyyy-mm-dd，判断两个日期的大小关系，以及两个日期之间的间隔天数。
//输入样例：2022-07-31，2011-01-05
//输出样例：第一个日期大于第二个日期，相隔4225天。

package experiment2;

public class Day {
    String S1;
    String S2;

    public Day(String S1, String S2) {
        this.S1 = S1;
        this.S2 = S2;
    }

    public void compare() {
        int num = intervalDay();
        if (num > 0) {
            System.out.println("第一个日期大于第二个日期，相隔" + num + "天。");
        } else if (num < 0) {
            System.out.println("第一个日期小于第二个日期，相隔" + -num + "天。");
        } else {
            System.out.println("两个日期相等。");
        }
    }

    public int intervalDay() {
        String[] s1 = S1.split("-"); // 将字符串按照"-"分割
        String[] s2 = S2.split("-");
        int year1 = Integer.parseInt(s1[0]); // 将字符串转换为整数
        int month1 = Integer.parseInt(s1[1]);
        int day1 = Integer.parseInt(s1[2]);
        int year2 = Integer.parseInt(s2[0]);
        int month2 = Integer.parseInt(s2[1]);
        int day2 = Integer.parseInt(s2[2]);
        int days = 0;
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year1 == year2) {
            if (month1 == month2) {
                days = day1 - day2;
            } else {
                for (int i = month2; i < month1; i++) {
                    if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                        days += month[i - 1] + 1;
                    } else {
                        days += month[i - 1];
                    }
                }
                days = days - day2 + day1;
            }
        } else {
            for (int i = year2; i < year1; i++) {
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                    days += 366;
                } else {
                    days += 365;
                }
            }
            for (int i = month2; i <= 12; i++) {
                days += month[i - 1];
            }
            days = days - day2;
            for (int i = 1; i < month1; i++) {
                days += month[i - 1];
            }
            days = days + day1;
        }
        return days;
    }
}

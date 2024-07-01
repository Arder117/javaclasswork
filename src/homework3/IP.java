//3.正则表达式
//自定义一个String类的对象，其中包含中英文字符、2个合法IP地址以及2个非法IP地址。要求提取出其中所有合法的IP地址，
//并将两个非法的IP地址依次替换为192.168.0.1和192.168.1.1。合法IP地址的定义为：四组数字，每组数字最多有三位，取值范围是0-255，如：192.168.0.1
//输入样例：首先登录网址222.128.89.253，然后进入1.256.200.12，以及192.168.0，最后跳到202.192.78.56
//输出样例：
// 合法IP地址有：222.128.89.253，202.192.78.56
//替换非法IP地址后的结果：首先登录网址222.128.89.253，然后进入192.168.0.1，以及192.168.1.1，最后跳到202.192.78.56

package homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IP {
    String str;

    public IP(String str) {
        this.str = str;
    }

    public boolean isLegal(String str) {
        String[] ip = str.split("\\.");
        if (ip.length != 4) {
            return false;
        }
        for (String s : ip) {
            int num = Integer.parseInt(s);
            if (num < 0 || num > 255) {
                return false;
            }
        }
        return true;
    }

    public void printIP() {
        Pattern pattern = Pattern.compile("[0-9.]++");
        Matcher matcher = pattern.matcher(str);
        System.out.print("合法IP地址有：");
        int count = 0;
        while (matcher.find()) {
            String ip = matcher.group();
            if (isLegal(ip)) {
                System.out.print(matcher.group());
                count++;
                if (count == 1) {
                    System.out.print("，");
                }
            }
        }
        System.out.println();

        String replacedInput = str;
        for (int i = 0; i < count; i++) {
            pattern = Pattern.compile("[0-9.]++");
            matcher = pattern.matcher(replacedInput);
            int flag = 0;
            while (matcher.find()) {
                String ip = matcher.group();
                if (!isLegal(ip)) {
                    if (flag == 0) {
                        replacedInput = replacedInput.replace(ip, "192.168.0.1");
                    } else if (flag == 1) {
                        replacedInput = replacedInput.replace(ip, "192.168.1.1");
                    }
                    flag++;
                }
            }
        }
        System.out.print("替换非法IP地址后的结果：" + replacedInput);
    }

    public static void main(String[] args) {
        System.out.print("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        IP ip = new IP(str);
        ip.printIP();
        scanner.close();
    }
}



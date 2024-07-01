//编写一程序，查找某一字符串中是否包含有“abc”

package experiment1;

import java.util.Scanner;

public class first3 {
    public static void main(String[] args) {
        String str = "abc";
        String s = "";
        System.out.print("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        if (s.contains(str)) {
            System.out.println("包含");
        } else {
            System.out.println("不包含");
        }
    }
}

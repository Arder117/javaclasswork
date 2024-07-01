package experiment2;

import java.util.Scanner;

public class ShoppingTest {
    public static void main(String[] args) {
        System.out.print("请输入购物小票信息: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Shopping shopping = new Shopping(s);
        shopping.show();
    }
}

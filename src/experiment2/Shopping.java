//3. 自定义一个String类的对象，显示购物小票信息。判断该信息中
//是否包含”巧克力”，输出价格大于20元的商品，最后计算总价。
//输入样例：牛奶：35元，香肠：12.7元，巧克力：19.9元，啤酒：20.1元
//输出样例：
// 该小票包含巧克力，价格为19.9元
// 价格大于20元的商品有：牛奶：35元，啤酒：20.1元
//该购物小票总价为：87.7元

package experiment2;

public class Shopping {
    String s;

    public Shopping(String s) {
        this.s = s;
    }

    public void show() {
        String[] items = s.split("，");
        double sum = 0;
        for (String item : items) {
            if (item.contains("巧克力")) {
                System.out.println("该小票包含巧克力，价格为" + item.substring(item.indexOf("：") + 1));
                // substring(int beginIndex) 返回此字符串的一个子字符串
                // index0f()返回指定字符在此字符串中第一次出现处的索引。
                break;
            }
        }
        System.out.print("价格大于20元的商品有：");
        for (String item : items) {
            String[] parts = item.split("：");
            double price = Double.parseDouble(parts[1].substring(0, parts[1].length() - 1));
            //parseDouble() 方法用于将字符串参数作为有符号的浮点数进行解析。返回解析后的浮点数。
            if (price > 20) {
                System.out.print(parts[0] + "：" + parts[1] + "，");
            }
            sum += price;
        }
        System.out.println();
        System.out.print("该购物小票总价为：" + String.format("%.1f", sum) + "元");
    }
}

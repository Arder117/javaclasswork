// 用复选框进行多项爱好选择。单击各个复选框，均能在只读文本框中动态显示选择结果

package experiment12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class third {
    public static void main(String[] args) {
        JFrame panel = new JFrame("关于复选框");
        JLabel label1 = new JLabel("爱好选择：");
        JLabel label2 = new JLabel("您选择了：");
        JTextField text = new JTextField(20);
        JCheckBox optionA = new JCheckBox("音乐");
        JCheckBox optionB = new JCheckBox("运动");
        JCheckBox optionC = new JCheckBox("上网");

        panel.setSize(500, 300);
        panel.setLocationRelativeTo(null);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);

        Container container = panel.getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10));
        container.add(label1);
        container.add(optionA);
        container.add(optionB);
        container.add(optionC);
        container.add(label2);
        container.add(text);

        ActionListener listener = e -> {
            String result = "";
            if (optionA.isSelected()) {
                result += "音乐 ";
            }
            if (optionB.isSelected()) {
                result += "运动 ";
            }
            if (optionC.isSelected()) {
                result += "上网 ";
            }
            text.setText(result);
        };

        optionA.addActionListener(listener);
        optionB.addActionListener(listener);
        optionC.addActionListener(listener);
    }
}

// 用单选按钮组进行志向选择程序，每次只能选一个

package experiment12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class second extends JFrame {
    public static void main(String[] args) {
        JFrame panel = new JFrame("关于单选按钮");
        JLabel label1 = new JLabel("将来要当：");
        JLabel label2 = new JLabel("您选择了：");
        JTextField text = new JTextField(20);
        ButtonGroup option = new ButtonGroup();
        JRadioButton optionA = new JRadioButton("经理");
        JRadioButton optionB = new JRadioButton("工程师");
        JRadioButton optionC = new JRadioButton("教师");

        panel.setSize(500, 300);
        panel.setLocationRelativeTo(null);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);

        option.add(optionA);
        option.add(optionB);
        option.add(optionC);

        Container container = panel.getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10));
        container.add(label1);
        container.add(optionA);
        container.add(optionB);
        container.add(optionC);
        container.add(label2);
        container.add(text);

        ActionListener listener = e -> {
            if (optionA.isSelected()) {
                text.setText("经理");
            } else if (optionB.isSelected()) {
                text.setText("工程师");
            } else if (optionC.isSelected()) {
                text.setText("教师");
            }
        }; 
        optionA.addActionListener(listener);
        optionB.addActionListener(listener);
        optionC.addActionListener(listener);
    }
}

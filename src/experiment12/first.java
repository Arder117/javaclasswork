// 使用JDialog对话框显示问候语。

package experiment12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class first extends JDialog {
    public static void main(String[] args) {
        JDialog dialog = new JDialog(new Frame(), "Hello", true);
        dialog.setSize(500, 300);
        JLabel label = new JLabel("请输入你的名字：");
        JTextField text = new JTextField(20);
        JButton button = new JButton("确定");
        dialog.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10));
        Container container = dialog.getContentPane();
        container.add(label);
        container.add(text);
        container.add(button);
        button.addActionListener(
                (ActionEvent e) ->
                        JOptionPane.showMessageDialog(null, "你好，" + text.getText())
        );
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
        dialog.setVisible(true);

    }
}

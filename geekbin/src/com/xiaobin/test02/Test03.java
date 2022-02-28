package com.xiaobin.test02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test03 {
    public static void main(String[] args) {
        // 1、创建窗口
        JFrame win = new JFrame("登录界面");
        // 桌布
        JPanel panel = new JPanel();
        win.add(panel);

        // 2、创建一个按钮对象
        JButton btn = new JButton("登录");

        // 重点：匿名内部类的使用，给按钮绑定事件
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"ddd");
            }
        });
        // 好像 ES6 语法
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win,"xxx"));

        // 3、把按钮对象添加到窗口上展示
        win.add(btn);

        // 4、设置窗口的高和宽
        win.setSize(400, 300);

        // 5、设置居中
        win.setLocationRelativeTo(null);

        // 6、展示窗口
        win.setVisible(true);
    }
}

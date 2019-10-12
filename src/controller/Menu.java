package controller;

import util.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    JPanel panel = Model.MenuPanel();

    public void initialize(JFrame frame){

        frame.getContentPane().add(panel);

        JLabel label = new JLabel("门禁系统");
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        label.setBounds(79, 20, 150, 34);
        panel.add(label);

        JButton button = new JButton("用户管理");
        button.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
        button.setBounds(32, 129, 197, 49);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println(1);
                Model.TimePanel().setVisible(false);
                Model.HighSetup().setVisible(false);
                Model.VerifyPanel().setVisible(false);
                Model.MenJPanel().setVisible(false);
                Model.NetworkPanel().setVisible(false);
                new User();
                Model.UserPanel().setVisible(true);
            }
        });

        JButton button_1 = new JButton("验证设置");
        button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
        button_1.setBounds(33, 190, 197, 49);
        panel.add(button_1);
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Model.TimePanel().setVisible(false);
                Model.UserPanel().setVisible(false);
                Model.HighSetup().setVisible(false);
                Model.VerifyPanel().setVisible(false);
                new verify();
                Model.VerifyPanel().setVisible(true);
            }
        });

        JButton button_2 = new JButton("时间设置");
        button_2.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
        button_2.setBounds(32, 262, 197, 49);
        panel.add(button_2);
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println(1);
                Model.UserPanel().setVisible(false);
                new Time();
                Model.TimePanel().setVisible(true);
            }
        });

        JButton button_3 = new JButton("高级设置");
        button_3.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
        button_3.setBounds(32, 323, 197, 49);
        panel.add(button_3);

        JButton button_4 = new JButton("网络设置");
        button_4.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
        button_4.setBounds(32, 388, 197, 49);
        panel.add(button_4);

        JButton button_5 = new JButton("退出");
        button_5.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
        button_5.setBounds(32, 449, 197, 49);
        panel.add(button_5);

        JButton button_6 = new JButton("记录查询");
        button_6.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
        button_6.setBounds(32, 66, 197, 49);
        panel.add(button_6);
    }
}

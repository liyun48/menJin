package controller;

import util.Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;

public class verify {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					verify window = new verify();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public verify() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = Model.Jfr();
		
		JPanel panel = Model.VerifyPanel();
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
		
		JButton button_1 = new JButton("验证设置");
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		button_1.setBounds(32, 190, 197, 49);
		panel.add(button_1);
		
		JButton button_2 = new JButton("时间设置");
		button_2.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		button_2.setBounds(32, 262, 197, 49);
		panel.add(button_2);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(260, 0, 740, 578);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxTm = new JCheckBox("TM卡");
		chckbxTm.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		chckbxTm.setBounds(294, 218, 139, 44);
		panel_1.add(chckbxTm);
		
		JCheckBox checkBox_2 = new JCheckBox("人脸");
		checkBox_2.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		checkBox_2.setBounds(294, 287, 139, 75);
		panel_1.add(checkBox_2);
		
		JCheckBox checkBox = new JCheckBox("指纹");
		checkBox.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		checkBox.setBounds(294, 145, 139, 44);
		panel_1.add(checkBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("密码");
		chckbxNewCheckBox.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		chckbxNewCheckBox.setBounds(294, 80, 139, 44);
		panel_1.add(chckbxNewCheckBox);
		
		JButton button_7 = new JButton("确定");
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		button_7.setBounds(504, 387, 127, 64);
		panel_1.add(button_7);
	}
}

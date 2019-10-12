package controller;

import util.Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class network_seting {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					network_seting window = new network_seting();
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
	public network_seting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(10, -22, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = Model.NetworkPanel();
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
		panel_1.setBounds(263, 0, 731, 578);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton button_7 = new JButton("确认");
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		button_7.setBounds(534, 445, 104, 59);
		panel_1.add(button_7);
		
		JButton btnNewButton = new JButton("取消");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton.setBounds(412, 445, 110, 59);
		panel_1.add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		textField.setBounds(301, 32, 363, 73);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblip = new JLabel("本机IP地址:");
		lblip.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblip.setBounds(106, 37, 196, 63);
		panel_1.add(lblip);
		
		JLabel label_1 = new JLabel("本机端口号：");
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		label_1.setBounds(106, 130, 141, 85);
		panel_1.add(label_1);
		
		JLabel lblip_2 = new JLabel("服务器端口号：");
		lblip_2.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblip_2.setBounds(106, 331, 196, 59);
		panel_1.add(lblip_2);
		
		JLabel lblip_1 = new JLabel("服务器IP地址：");
		lblip_1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblip_1.setBounds(106, 237, 183, 63);
		panel_1.add(lblip_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(301, 136, 363, 73);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(301, 232, 363, 73);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(301, 331, 363, 73);
		panel_1.add(textField_3);
	}
}

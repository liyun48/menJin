package controller;

import util.Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

public class Time {

//	private JFrame frame;
	JPanel panel_1 = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Time();
//					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Time() {
		initialize(Model.Jfr());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(JFrame frame) {
		JPanel panel = Model.TimePanel();
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
		

		panel_1.setBounds(707, 263, 293, 315);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton button_19 = new JButton("1");
		button_19.setBounds(6, 6, 75, 48);
		panel_1.add(button_19);
		
		JButton button_13 = new JButton("1");
		button_13.setBounds(93, 6, 75, 48);
		panel_1.add(button_13);
		
		JButton button_14 = new JButton("1");
		button_14.setBounds(180, 6, 75, 48);
		panel_1.add(button_14);
		
		JButton button_15 = new JButton("1");
		button_15.setBounds(6, 66, 75, 48);
		panel_1.add(button_15);
		
		JButton button_16 = new JButton("1");
		button_16.setBounds(93, 66, 75, 48);
		panel_1.add(button_16);
		
		JButton button_18 = new JButton("1");
		button_18.setBounds(180, 66, 75, 48);
		panel_1.add(button_18);
		
		JButton button_22 = new JButton("1");
		button_22.setBounds(6, 128, 75, 48);
		panel_1.add(button_22);
		
		JButton button_23 = new JButton("1");
		button_23.setBounds(93, 126, 75, 48);
		panel_1.add(button_23);
		
		JButton button_24 = new JButton("1");
		button_24.setBounds(180, 128, 75, 48);
		panel_1.add(button_24);
		
		JButton button_25 = new JButton("1");
		button_25.setBounds(6, 188, 75, 48);
		panel_1.add(button_25);
		
		JButton button_26 = new JButton("1");
		button_26.setBounds(93, 186, 75, 48);
		panel_1.add(button_26);
		
		JButton button_27 = new JButton("1");
		button_27.setBounds(180, 188, 75, 48);
		panel_1.add(button_27);
		
		JButton button_28 = new JButton("1");
		button_28.setBounds(6, 248, 75, 48);
		panel_1.add(button_28);
		
		JButton button_29 = new JButton("1");
		button_29.setBounds(93, 246, 75, 48);
		panel_1.add(button_29);
		
		JButton button_30 = new JButton("1");
		button_30.setBounds(180, 248, 75, 48);
		panel_1.add(button_30);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		textField.setBounds(358, 39, 121, 54);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(358, 123, 121, 54);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(358, 205, 121, 54);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(545, 39, 121, 54);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		textField_4.setColumns(10);
		textField_4.setBounds(724, 39, 121, 54);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		textField_5.setColumns(10);
		textField_5.setBounds(545, 123, 121, 54);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		textField_6.setColumns(10);
		textField_6.setBounds(724, 123, 121, 54);
		frame.getContentPane().add(textField_6);
		
		JLabel label_1 = new JLabel("年");
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		label_1.setBounds(491, 54, 25, 23);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("月");
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		label_2.setBounds(676, 54, 25, 23);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("日");
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		label_3.setBounds(857, 55, 25, 23);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("时");
		label_4.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		label_4.setBounds(491, 134, 25, 23);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("分");
		label_5.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		label_5.setBounds(678, 140, 25, 23);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("秒");
		label_6.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		label_6.setBounds(857, 140, 25, 23);
		frame.getContentPane().add(label_6);
	}
}

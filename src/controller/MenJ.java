package controller;

import util.Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class MenJ {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new MenJ();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenJ() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = Model.MenJPanel();

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

		table_1 = new JTable();
		table_1.setBounds(62, 104, 628, 348);
		panel_1.add(table_1);

		JButton button_7 = new JButton("上一页");
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_7.setBounds(300, 485, 132, 58);
		panel_1.add(button_7);

		JButton button_8 = new JButton("下一页");
		button_8.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_8.setBounds(444, 485, 132, 58);
		panel_1.add(button_8);

		JButton button_9 = new JButton("详细信息");
		button_9.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_9.setBounds(602, 485, 132, 58);
		panel_1.add(button_9);

		JTable f = new JTable();
		table.setBounds(17, 54, 704, 408);
	}
}

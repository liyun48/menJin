package controller;

import util.Model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Hige_setup {

//	private JFrame frame;
	JPanel panel32 = Model.HighSetup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Hige_setup();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hige_setup() {
		initialize(Model.Jfr());
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(JFrame frame) {
		frame.getContentPane().add(panel32);


//		JButton qw = new JButton("管理员设置");
//		qw.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
//		qw.setBounds(344, 485, 140, 45);
//		panel32.add(qw);


		JButton button_7 = new JButton("恢复出厂设置");
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_7.setBounds(666, 306, 188, 66);
		panel32.add(button_7);
		
		JButton button_8 = new JButton("系统信息");
		button_8.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		button_8.setBounds(200, 306, 188, 66);
		panel32.add(button_8);

//		panel32.setVisible(true);
	}
}

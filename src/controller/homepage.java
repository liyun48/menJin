package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class homepage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
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
	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("上海俊悦智能门禁控制器");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 47));
		lblNewLabel.setBounds(229, 80, 618, 137);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("系统管理");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(229, 376, 154, 65);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("开门");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(535, 379, 189, 62);
		frame.getContentPane().add(btnNewButton_1);
	}
}

package controller;

import service.UserTableData;
import util.Model;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class User {

	private JTable table;
	JPanel panel_1 = Model.UserPanel();
    static JPanel panel1 = Model.AddUsers1();
    static JPanel panel2 = Model.AddUsers2();
    static JPanel panel3 = Model.AddUsers3();
    static JPanel panel4 = Model.AddUsers4();
    static JPanel adminpanel = Model.AdminSetting();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new User().initialize(Model.Jfr());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
//	public User(JFrame frame) {
//		initialize(frame);
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize(JFrame frame) {
		frame.getContentPane().add(panel_1);
		String[] name = {"姓名","工号"};
        table = new JTable(new UserTableData().getData(),name);
//        table.setSize(500,400);
		table.setBounds(45, 44, 641, 412);
        table.setRowHeight(35);
//        table.setAutoResizeMode(30);
        table.getColumnModel().getColumn(1).setPreferredWidth(180);
        table.setFont(new Font("宋体", Font.PLAIN, 24));
        DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
        cr.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, cr);
		panel_1.add(table);
//		panel_1.add(new JScrollPane(table));
		
		JButton button_7 = new JButton("添加用户");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//                Model.UserPanel().setVisible(false);
                Model.MenuPanel().setVisible(false);
                panel_1.setVisible(false);
                new User().addUser1(frame);
                panel1.setVisible(true);
			}
		});
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		button_7.setBounds(6, 485, 120, 45);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("管理员设置");
		button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                Model.UserPanel().setVisible(false);
                Model.MenuPanel().setVisible(false);
                panel_1.setVisible(false);
                new User().adminSetting(frame);
                adminpanel.setVisible(true);
            }
        });
		button_8.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		button_8.setBounds(144, 485, 140, 45);
		panel_1.add(button_8);
		
		JButton button_9 = new JButton("上一页");
		button_9.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		button_9.setBounds(356, 485, 100, 45);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton("下一页");
		button_10.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		button_10.setBounds(469, 485, 100, 45);
		panel_1.add(button_10);
		
		JButton button_11 = new JButton("删除用户");
		button_11.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		button_11.setBounds(581, 485, 120, 45);
		panel_1.add(button_11);
	}

    public static void drawSteps(JPanel panel) {
        int x = 170;
        for (int i = 0; i < 3; i++) {
            JLabel Label = new JLabel("———");
            Label.setFont(new Font("宋体", Font.BOLD, 24));
            Label.setForeground(Color.gray);
            Label.setBounds(x, 40, 150, 50);
            panel.add(Label);
            x += 250;
        }
    }

	public void addUser1(JFrame frame){
//
        frame.getContentPane().add(panel1);

        //进度条
        drawSteps(panel1);
        JLabel oneLabel = new JLabel("① 设置密码");
        oneLabel.setFont(new Font("宋体", Font.BOLD, 24));
        oneLabel.setForeground(Color.black);
        oneLabel.setBounds(20, 40, 150, 50);
        panel1.add(oneLabel);
        JLabel twoLabel = new JLabel("② 录入卡号");
        twoLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        twoLabel.setForeground(Color.gray);
        twoLabel.setBounds(260, 40, 150, 50);
        panel1.add(twoLabel);
        JLabel threeLabel = new JLabel("③ 录入指纹");
        threeLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        threeLabel.setForeground(Color.gray);
        threeLabel.setBounds(520, 40, 150, 50);
        panel1.add(threeLabel);
        JLabel foreLabel = new JLabel("④ 录入面部信息");
        foreLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        foreLabel.setForeground(Color.gray);
        foreLabel.setBounds(770, 40, 200, 50);
        panel1.add(foreLabel);

//      input框
        JLabel idLabel = new JLabel("请输入工号：");
        idLabel.setFont(new Font("宋体", Font.BOLD, 24));
        idLabel.setBounds(180, 140, 150, 50);
        panel1.add(idLabel);
        JTextField idText = new JTextField(20);
        idText.setBounds(330, 140, 500, 50);
        idText.setFont(new Font("宋体", Font.BOLD, 20));
        panel1.add(idText);
        JLabel nameLabel = new JLabel("请输入姓名：");
        nameLabel.setFont(new Font("宋体", Font.BOLD, 24));
        nameLabel.setBounds(180, 210, 150, 50);
        panel1.add(nameLabel);
        JTextField nameText = new JTextField(20);
        nameText.setBounds(330, 210, 500, 50);
        nameText.setFont(new Font("宋体", Font.BOLD, 20));
        panel1.add(nameText);
        JLabel passwordLabel = new JLabel("请输入密码: ");
        passwordLabel.setFont(new Font("宋体", Font.BOLD, 24));
        passwordLabel.setBounds(180, 280, 180, 50);
        panel1.add(passwordLabel);
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(330, 280, 500, 50);
        passwordText.setFont(new Font("宋体", Font.BOLD, 20));
        panel1.add(passwordText);
        JLabel passwordAgainLabel = new JLabel("再次输入密码: ");
        passwordAgainLabel.setFont(new Font("宋体", Font.BOLD, 24));
        passwordAgainLabel.setBounds(155, 350, 180, 50);
        panel1.add(passwordAgainLabel);
        JPasswordField passwordAgainText = new JPasswordField(20);
        passwordAgainText.setBounds(330, 350, 500, 50);
        passwordAgainText.setFont(new Font("宋体", Font.BOLD, 20));
        panel1.add(passwordAgainText);

        //按钮
        JButton upButton = new JButton("上一页");
        upButton.setBounds(150, 450, 100, 45);
        upButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        upButton.setEnabled(false);
        panel1.add(upButton);
        JButton downButton = new JButton("下一页");
        downButton.setBounds(290, 450, 100, 45);
        downButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        downButton.setBackground(new Color(24,144,255));
        panel1.add(downButton);
        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                addUser2(frame);
                panel2.setVisible(true);
            }
        });
        JButton saveButton = new JButton("保 存");
        saveButton.setBounds(600, 450, 100, 45);
        saveButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        saveButton.setBackground(new Color(24,144,255));
        panel1.add(saveButton);
        JButton exitButton = new JButton("退 出");
        exitButton.setBounds(720, 450, 100, 45);
        exitButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        exitButton.setBackground(new Color(24,144,255));
        panel1.add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                initialize(frame);
                panel_1.setVisible(true);
                Model.MenuPanel().setVisible(true);
            }
        });
    }

    public void addUser2(JFrame frame) {
        frame.getContentPane().add(panel2);
        panel2.setLayout(null);
//        panel.setVisible(true);
        //进度条
        drawSteps(panel2);
        JLabel oneLabel = new JLabel("√ 设置密码");
        oneLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        oneLabel.setForeground(Color.gray);
        oneLabel.setBounds(20, 40, 150, 50);
        panel2.add(oneLabel);
        JLabel twoLabel = new JLabel("② 录入卡号");
        twoLabel.setFont(new Font("宋体", Font.BOLD, 24));
        twoLabel.setForeground(Color.black);
        twoLabel.setBounds(260, 40, 150, 50);
        panel2.add(twoLabel);
        JLabel threeLabel = new JLabel("③ 录入指纹");
        threeLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        threeLabel.setForeground(Color.gray);
        threeLabel.setBounds(520, 40, 150, 50);
        panel2.add(threeLabel);
        JLabel foreLabel = new JLabel("④ 录入面部信息");
        foreLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        foreLabel.setForeground(Color.gray);
        foreLabel.setBounds(770, 40, 200, 50);
        panel2.add(foreLabel);

        //input框
        JLabel idLabel = new JLabel("请输入工号：");
        idLabel.setFont(new Font("宋体", Font.BOLD, 24));
        idLabel.setBounds(180, 140, 150, 50);
        panel2.add(idLabel);
        JTextField idText = new JTextField(20);
        idText.setBounds(330, 140, 500, 50);
        idLabel.setFont(new Font("宋体", Font.BOLD, 20));
        panel2.add(idText);
        JLabel nameLabel = new JLabel("请输入姓名：");
        nameLabel.setFont(new Font("宋体", Font.BOLD, 24));
        nameLabel.setBounds(180, 210, 150, 50);
        panel2.add(nameLabel);
        JTextField nameText = new JTextField(20);
        nameText.setBounds(330, 210, 500, 50);
        nameText.setFont(new Font("宋体", Font.BOLD, 20));
        panel2.add(nameText);
        JLabel cardLabel = new JLabel("请输入卡号: ");
        cardLabel.setFont(new Font("宋体", Font.BOLD, 24));
        cardLabel.setBounds(180, 280, 180, 50);
        panel2.add(cardLabel);
        JTextField cardText = new JTextField(20);
        cardText.setBounds(330, 280, 500, 50);
        cardText.setFont(new Font("宋体", Font.BOLD, 20));
        panel2.add(cardText);


        //按钮
        JButton upButton = new JButton("上一页");
        upButton.setBounds(150, 450, 100, 45);
        upButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        upButton.setBackground(new Color(24,144,255));
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(false);
                addUser1(frame);
                panel1.setVisible(true);
            }
        });
        panel2.add(upButton);
        JButton downButton = new JButton("下一页");
        downButton.setBounds(290, 450, 100, 45);
        downButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        downButton.setBackground(new Color(24,144,255));
        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(false);
                addUser3(frame);
                panel3.setVisible(true);
            }
        });
        panel2.add(downButton);
        JButton saveButton = new JButton("保 存");
        saveButton.setBounds(600, 450, 100, 45);
        saveButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        saveButton.setBackground(new Color(24,144,255));
        panel2.add(saveButton);
        JButton exitButton = new JButton("退 出");
        exitButton.setBounds(720, 450, 100, 45);
        exitButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        exitButton.setBackground(new Color(24,144,255));
        panel2.add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(false);
                initialize(frame);
                panel_1.setVisible(true);
                Model.MenuPanel().setVisible(true);
            }
        });
    }

    //增加用户3
    public void addUser3(JFrame frame) {
	    frame.getContentPane().add(panel3);
        panel3.setLayout(null);
        //进度条
        drawSteps(panel3);
        JLabel oneLabel = new JLabel("√ 设置密码");
        oneLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        oneLabel.setForeground(Color.gray);
        oneLabel.setBounds(20, 40, 150, 50);
        panel3.add(oneLabel);
        JLabel twoLabel = new JLabel("√ 录入卡号");
        twoLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        twoLabel.setForeground(Color.gray);
        twoLabel.setBounds(260, 40, 150, 50);
        panel3.add(twoLabel);
        JLabel threeLabel = new JLabel("③ 录入指纹");
        threeLabel.setFont(new Font("宋体", Font.BOLD, 24));
        threeLabel.setForeground(Color.black);
        threeLabel.setBounds(520, 40, 150, 50);
        panel3.add(threeLabel);
        JLabel foreLabel = new JLabel("④ 录入面部信息");
        foreLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        foreLabel.setForeground(Color.gray);
        foreLabel.setBounds(770, 40, 200, 50);
        panel3.add(foreLabel);

        //input框
        JLabel idLabel = new JLabel("请输入工号：");
        idLabel.setFont(new Font("宋体", Font.BOLD, 24));
        idLabel.setBounds(180, 140, 150, 50);
        panel3.add(idLabel);
        JTextField idText = new JTextField(20);
        idText.setBounds(330, 140, 500, 50);
        idText.setFont(new Font("宋体", Font.BOLD, 20));
        panel3.add(idText);
        JLabel nameLabel = new JLabel("请输入姓名：");
        nameLabel.setFont(new Font("宋体", Font.BOLD, 24));
        nameLabel.setBounds(180, 210, 150, 50);
        panel3.add(nameLabel);
        JTextField nameText = new JTextField(20);
        nameText.setBounds(330, 210, 500, 50);
        nameText.setFont(new Font("宋体", Font.BOLD, 20));
        panel3.add(nameText);
        JLabel fingerLabel = new JLabel("请输入指纹: ");
        fingerLabel.setFont(new Font("宋体", Font.BOLD, 24));
        fingerLabel.setBounds(180, 280, 180, 50);
        panel3.add(fingerLabel);

        //按钮
        JButton upButton = new JButton("上一页");
        upButton.setBounds(150, 450, 100, 45);
        upButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        upButton.setBackground(new Color(24,144,255));
        panel3.add(upButton);
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel3.setVisible(false);
                addUser2(frame);
                panel2.setVisible(true);
            }
        });
        JButton downButton = new JButton("下一页");
        downButton.setBounds(290, 450, 100, 45);
        downButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        downButton.setBackground(new Color(24,144,255));
        panel3.add(downButton);
        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel3.setVisible(false);
                addUser4(frame);
                panel4.setVisible(true);
            }
        });
        JButton saveButton = new JButton("保 存");
        saveButton.setBounds(600, 450, 100, 45);
        saveButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        saveButton.setBackground(new Color(24,144,255));
        panel3.add(saveButton);
        JButton exitButton = new JButton("退 出");
        exitButton.setBounds(720, 450, 100, 45);
        exitButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        exitButton.setBackground(new Color(24,144,255));
        panel3.add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel3.setVisible(false);
                initialize(frame);
                panel_1.setVisible(true);
                Model.MenuPanel().setVisible(true);
            }
        });
    }

    //增加用户4
    public void addUser4(JFrame frame) {
	    frame.getContentPane().add(panel4);
        panel4.setLayout(null);
        //进度条
        drawSteps(panel4);
        JLabel oneLabel = new JLabel("√ 设置密码");
        oneLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        oneLabel.setForeground(Color.gray);
        oneLabel.setBounds(20, 40, 150, 50);
        panel4.add(oneLabel);
        JLabel twoLabel = new JLabel("√ 录入卡号");
        twoLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        twoLabel.setForeground(Color.gray);
        twoLabel.setBounds(260, 40, 150, 50);
        panel4.add(twoLabel);
        JLabel threeLabel = new JLabel("√ 录入指纹");
        threeLabel.setFont(new Font("宋体", Font.PLAIN, 24));
        threeLabel.setForeground(Color.gray);
        threeLabel.setBounds(520, 40, 150, 50);
        panel4.add(threeLabel);
        JLabel foreLabel = new JLabel("④ 录入面部信息");
        foreLabel.setFont(new Font("宋体", Font.BOLD, 24));
        foreLabel.setForeground(Color.black);
        foreLabel.setBounds(770, 40, 200, 50);
        panel4.add(foreLabel);
        //input框
        JLabel idLabel = new JLabel("请输入工号：");
        idLabel.setFont(new Font("宋体", Font.BOLD, 24));
        idLabel.setBounds(180, 140, 150, 50);
        panel4.add(idLabel);
        JTextField idText = new JTextField(20);
        idText.setBounds(330, 140, 500, 50);
        idText.setFont(new Font("宋体", Font.BOLD, 20));
        panel4.add(idText);
        JLabel nameLabel = new JLabel("请输入姓名：");
        nameLabel.setFont(new Font("宋体", Font.BOLD, 24));
        nameLabel.setBounds(180, 210, 150, 50);
        panel4.add(nameLabel);
        JTextField nameText = new JTextField(20);
        nameText.setBounds(330, 210, 500, 50);
        nameText.setFont(new Font("宋体", Font.BOLD, 20));
        panel4.add(nameText);
        JLabel faceLabel = new JLabel("请输入面部信息: ");
        faceLabel.setFont(new Font("宋体", Font.BOLD, 24));
        faceLabel.setBounds(130, 280, 220, 50);
        panel4.add(faceLabel);
        //按钮
        JButton upButton = new JButton("上一页");
        upButton.setBounds(150, 450, 100, 45);
        upButton.setBackground(new Color(24,144,255));
        panel4.add(upButton);
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel4.setVisible(false);
                addUser3(frame);
                panel3.setVisible(true);
            }
        });
        JButton downButton = new JButton("下一页");
        downButton.setBounds(290, 450, 100, 45);
        downButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        downButton.setEnabled(false);
        panel4.add(downButton);
        JButton saveButton = new JButton("保 存");
        saveButton.setBounds(600, 450, 100, 45);
        saveButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        saveButton.setBackground(new Color(24,144,255));
        panel4.add(saveButton);
        JButton exitButton = new JButton("退 出");
        exitButton.setBounds(720, 450, 100, 45);
        exitButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        exitButton.setBackground(new Color(24,144,255));
        panel4.add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel4.setVisible(false);
                initialize(frame);
                panel_1.setVisible(true);
                Model.MenuPanel().setVisible(true);
            }
        });
    }

    public void  adminSetting(JFrame frame){
	    frame.getContentPane().add(adminpanel);
        JLabel nameLabel = new JLabel("请输入新管理员工号：");
        nameLabel.setFont(new Font("宋体", Font.BOLD, 24));
        nameLabel.setBounds(80, 100, 250, 50);
        adminpanel.add(nameLabel);
        JTextField nameText = new JTextField(20);
        nameText.setBounds(330, 100, 500, 50);
        nameText.setFont(new Font("宋体", Font.BOLD, 20));
        adminpanel.add(nameText);
        JLabel passwordLabel = new JLabel("请输入新管理员密码: ");
        passwordLabel.setFont(new Font("宋体", Font.BOLD, 24));
        passwordLabel.setBounds(80, 180, 260, 50);
        adminpanel.add(passwordLabel);
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(330, 180, 500, 50);
        passwordText.setFont(new Font("宋体", Font.BOLD, 20));
        adminpanel.add(passwordText);
        JLabel passwordAgainLabel = new JLabel("再次输入新管理员密码: ");
        passwordAgainLabel.setFont(new Font("宋体", Font.BOLD, 24));
        passwordAgainLabel.setBounds(55, 250, 300, 50);
        adminpanel.add(passwordAgainLabel);
        JPasswordField passwordAgainText = new JPasswordField(20);
        passwordAgainText.setBounds(330, 250, 500, 50);
        passwordAgainText.setFont(new Font("宋体", Font.BOLD, 20));
        adminpanel.add(passwordAgainText);
        JButton saveButton = new JButton("确 定");
        saveButton.setBounds(600, 450, 100, 45);
        saveButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        saveButton.setBackground(new Color(24,144,255));
        adminpanel.add(saveButton);
        JButton exitButton = new JButton("退 出");
        exitButton.setBounds(720, 450, 100, 45);
        exitButton.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        exitButton.setBackground(new Color(24,144,255));
        adminpanel.add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminpanel.setVisible(false);
                initialize(frame);
                panel_1.setVisible(true);
                Model.MenuPanel().setVisible(true);
            }
        });
    }
}

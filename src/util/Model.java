package util;

import javax.swing.*;

public class Model {
    static final JFrame frame = new JFrame();
    static final JPanel Timepanel = new JPanel();
    static final JPanel Userpanel = new JPanel();
    static final JPanel Menupanel = new JPanel();
    static final JPanel Highpanel = new JPanel();
    static final JPanel MenJpanel = new JPanel();
    static final JPanel Networkpanel = new JPanel();
    static final JPanel Verifypanel = new JPanel();
    static final JPanel BackGroundpanel = new JPanel();

    static final JPanel AddUserpanel1 = new JPanel();
    static final JPanel AddUserpanel2 = new JPanel();
    static final JPanel AddUserpanel3 = new JPanel();
    static final JPanel AddUserpanel4 = new JPanel();
    static final JPanel AdminSettingpanel = new JPanel();

    public static JFrame Jfr(){
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        return frame;
    }

    public static JPanel MenuPanel(){
        Menupanel.setLayout(null);
        Menupanel.setBounds(0, 0, 262, 578);
        return Menupanel;
    }

    public static JPanel TimePanel(){
        Timepanel.setLayout(null);
        Timepanel.setBounds(0, 0, 262, 578);
        return Timepanel;
    }

    public static JPanel UserPanel(){
        Userpanel.setLayout(null);
        Userpanel.setBounds(263, 0, 731, 578);
        return Userpanel;
    }

    public static JPanel HighSetup(){
        Highpanel.setLayout(null);
        Highpanel.setBounds(263, 0, 731, 578);
        return Highpanel;
    }

    public static JPanel MenJPanel(){
        MenJpanel.setBounds(0, 0, 262, 578);
        MenJpanel.setLayout(null);
        return MenJpanel;
    }

    public static JPanel NetworkPanel(){
        Networkpanel.setBounds(0, 0, 262, 578);
        Networkpanel.setLayout(null);
        return Networkpanel;
    }

    public static JPanel VerifyPanel(){
        Verifypanel.setBounds(0, 0, 262, 578);
        Verifypanel.setLayout(null);
        return Verifypanel;
    }

    public static JPanel AddUsers1(){
        AddUserpanel1.setBounds(0, 0, 1000, 578);
        AddUserpanel1.setLayout(null);
        return AddUserpanel1;
    }

    public static JPanel AddUsers2(){
        AddUserpanel2.setBounds(0, 0, 1000, 578);
        AddUserpanel2.setLayout(null);
        return AddUserpanel2;
    }

    public static JPanel AddUsers3(){
        AddUserpanel3.setBounds(0, 0, 1000, 578);
        AddUserpanel3.setLayout(null);
        return AddUserpanel3;
    }

    public static JPanel AddUsers4(){
        AddUserpanel4.setBounds(0, 0, 1000, 578);
        AddUserpanel4.setLayout(null);
        return AddUserpanel4;
    }

    public static JPanel AdminSetting(){
        AdminSettingpanel.setBounds(0, 0, 1000, 578);
        AdminSettingpanel.setLayout(null);
        return AdminSettingpanel;
    }

    public static JPanel BackGround(){
        return BackGroundpanel;
    }
}

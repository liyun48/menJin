import controller.Menu;
import controller.User;
import util.Model;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JFrame frame = Model.Jfr();
                    new Menu().initialize(frame);
                    new User().initialize(frame);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

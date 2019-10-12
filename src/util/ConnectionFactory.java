package util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {
    private static String driver;
    private static String url ;
    private static String username;
    private static String password ;
    static {
        try {
            Properties p = new Properties();
            p.load(ConnectionFactory.class.getResourceAsStream("db.properties"));
            driver = p.getProperty("driver");
            url = p.getProperty("url");
            username = p.getProperty("username");
            password = p.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        // 注册驱动
        try {
            Class.forName(driver);
            // 建立连接
            conn = DriverManager.getConnection(url,username,password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}

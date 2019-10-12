package service;


import bean.User;
import org.junit.Test;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserTableData {

    public Object[][] getData(){
        Connection conn = null;
        Statement stmt = null;
        List<User> list = new ArrayList<>();
        User user = null;
        try {
            conn = ConnectionFactory.getConnection();
            stmt  = conn.createStatement();
            String sql = "select * from user";
            ResultSet resultSet = stmt.executeQuery(sql);

            while (resultSet.next()){
                int JID = resultSet.getInt("JID");
                String name = resultSet.getString("name");
                user = new User(JID,name);
                list.add(user);
            }
//            System.out.println(list.get(0));
//            System.out.println(list.size());
            Object[][] arr = new Object[list.size()+1][3];
            // 操作结果集
            arr[0][0] = "姓名";
            arr[0][1] = "工号";
            for (int i = 0; i <list.size(); i++) {
                arr[i+1][0] = list.get(i).getJID();
                arr[i+1][1] = list.get(i).getName();
            }
//            for (int i=0;i<list.size();i++)
//            System.out.println(Arrays.toString (arr[i]));
            return arr;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}

package com.sph;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcTest {
    public static void main(String[] args) throws Exception {

//        testConnection();
        search();

    }
    public static void testConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/db01";
        String user = "root";
        String password = "1234";

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();

        String sql = "insert into emp (username, name, gender, phone, job, image, salary, entry_data, create_time, update_time) values" +
                "          ('tdw', '阿松', 1, '13888447481', 1, 'default5a5.jpg', 5600, now(), now(), now())";
        int i = statement.executeUpdate(sql);

        System.out.println(i);


        statement.close();
        connection.close();

    }

    public static void search() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/db01";
        String user = "root";
        String password = "1234";

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();

        String sql = "select * from user";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String name = resultSet.getString("name");
            String age = resultSet.getString("age");
            String gender = resultSet.getString("gender");
            System.out.println(id + "\t" + username + "\t" + name + "\t" + age + "\t" + gender);
        }
        resultSet.close();
        statement.close();
        connection.close();

    }
}

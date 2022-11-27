package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/users_table";
//    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USERNAME = "root1";
    private static final String PASSWORD = "root";
    private static Connection connection;

    public static Connection getConnection() {
        try  {
//            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("Подключение к БД установлено");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Не удалось подключится к БД!");
        }
        return connection;
    }


}

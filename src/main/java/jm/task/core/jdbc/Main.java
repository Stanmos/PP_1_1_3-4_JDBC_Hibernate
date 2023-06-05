package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Get connection...");
        Connection conn = Util.getMySQLConnection();

        System.out.println("Get connection " + conn);
        System.out.println("Done!");

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Mike", "Tyson", (byte) 35);
    }
}

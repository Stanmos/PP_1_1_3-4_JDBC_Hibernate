package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Mike", "Tyson", (byte) 35);
        userService.saveUser("Key", "Note", (byte) 16);
        userService.saveUser("Will", "Armstrong", (byte) 49);
        userService.saveUser("Luise", "Huston", (byte) 23);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

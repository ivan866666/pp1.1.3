package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService us = new UserServiceImpl();
        us.createUsersTable();

        us.saveUser("Vasya", "Pupkin", (byte) 21);
        us.saveUser("John", "Yik", (byte) 41);
        us.saveUser("Merlin", "Menson", (byte) 57);
        us.saveUser("Pomella", "Andorson", (byte) 61);
        us.saveUser("Roberto", "Carlos", (byte) 52);
        us.saveUser("Yrii", "Gagarin", (byte) 98);
        us.saveUser("Jenifer", "Lopaz", (byte) 49);

        us.getAllUsers().forEach(System.out::println);

        us.cleanUsersTable();
        us.dropUsersTable();
    }
}

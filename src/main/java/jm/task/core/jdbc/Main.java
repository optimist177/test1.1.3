package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getConnect();
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();

        userDao.saveUser("Иван", "Иванов", (byte) 18);
        userDao.saveUser("Петр", "Петров", (byte) 20);
        userDao.saveUser("Николай", "Николаев", (byte) 25);
        userDao.saveUser("Сергей", "Орлов", (byte) 32);
        userDao.removeUserById(4);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
        Util.closeConnect();
    }
}

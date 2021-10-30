package web.dao;

import web.model.User;

import java.util.ArrayList;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void save(User user);
}

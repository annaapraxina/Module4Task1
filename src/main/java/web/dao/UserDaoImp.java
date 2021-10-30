package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImp implements UserDao {

    private static int PEOPLE_COUNT;

    @Override
    public List<User> getAllUsers() {
        List<User> allUsers = new ArrayList<>();
        allUsers.add(new User(++PEOPLE_COUNT, "Anna", "Apraxina", 23));
        allUsers.add(new User(++PEOPLE_COUNT, "Ivan", "Ivanov", 44));
        allUsers.add(new User(++PEOPLE_COUNT, "Tom", "Black", 77));
        return allUsers;
    }

    @Override
    public void save(User user) {
        user.setId(++PEOPLE_COUNT);
        user.add(user);
    }
}

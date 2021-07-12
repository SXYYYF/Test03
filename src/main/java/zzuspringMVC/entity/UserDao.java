package zzuspringMVC.entity;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ASUS
 */
@Repository
public class UserDao {
    public User getUser(int id){
        List<User> users=new ArrayList<User>();
        users.add(new User(1,"222","333"));
        users.add(new User(2,"222","333"));
        users.add(new User(3,"222","333"));
        return users.get(id-1);

    }
}

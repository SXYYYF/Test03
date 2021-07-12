package zzuspringMVC.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yaoyunfei
 * @data 2021/7/10 9:35
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public User getUser(int id){
        User user = userDao.getUser(id);

        return user;

    }

}

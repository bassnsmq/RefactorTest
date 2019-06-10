package demanadtwo.packagetest.service;


import demanadtwo.packagetest.Dao.UserDao;
import demanadtwo.packagetest.entity.User;

import javax.annotation.Resource;

/**
 * Created by sang on 17-3-10.
 */

public class UserService {
    @Resource
    private UserDao userDao;

    public boolean login(String username, String password) {
        User user = userDao.getUser(username, password);
        if (user == null) {
            return false;
        }else{
            return true;
        }
    }
}

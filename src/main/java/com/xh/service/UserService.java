package com.xh.service;

import com.xh.bean.p.User;
import com.xh.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2016/12/27.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User addUser(User user) {
        return userDao.addUser(user);
    }
}

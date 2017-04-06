package com.xh.dao;

import com.xh.bean.p.User;
import com.xh.pri.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xh on 2017/3/14.
 */
@Service
public class UserDao {
    @Autowired
    UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }
}

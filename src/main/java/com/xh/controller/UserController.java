package com.xh.controller;

import com.xh.bean.p.User;
import com.xh.pri.UserRepository;
import com.xh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2016/12/27.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/add")
    public User addUser() {
        User user = new User("phyl",24);
        return userService.addUser(user);
    }
}

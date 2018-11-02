package com.rwt.blogusermanage.service.impl;

import com.rwt.blogusermanage.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 10156610c
 */
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;
    public UserRepository getUserRepository(){
        return userRepository;
    }


}

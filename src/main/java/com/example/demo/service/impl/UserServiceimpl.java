package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserServiceimpl  implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}

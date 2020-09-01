package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/user")
public class UseController
{
    @Autowired
    private UserService userService;
    @RequestMapping("/findall")
    public List<User> findAll(){
        List<User>  userList=userService.findAll();
        for(User user1:userList)
        {
            System.out.println(user1);
        }
        return userList;
    }
}

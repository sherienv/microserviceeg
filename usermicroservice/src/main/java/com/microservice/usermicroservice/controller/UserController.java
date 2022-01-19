package com.microservice.usermicroservice.controller;

import com.microservice.usermicroservice.VO.ResponseTemplateVO;
import com.microservice.usermicroservice.model.User;
import com.microservice.usermicroservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public User getUser(){
        User user = new User();
        user.setUserID(1);
        user.setUserName("TestUser");
        return user;
    }


    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithBook(@PathVariable("id") int userId){
        return userService.getBook(userId);
    }

}

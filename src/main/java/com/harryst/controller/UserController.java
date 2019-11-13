package com.harryst.controller;

import com.harryst.entity.User;
import com.harryst.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by harryhx on 2019/11/12.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserJPA userJPA;

    /**
     * 查询所有用户方法
     * @return
     */
    @RequestMapping("/list")
    public List<User> list(){
        return  userJPA.findAll();
    }

    /**
     * 保存用户
     * @param user
     * @return
     */
    @RequestMapping("/save")
    public User save(User user){
        return userJPA.save(user);
    }
    @RequestMapping("/delete")
    public List<User> delete(Long id){
        userJPA.delete(id);
        return userJPA.findAll();
    }

}

package com.harryst.controller;

import com.harryst.entity.User;
import com.harryst.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by harryhx on 2019/11/14.
 */
@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserJPA userJPA;
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request)throws Exception{
        request.setCharacterEncoding("UTF-8");
        //登录成功
        boolean flag = true;
        String result = "登录成功";
        //根据用户名查询用户是否存在
        User userEntity = userJPA.findOne(new Specification<User>() {
            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                query.where(cb.equal(root.get("name"),user.getName()));
                return null;
            }
        }) ;
        //用户不存在
        if(userEntity==null){
            flag = false;
            result = "用户不存在,登录失败";
        }
        //密码错误
        else if(!userEntity.getPassword().equals(user.getPassword())){
            result = "用户密码不相符，登录失败";
        }
        //登录成功
        if(flag){
            //将用户写入session
            request.getSession().setAttribute("_session_user",userEntity);
        }
        return result;

    }
}

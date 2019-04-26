package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.model.User;
import com.ssh.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport{

    //定义存放到值栈中的对象
    private User user;

    //依赖service
    @Resource
    private UserService userService;

    //实现要存放到值栈中对象的get方法
    public User getUser() {
        return user;
    }

    public String m1(){
        user =  userService.getUser(1);
        System.out.println(user.getUname());
        return SUCCESS;
    }

    public String saveUser(){
        User user = new User();

        user.setUname("事务提交");
        userService.saveUser(user);

        return SUCCESS;
    }
}
package com.ryan.houses.controller;

import com.ryan.houses.pojo.User;
import com.ryan.houses.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/6/14.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("getUsers")
    @ResponseBody
    public List<User> getAllUser() {
        return userService.selectAllUser();
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("property-detail")
    public String propertyDetail() {
        return "property-detail";
    }
}

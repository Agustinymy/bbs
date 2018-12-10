package com.ymy.controller;

import com.ymy.entity.User;
import com.ymy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    UserMapper userMapper;

    /**
     *RequestMapping value 代表访问路径，method:访问方式
     * ResponseBody 把他相应给浏览器
     * */
    @RequestMapping(value = "/finduser",method = RequestMethod.GET)
    @ResponseBody
    public User findUser(){
        User user = userMapper.selectById(1);
     /*   List<User> user = userMapper.findUser();
        System.out.println(user);*/

        return user;
    }
}

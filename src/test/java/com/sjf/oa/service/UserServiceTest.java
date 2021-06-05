package com.sjf.oa.service;

import com.sjf.oa.entity.Node;
import com.sjf.oa.entity.User;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class UserServiceTest  {
    private UserService userService=new UserService();
    @Test
    public void checkLogin1() {
        userService.checkLogin("uu","1234");
    }

    @Test
    public void checkLogin2() {
        userService.checkLogin("m8","1234");
    }

    @Test
    public void checkLogin3() {
        User user=userService.checkLogin("m8","test");
        System.out.println(user);
    }

    @Test
    public void selectNodeByUserId(){
        List<Node> nodeList = userService.selectNodeByUserId(2l);
        System.out.println(nodeList);
    }
}
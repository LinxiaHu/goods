package com.hd.service.impl;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hd.service.UserService;
import com.hd.ssm.mapper.UserCustomMapper;

/**
 * Created by Chunyun on 2015/11/4.
 */
public class UserServiceImplTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
    }

    @Test
    public void testFindUserList() throws Exception {
        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService.findUserList(null));
        System.out.println("-----------------------------------------------------------");
        UserCustomMapper userCustomMapper = (UserCustomMapper) applicationContext.getBean("userCustomMapper");
        System.out.println(userCustomMapper.findUserList(null));
    	
    }
}
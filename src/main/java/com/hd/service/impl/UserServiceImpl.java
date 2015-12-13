package com.hd.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd.exception.CustomException;
import com.hd.service.UserService;
import com.hd.ssm.mapper.UserCustomMapper;
import com.hd.ssm.mapper.UserMapper;
import com.hd.ssm.pojo.User;
import com.hd.ssm.pojo.UserCustom;
import com.hd.ssm.pojo.UserQueryVo;

/**
 * Created by Chunyun on 2015/11/3.
 */

public class UserServiceImpl implements UserService {

	@Autowired(required = false)
	private UserCustomMapper userCustomMapper;// 自定义扩展功能的mapper
	@Autowired(required = false)
	private UserMapper userMapper;// 基础功能的mapper

	@Override
	public List<UserCustom> findUserList(UserQueryVo userQueryVo)
			throws Exception {
		return userCustomMapper.findUserList(userQueryVo);
	}

	@Override
	public UserCustom findCheckUserLogin(UserQueryVo userQueryVo)
			throws Exception {
		return userCustomMapper.findCheckUserLogin(userQueryVo);
	}

	@Override
	public User selectByPrimaryKey(String uid) throws Exception {
		// 用于测试全局异常处理器
//		uid = "";
//		if (uid == "" || uid == null) {
//			throw new CustomException("uid为空");
//		}
		return userMapper.selectByPrimaryKey(uid);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}
	
	// 相当于xml中<bean>中的init-method属性
	@PostConstruct
	public void initConstruct() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("调用UserServiceImpl");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	// 相当于xml中<bean>的destroy-method属性
	@PreDestroy
	public void destory() {
		System.out.println("结束UserServiceImpl调用");
	}
}

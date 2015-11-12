package com.hd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hd.service.UserService;
import com.hd.ssm.mapper.UserCustomMapper;
import com.hd.ssm.pojo.UserCustom;
import com.hd.ssm.pojo.UserQueryVo;

/**
 * Created by Chunyun on 2015/11/3.
 */

public class UserServiceImpl implements UserService {

	@Autowired(required = false)
	private UserCustomMapper userCustomMapper;

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
}
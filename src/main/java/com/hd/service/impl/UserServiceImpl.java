package com.hd.service.impl;

import com.hd.service.UserService;
import com.hd.ssm.mapper.UserCustomMapper;
import com.hd.ssm.pojo.UserCustom;
import com.hd.ssm.pojo.UserQueryVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Chunyun on 2015/11/3.
 */

public class UserServiceImpl implements UserService {
    @Autowired
    private UserCustomMapper userCustomMapper;
    @Override
    public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception {
        return userCustomMapper.findUserList(userQueryVo);
    }
}

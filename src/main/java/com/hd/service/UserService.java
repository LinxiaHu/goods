package com.hd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hd.ssm.pojo.User;
import com.hd.ssm.pojo.UserCustom;
import com.hd.ssm.pojo.UserQueryVo;

/**
 * Created by Chunyun on 2015/11/3.
 */

public interface UserService {
    public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
    
    public UserCustom findCheckUserLogin(UserQueryVo userQueryVo) throws Exception;
    
    public User selectByPrimaryKey(String uid) throws Exception;
    
    public int updateByPrimaryKey(User record);
}

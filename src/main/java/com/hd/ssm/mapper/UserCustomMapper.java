package com.hd.ssm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hd.ssm.pojo.UserCustom;
import com.hd.ssm.pojo.UserQueryVo;

/**
 * Created by Chunyun on 2015/11/3.
 */

public interface UserCustomMapper {
    public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
    public UserCustom findCheckUserLogin(UserQueryVo userQueryVo) throws Exception;
}

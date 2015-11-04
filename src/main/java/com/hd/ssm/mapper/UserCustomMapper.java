package com.hd.ssm.mapper;

import com.hd.ssm.pojo.UserCustom;
import com.hd.ssm.pojo.UserQueryVo;

import java.util.List;

/**
 * Created by Chunyun on 2015/11/3.
 */
public interface UserCustomMapper {
    public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
}

package com.hd.ssm.mapper;

import com.hd.ssm.pojo.TUserCustom;
import com.hd.ssm.pojo.TUserQueryVo;

import java.util.List;

/**
 * Created by Chunyun on 2015/11/3.
 */
public interface TUserCustomMapper {
    public List<TUserCustom> findUserList(TUserQueryVo tUserQueryVo) throws Exception;
}

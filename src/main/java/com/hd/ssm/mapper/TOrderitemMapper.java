package com.hd.ssm.mapper;

import com.hd.ssm.pojo.TOrderitem;
import com.hd.ssm.pojo.TOrderitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderitemMapper {
    int countByExample(TOrderitemExample example);

    int deleteByExample(TOrderitemExample example);

    int deleteByPrimaryKey(String orderitemid);

    int insert(TOrderitem record);

    int insertSelective(TOrderitem record);

    List<TOrderitem> selectByExample(TOrderitemExample example);

    TOrderitem selectByPrimaryKey(String orderitemid);

    int updateByExampleSelective(@Param("record") TOrderitem record, @Param("example") TOrderitemExample example);

    int updateByExample(@Param("record") TOrderitem record, @Param("example") TOrderitemExample example);

    int updateByPrimaryKeySelective(TOrderitem record);

    int updateByPrimaryKey(TOrderitem record);
}
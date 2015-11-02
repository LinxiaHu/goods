package com.hd.ssm.mapper;

import com.hd.ssm.pojo.TCategory;
import com.hd.ssm.pojo.TCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCategoryMapper {
    int countByExample(TCategoryExample example);

    int deleteByExample(TCategoryExample example);

    int deleteByPrimaryKey(String cid);

    int insert(TCategory record);

    int insertSelective(TCategory record);

    List<TCategory> selectByExample(TCategoryExample example);

    TCategory selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") TCategory record, @Param("example") TCategoryExample example);

    int updateByExample(@Param("record") TCategory record, @Param("example") TCategoryExample example);

    int updateByPrimaryKeySelective(TCategory record);

    int updateByPrimaryKey(TCategory record);
}
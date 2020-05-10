package com.ssm.dao;

import com.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * @Auther:cdx
 * @Date:2020-05-10
 * @Description:com.ssm.dao
 * @Version:1.0
 */
public interface IMemberDao {

    @Select("select * from member where id=#{id}")
    Member findById(Integer id)throws Exception;
}

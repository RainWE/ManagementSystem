package com.ssm.dao;

import com.ssm.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther:cdx
 * @Date:2020-05-08
 * @Description:com.ssm.dao
 * @Version:1.0
 */
public interface IProductDao {

    //查询所有的产品信息
    @Select("select * from product")
    public List<Product> findAll() throws Exception;

}

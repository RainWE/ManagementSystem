package com.ssm.dao;

import com.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther:cdx
 * @Date:2020-05-08
 * @Description:com.ssm.dao
 * @Version:1.0
 */
@Repository
public interface IProductDao {

    //根据id查询产品
    @Select("select * from product where id =#{id}")
    Product findById(Integer id) throws Exception;

    //查询所有的产品信息
    @Select("select * from product")
    List<Product> findAll() throws Exception;

    @Insert("insert into product(productNum,productName,cityName,DepartureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);
}

package com.ssm.service;

import com.ssm.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther:cdx
 * @Date:2020-05-08
 * @Description:com.ssm.service
 * @Version:1.0
 */
public interface IProductService {


    //查询所有的产品信息
    List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;
}

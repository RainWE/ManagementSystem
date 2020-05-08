package com.ssm.service.impl;

import com.ssm.dao.IProductDao;
import com.ssm.domain.Product;
import com.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther:cdx
 * @Date:2020-05-08
 * @Description:com.ssm.service.impl
 * @Version:1.0
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productdao;


    @Override
    public List<Product> findAll() throws Exception {
        return productdao.findAll();
    }
}

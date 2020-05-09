package com.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.ssm.dao.IOrdersDao;
import com.ssm.domain.Orders;
import com.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther:cdx
 * @Date:2020-05-09
 * @Description:com.ssm.service.impl
 * @Version:1.0
 */
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao OrdersDao;
//      未分页
//    @Override
//    public List<Orders> findAll() throws Exception {
//        //参数pageNum是页码值,参数pageSize代表是每页显示条数
//        PageHelper.startPage(1,5);
//        return OrdersDao.findAll();
//    }
    //分页
    @Override
    public List<Orders> findAll(int page,int size) throws Exception {
        //参数pageNum是页码值,参数pageSize代表是每页显示条数
        PageHelper.startPage(page,size);
        return OrdersDao.findAll();
    }
}

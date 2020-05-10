package com.ssm.service;

import com.ssm.domain.Orders;

import java.util.List;

/**
 * @Auther:cdx
 * @Date:2020-05-09
 * @Description:com.ssm.service
 * @Version:1.0
 */
public interface IOrdersService {
//      未分页
//    List<Orders> findAll() throws Exception;
    //分页
    List<Orders> findAll(int page,int size) throws Exception;

    Orders findById(Integer ordersId) throws Exception;
}

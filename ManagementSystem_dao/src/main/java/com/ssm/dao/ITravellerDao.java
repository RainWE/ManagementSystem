package com.ssm.dao;

import com.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther:cdx
 * @Date:2020-05-10
 * @Description:com.ssm.dao
 * @Version:1.0
 */
public interface ITravellerDao {

    @Select("select * from traveller where id in(select travellerId from order_traveller where orderId=#{ordersId})")
    public List<Traveller> findByOrdersId(Integer ordersId) throws Exception;
}

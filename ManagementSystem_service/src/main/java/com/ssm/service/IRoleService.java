package com.ssm.service;

import com.ssm.domain.Role;

import java.util.List;

/**
 * @Auther:cdx
 * @Date:2020-05-12
 * @Description:com.ssm.service
 * @Version:1.0
 */
public interface IRoleService {

    List<Role> findAll()throws Exception;

}

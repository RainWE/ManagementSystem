package com.ssm.service;

import com.ssm.domain.Permission;

import java.util.List;

/**
 * @Auther:cdx
 * @Date:2020-05-12
 * @Description:com.ssm.service
 * @Version:1.0
 */
public interface IPermissionService {

    List<Permission> findAll() throws Exception;

    void save(Permission permission)throws Exception;
}

package com.ssm.service.impl;

import com.ssm.dao.IRoleDao;
import com.ssm.domain.Permission;
import com.ssm.domain.Role;
import com.ssm.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther:cdx
 * @Date:2020-05-12
 * @Description:com.ssm.service.impl
 * @Version:1.0
 */
@Service
@Transactional
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao roleDao;

    @Override
    public void addPermissionToRole(Integer roleId, Integer[] permissionIds) throws Exception {
            for(Integer permissionId:permissionIds){
                roleDao.addPermissionToRole(roleId,permissionId);
        }
    }

    @Override
    public Role findById(Integer roleId) {
        return roleDao.findById(roleId);
    }

    @Override
    public List<Permission> findOtherPermissions(Integer roleId) {
        return roleDao.findOtherPermissions(roleId);
    }

    @Override
    public void save(Role role) throws Exception {
        roleDao.save(role);
    }

    @Override
    public List<Role> findAll() throws Exception {
        return roleDao.findAll();
    }
}

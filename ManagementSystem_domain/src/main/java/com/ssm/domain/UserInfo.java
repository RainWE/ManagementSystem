package com.ssm.domain;

import lombok.Data;

import java.util.List;

/**
 * @Auther:cdx
 * @Date:2020-05-10
 * @Description:com.ssm.domain
 * @Version:1.0
 */
//与数据库中的users对应
@Data
public class UserInfo {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private String phoneNum;
    private int status;
    private String statusStr;
    private List<Role> roles;
}

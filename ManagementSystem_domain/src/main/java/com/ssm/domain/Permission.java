package com.ssm.domain;

import lombok.Data;

import java.util.List;
@Data
public class Permission {
    private Integer id;
    private String permissionName;
    private String url;
    private List<Role> roles;


}

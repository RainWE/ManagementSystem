package com.ssm.domain;

import lombok.Data;

import java.util.Date;

@Data
public class SysLog {
    private Integer id;
    private Date visitTime;
    private String visitTimeStr;
    private String username;
    private String ip;
    private String url;
    private Long executionTime;
    private String method;

}

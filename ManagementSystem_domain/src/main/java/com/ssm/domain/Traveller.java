package com.ssm.domain;

import lombok.Data;

//旅客
@Data
public class Traveller {
    private Integer id;
    private String name;
    private String sex;
    private String phoneNum;
    private Integer credentialsType;
    private String credentialsTypeStr;
    private String credentialsNum;
    private Integer travellerType;
    private String travellerTypeStr;

}

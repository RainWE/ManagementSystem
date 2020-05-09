# 权限管理系统

## 数据库
```sql
create table member
(
    id       int auto_increment
        primary key,
    NAME     varchar(20) null,
    nickname varchar(20) null,
    phoneNum varchar(20) null,
    email    varchar(20) null
);

create table order_traveller
(
    orderId     int(32) null,
    travellerId int(32) null,
    constraint order_traveller_orders_id_fk
        foreign key (orderId) references orders (id),
    constraint order_traveller_traveller_id_fk
        foreign key (travellerId) references traveller (id)
);

create table orders
(
    id          int auto_increment
        primary key,
    orderNum    varchar(20)  not null,
    orderTime   timestamp    null,
    peopleCount int          null,
    orderDesc   varchar(500) null,
    payType     int          null,
    orderStatus int          null,
    productId   int(32)      null,
    memberId    int(32)      null,
    constraint orderNum
        unique (orderNum),
    constraint orders_member_id_fk
        foreign key (memberId) references member (id),
    constraint orders_product_id_fk
        foreign key (productId) references product (id)
);

create table product
(
    id            int auto_increment
        primary key,
    productNum    varchar(50)  not null comment '产品编号',
    productName   varchar(50)  null comment '产品名称（路线名称）',
    cityName      varchar(50)  null comment '出发城市
',
    DepartureTime timestamp    null comment '出发时间
',
    productPrice  float        null comment '产品价格',
    productDesc   varchar(500) null comment '产品描述
',
    productStatus int          null comment '状态（0 关闭 1 开启）',
    constraint product_productNum_uindex
        unique (productNum)
)
    comment '产品表';

create table traveller
(
    id              int auto_increment
        primary key,
    NAME            varchar(20) null,
    sex             varchar(20) null,
    phoneNum        varchar(20) null,
    credentialsType int         null,
    credentialsNum  varchar(50) null,
    travellerType   int         null
);

```

[Mybatis-PageHelper使用文档](https://github.com/pagehelper/Mybatis-PageHelper/blob/master/wikis/zh/HowToUse.md)

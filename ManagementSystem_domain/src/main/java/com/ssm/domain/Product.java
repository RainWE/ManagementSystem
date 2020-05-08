package com.ssm.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import com.ssm.utils.DateUtils;
/**
 * @Auther:cdx
 * @Date:2020-05-08
 * @Description:com.ssm
 * @Version:1.0
 */
@Data
public class Product {
    private Integer id; // 主键
    private String productNum; // 编号 唯一
    private String productName; // 名称
    private String cityName; // 出发城市
    private Date DepartureTime; // 出发时间
    private float productPrice; // 产品价格
    private String productDesc; // 产品描述
    private Integer productStatus; // 状态 0 关闭 1 开启
    private String departureTimeStr;//数据库没有的属性
    private String productStatusStr;//数据库没有的属性

    public String getProductStatusStr() {
        if (productStatus != null) {
            // 状态 0 关闭 1 开启
            if(productStatus==0)
                productStatusStr="关闭";
            if(productStatus==1)
                productStatusStr="开启";
        }
        return productStatusStr;
    }

    public String getDepartureTimeStr() {
        if(DepartureTime!=null){
            departureTimeStr= DateUtils.date2String(DepartureTime,"yyyy-MM-dd HH:mm:ss");
        }
        return departureTimeStr;
    }
}

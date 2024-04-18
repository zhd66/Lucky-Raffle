package com.itzhd.infrastructure.persistent.po;/*
 * ClassName: Strategy
 * Package: com.itzhd.infrastructure.persistent.po
 * @Author ZHD
 * @Create 2024/4/18 21:40
 */

import lombok.Data;

import java.util.Date;

@Data
public class Strategy {
    private long id;
    private long strategyId;
    private String strategyDesc;
    private Date createTime;
    private Date updateTime;
}

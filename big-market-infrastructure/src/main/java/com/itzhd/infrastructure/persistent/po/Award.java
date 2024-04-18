package com.itzhd.infrastructure.persistent.po;/*
 * ClassName: award
 * Package: com.itzhd.infrastructure.persistent.po
 * @Author ZHD
 * @Create 2024/4/18 22:18
 */

import lombok.Data;

import java.util.Date;

@Data
public class Award {
    private long id;
    private Integer awardId;
    private String awardKey;
    private String awardConfig;
    private String awardDesc;
    private Date createTime;
    private Date updateTime;
}

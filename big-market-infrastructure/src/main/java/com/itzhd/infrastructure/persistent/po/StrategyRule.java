package com.itzhd.infrastructure.persistent.po;/*
 * ClassName: StrategyRule
 * Package: com.itzhd.infrastructure.persistent.po
 * @Author ZHD
 * @Create 2024/4/18 22:00
 */

import lombok.Data;

import java.util.Date;

@Data
public class StrategyRule {
    private long id;
    private long strategyId;
    private Integer awardId;
    private Integer rule_type;
    private String ruleModels;
    private String ruleValue;
    private String ruleDesc;
    private Date createTime;
    private Date updateTime;
}

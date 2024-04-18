package com.itzhd.infrastructure.persistent.po;/*
 * ClassName: strategy_reward
 * Package: com.itzhd.infrastructure.persistent.po
 * @Author ZHD
 * @Create 2024/4/18 21:47
 */

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class StrategyReward {
    private long id;
    private long strategyId;
    private Integer awardId;
    private String awardTitle;
    private String awardSubtitle;
    private Integer awardCount;
    private Integer awardCountSurplus;
    private BigDecimal awardRate;
    private String ruleModels;
    private Integer sort;
    private Date creatTime;
    private Date updateTime;
}

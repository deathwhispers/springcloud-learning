package com.sunshine.provider.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Yanggj
 * @date 2021/4/8 23:22
 */
@Data
@TableName("t_order")
public class Order implements Serializable {

    @TableId
    private Integer id;

    private String userId;

    private String commodityCode;

    private Integer count;

    private Integer amount;
}

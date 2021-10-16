package com.sunshine.provider.serice.dto;

import lombok.Data;

/**
 * @author Yanggj
 * @date 2021/4/8 23:22
 */
@Data
public class OrderDto {

    private Integer id;

    private String userId;

    private String commodityCode;

    private Integer count;

    private Integer amount;
}

package com.guangjian.consumer.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Yanggj
 * @date 2021/4/12 23:37
 */
@Data
@TableName("t_user")
public class User implements Serializable {

    @TableId
    private Integer id;

    private String username;

    private Integer age;

}

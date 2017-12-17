package com.ssm.dao.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString(callSuper = true)
public class DataDo {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 登录IP
     */
    private String ip;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 密码
     */
    private String password;

    /**
     * IP地理位置
     */
    private String ipAddress;
}
package com.my.springbootinit.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName company
 */
@TableName(value ="company")
@Data
public class Company implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 企业编号
     */
    private String companyId;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 企业类别
     */
    private String companyType;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 经营范围
     */
    private String businessRange;

    /**
     * 地址
     */
    private String address;

    /**
     * 统一信用编号
     */
    private String uscc;

    /**
     * 法人
     */
    private String legalEntity;

    /**
     * 法人电话
     */
    private String legalEntityNum;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
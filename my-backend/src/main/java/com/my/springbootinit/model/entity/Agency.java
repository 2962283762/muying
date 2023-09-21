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
 * @TableName agency
 */
@TableName(value ="agency")
@Data
public class Agency implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 机构id
     */
    private String agencyId;

    /**
     * 机构所有人姓名
     */
    private String owner;

    /**
     * 机构名称
     */
    private String agencyName;

    /**
     * 机构电话
     */
    private String agencyNumber;

    /**
     * 机构地址
     */
    private String address;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
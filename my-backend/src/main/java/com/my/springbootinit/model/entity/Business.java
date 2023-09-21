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
 * @TableName business
 */
@TableName(value ="business")
@Data
public class Business implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 业务编号
     */
    private String businessId;

    /**
     * 业务名称
     */
    private String businessName;

    /**
     * 承接单位
     */
    private String companyId;

    /**
     * 负责人
     */
    private String headName;

    /**
     * 负责人电话
     */
    private String headNum;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 状态
     */
    private Integer status;

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
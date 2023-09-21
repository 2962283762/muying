package com.my.springbootinit.model.dto.agency;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.my.springbootinit.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户查询请求
 *

 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AgencyQueryRequest extends PageRequest implements Serializable {
    /**
     * 主键
     */
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


    private static final long serialVersionUID = 1L;
}
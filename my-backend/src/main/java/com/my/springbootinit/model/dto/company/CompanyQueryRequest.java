package com.my.springbootinit.model.dto.company;

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
public class CompanyQueryRequest extends PageRequest implements Serializable {
    /**
     * 主键
     */
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

    private static final long serialVersionUID = 1L;
}
package com.my.springbootinit.model.dto.business;

import com.my.springbootinit.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 用户查询请求
 *

 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessQueryRequest extends PageRequest implements Serializable {
    /**
     * 主键
     */
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

    private static final long serialVersionUID = 1L;
}
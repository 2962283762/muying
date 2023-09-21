package com.my.springbootinit.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my.springbootinit.common.BaseResponse;
import com.my.springbootinit.common.ErrorCode;
import com.my.springbootinit.common.ResultUtils;
import com.my.springbootinit.constant.CommonConstant;
import com.my.springbootinit.exception.BusinessException;
import com.my.springbootinit.model.dto.business.BusinessQueryRequest;
import com.my.springbootinit.model.entity.Business;
import com.my.springbootinit.service.BusinessService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/business")
@Slf4j
public class BusinessController {

    @Resource
    private BusinessService businessService;

    /**
     * 分页查询
     *
     * @param businessQueryRequest
     * @return
     */
    @GetMapping("/list/page")
    public BaseResponse<Page<Business>> getBusinessByPage(BusinessQueryRequest businessQueryRequest) {
        if(businessQueryRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Business business = new Business();
        BeanUtils.copyProperties(businessQueryRequest, business);
        long current = businessQueryRequest.getCurrent();
        long pageSize = businessQueryRequest.getPageSize();
        String sortField = businessQueryRequest.getSortField();
        String sortOrder = businessQueryRequest.getSortOrder();
        // 限制爬虫
        if (pageSize > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<Business> queryWrapper = new QueryWrapper<>(business);
        queryWrapper.orderBy(StringUtils.isNotBlank(sortField), sortOrder.equals(CommonConstant.SORT_ORDER_ASC), sortField);
        Page<Business> result = businessService.page(new Page<>(current, pageSize), queryWrapper);
        return ResultUtils.success(result);
    }
}

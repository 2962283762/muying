package com.my.springbootinit.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my.springbootinit.common.BaseResponse;
import com.my.springbootinit.common.ErrorCode;
import com.my.springbootinit.common.ResultUtils;
import com.my.springbootinit.constant.CommonConstant;
import com.my.springbootinit.exception.BusinessException;
import com.my.springbootinit.model.dto.company.CompanyQueryRequest;
import com.my.springbootinit.model.entity.Company;
import com.my.springbootinit.service.CompanyService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/company")
@Slf4j
public class CompanyController {

    @Resource
    private CompanyService companyService;

    /**
     * 分页查询
     *
     * @param companyQueryRequest
     * @return
     */
    @GetMapping("/list/page")
    public BaseResponse<Page<Company>> getCompanyByPage(CompanyQueryRequest companyQueryRequest) {
        if(companyQueryRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Company company = new Company();
        BeanUtils.copyProperties(companyQueryRequest, company);
        long current = companyQueryRequest.getCurrent();
        long pageSize = companyQueryRequest.getPageSize();
        String sortField = companyQueryRequest.getSortField();
        String sortOrder = companyQueryRequest.getSortOrder();
        // 限制爬虫
        if (pageSize > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<Company> queryWrapper = new QueryWrapper<>(company);
        queryWrapper.orderBy(StringUtils.isNotBlank(sortField), sortOrder.equals(CommonConstant.SORT_ORDER_ASC), sortField);
        Page<Company> result = companyService.page(new Page<>(current, pageSize), queryWrapper);
        return ResultUtils.success(result);
    }
}

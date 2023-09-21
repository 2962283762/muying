package com.my.springbootinit.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my.springbootinit.common.BaseResponse;
import com.my.springbootinit.common.ErrorCode;
import com.my.springbootinit.common.ResultUtils;
import com.my.springbootinit.constant.CommonConstant;
import com.my.springbootinit.exception.BusinessException;
import com.my.springbootinit.model.dto.agency.AgencyQueryRequest;
import com.my.springbootinit.model.entity.Agency;
import com.my.springbootinit.service.AgencyService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/agency")
@Slf4j
public class AgencyController {

    @Resource
    private AgencyService agencyService;

    /**
     * 分页查询
     *
     * @param agencyQueryRequest
     * @return
     */
    @GetMapping("/list/page")
    public BaseResponse<Page<Agency>> getAgencyByPage(AgencyQueryRequest agencyQueryRequest) {
        if(agencyQueryRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        Agency agency = new Agency();
        BeanUtils.copyProperties(agencyQueryRequest, agency);
        long current = agencyQueryRequest.getCurrent();
        long pageSize = agencyQueryRequest.getPageSize();
        String sortField = agencyQueryRequest.getSortField();
        String sortOrder = agencyQueryRequest.getSortOrder();
        // 限制爬虫
        if (pageSize > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<Agency> queryWrapper = new QueryWrapper<>(agency);
        queryWrapper.orderBy(StringUtils.isNotBlank(sortField), sortOrder.equals(CommonConstant.SORT_ORDER_ASC), sortField);
        Page<Agency> result = agencyService.page(new Page<>(current, pageSize), queryWrapper);
        return ResultUtils.success(result);
    }
}

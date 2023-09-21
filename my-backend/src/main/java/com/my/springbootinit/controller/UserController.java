package com.my.springbootinit.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my.springbootinit.common.BaseResponse;
import com.my.springbootinit.common.ErrorCode;
import com.my.springbootinit.common.ResultUtils;
import com.my.springbootinit.constant.CommonConstant;
import com.my.springbootinit.exception.BusinessException;
import com.my.springbootinit.model.dto.user.UserQueryRequest;
import com.my.springbootinit.model.entity.User;
import com.my.springbootinit.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 分页查询
     *
     * @param userQueryRequest
     * @return
     */
    @GetMapping("/list/page")
    public BaseResponse<Page<User>> getUserByPage(UserQueryRequest userQueryRequest) {
        if(userQueryRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        User user = new User();
        BeanUtils.copyProperties(userQueryRequest, user);
        long current = userQueryRequest.getCurrent();
        long pageSize = userQueryRequest.getPageSize();
        String sortField = userQueryRequest.getSortField();
        String sortOrder = userQueryRequest.getSortOrder();
        // 限制爬虫
        if (pageSize > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>(user);
        queryWrapper.orderBy(StringUtils.isNotBlank(sortField), sortOrder.equals(CommonConstant.SORT_ORDER_ASC), sortField);
        Page<User> result = userService.page(new Page<>(current, pageSize), queryWrapper);
        return ResultUtils.success(result);
    }
}

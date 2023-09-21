package com.my.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.springbootinit.model.entity.Business;
import com.my.springbootinit.service.BusinessService;
import com.my.springbootinit.mapper.BusinessMapper;
import org.springframework.stereotype.Service;

/**
* @author 25137
* @description 针对表【business】的数据库操作Service实现
* @createDate 2023-09-21 11:24:08
*/
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business>
    implements BusinessService{

}





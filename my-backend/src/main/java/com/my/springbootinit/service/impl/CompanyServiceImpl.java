package com.my.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.springbootinit.model.entity.Company;
import com.my.springbootinit.service.CompanyService;
import com.my.springbootinit.mapper.CompanyMapper;
import org.springframework.stereotype.Service;

/**
* @author 25137
* @description 针对表【company】的数据库操作Service实现
* @createDate 2023-09-21 11:24:05
*/
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company>
    implements CompanyService{

}





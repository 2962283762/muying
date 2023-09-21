package com.my.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.springbootinit.model.entity.Agency;
import com.my.springbootinit.service.AgencyService;
import com.my.springbootinit.mapper.AgencyMapper;
import org.springframework.stereotype.Service;

/**
* @author 25137
* @description 针对表【agency】的数据库操作Service实现
* @createDate 2023-09-21 11:24:11
*/
@Service
public class AgencyServiceImpl extends ServiceImpl<AgencyMapper, Agency>
    implements AgencyService{

}





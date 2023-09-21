package com.my.springbootinit.mapper;

import com.my.springbootinit.model.entity.Business;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 25137
* @description 针对表【business】的数据库操作Mapper
* @createDate 2023-09-21 11:24:08
* @Entity com.my.springbootinit.model.entity.business
*/
@Mapper
public interface BusinessMapper extends BaseMapper<Business> {

}





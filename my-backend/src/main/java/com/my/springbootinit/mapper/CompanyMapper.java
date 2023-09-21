package com.my.springbootinit.mapper;

import com.my.springbootinit.model.entity.Company;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 25137
* @description 针对表【company】的数据库操作Mapper
* @createDate 2023-09-21 11:24:05
* @Entity com.my.springbootinit.model.entity.Company
*/
@Mapper
public interface CompanyMapper extends BaseMapper<Company> {

}





package com.my.springbootinit.mapper;

import com.my.springbootinit.model.entity.Agency;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 25137
* @description 针对表【agency】的数据库操作Mapper
* @createDate 2023-09-21 11:24:11
* @Entity com.my.springbootinit.model.entity.Agency
*/
@Mapper
public interface AgencyMapper extends BaseMapper<Agency> {

}





package com.my.springbootinit.mapper;

import com.my.springbootinit.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 25137
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-09-21 11:23:56
* @Entity com.my.springbootinit.model.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}





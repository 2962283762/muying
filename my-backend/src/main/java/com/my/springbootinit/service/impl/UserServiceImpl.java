package com.my.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.springbootinit.model.entity.User;
import com.my.springbootinit.service.UserService;
import com.my.springbootinit.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 25137
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-09-21 11:23:56
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}





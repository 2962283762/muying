package com.my.springbootinit.service;

import com.my.apicommon.model.entity.InterfaceInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author panpengfei
 * @date 2023/9/18
 */
@SpringBootTest
class InterfaceInfoServiceTest {

    @Resource
    private InterfaceInfoService interfaceInfoService;

    @Test
    void testInterfaceInfo () {
        long id = 8;
        InterfaceInfo res = interfaceInfoService.getById(id);
        System.out.println(res);
    }

}
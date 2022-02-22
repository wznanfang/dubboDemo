package com.wzp.dubboprovider2.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzp.dubboapi.service.HelloService;

/**
 * @author zp.wei
 * @date 2022/2/22 12:10
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        System.out.println("name111:"+name);
        return "Hello11111, " + name;
    }
}

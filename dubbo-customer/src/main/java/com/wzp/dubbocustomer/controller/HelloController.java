package com.wzp.dubbocustomer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wzp.dubboapi.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zp.wei
 * @date 2022/2/22 14:24
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @GetMapping("/sayHello")
    private String sayHello(@RequestParam String name){
        System.out.println("调用sayHello成功了..." + " name:" + name);
        return helloService.sayHello(name);
    }


}

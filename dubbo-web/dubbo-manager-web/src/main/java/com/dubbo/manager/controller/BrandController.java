package com.dubbo.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.pojo.Brand;
import com.dubbo.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Z.K
 * @create: 2019-07-04 14:00:44
 * @description: This is brandController  class!
 **/
@RestController
@RequestMapping("/brand")
public class BrandController {

    //引用服务接口代理对象  timeout:调用服务接口方法超时时间毫秒数
    @Reference(timeout = 10000)
    private BrandService brandService;

    @GetMapping("/findAll")
    public List<Brand> findAll() {
        return brandService.findAll();
    }
}

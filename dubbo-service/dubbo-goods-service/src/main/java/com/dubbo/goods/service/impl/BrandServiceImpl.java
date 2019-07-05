package com.dubbo.goods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.mapper.BrandMapper;
import com.dubbo.pojo.Brand;
import com.dubbo.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: Z.K
 * @create: 2019-07-04 13:58:58
 * @description: This is brandServiceImpl class!
 **/
@Service(interfaceName = "com.dubbo.service.BrandService")
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }
}

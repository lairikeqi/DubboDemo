package com.dubbo.mapper;

import com.dubbo.pojo.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {

    @Select("select * from brand order by id")
    List<Brand> findAll();
}

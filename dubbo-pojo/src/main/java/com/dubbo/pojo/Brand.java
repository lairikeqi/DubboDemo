package com.dubbo.pojo;

import java.io.Serializable;

/**
 * @author: Z.K
 * @create: 2019-07-04 11:43:46
 * @description: This is brand class!
 **/
public class Brand implements Serializable {
    // 主键
    private Long id;
    // 品牌名称
    private String name;
    // 品牌首字母
    private String firstChar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }
}
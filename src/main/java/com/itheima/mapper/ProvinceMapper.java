package com.itheima.mapper;

import com.itheima.pojo.Province;

import java.util.List;

public interface ProvinceMapper {
    //根据code查询province对象
    Province findByCode(String code);

    //查询所有信息
    List<Province> findAll();
}

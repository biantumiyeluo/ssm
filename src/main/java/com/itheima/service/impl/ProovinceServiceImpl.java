package com.itheima.service.impl;

import com.itheima.mapper.ProvinceMapper;
import com.itheima.pojo.Province;
import com.itheima.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.itheima.service.impl
 * @ClassName: ProovinceServiceImpl
 * @Author: renpengzhi
 * @Date: 2019/11/21 0021 上午 11:26
 * @Description: //TODO
 */
@Service("provinceService")
public class ProovinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceMapper provinceMapper;

    public List<Province> findAll() {
        return provinceMapper.findAll();
    }
}

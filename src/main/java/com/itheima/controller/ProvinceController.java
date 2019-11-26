package com.itheima.controller;

import com.itheima.mapper.ProvinceMapper;
import com.itheima.pojo.Province;
import com.itheima.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @PackageName: com.itheima.controller
 * @ClassName: ProvinceController
 * @Author: renpengzhi
 * @Date: 2019/11/21 0021 上午 11:24
 * @Description: //TODO
 */
@Controller
@RequestMapping("/province")
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Province> findAll() {
        List<Province> list = provinceService.findAll();
        return list;
    }
}

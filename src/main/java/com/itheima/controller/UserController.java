package com.itheima.controller;

import com.itheima.domain.PageBean;
import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @PackageName: com.itheima.controller
 * @ClassName: Controller
 * @Author: renpengzhi
 * @Date: 2019/11/20 0020 下午 7:16
 * @Description: //TODO
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    //@ResponseBody
    public String findAll(Model model,
                          //参数必须得有，没有时为默认参数
                          @RequestParam(value = "currentPage", required = false, defaultValue = "1") Integer currentPage,
                          @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize,
                          User user) {
        //System.out.println("SpringMVC");
        PageBean<User> pageBean = userService.findAll(currentPage, pageSize, user);
        model.addAttribute("pageBean", pageBean);

        return "list";
    }

    //添加用户
    @RequestMapping("/toAddUi")
    public String toAddUi() {
        return "add";
    }

    //添加用户信息
    @RequestMapping("/save")
    public String add(User user, HttpServletRequest request) {
        userService.add(user);
        return "redirect:" + request.getContextPath() + "/user/findAll";
    }

    //del
    @RequestMapping("/delete")
    public String del(int id, HttpServletRequest request) {
        userService.delete(id);
        return "redirect:" + request.getContextPath() + "/user/findAll";
    }

    //findById
    @RequestMapping("/findById")
    public String findById(int id, Model model) {
        User user = userService.findId(id);

        model.addAttribute("user", user);
        return "update";
    }

    //update
    @RequestMapping("/update")
    public String update(User user, HttpServletRequest request) {
        userService.update(user);

        return "redirect:" + request.getContextPath() + "/user/findAll";
    }

    //删除选中
    @RequestMapping("/deleteSelect")
    public String deleteSelect(int[] checkbox, HttpServletRequest request) {
        userService.deleteSelect(checkbox);

        return "redirect:" + request.getContextPath() + "/user/findAll";
    }

    //查询所有用户
    @RequestMapping("/findTotal")
    @ResponseBody
    public String findTotal(Model model) {
        List<User> userList = userService.findTotal();

        System.out.println(userList);
        model.addAttribute("userList", userList);
        return null;
    }

    //login
    @RequestMapping("/login")
    public String login(User user, HttpSession session, HttpServletRequest request) {

        User loginuser = userService.findUser(user);
        if (loginuser != null) {

            session.setAttribute("loginuser", loginuser);

            return "redirect:" + request.getContextPath() + "/user/findAll";
        }
        return "login";
    }
}

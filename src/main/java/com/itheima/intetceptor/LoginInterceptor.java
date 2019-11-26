package com.itheima.intetceptor;

import com.itheima.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @PackageName: com.itheima.intetceptor
 * @ClassName: LoginInterceptor
 * @Author: renpengzhi
 * @Date: 2019/11/21 0021 下午 6:04
 * @Description: //TODO
 */
public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User loginuser = (User) request.getSession().getAttribute("loginuser");

        //测试  System.out.println(loginuser);

        if (loginuser == null) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);

            return false;
        }
        return true;
    }
}

package com.demo.satokendemo.controller;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/5/7 15:33
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    /**
     * 测试登录，浏览器访问： http://localhost:8888/user/doLogin?username=zhang&password=123456
     *
     *@author Administrator
     *@date 2022/5/7 15:16
     *@return
     */
    @RequestMapping("doLogin")
    public String doLogin(String username, String password) {
        // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对
        if("zhang".equals(username) && "123456".equals(password)) {
            StpUtil.login(10001);
            return "登录成功";
        }
        return "登录失败";
    }

    /**
     *查询登录状态，浏览器访问： http://localhost:8888/user/isLogin
     *
     *@author Administrator
     *@date 2022/5/7 15:16
     *@return
     */
    @RequestMapping("isLogin")
    public String isLogin() {
        return "当前会话是否登录：" + StpUtil.isLogin();
    }
}


package com.demo.satokendemo.controller;

import cn.dev33.satoken.annotation.*;
import cn.dev33.satoken.util.SaResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/5/7 16:20
 */
@RestController
@RequestMapping("/anno/")
public class AnnotationComntroller {

    /**
     *
     *http://localhost:8888/anno/getMoney
     *登录认证 —— 只有登录之后才能进入该方法
     *@author Administrator
     *@date 2022/5/7 16:30
     *@return
     */
    @SaCheckLogin
    @RequestMapping("getMoney")
    public SaResult isLogin() {
        return SaResult.ok("100$");
    }

    // 登录认证：只有登录之后才能进入该方法
    @SaCheckLogin
    @RequestMapping("info")
    public String info() {
        return "查询用户信息";
    }

    // 角色认证：必须具有指定角色才能进入该方法
    @SaCheckRole("super-admin")
    @RequestMapping("add1")
    public String add1() {
        return "用户增加";
    }

    // 权限认证：必须具有指定权限才能进入该方法
    @SaCheckPermission("user-add")
    @RequestMapping("add2")
    public String add2() {
        return "用户增加";
    }

    // 二级认证：必须二级认证之后才能进入该方法
    @SaCheckSafe()
    @RequestMapping("add3")
    public String add3() {
        return "用户增加";
    }

    // Http Basic 认证：只有通过 Basic 认证后才能进入该方法
    @SaCheckBasic(account = "sa:123456")
    @RequestMapping("add4")
    public String add4() {
        return "用户增加";
    }

}

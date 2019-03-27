package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/login")
public class LoginServlet {

    @RequestMapping(value = "/search")
    public String login(HttpServletRequest request){

        System.out.println("----- 登录 -----");
        /*
        * 校验登录页面的信息，并进行跳转
        * */
        return "login";
    }

    /**
     *
     * 通过添加必要的参数bookid
     * @return
     */
    @RequestMapping(value = "/test/{bookid}")
    public String test(@PathVariable("bookid") String id){

        System.out.println(id);
        System.out.println("查询书籍"+id);
        return "login";
    }
}

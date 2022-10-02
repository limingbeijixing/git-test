package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController extends BaseController {
    @RequestMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("username"));
        System.out.println(request.getParameter("password"));
        System.out.println(request.getParameter("gmtStart"));
        System.out.println(request.getParameter("gmtEnd"));
        return "index";
    }

    @RequestMapping("/main")
    public String main(HttpServletRequest request, HttpServletResponse response) {
        return "main";
    }
}

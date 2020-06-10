package com.wangyii.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping("/hello")
    public String hello(){
        return "/hello.jsp";
    }
    @RequestMapping("/new")
    public ModelAndView newp(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("new");
        modelAndView.addObject("num",8);
        return modelAndView;
    }
}

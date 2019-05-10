package com.manage.teacher.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class IndexAction {

    Logger log = LoggerFactory.getLogger(IndexAction.class);
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /*@PostMapping("/auth/login.action")
    public ModelAndView login(HttpServletRequest request,@ModelAttribute XtUser xtUser){
        ModelAndView view = new ModelAndView();
        if (xtUser.getUsercode().equals("admin")&&xtUser.getPassword().equals("admin")){

            view.addObject("usercode",xtUser.getUsercode());
            view.setViewName("index");
        }else{
            view.addObject("msg","用户名或密码错误！");
            view.setViewName("login");
        }
        //查询所有权限
        //List<XtAuth> lists = xtAuthMapper.selectAll();

        return view;
    }*/
}

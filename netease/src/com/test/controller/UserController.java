package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xiezuoyuan on 2018/3/3.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    public UserController(){
        System.out.println("接收到UserController");
    }

    @RequestMapping(value="/index",method= RequestMethod.GET)
    public ModelAndView index()
    {
        ModelAndView mov=new ModelAndView();
        mov.setViewName("index");
        return mov;
    }

    @RequestMapping(value="/save",method= RequestMethod.POST,produces="text/html;charset=UTF-8")
    public ModelAndView save(String name, String age)
    {
        System.out.println("接收到的用户信息："+name+" age:"+age);


        //...
        int id = 1;



        ModelAndView mov=new ModelAndView();
        mov.setViewName("saveUserSuccess");
        mov.addObject("msg", "保存成功了");
        mov.addObject("id", id);

        return mov;
    }

    @RequestMapping(value="/xqy",method= RequestMethod.POST,produces="text/html;charset=UTF-8")
    public ModelAndView xqy(String name, String age)
    {
        System.out.println("接收到的用户信息："+name+" age:"+age);


        //...
        int id = 1;



        ModelAndView mov=new ModelAndView();
        mov.setViewName("saveUserSuccess");
        mov.addObject("msg", "保存成功了");
        mov.addObject("id", id);

        return mov;
    }

    @RequestMapping(value="/qy",method= RequestMethod.POST,produces="text/html;charset=UTF-8")
    public ModelAndView qy(String name, String age)
    {
        System.out.println("接收到的用户信息："+name+" age:"+age);


        //...
        int id = 1;



        ModelAndView mov=new ModelAndView();
        mov.setViewName("saveUserSuccess");
        mov.addObject("msg", "保存成功了");
        mov.addObject("id", id);

        return mov;
    }

}

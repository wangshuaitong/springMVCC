package com.controller;

import com.entity.Master;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/user")
@Controller
public class AddMasterHandler {

    @RequestMapping(value="/add",method = RequestMethod.GET)
    public String addMaster(){

        System.out.println("进入添加信息页面");
        return "addMaster";
    }

    @RequestMapping(value = "/addMaster",method = RequestMethod.POST)
    public String addMasterInfo(Master master){

        System.out.println(master.getName().toString());
        return "welcome";
    }
}

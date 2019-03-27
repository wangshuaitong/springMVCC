package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RequestMapping(value = "/user")
@Controller
public class BookHandler {

    @RequestMapping(value = "/book/{id}",method = RequestMethod.GET)
    public String getBook(@PathVariable("id") String id){

        System.out.println("购买第"+ id +"书籍成功了2");

        return "bookOk";
    }

    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public String postBook(@PathVariable("id") String id){

        System.out.println("购买第"+ id +"书籍成功了");

        return "bookOk";
    }

    @RequestMapping(value = "/book/{id}",method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable("id") String id){

        System.out.println("删除"+id+"本书");
        return "bookOK";
    }
}

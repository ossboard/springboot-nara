package com.nara.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class Demo2Controller {

    @RequestMapping(value = "/demo2", method = RequestMethod.GET)
    public String demo2(HttpServletRequest request, HttpSession session) {
        return "demo2/index";
    }

}

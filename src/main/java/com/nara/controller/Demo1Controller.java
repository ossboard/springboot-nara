package com.nara.controller;

import com.nara.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class Demo1Controller {


    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/demo1", method = RequestMethod.GET)
    public String demo1(ModelMap modelMap, HttpServletRequest request) {
        return "demo1/index1";
    }

    @RequestMapping(value = "/demo1/list", method = RequestMethod.GET)
    public String demo1List(ModelMap modelMap, HttpServletRequest request) {
        List<Map> items = demoService.getDemo1(null);
        modelMap.addAttribute("items", items);
        return "demo1/list1";
    }

}

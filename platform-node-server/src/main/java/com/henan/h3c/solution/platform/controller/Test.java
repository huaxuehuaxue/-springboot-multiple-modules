package com.henan.h3c.solution.platform.controller;

//import com.henan.h3c.solution.platform.ca.server.util.TestUtil;
import com.henan.h3c.solution.platform.ca.server.util.TestUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
    private static TestUtil testUtil;

    @RequestMapping(value = "/test1/", method = RequestMethod.GET)
    @ResponseBody
    public String test1(){
        return "spring boot multiple modules test1";
    }

    @RequestMapping(value = "/test2/{number1}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public static String test2(@PathVariable int number1, @PathVariable int number2) {
        return  number1 + "+" + number2 + "=" + testUtil.add(number1,number2);
        //return  number1 + "+" + number2 + "=" + (number1 + number2);
    }



}

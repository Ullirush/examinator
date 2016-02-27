package com.examinator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tr0tt3l on 27.02.16.
 */
@Controller
public class FirstController {

    @RequestMapping("hi")
    @ResponseBody
    public String hi() {
        return "Hello, world.";
    }
}
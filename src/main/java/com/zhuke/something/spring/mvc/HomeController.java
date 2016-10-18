package com.zhuke.something.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ZHUKE on 2016/9/27.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/{id}")
    public String home(@PathVariable("id") long id) {
        return "home";
    }

    @RequestMapping(path = "/home")
    public String home1(@Validated Spittle spittle, Errors error) {
        System.out.println(error.hasErrors());
        System.out.println(spittle);
        return "/2";
    }
}

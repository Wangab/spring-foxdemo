package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class IndexController {

    @RequestMapping("/")
    public String index() {
        return "redirect:swagger-ui.html";
//        return "forward:/swagger-ui.html";
    }
}
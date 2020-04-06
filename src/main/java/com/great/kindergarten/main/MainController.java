package com.great.kindergarten.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/main")
    public String Main() {
        return "mainjsp/main";
    }

    @RequestMapping("/about")
    public String About() {
        return "mainjsp/about";
    }

    @RequestMapping("/detail")
    public String Detail() {
        return "mainjsp/detail";
    }

    @RequestMapping("/login")
    public String Login() {
        return "parentjsp/userLogin";
    }

}

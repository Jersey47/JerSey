package com.great.kindergarten.security.controller;

import com.great.kindergarten.security.service.SecurityService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/security")
public class SecurityController {

    @Resource
    private SecurityService securityService;
}

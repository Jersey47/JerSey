package com.great.kindergarten.healther.controller;

import com.great.kindergarten.healther.service.HealtherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/healther")
public class HealtherController {

    @Resource
    private HealtherService healtherService;
}

package com.great.kindergarten.parent.controller;

import com.great.kindergarten.parent.service.ParentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/parent")
public class ParentController {

    @Resource
    private ParentService parentService;
}

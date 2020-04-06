package com.great.kindergarten.rector.controller;

import com.great.kindergarten.rector.service.RectorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/rector")
public class RectorController {

    @Resource
    private RectorService rectorService;
}

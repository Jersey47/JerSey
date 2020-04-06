package com.great.kindergarten.healther.service;

import com.great.kindergarten.healther.mapper.HealtherMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class HealtherService {

    @Resource
    private HealtherMapper healtherMapper;

}

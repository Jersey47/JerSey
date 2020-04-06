package com.great.kindergarten.security.service;

import com.great.kindergarten.admin.mapper.AdminMapper;
import com.great.kindergarten.security.mapper.SecurityMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class SecurityService {

    @Resource
    private SecurityMapper securityMapper;

}

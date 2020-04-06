package com.great.kindergarten.admin.service;

import com.great.kindergarten.admin.mapper.AdminMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class AdminService {

    @Resource
    private AdminMapper adminMapper;

}

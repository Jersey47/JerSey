package com.great.kindergarten.rector.service;

import com.great.kindergarten.admin.mapper.AdminMapper;
import com.great.kindergarten.rector.mapper.RectorMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class RectorService {

    @Resource
    private RectorMapper rectorMapper;

}

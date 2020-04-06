package com.great.kindergarten.parent.service;

import com.great.kindergarten.parent.mapper.ParentMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class ParentService {

    @Resource
    private ParentMapper parentMapper;

}

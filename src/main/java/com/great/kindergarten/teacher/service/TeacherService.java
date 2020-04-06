package com.great.kindergarten.teacher.service;

import com.great.kindergarten.admin.mapper.AdminMapper;
import com.great.kindergarten.teacher.mapper.TeacherMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class TeacherService {

    @Resource
    private TeacherMapper teacherMapper;

}

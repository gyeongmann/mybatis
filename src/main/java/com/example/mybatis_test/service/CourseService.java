package com.example.mybatis_test.service;

import com.example.mybatis_test.dto.CourseDto;

import java.util.List;

public interface CourseService {

    public List<CourseDto> findAll();

    public CourseDto findById(Long courseId);
}

package com.example.mybatis_test.mapper;

import com.example.mybatis_test.dto.CourseDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {

    List<CourseDto> findAll();

    CourseDto findById(Long courseId);
}
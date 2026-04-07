package com.example.mybatis_test.service.serviceImpl;

import com.example.mybatis_test.dto.CourseDto;
import com.example.mybatis_test.mapper.CourseMapper;
import com.example.mybatis_test.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseMapper courseMapper;

    @Override
    public List<CourseDto> findAll() {
        return courseMapper.findAll();
    }

    @Override
    public CourseDto findById(Long courseId) {
        return courseMapper.findById(courseId);
    }
}

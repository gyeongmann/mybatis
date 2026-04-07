package com.example.mybatis_test.controller;

import com.example.mybatis_test.dto.CourseDto;
import com.example.mybatis_test.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    public List<CourseDto> findAll() {
        return courseService.findAll();
    }

    @GetMapping("/{id}")
    public CourseDto findById(@PathVariable Long id) {
        return courseService.findById(id);
    }
}
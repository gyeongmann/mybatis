package com.example.mybatis_test.service;

import com.example.mybatis_test.dto.StudentDto;

import java.util.List;

public interface StudentService {

    public List<StudentDto> findAll();

    public StudentDto findById(Long studentId);
}

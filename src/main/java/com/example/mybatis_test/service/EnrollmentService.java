package com.example.mybatis_test.service;

import com.example.mybatis_test.dto.EnrollmentDto;

import java.util.List;

public interface EnrollmentService {

    List<EnrollmentDto> findAll();

    List<EnrollmentDto> findByStudentId(Long studentId);

    int insert(EnrollmentDto enrollmentDto);

    int deleteById(Long enrollmentId);
}

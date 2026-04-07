package com.example.mybatis_test.mapper;

import com.example.mybatis_test.dto.EnrollmentDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnrollmentMapper {

    List<EnrollmentDto> findAll();

    List<EnrollmentDto> findByStudentId(Long studentId);

    int insert(EnrollmentDto enrollmentDto);

    int deleteById(Long enrollmentId);
}
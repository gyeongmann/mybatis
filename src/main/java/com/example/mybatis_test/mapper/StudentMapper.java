package com.example.mybatis_test.mapper;

import com.example.mybatis_test.dto.StudentDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<StudentDto> findAll();

    StudentDto findById(Long studentId);
}
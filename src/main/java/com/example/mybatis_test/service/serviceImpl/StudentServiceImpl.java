package com.example.mybatis_test.service.serviceImpl;

import com.example.mybatis_test.dto.StudentDto;
import com.example.mybatis_test.mapper.StudentMapper;
import com.example.mybatis_test.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;

    @Override
    public List<StudentDto> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public StudentDto findById(Long studentId) {
        return studentMapper.findById(studentId);
    }
}

package com.example.mybatis_test.service.serviceImpl;

import com.example.mybatis_test.dto.EnrollmentDto;
import com.example.mybatis_test.mapper.EnrollmentMapper;
import com.example.mybatis_test.service.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentMapper enrollmentMapper;

    @Override
    public List<EnrollmentDto> findAll() {
        return enrollmentMapper.findAll();
    }

    @Override
    public List<EnrollmentDto> findByStudentId(Long studentId) {
        return enrollmentMapper.findByStudentId(studentId);
    }

    @Override
    @Transactional
    public int insert(EnrollmentDto enrollmentDto) {
        return enrollmentMapper.insert(enrollmentDto);
    }

    @Override
    @Transactional
    public int deleteById(Long enrollmentId) {
        return enrollmentMapper.deleteById(enrollmentId);
    }

}

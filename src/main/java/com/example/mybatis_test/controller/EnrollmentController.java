package com.example.mybatis_test.controller;

import com.example.mybatis_test.dto.EnrollmentDto;
import com.example.mybatis_test.service.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
@RequiredArgsConstructor
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    @GetMapping
    public List<EnrollmentDto> findAll() {
        return enrollmentService.findAll();
    }

    @GetMapping("/student/{studentId}")
    public List<EnrollmentDto> findByStudentId(@PathVariable Long studentId) {
        return enrollmentService.findByStudentId(studentId);
    }

    @PostMapping
    public int insert(@RequestBody EnrollmentDto enrollmentDto) {
        return enrollmentService.insert(enrollmentDto);
    }

    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable Long id) {
        return enrollmentService.deleteById(id);
    }
}
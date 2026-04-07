package com.example.mybatis_test.controller;

import com.example.mybatis_test.dto.StudentDto;
import com.example.mybatis_test.service.StudentService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students";
    }

    @GetMapping("/{id}")
    public StudentDto findById(@PathVariable Long id) {
        return studentService.findById(id);
    }
}
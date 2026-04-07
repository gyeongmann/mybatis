package com.example.mybatis_test.controller;

import com.example.mybatis_test.dto.ProfessorDto;
import com.example.mybatis_test.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professors")
@RequiredArgsConstructor
public class ProfessorController {

    private final ProfessorService professorService;

    @GetMapping
    public List<ProfessorDto> findAll() {
        return professorService.findAll();
    }

    @GetMapping("/{id}")
    public ProfessorDto findById(@PathVariable Long id) {
        return professorService.findById(id);
    }
}
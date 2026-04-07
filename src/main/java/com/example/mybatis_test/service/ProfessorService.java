package com.example.mybatis_test.service;

import com.example.mybatis_test.dto.ProfessorDto;

import java.util.List;

public interface ProfessorService {

    public List<ProfessorDto> findAll();

    public ProfessorDto findById(Long professorId);
}

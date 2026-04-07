package com.example.mybatis_test.service.serviceImpl;

import com.example.mybatis_test.dto.ProfessorDto;
import com.example.mybatis_test.mapper.ProfessorMapper;
import com.example.mybatis_test.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessorServiceImpl implements ProfessorService {

    private final ProfessorMapper professorMapper;

    @Override
    public List<ProfessorDto> findAll() {
        return professorMapper.findAll();
    }

    @Override
    public ProfessorDto findById(Long professorId) {
        return professorMapper.findById(professorId);
    }
}

package com.example.mybatis_test.mapper;

import com.example.mybatis_test.dto.ProfessorDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProfessorMapper {

    List<ProfessorDto> findAll();

    ProfessorDto findById(Long professorId);
}
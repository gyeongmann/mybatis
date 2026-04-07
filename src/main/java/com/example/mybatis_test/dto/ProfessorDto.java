package com.example.mybatis_test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfessorDto {

    private Long professorId;
    private String professorNo;
    private String name;
    private String department;
    private String office;
}

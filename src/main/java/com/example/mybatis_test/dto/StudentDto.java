package com.example.mybatis_test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private Long studentId;
    private String studentNo;
    private String name;
    private String department;
    private Integer grade;
}

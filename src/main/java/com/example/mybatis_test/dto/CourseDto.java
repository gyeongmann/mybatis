package com.example.mybatis_test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {

    private Long courseId;
    private String courseCode;
    private String courseName;
    private Integer credit;
    private Long professorId;
}

package com.example.mybatis_test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentDto {

    private Long enrollmentId;
    private Long studentId;
    private Long courseId;
    private String semester;
    private String status;
}

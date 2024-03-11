package com.example.MyBatisDemo.dto;

import lombok.Data;

@Data
public class SubjectTeacherDisplayDto {
    private Long id;
    private String name;
    private int credits;
    private TeacherDisplayDto teacher;
}

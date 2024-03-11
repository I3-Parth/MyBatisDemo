package com.example.MyBatisDemo.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentSubjectsDisplayDto {
    private Long id;
    private String name;
    private int age;
    private String email;
    private String city;
    private List<SubjectDisplayDto> subjects;
}

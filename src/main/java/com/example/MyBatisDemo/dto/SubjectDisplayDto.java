package com.example.MyBatisDemo.dto;

import lombok.Data;

@Data
public class SubjectDisplayDto {
    private Long id;
    private String name;
    private int credits;
    private Long teacher;
}

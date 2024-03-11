package com.example.MyBatisDemo.dto;

import lombok.Data;

@Data
public class StudentAdditionDto {
    private Long id;
    private String name;
    private int age;
    private String email;
    private String city;
}

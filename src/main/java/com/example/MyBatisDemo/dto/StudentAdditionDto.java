package com.example.MyBatisDemo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class StudentAdditionDto {
    @NotBlank(message = "id is mandatory")
    private Long id;
    @NotBlank(message = "name is mandatory")
    private String name;
    @NotBlank(message = "age is mandatory")
    private int age;
    @NotBlank(message = "email is mandatory")
    private String email;
    @NotBlank(message = "city is mandatory")
    private String city;
}

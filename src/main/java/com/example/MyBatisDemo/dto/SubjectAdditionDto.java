package com.example.MyBatisDemo.dto;

import com.example.MyBatisDemo.model.TeacherEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SubjectAdditionDto {
    @NotBlank(message = "id is mandatory")
    private Long id;
    @NotBlank(message = "name is mandatory")
    private String name;
    @NotBlank(message = "credits is mandatory")
    private int credits;
    @NotBlank(message = "teacher is mandatory")
    private TeacherEntity teacher;
}

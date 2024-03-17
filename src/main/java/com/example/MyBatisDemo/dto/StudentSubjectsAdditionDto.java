package com.example.MyBatisDemo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Data
public class StudentSubjectsAdditionDto {
    @NotBlank(message = "subject ids are mandatory")
    List<Long> subjectIds;
}

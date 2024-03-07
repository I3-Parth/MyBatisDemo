package com.example.MyBatisDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherEntity {

    private Long id;
    private String name;
    private int age;
    private String email;
    private String City;
    private List<SubjectEntity> subjects;
}

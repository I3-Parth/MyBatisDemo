package com.example.MyBatisDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {

    private Long id;
    private String name;
    private int age;
    private String email;
    private String city;
    private List<SubjectEntity> subjects;

}

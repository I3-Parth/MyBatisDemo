package com.example.MyBatisDemo.model;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeacherEntity {

    private Long id;
    private String name;
    private int age;
    private String email;
    private String City;
    private SubjectEntity subject;
}

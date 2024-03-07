package com.example.MyBatisDemo.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubjectEntity {

    private Long id;
    private String name;
    private int credits;
    private TeacherEntity teacher;
}

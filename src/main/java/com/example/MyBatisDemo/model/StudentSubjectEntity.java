package com.example.MyBatisDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentSubjectEntity {
    private Long id;
    private Long student_id;
    private Long subject_id;
}

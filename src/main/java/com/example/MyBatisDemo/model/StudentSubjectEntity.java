package com.example.MyBatisDemo.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentSubjectEntity {
    private Long id;
    private StudentEntity student_id;
    private SubjectEntity subject_id;
}

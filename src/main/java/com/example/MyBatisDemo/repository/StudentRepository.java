package com.example.MyBatisDemo.repository;

import com.example.MyBatisDemo.model.StudentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Mapper
public interface StudentRepository {
    List<StudentEntity> findAllStudents();
    StudentEntity findStudentById(Long id);
    StudentEntity findSubjectsByStudentId(Long id);
    Long addStudent(StudentEntity student);
    void assignSubjectsToStudent(@Param("student_id") Long student_id, @Param("subject_id") List<Long> subject_id);
}

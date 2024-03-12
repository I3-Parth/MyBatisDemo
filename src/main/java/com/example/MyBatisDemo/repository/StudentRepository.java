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
    boolean addStudent(StudentEntity student);
    void assignSubjectsToStudent(@Param("studentId") Long studentId, @Param("subjectIds") List<Long> subjectIds);
}

package com.example.MyBatisDemo.repository;

import com.example.MyBatisDemo.config.MyBatisDBConnMapper;
import com.example.MyBatisDemo.model.StudentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@MyBatisDBConnMapper
public interface StudentRepository {
    List<StudentEntity> findAllStudents(@Param("name") String name,@Param("age") Integer age,@Param("city") String city);
    StudentEntity findStudentById(Long id);
    StudentEntity findSubjectsByStudentId(Long id);
    boolean addStudent(StudentEntity student);
    void assignSubjectsToStudent(@Param("studentId") Long studentId, @Param("subjectIds") List<Long> subjectIds);
}

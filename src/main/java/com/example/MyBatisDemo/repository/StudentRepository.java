package com.example.MyBatisDemo.repository;

import com.example.MyBatisDemo.model.StudentEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentRepository {
    List<StudentEntity> findAllStudents();
    StudentEntity findStudentById(Long id);
    StudentEntity findSubjectsByStudentId(Long id);
}

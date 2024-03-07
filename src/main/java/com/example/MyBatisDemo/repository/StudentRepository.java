package com.example.MyBatisDemo.repository;

import com.example.MyBatisDemo.model.StudentEntity;

import java.util.List;

public interface StudentRepository {
    List<StudentEntity> findAllStudents();
    StudentEntity findStudentById(Long id);
}

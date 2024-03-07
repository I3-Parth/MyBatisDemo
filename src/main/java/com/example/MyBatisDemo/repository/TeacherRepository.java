package com.example.MyBatisDemo.repository;

import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.model.TeacherEntity;

import java.util.List;

public interface TeacherRepository {
    List<TeacherEntity> findAllTeachers();
    TeacherEntity findTeacherById(Long id);
}

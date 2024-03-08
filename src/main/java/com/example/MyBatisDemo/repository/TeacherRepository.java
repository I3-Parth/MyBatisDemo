package com.example.MyBatisDemo.repository;

import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.model.TeacherEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//@Mapper
public interface TeacherRepository {
    List<TeacherEntity> findAllTeachers();
    TeacherEntity findTeacherById(Long id);
}

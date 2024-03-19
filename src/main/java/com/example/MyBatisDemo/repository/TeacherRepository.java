package com.example.MyBatisDemo.repository;

import com.example.MyBatisDemo.config.MyBatisDBConnMapper;
import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.model.TeacherEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@MyBatisDBConnMapper
public interface TeacherRepository {
    List<TeacherEntity> findAllTeachers();
    TeacherEntity findTeacherById(Long id);
    TeacherEntity findSubjectsByTeacherId(Long id);

    boolean addTeacher(TeacherEntity teacher);
}

package com.example.MyBatisDemo.repository;

import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.model.SubjectEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SubjectRepository {
    List<SubjectEntity> findAllSubjects();
    SubjectEntity findSubjectById(Long id);
}

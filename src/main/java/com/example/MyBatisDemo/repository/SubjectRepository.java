package com.example.MyBatisDemo.repository;

import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.model.SubjectEntity;

import java.util.List;

public interface SubjectRepository {
    List<SubjectEntity> findAllSubjects();
    SubjectEntity findSubjectById(Long id);
}

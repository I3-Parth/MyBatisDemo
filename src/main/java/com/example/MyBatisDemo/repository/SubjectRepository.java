package com.example.MyBatisDemo.repository;

import com.example.MyBatisDemo.config.MyBatisDBConnMapper;
import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.model.SubjectEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@MyBatisDBConnMapper
public interface SubjectRepository {
    List<SubjectEntity> findAllSubjects();
    SubjectEntity findSubjectById(Long id);
    SubjectEntity displaySubjectById(Long id);
    boolean addSubject(SubjectEntity subject);
}

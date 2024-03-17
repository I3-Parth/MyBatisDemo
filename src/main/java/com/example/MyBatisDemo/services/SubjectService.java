package com.example.MyBatisDemo.services;

import com.example.MyBatisDemo.dto.StudentAdditionDto;
import com.example.MyBatisDemo.dto.SubjectAdditionDto;
import com.example.MyBatisDemo.dto.SubjectDisplayDto;
import com.example.MyBatisDemo.dto.SubjectTeacherDisplayDto;
import com.example.MyBatisDemo.mapstructMapper.SubjectMapper;
import com.example.MyBatisDemo.model.SubjectEntity;
import com.example.MyBatisDemo.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubjectService {

    @Autowired
    SubjectMapper subjectMapper;

    @Autowired
    SubjectRepository subjectRepository;

    public List<SubjectDisplayDto> getAllSubjects(){
        return subjectMapper.convertListOfSubjectEntityToSubjectDisplayDto(subjectRepository.findAllSubjects());
    }

    public SubjectTeacherDisplayDto getSubjectById(Long id){
        return subjectMapper.convertSubjectEntityToSubjectTeacherDisplayDto(subjectRepository.findSubjectById(id));
    }

    public SubjectTeacherDisplayDto addSubject(SubjectAdditionDto subjectAdditionDto){
        subjectRepository.addSubject(subjectMapper.convertSubjectAdditionDtoToSubjectEntity(subjectAdditionDto));
        return getSubjectById(subjectAdditionDto.getId());
    }
}

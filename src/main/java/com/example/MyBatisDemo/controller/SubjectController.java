package com.example.MyBatisDemo.controller;

import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.model.SubjectEntity;
import com.example.MyBatisDemo.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    SubjectRepository subjectRepository;

    @GetMapping
    public List<SubjectEntity> getAllSubjects(){
        return subjectRepository.findAllSubjects();
    }

    @GetMapping("/{id}")
    public SubjectEntity getSubjectById(@PathVariable(value = "id")Long id){
        return subjectRepository.findSubjectById(id);
    }
}

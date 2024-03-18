package com.example.MyBatisDemo.controller;

import com.example.MyBatisDemo.dto.SubjectAdditionDto;
import com.example.MyBatisDemo.dto.SubjectDisplayDto;
import com.example.MyBatisDemo.dto.SubjectTeacherDisplayDto;
import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.model.SubjectEntity;
import com.example.MyBatisDemo.repository.SubjectRepository;
import com.example.MyBatisDemo.services.SubjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @GetMapping
    public List<SubjectDisplayDto> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

    @GetMapping("/{id}")
    public SubjectTeacherDisplayDto getSubjectById(@PathVariable(value = "id")Long id){
        return subjectService.getSubjectById(id);
    }

    @PostMapping
    public SubjectTeacherDisplayDto addSubject(@Valid @RequestBody SubjectAdditionDto subjectAdditionDto){
        return subjectService.addSubject(subjectAdditionDto);
    }
}

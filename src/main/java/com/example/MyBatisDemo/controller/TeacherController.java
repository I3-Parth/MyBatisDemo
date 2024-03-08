package com.example.MyBatisDemo.controller;

import com.example.MyBatisDemo.model.SubjectEntity;
import com.example.MyBatisDemo.model.TeacherEntity;
import com.example.MyBatisDemo.repository.SubjectRepository;
import com.example.MyBatisDemo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping
    public List<TeacherEntity> getAllTeachers(){
        return teacherRepository.findAllTeachers();
    }

    @GetMapping("/{id}")
    public TeacherEntity getTeacherById(@PathVariable(value = "id")Long id){
        return teacherRepository.findTeacherById(id);
    }
}

package com.example.MyBatisDemo.controller;

import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.repository.StudentRepository;
import com.example.MyBatisDemo.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;


    @GetMapping
    public List<StudentEntity> getAllStudents(){
        return studentRepository.findAllStudents();
    }

    @GetMapping("/{id}")
    public StudentEntity getStudentById(@PathVariable(value = "id")Long id){
        return studentRepository.findStudentById(id);
    }
}

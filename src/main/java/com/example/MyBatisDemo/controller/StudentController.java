package com.example.MyBatisDemo.controller;

import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.repository.StudentRepository;
import com.example.MyBatisDemo.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}/subjects")
    public StudentEntity findSubjectsByStudentId(@PathVariable(value = "id")Long id){
        return studentRepository.findSubjectsByStudentId(id);
    }

    @PostMapping
    public StudentEntity addStudent(@RequestBody StudentEntity student){
        Long id = studentRepository.addStudent(student);
        return studentRepository.findStudentById(id);
    }

    @PostMapping("/{id}/subjects")
    public StudentEntity assignSubjectsToStudent(@PathVariable(value = "id")Long id, @RequestBody List<Long> subjectIds){
        studentRepository.assignSubjectsToStudent(id,subjectIds);
        return studentRepository.findSubjectsByStudentId(id);
    }
}

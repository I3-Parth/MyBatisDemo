package com.example.MyBatisDemo.controller;

import com.example.MyBatisDemo.dto.StudentAdditionDto;
import com.example.MyBatisDemo.dto.StudentDisplayDto;
import com.example.MyBatisDemo.dto.StudentSubjectsAdditionDto;
import com.example.MyBatisDemo.dto.StudentSubjectsDisplayDto;
import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.repository.StudentRepository;
import com.example.MyBatisDemo.repository.SubjectRepository;
import com.example.MyBatisDemo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<StudentDisplayDto> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDisplayDto getStudentById(@PathVariable(value = "id")Long id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/{id}/subjects")
    public StudentSubjectsDisplayDto findSubjectsByStudentId(@PathVariable(value = "id")Long id){
        return studentService.findSubjectsByStudentId(id);
    }

    @PostMapping
    public StudentDisplayDto addStudent(@RequestBody StudentAdditionDto studentAdditionDto){
        return studentService.addStudent(studentAdditionDto);
    }

    @PostMapping("/{id}/subjects")
    public StudentSubjectsDisplayDto assignSubjectsToStudent(@PathVariable(value = "id")Long id, @RequestBody StudentSubjectsAdditionDto subjectsAdditionDto){
        return studentService.assignSubjectsToStudent(id, subjectsAdditionDto);
    }
}

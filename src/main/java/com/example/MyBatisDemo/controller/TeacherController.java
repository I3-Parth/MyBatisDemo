package com.example.MyBatisDemo.controller;

import com.example.MyBatisDemo.dto.TeacherAdditionDto;
import com.example.MyBatisDemo.dto.TeacherDisplayDto;
import com.example.MyBatisDemo.dto.TeacherSubjectsDisplayDto;
import com.example.MyBatisDemo.model.SubjectEntity;
import com.example.MyBatisDemo.model.TeacherEntity;
import com.example.MyBatisDemo.repository.SubjectRepository;
import com.example.MyBatisDemo.repository.TeacherRepository;
import com.example.MyBatisDemo.services.TeacherService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping
    public List<TeacherDisplayDto> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public TeacherDisplayDto getTeacherById(@PathVariable(value = "id")Long id){
        return teacherService.getTeacherById(id);
    }

    @GetMapping("/{id}/subjects")
    public TeacherSubjectsDisplayDto findSubjectsByTeacherId(@PathVariable(value = "id")Long id){
        return teacherService.findSubjectsByTeacherId(id);
    }

    @PostMapping
    public boolean addTeacher(@Valid @RequestBody TeacherAdditionDto teacherAdditionDto){
        return teacherService.addTeacher(teacherAdditionDto);
    }
}

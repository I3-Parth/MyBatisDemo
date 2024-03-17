package com.example.MyBatisDemo.services;

import com.example.MyBatisDemo.dto.TeacherAdditionDto;
import com.example.MyBatisDemo.dto.TeacherDisplayDto;
import com.example.MyBatisDemo.dto.TeacherSubjectsDisplayDto;
import com.example.MyBatisDemo.mapstructMapper.TeacherMapper;
import com.example.MyBatisDemo.model.TeacherEntity;
import com.example.MyBatisDemo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    TeacherMapper teacherMapper;

    public List<TeacherDisplayDto> getAllTeachers(){
        return teacherMapper.convertListOfTeacherEntityToTeacherDisplayDto(teacherRepository.findAllTeachers());
    }

    public TeacherDisplayDto getTeacherById(Long id){
        return teacherMapper.convertTeacherEntityToTeacherDisplayDto(teacherRepository.findSubjectsByTeacherId(id));
    }

    public TeacherSubjectsDisplayDto findSubjectsByTeacherId(Long id){
        return teacherMapper.convertTeacherEntityToTeacherSubjectsDisplayDto(teacherRepository.findSubjectsByTeacherId(id));
    }

    public TeacherDisplayDto addTeacher(TeacherAdditionDto teacherAdditionDto){
        teacherRepository.addTeacher(teacherMapper.convertTeacherAdditionDtoToTeacherEntity(teacherAdditionDto));
        return getTeacherById(teacherAdditionDto.getId());
    }
}

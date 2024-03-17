package com.example.MyBatisDemo.services;

import com.example.MyBatisDemo.dto.StudentAdditionDto;
import com.example.MyBatisDemo.dto.StudentDisplayDto;
import com.example.MyBatisDemo.dto.StudentSubjectsAdditionDto;
import com.example.MyBatisDemo.dto.StudentSubjectsDisplayDto;
import com.example.MyBatisDemo.mapstructMapper.StudentMapper;
import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentMapper studentMapper;

    public List<StudentDisplayDto> getAllStudents(){
        return studentMapper.convertListOfStudentEntityToStudentDisplayDto(studentRepository.findAllStudents());
    }

    public StudentDisplayDto getStudentById(Long id){
        return studentMapper.convertStudentEntityToStudentDisplayDto(studentRepository.findStudentById(id));
    }

    public StudentSubjectsDisplayDto findSubjectsByStudentId(Long id){
        return studentMapper.convertStudentEntityToStudentSubjectsDisplayDto(studentRepository.findSubjectsByStudentId(id));
    }

    public StudentDisplayDto addStudent(StudentAdditionDto studentAdditionDto){
        studentRepository.addStudent(studentMapper.convertStudentAdditionDtoToStudentEntity(studentAdditionDto));
        return getStudentById(studentAdditionDto.getId());
    }

    public StudentSubjectsDisplayDto assignSubjectsToStudent(Long id, StudentSubjectsAdditionDto subjectsAdditionDto){
        studentRepository.assignSubjectsToStudent(id, subjectsAdditionDto.getSubjectIds());
        return findSubjectsByStudentId(id);
    }

}

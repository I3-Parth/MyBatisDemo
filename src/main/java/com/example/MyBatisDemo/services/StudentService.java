package com.example.MyBatisDemo.services;

import com.example.MyBatisDemo.dto.StudentAdditionDto;
import com.example.MyBatisDemo.dto.StudentDisplayDto;
import com.example.MyBatisDemo.dto.StudentSubjectsAdditionDto;
import com.example.MyBatisDemo.dto.StudentSubjectsDisplayDto;
import com.example.MyBatisDemo.exceptions.ResourceNotFoundException;
import com.example.MyBatisDemo.mapstructMapper.StudentMapper;
import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.model.SubjectEntity;
import com.example.MyBatisDemo.repository.StudentRepository;
import com.example.MyBatisDemo.repository.SubjectRepository;
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

    @Autowired
    SubjectRepository subjectRepository;
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
        StudentEntity studentEntity = studentMapper.convertStudentAdditionDtoToStudentEntity(studentAdditionDto);
        studentRepository.addStudent(studentEntity);
        return studentMapper.convertStudentEntityToStudentDisplayDto(studentEntity);
    }

    public StudentSubjectsDisplayDto assignSubjectsToStudent(Long id, StudentSubjectsAdditionDto subjectsAdditionDto)throws ResourceNotFoundException {
        List<SubjectEntity> subjectEntities =subjectRepository.findAllSubjects();
        int flag = 0;
        if(subjectsAdditionDto != null){
            for(Long subjectId: subjectsAdditionDto.getSubjectIds()){
                flag = 0;
                for(SubjectEntity s:subjectEntities){
                    if(s.getId().equals(subjectId)){
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0 && subjectId != null){
                    throw new ResourceNotFoundException(subjectId);
                }
            }
        }
        if (subjectsAdditionDto != null) {
            studentRepository.assignSubjectsToStudent(id, subjectsAdditionDto.getSubjectIds());
        }
        return findSubjectsByStudentId(id);
    }

}

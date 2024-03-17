package com.example.MyBatisDemo.mapstructMapper;

import com.example.MyBatisDemo.dto.StudentAdditionDto;
import com.example.MyBatisDemo.dto.StudentDisplayDto;
import com.example.MyBatisDemo.dto.StudentSubjectsAdditionDto;
import com.example.MyBatisDemo.dto.StudentSubjectsDisplayDto;
import com.example.MyBatisDemo.model.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = SubjectMapper.class)
public interface StudentMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "city", target = "city")
    StudentEntity convertStudentAdditionDtoToStudentEntity(StudentAdditionDto studentAdditionDto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "city", target = "city")
    StudentDisplayDto convertStudentEntityToStudentDisplayDto(StudentEntity studentEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "city", target = "city")
    @Mapping(source = "subjects", target = "subjects", ignore = true)
    StudentSubjectsDisplayDto convertStudentEntityToStudentSubjectsDisplayDto(StudentEntity studentEntity);

    List<StudentDisplayDto> convertListOfStudentEntityToStudentDisplayDto(List<StudentEntity> studentEntity);
}

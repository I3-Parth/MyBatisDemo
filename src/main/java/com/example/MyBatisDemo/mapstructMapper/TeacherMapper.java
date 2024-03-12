package com.example.MyBatisDemo.mapstructMapper;

import com.example.MyBatisDemo.dto.*;
import com.example.MyBatisDemo.model.StudentEntity;
import com.example.MyBatisDemo.model.TeacherEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = SubjectMapper.class)
public interface TeacherMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "city", target = "city")
    TeacherEntity convertTeacherAdditionDtoToTeacherEntity(TeacherAdditionDto teacherAdditionDto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "city", target = "city")
    TeacherDisplayDto convertTeacherEntityToTeacherDisplayDto(TeacherEntity teacherEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "age", target = "age")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "city", target = "city")
    @Mapping(source = "subjects", target = "subjects")
    TeacherSubjectsDisplayDto convertTeacherEntityToTeacherSubjectsDisplayDto(TeacherEntity teacherEntity);


//    TeacherEntity getTeacherEntity(Long teacherId);
}

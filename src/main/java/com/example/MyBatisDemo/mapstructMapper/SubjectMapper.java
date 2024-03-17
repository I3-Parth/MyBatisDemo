package com.example.MyBatisDemo.mapstructMapper;


import com.example.MyBatisDemo.dto.SubjectAdditionDto;
import com.example.MyBatisDemo.dto.SubjectDisplayDto;
import com.example.MyBatisDemo.dto.SubjectTeacherDisplayDto;
import com.example.MyBatisDemo.model.SubjectEntity;
import org.mapstruct.Mapper;
import com.example.MyBatisDemo.model.TeacherEntity;
import com.example.MyBatisDemo.dto.*;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring",uses = TeacherMapper.class)
public interface SubjectMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "credits", target = "credits")
    @Mapping(source = "teacher", target = "teacher")
    SubjectEntity convertSubjectAdditionDtoToSubjectEntity(SubjectAdditionDto subjectAdditionDto);


    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "credits", target = "credits")
    @Mapping(source = "teacher.id", target = "teacher")
    SubjectDisplayDto convertSubjectEntityToSubjectDisplayDto(SubjectEntity subjectEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "credits", target = "credits")
    @Mapping(source = "teacher", target = "teacher")
    SubjectTeacherDisplayDto convertSubjectEntityToSubjectTeacherDisplayDto(SubjectEntity subjectEntity);

}

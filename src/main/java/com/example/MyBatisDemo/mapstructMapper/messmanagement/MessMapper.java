package com.example.MyBatisDemo.mapstructMapper.messmanagement;

import com.example.MyBatisDemo.dto.messmanagement.MessAdditionDto;
import com.example.MyBatisDemo.dto.messmanagement.MessDisplayDto;
import com.example.MyBatisDemo.model.messmanagement.MessEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MessMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "messType", target = "messType")
    @Mapping(source = "location", target = "location")
    MessEntity convertMessAdditionDtoToMessEntity(MessAdditionDto messAdditionDto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "messType", target = "messType")
    @Mapping(source = "location", target = "location")
    MessDisplayDto convertMessEntityToMessDisplayDto(MessEntity messEntity);

    List<MessDisplayDto> convertListOfMessEntityToMessDisplayDto(List<MessEntity> messEntities);
}

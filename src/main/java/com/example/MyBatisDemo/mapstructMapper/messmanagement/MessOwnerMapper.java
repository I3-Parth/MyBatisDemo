package com.example.MyBatisDemo.mapstructMapper.messmanagement;

import com.example.MyBatisDemo.dto.messmanagement.MessOwnerAdditionDto;
import com.example.MyBatisDemo.dto.messmanagement.MessOwnerDisplayDto;
import com.example.MyBatisDemo.model.messmanagement.MessOwnerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = MessMapper.class)
public interface MessOwnerMapper {

    @Mapping(source = "name",target = "name")
    @Mapping(source = "contactNumber",target = "contact_number")
    @Mapping(source = "email",target = "email")
    @Mapping(source = "mess",target = "mess")
    MessOwnerEntity convertMessOwnerAdditionDtoToMessOwnerEntity(MessOwnerAdditionDto messOwnerAdditionDto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name",target = "name")
    @Mapping(source = "contact_number",target = "contactNumber")
    @Mapping(source = "email",target = "email")
    @Mapping(source = "mess",target = "mess")
    MessOwnerDisplayDto convertMessEntityToMessOwnerDisplayDto(MessOwnerEntity messOwnerEntity);

    List<MessOwnerDisplayDto> convertListOfMessEntityToMessOwnerDisplayDto(List<MessOwnerEntity> messOwnerEntities);
}

package com.example.MyBatisDemo.mapstructMapper.messmanagement;

import com.example.MyBatisDemo.dto.messmanagement.MessAdditionDto;
import com.example.MyBatisDemo.dto.messmanagement.MessDisplayDto;
import com.example.MyBatisDemo.dto.messmanagement.MessOwnerDisplayDto;
import com.example.MyBatisDemo.dto.messmanagement.MessOwnersInfoDisplayDto;
import com.example.MyBatisDemo.model.messmanagement.MessEntity;
import com.example.MyBatisDemo.model.messmanagement.MessOwnerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = MessOwnerMapper.class)
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

    @Mapping(source = "messEntity.id", target = "id")
    @Mapping(source = "messEntity.name", target = "name")
    @Mapping(source = "messEntity.messType", target = "messType")
    @Mapping(source = "messEntity.location", target = "location")
    @Mapping(source = "messOwnerEntities", target = "messOwners")
    MessOwnersInfoDisplayDto convertMessEntityToMessOwnersInfoDisplayDto(MessEntity messEntity, List<MessOwnerEntity> messOwnerEntities);

    List<MessDisplayDto> convertListOfMessEntityToMessDisplayDto(List<MessEntity> messEntities);
}

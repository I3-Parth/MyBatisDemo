package com.example.MyBatisDemo.mapstructMapper.messmanagement;

import com.example.MyBatisDemo.dto.messmanagement.HostelAdditionDto;
import com.example.MyBatisDemo.dto.messmanagement.HostelDisplayDto;
import com.example.MyBatisDemo.model.messmanagement.HostelEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HostelMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "capacity", target = "capacity")
    @Mapping(source = "rating", target = "rating")
    @Mapping(source = "location", target = "location")
    HostelEntity convertHostelAdditionDtoToHostelEntity(HostelAdditionDto hostelAdditionDto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "capacity", target = "capacity")
    @Mapping(source = "rating", target = "rating")
    @Mapping(source = "location", target = "location")
    HostelDisplayDto convertHostelEntityToHostelDisplayDto(HostelEntity hostelEntity);

    List<HostelDisplayDto> convertListOfHostelEntityToHostelDisplayDto(List<HostelEntity> hostelEntities);
}

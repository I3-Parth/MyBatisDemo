package com.example.MyBatisDemo.services.messmanagement;

import com.example.MyBatisDemo.dto.messmanagement.HostelAdditionDto;
import com.example.MyBatisDemo.dto.messmanagement.HostelDisplayDto;
import com.example.MyBatisDemo.dto.messmanagement.MessOwnerAdditionDto;
import com.example.MyBatisDemo.dto.messmanagement.MessOwnerDisplayDto;
import com.example.MyBatisDemo.mapstructMapper.messmanagement.HostelMapper;
import com.example.MyBatisDemo.mapstructMapper.messmanagement.MessMapper;
import com.example.MyBatisDemo.mapstructMapper.messmanagement.MessOwnerMapper;
import com.example.MyBatisDemo.model.messmanagement.HostelEntity;
import com.example.MyBatisDemo.model.messmanagement.MessOwnerEntity;
import com.example.MyBatisDemo.repository.messmanagement.HostelRepository;
import com.example.MyBatisDemo.repository.messmanagement.MessOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessOwnerService {

    @Autowired
    MessOwnerRepository messOwnerRepository;

    @Autowired
    MessOwnerMapper messOwnerMapper;

    public List<MessOwnerDisplayDto> getAllMessOwners(){
        return messOwnerMapper.convertListOfMessEntityToMessOwnerDisplayDto(messOwnerRepository.findAllMessOwners());
    }

    public MessOwnerDisplayDto addMessOwner(MessOwnerAdditionDto messOwnerAdditionDto){
        MessOwnerEntity messOwnerEntity = messOwnerMapper.convertMessOwnerAdditionDtoToMessOwnerEntity(messOwnerAdditionDto);
        messOwnerRepository.addMessOwner(messOwnerEntity);
        return messOwnerMapper.convertMessEntityToMessOwnerDisplayDto(messOwnerEntity);
    }
}

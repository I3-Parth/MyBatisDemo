package com.example.MyBatisDemo.services.messmanagement;

import com.example.MyBatisDemo.dto.messmanagement.HostelAdditionDto;
import com.example.MyBatisDemo.dto.messmanagement.HostelDisplayDto;
import com.example.MyBatisDemo.dto.messmanagement.MessAdditionDto;
import com.example.MyBatisDemo.dto.messmanagement.MessDisplayDto;
import com.example.MyBatisDemo.mapstructMapper.messmanagement.HostelMapper;
import com.example.MyBatisDemo.model.messmanagement.HostelEntity;
import com.example.MyBatisDemo.model.messmanagement.MessEntity;
import com.example.MyBatisDemo.repository.messmanagement.HostelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HostelService {

    @Autowired
    HostelRepository hostelRepository;

    @Autowired
    HostelMapper hostelMapper;

    public List<HostelDisplayDto> getAllHostel(){
        return hostelMapper.convertListOfHostelEntityToHostelDisplayDto(hostelRepository.findAllHostels());
    }

    public HostelDisplayDto addHostel(HostelAdditionDto hostelAdditionDto){
        HostelEntity hostelEntity = hostelMapper.convertHostelAdditionDtoToHostelEntity(hostelAdditionDto);
        hostelRepository.addHostel(hostelEntity);
        return hostelMapper.convertHostelEntityToHostelDisplayDto(hostelEntity);
    }
}

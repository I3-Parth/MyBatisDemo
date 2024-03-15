package com.example.MyBatisDemo.services.messmanagement;

import com.example.MyBatisDemo.dto.messmanagement.MessAdditionDto;
import com.example.MyBatisDemo.dto.messmanagement.MessDisplayDto;
import com.example.MyBatisDemo.mapstructMapper.messmanagement.MessMapper;
import com.example.MyBatisDemo.model.messmanagement.MessEntity;
import com.example.MyBatisDemo.repository.messmanagement.MessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessService {
    @Autowired
    MessRepository messRepository;

    @Autowired
    MessMapper messMapper;

    public List<MessDisplayDto> getAllMesses(){
        return messMapper.convertListOfMessEntityToMessDisplayDto(messRepository.findAllMesses());
    }

    public MessDisplayDto addMess(MessAdditionDto messAdditionDto){
        MessEntity messEntity = messMapper.convertMessAdditionDtoToMessEntity(messAdditionDto);
        messRepository.addMess(messEntity);
        return messMapper.convertMessEntityToMessDisplayDto(messEntity);
    }
}

package com.example.MyBatisDemo.repository.messmanagement;

import com.example.MyBatisDemo.config.MessManagementConnMapper;
import com.example.MyBatisDemo.model.messmanagement.MessEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@MessManagementConnMapper
public interface MessRepository {
    List<MessEntity> findAllMesses();

    void addMess(MessEntity messEntity);
}

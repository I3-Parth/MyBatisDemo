package com.example.MyBatisDemo.repository.messmanagement;

import com.example.MyBatisDemo.model.messmanagement.MessEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessRepository {
    List<MessEntity> findAllMesses();
}

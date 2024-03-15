package com.example.MyBatisDemo.repository.messmanagement;

import com.example.MyBatisDemo.model.messmanagement.HostelEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface HostelRepository {
    List<HostelEntity> findAllHostels();
}

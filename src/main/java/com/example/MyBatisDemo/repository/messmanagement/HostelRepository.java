package com.example.MyBatisDemo.repository.messmanagement;

import com.example.MyBatisDemo.config.MessManagementConnMapper;
import com.example.MyBatisDemo.model.messmanagement.HostelEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@MessManagementConnMapper
public interface HostelRepository {
    List<HostelEntity> findAllHostels();

    void addHostel(HostelEntity hostelEntity);
}

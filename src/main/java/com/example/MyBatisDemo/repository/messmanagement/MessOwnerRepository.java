package com.example.MyBatisDemo.repository.messmanagement;

import com.example.MyBatisDemo.config.MessManagementConnMapper;
import com.example.MyBatisDemo.model.messmanagement.MessOwnerEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@MessManagementConnMapper
public interface MessOwnerRepository {
    List<MessOwnerEntity> findAllMessOwners();

    void addMessOwner(MessOwnerEntity messOwnerEntity);
}

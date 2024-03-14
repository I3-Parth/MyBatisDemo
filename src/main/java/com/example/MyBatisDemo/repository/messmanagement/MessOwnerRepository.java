package com.example.MyBatisDemo.repository.messmanagement;

import com.example.MyBatisDemo.model.messmanagement.MessOwnerEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessOwnerRepository {
    List<MessOwnerEntity> findAllMessOwners();
}

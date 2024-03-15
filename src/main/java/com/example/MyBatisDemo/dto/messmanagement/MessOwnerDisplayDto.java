package com.example.MyBatisDemo.dto.messmanagement;

import com.example.MyBatisDemo.model.messmanagement.MessEntity;
import lombok.Data;

@Data
public class MessOwnerDisplayDto {
    private Long id;
    private String name;
    private String contactNumber;
    private String email;
    private MessEntity mess;
}

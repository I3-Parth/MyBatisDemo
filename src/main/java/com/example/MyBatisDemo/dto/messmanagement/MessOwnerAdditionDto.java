package com.example.MyBatisDemo.dto.messmanagement;

import com.example.MyBatisDemo.model.messmanagement.MessEntity;
import lombok.Data;

@Data
public class MessOwnerAdditionDto {
    private String name;
    private String contactNumber;
    private String email;
    private Long messId;
}

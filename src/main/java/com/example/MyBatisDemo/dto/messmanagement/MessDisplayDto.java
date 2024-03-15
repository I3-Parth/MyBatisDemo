package com.example.MyBatisDemo.dto.messmanagement;

import lombok.Data;

@Data
public class MessDisplayDto {
    private Long id;
    private String name;
    private String messType;
    private String location;
}

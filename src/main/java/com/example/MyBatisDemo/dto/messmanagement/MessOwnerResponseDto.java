package com.example.MyBatisDemo.dto.messmanagement;

import lombok.Data;

@Data
public class MessOwnerResponseDto {
    private Long id;
    private String name;
    private String contactNumber;
    private String email;
    private Long messId;
}

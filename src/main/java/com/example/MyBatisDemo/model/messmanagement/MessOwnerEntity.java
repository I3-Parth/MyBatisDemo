package com.example.MyBatisDemo.model.messmanagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessOwnerEntity {
    private Long id;
    private String name;
    private String contact_number;
    private String email;
    private MessEntity mess;
}

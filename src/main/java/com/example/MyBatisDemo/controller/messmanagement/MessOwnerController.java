package com.example.MyBatisDemo.controller.messmanagement;

import com.example.MyBatisDemo.dto.messmanagement.*;
import com.example.MyBatisDemo.services.messmanagement.MessOwnerService;
import com.example.MyBatisDemo.services.messmanagement.MessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mess-owners")
public class MessOwnerController {

    @Autowired
    MessOwnerService messOwnerService;

    @GetMapping
    public List<MessOwnerDisplayDto> findAllMessOwners(){return messOwnerService.getAllMessOwners();}

    @PostMapping
    public MessOwnerResponseDto addMessOwners(@RequestBody MessOwnerAdditionDto messOwnerAdditionDto){
        return messOwnerService.addMessOwner(messOwnerAdditionDto);
    }
}

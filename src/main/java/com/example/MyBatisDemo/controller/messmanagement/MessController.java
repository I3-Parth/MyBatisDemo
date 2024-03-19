package com.example.MyBatisDemo.controller.messmanagement;

import com.example.MyBatisDemo.dto.messmanagement.MessAdditionDto;
import com.example.MyBatisDemo.dto.messmanagement.MessDisplayDto;
import com.example.MyBatisDemo.dto.messmanagement.MessOwnersInfoDisplayDto;
import com.example.MyBatisDemo.services.messmanagement.MessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messes")
public class MessController {

    @Autowired
    MessService messService;

    @GetMapping
    public List<MessDisplayDto> findAllMesses(){return messService.getAllMesses();}

    @GetMapping("/{id}/owners")
    public MessOwnersInfoDisplayDto findOwnersByMessID(@PathVariable(value = "id")Long id){
        return messService.findOwnersByMessID(id);
    }

    @PostMapping
    public MessDisplayDto addMess(@RequestBody MessAdditionDto messAdditionDto){
        return messService.addMess(messAdditionDto);
    }
}

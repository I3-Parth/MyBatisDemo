package com.example.MyBatisDemo.controller.messmanagement;

import com.example.MyBatisDemo.dto.messmanagement.HostelAdditionDto;
import com.example.MyBatisDemo.dto.messmanagement.HostelDisplayDto;
import com.example.MyBatisDemo.services.messmanagement.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hostels")
public class HostelController {

    @Autowired
    HostelService hostelService;

    @GetMapping
    public List<HostelDisplayDto> findAllHostels(){return hostelService.getAllHostel();}

    @PostMapping
    public HostelDisplayDto addHostel(@RequestBody HostelAdditionDto hostelAdditionDto){
        return hostelService.addHostel(hostelAdditionDto);
    }
}

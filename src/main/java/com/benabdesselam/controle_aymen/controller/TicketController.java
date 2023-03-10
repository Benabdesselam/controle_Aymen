package com.benabdesselam.controle_aymen.controller;


import com.benabdesselam.controle_aymen.dto.TicketRequestDto;
import com.benabdesselam.controle_aymen.dto.TicketResponseDto;
import com.benabdesselam.controle_aymen.service.TicketServiceImpl;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/json/ticket/",produces = "application/json")
public class TicketController {
    @Autowired
    TicketServiceImpl ticketService;

    @PostMapping("addTiket/{id}")
    public TicketResponseDto addTiket(@PathVariable Long id, @RequestBody TicketRequestDto ticketRequestDto){
        return ticketService.addTicket(id,ticketRequestDto);
    }

    @GetMapping("allTicket")
    public List<TicketResponseDto> getAll(){
        return ticketService.findAll();
    }

    @GetMapping("ticketById/{id}")
    public TicketResponseDto ticketById(@PathVariable Long id){
        return ticketService.findById(id);
    }

    @PutMapping("update/{id}")
    public TicketResponseDto updateTicket(@PathVariable Long id,@RequestBody TicketRequestDto dto){
        return  ticketService.updateTicket(id, dto);
    }

    @DeleteMapping("delete/{id}")
    public  void deleteTicket(@PathVariable Long id){
        ticketService.deleteTicket(id);
    }



}

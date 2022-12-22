package com.benabdesselam.controle_aymen.service;



import com.benabdesselam.controle_aymen.dto.TicketRequestDto;
import com.benabdesselam.controle_aymen.dto.TicketResponseDto;

import java.util.List;

public interface TicketService {


    List<TicketResponseDto> findAll();
    TicketResponseDto addTicket(Long id, TicketRequestDto ticketRequestDto);
    TicketResponseDto findById(Long id);
    TicketResponseDto updateTicket(Long id, TicketRequestDto ticketRequestDto);
    void deleteTicket(Long id);
}

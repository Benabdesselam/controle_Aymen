package com.benabdesselam.controle_aymen.dto;

import com.benabdesselam.controle_aymen.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class TicketResponseDto {
    private Long id;
    private String reference;
    private Float prix;
    private Status status;
}

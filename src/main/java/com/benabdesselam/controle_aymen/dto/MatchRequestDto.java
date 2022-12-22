package com.benabdesselam.controle_aymen.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchRequestDto {

    private Date date;
    private String lieu;
    private String equipe1;
    private String equipe2;
}

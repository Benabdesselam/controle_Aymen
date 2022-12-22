package com.benabdesselam.controle_aymen.service;



import com.benabdesselam.controle_aymen.dto.MatchRequestDto;
import com.benabdesselam.controle_aymen.dto.MatchResponseDto;

import java.util.List;

public interface MatchService {

    List<MatchResponseDto> allMatch();
    MatchResponseDto findById(Long id);
    MatchResponseDto addMatch(MatchRequestDto matchRequestDto);
    MatchResponseDto updateMatch(Long id, MatchRequestDto matchRequestDto);
    void deleteMatch(Long id);
}

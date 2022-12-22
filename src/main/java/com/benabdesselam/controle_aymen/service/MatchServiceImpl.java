package com.benabdesselam.controle_aymen.service;


import com.benabdesselam.controle_aymen.dto.MatchRequestDto;
import com.benabdesselam.controle_aymen.dto.MatchResponseDto;
import com.benabdesselam.controle_aymen.mappers.MatchMapper;
import com.benabdesselam.controle_aymen.model.Match;
import com.benabdesselam.controle_aymen.repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MatchServiceImpl implements MatchService {

    @Autowired
    MatchRepository matchRepository;
    @Autowired
    MatchMapper matchMapper;


    @Override
    public List<MatchResponseDto> allMatch() {
        List<MatchResponseDto> matchResponseDtoList =
                matchRepository.findAll().stream().map(t-> matchMapper.matchToResponse(t)).collect(Collectors.toList());
        return matchResponseDtoList;
    }

    @Override
    public MatchResponseDto findById(Long id) {
        Match match =  matchRepository.findById(id).orElse(null);
        return matchMapper.matchToResponse(match);
    }

    @Override
    public MatchResponseDto addMatch(MatchRequestDto matchRequestDto) {
        Match match = matchMapper.requestToMatch(matchRequestDto);
        match.setReference(UUID.randomUUID().toString());
        matchRepository.save(match);
        return matchMapper.matchToResponse(match);
    }

    @Override
    public MatchResponseDto updateMatch(Long id, MatchRequestDto matchRequestDto) {
        Match match = matchRepository.findById(id).orElseThrow(()-> new RuntimeException("Match Not Found"));
        match.setDate(matchRequestDto.getDate());
        match.setEquipe1(matchRequestDto.getEquipe1());
        match.setEquipe2(matchRequestDto.getEquipe2());
        matchRepository.save(match);
        return matchMapper.matchToResponse(match);
    }

    @Override
    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);
    }
}

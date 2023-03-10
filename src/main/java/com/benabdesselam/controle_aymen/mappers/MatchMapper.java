package com.benabdesselam.controle_aymen.mappers;



import com.benabdesselam.controle_aymen.dto.MatchRequestDto;
import com.benabdesselam.controle_aymen.dto.MatchResponseDto;
import com.benabdesselam.controle_aymen.model.Match;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class MatchMapper {
    @Autowired
    static
    TicketMapper ticketMapper;

    public static Match requestToMatch(MatchRequestDto matchRequestDto) {
        Match match = new Match();
        BeanUtils.copyProperties(matchRequestDto, match);
        return match;
    }

    public static MatchResponseDto matchToResponse(Match match) {
        MatchResponseDto matchResponseDto = new MatchResponseDto();
        BeanUtils.copyProperties(match, matchResponseDto);
        matchResponseDto.setTicketList(match.getTicketList().stream().map(ticket ->
                        ticketMapper.ticketToResponse(ticket)).collect(Collectors.toList())
        );
        return matchResponseDto;
    }
}

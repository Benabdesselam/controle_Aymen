package com.benabdesselam.controle_aymen.controller;

import com.benabdesselam.controle_aymen.dto.MatchRequestDto;
import com.benabdesselam.controle_aymen.dto.MatchResponseDto;
import com.benabdesselam.controle_aymen.service.MatchServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "/api/json/match/",produces = "application/json")
public class MatchController {

    @Autowired
    MatchServiceImpl matchService;

    @PostMapping("add")
    public MatchResponseDto addMatch(@RequestBody MatchRequestDto matchRequestDto){
        return matchService.addMatch(matchRequestDto);
    }

    /*

    @PutMapping("add")
    public MatchResponseDto updateMatch(@RequestBody MatchRequestDto matchRequestDto){
        return matchService.addMatch(matchRequestDto);
    }

     */

    @GetMapping("all")
    public List<MatchResponseDto> listMatch(){
        return matchService.allMatch();
    }

    @GetMapping("findById/{id}")
    public MatchResponseDto findById(@RequestParam Long id){
        return matchService.findById(id);
    }

    @DeleteMapping("deleteById/{id}")
    public  void  deleteById(@RequestParam Long id){
        matchService.deleteMatch(id);
    }
}

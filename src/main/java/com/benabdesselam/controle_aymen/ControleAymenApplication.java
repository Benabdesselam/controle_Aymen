package com.benabdesselam.controle_aymen;

import com.benabdesselam.controle_aymen.dto.MatchRequestDto;
import com.benabdesselam.controle_aymen.dto.TicketRequestDto;
import com.benabdesselam.controle_aymen.service.MatchServiceImpl;
import com.benabdesselam.controle_aymen.service.TicketServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ControleAymenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleAymenApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(MatchServiceImpl matchService, TicketServiceImpl ticketService){
        return args -> {
            matchService.addMatch( new MatchRequestDto(new Date(),"SETTAT","ANSS","RSS"));
            for (int i = 0; i < 10; i++) {
                TicketRequestDto ticketRequestDto = new TicketRequestDto((float) (Math.random()*100));
                ticketService.addTicket(1L,ticketRequestDto);
            }

        };
    }

}

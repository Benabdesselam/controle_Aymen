package com.benabdesselam.controle_aymen.repository;

import com.benabdesselam.controle_aymen.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}

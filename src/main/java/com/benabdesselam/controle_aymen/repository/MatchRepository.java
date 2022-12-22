package com.benabdesselam.controle_aymen.repository;

import com.benabdesselam.controle_aymen.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match,Long> {
}

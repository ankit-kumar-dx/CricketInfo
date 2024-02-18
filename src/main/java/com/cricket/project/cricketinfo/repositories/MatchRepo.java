package com.cricket.project.cricketinfo.repositories;

import com.cricket.project.cricketinfo.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    Optional<Match> findByTeamHeading(String teamHeading);
}

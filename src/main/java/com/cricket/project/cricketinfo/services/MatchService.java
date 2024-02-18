package com.cricket.project.cricketinfo.services;

import com.cricket.project.cricketinfo.entities.Match;

import java.util.List;


public interface MatchService {

    List<Match> getAllMatches();
    List<Match> getLiveMatches();
    List<List<String>> getPointTable();


}

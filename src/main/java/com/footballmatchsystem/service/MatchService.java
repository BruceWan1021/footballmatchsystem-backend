package com.footballmatchsystem.service;

import com.footballmatchsystem.model.Match;
import com.footballmatchsystem.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {
    @Autowired
    private MatchRepository matchRepository;

    public List<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    public Match createMatch(Match match) {
        return matchRepository.save(match);
    }
}

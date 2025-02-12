package com.footballmatchsystem.controller;

import com.footballmatchsystem.model.Match;
import com.footballmatchsystem.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matches")
public class MatchController {
    @Autowired
    private MatchService matchService;

    @GetMapping
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }

    @PostMapping
    public Match createMatch(@RequestBody Match match) {
        return matchService.createMatch(match);
    }
}

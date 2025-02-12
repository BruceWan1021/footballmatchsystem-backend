package com.footballmatchsystem.repository;

import com.footballmatchsystem.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}

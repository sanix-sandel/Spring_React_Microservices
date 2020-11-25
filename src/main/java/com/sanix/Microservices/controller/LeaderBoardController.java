package com.sanix.Microservices.controller;

import com.sanix.Microservices.domain.LeaderBoardRow;
import com.sanix.Microservices.service.LeaderBoardService;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class LeaderBoardController {

    private final LeaderBoardService leaderBoardService;

    @GetMapping
    public List<LeaderBoardRow> getLeaderBoard(){
        return leaderBoardService.getCurrentLeaderBoard();
    }
}

package com.sanix.Microservices.controller;

import com.sanix.Microservices.DTO.ChallengeSolvedDTO;
import com.sanix.Microservices.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attempts")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    void postResult(@RequestBody ChallengeSolvedDTO dto){
        gameService.newAttemptForUser(dto);
    }
}

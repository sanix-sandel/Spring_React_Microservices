package com.sanix.Microservices.service;


import com.sanix.Microservices.DTO.ChallengeSolvedDTO;
import com.sanix.Microservices.domain.BadgeType;
import lombok.Value;

import java.util.List;

public interface GameService {

    GameResult newAttemptForUser(ChallengeSolvedDTO challenge);

    @Value
    class GameResult{
        int score;
        List<BadgeType> badges;
    }
}

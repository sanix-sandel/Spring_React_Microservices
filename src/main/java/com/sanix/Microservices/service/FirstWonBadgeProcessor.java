package com.sanix.Microservices.service;

import com.sanix.Microservices.DTO.ChallengeSolvedDTO;
import com.sanix.Microservices.domain.BadgeType;
import com.sanix.Microservices.domain.ScoreCard;

import java.util.List;
import java.util.Optional;

public class FirstWonBadgeProcessor implements BadgeProcessor{

    @Override
    public Optional<BadgeType> processForOptionalBadge(
            int currentScore,
            List<ScoreCard> scoreCardList,
            ChallengeSolvedDTO solved
    ){
        return scoreCardList.size()==1 ? Optional.of(BadgeType.FIRST_WON): Optional.empty();
    }

    @Override
    public BadgeType badgeType(){
        return BadgeType.FIRST_WON;
    }
}

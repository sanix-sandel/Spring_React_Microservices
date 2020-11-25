package com.sanix.Microservices.service;

import com.sanix.Microservices.DTO.ChallengeSolvedDTO;
import com.sanix.Microservices.domain.BadgeType;
import com.sanix.Microservices.domain.ScoreCard;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BronzeBadgeProcessor implements BadgeProcessor{

    @Override
    public Optional<BadgeType> processForOptionalBadge(
            int currentScore,
            List<ScoreCard> scoreCardList,
            ChallengeSolvedDTO solved
    ){
        return currentScore > 50 ?
                Optional.of(BadgeType.BRONZE) : Optional.empty();
    }

    @Override
    public BadgeType badgeType(){
        return BadgeType.BRONZE;
    }
}

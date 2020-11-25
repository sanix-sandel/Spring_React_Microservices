package com.sanix.Microservices.service;

import com.sanix.Microservices.DTO.ChallengeSolvedDTO;
import com.sanix.Microservices.domain.BadgeType;
import com.sanix.Microservices.domain.ScoreCard;

import java.util.List;
import java.util.Optional;

public interface BadgeProcessor {

    Optional <BadgeType> processForOptionalBadge(
            int currentScore,
            List<ScoreCard> scoreCardList,
            ChallengeSolvedDTO solved
    );

    BadgeType badgeType();
}

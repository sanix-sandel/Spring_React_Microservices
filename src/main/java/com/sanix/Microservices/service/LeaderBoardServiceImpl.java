package com.sanix.Microservices.service;

import com.sanix.Microservices.domain.LeaderBoardRow;

import java.util.List;
import java.util.stream.Collectors;

public class LeaderBoardServiceImpl implements LeaderBoardService{

    private final ScoreRepository scoreRepository;
    private final BadgeRepository badgeRepository;

    @Override
    public List<LeaderBoardRow> getCurrentLeaderBoard(){
        //Get score only
        List<LeaderBoardRow> scoreOnly=scoreRepository.findFirst10();
        //combine with badges
        return scoreOnly.stream().map(row->{
            List<String> badges=badgeRepository.findByUserIdOrderByBadgeTimestampDesc(
                    row.getUserId()).stream()
                    .map(b->b.getBadgeType().getDescription())
                    .collect(Collectors.toList());
            return row.withBadges(badges);
        }).collect(Collectors.toList());
    }
}

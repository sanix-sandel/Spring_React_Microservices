package com.sanix.Microservices.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum BadgeType {

    BRONZE("Bronze"),
    SILVER("Silver"),
    GOLD("Gold"),

    FIRST_WON("First time"),
    LUCKY_NUMBER("Lucky Number");

    private final String description;
}

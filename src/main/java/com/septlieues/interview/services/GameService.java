package com.septlieues.interview.services;

import com.septlieues.interview.dto.GameRoundDto;

public interface GameService {

    GameRoundDto nextRound();

    GameRoundDto nextRound(String sortStrategy);
}

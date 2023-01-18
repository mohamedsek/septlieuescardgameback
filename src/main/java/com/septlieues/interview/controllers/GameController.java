package com.septlieues.interview.controllers;


import com.septlieues.interview.dto.GameRoundDto;
import com.septlieues.interview.models.CartModel;
import com.septlieues.interview.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class GameController {

    private GameService gameService;

    @RequestMapping(method = RequestMethod.GET, value = "/play")
    public GameRoundDto play() {
        return gameService.nextRound();
    }


    @Autowired
    public void setGameService(GameService gameService) {
        this.gameService = gameService;
    }
}

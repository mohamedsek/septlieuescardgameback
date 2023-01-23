package com.septlieues.interview.controllers;


import com.septlieues.interview.dto.GameRoundDto;
import com.septlieues.interview.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameController {

    private GameService gameService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/play/{sort}")
    public GameRoundDto playWithSort(@PathVariable(value = "sort", required = false) String sortStrategy) {
        return gameService.nextRound(sortStrategy);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/play")
    public GameRoundDto play() {
        return gameService.nextRound();
    }

    @Autowired
    public void setGameService(GameService gameService) {
        this.gameService = gameService;
    }
}

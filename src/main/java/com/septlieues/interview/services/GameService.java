package com.septlieues.interview.services;

import com.septlieues.interview.models.CartModel;

import java.util.Set;

public interface GameService {

    Set<CartModel> nextRound();
}

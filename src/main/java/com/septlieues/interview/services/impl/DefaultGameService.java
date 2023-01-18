package com.septlieues.interview.services.impl;

import com.septlieues.interview.common.GameConstants;
import com.septlieues.interview.common.GameUtils;
import com.septlieues.interview.dto.GameRoundDto;
import com.septlieues.interview.models.CartModel;
import com.septlieues.interview.repository.CartRepository;
import com.septlieues.interview.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class DefaultGameService implements GameService {

    private CartRepository cartRepository;

    @Override
    public GameRoundDto nextRound() {

        Set<CartModel> roundCarts = generateHand();
        GameRoundDto gameRound = new GameRoundDto();
        gameRound.setRoundCarts(roundCarts);
        gameRound.setSortedRoundCarts(roundCarts);
        return gameRound;
    }

    private Set<CartModel> generateHand() {
        ArrayList<CartModel> carts = new ArrayList<>(cartRepository.findAll());

        if (GameConstants.HAND_SIZE > carts.size()) {
            throw new RuntimeException("Hand size is bigger than carts total count");
        }


        Set<CartModel> roundCarts = new LinkedHashSet<>();
        // Get and remove cart from list to not reuse it
        for (int i = 0; i < GameConstants.HAND_SIZE; i++) {
            int randomIndex = GameUtils.getRandomInt(0, carts.size());
            CartModel pickedCart = carts.remove(randomIndex);
            roundCarts.add(pickedCart);
        }

        return roundCarts;
    }

    @Autowired
    public void setCartRepository(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }
}

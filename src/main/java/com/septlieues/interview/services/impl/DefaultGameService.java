package com.septlieues.interview.services.impl;

import com.septlieues.interview.models.CartModel;
import com.septlieues.interview.repository.CartRepository;
import com.septlieues.interview.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DefaultGameService implements GameService {

    private CartRepository cartRepository;

    @Override
    public Set<CartModel> nextRound() {
        return cartRepository.findAll();
    }

    @Autowired
    public void setCartRepository(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }
}

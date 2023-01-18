package com.septlieues.interview.dto;

import com.septlieues.interview.models.CartModel;

import java.util.Set;

public class GameRoundDto {


    private Set<CartModel> roundCarts;
    private Set<CartModel> sortedRoundCarts;


    public Set<CartModel> getRoundCarts() {
        return roundCarts;
    }

    public void setRoundCarts(Set<CartModel> roundCarts) {
        this.roundCarts = roundCarts;
    }

    public Set<CartModel> getSortedRoundCarts() {
        return sortedRoundCarts;
    }

    public void setSortedRoundCarts(Set<CartModel> sortedRoundCarts) {
        this.sortedRoundCarts = sortedRoundCarts;
    }
}

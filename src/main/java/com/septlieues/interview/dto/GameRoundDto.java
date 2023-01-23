package com.septlieues.interview.dto;

import com.septlieues.interview.models.CartModel;

import java.util.List;
import java.util.Set;

public class GameRoundDto {


    private Set<CartModel> roundCarts;
    private List<CartModel> sortedRoundCarts;

    private List<String> colorSortRule;
    private List<String> nameSortRule;


    public Set<CartModel> getRoundCarts() {
        return roundCarts;
    }

    public void setRoundCarts(Set<CartModel> roundCarts) {
        this.roundCarts = roundCarts;
    }

    public List<CartModel> getSortedRoundCarts() {
        return sortedRoundCarts;
    }

    public void setSortedRoundCarts(List<CartModel> sortedRoundCarts) {
        this.sortedRoundCarts = sortedRoundCarts;
    }

    public List<String> getColorSortRule() {
        return colorSortRule;
    }

    public void setColorSortRule(List<String> colorSortRule) {
        this.colorSortRule = colorSortRule;
    }

    public List<String> getNameSortRule() {
        return nameSortRule;
    }

    public void setNameSortRule(List<String> nameSortRule) {
        this.nameSortRule = nameSortRule;
    }
}

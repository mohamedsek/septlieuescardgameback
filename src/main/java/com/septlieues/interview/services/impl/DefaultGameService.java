package com.septlieues.interview.services.impl;

import com.septlieues.interview.common.GameConstants;
import com.septlieues.interview.common.GameUtils;
import com.septlieues.interview.dto.GameRoundDto;
import com.septlieues.interview.enums.CartSortStrategy;
import com.septlieues.interview.models.CartModel;
import com.septlieues.interview.repository.CartRepository;
import com.septlieues.interview.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DefaultGameService implements GameService {

    private CartRepository cartRepository;

    @Override
    public GameRoundDto nextRound() {
        return nextRound(CartSortStrategy.COLOR.getName());
    }

    @Override
    public GameRoundDto nextRound(String sortWith) {

        CartSortStrategy sortStrategy = Arrays.stream(CartSortStrategy.values()).filter(strategy -> strategy.getName().equals(sortWith)).findFirst().orElse(CartSortStrategy.COLOR);

        Set<CartModel> roundCarts = generateHand();

        List<String> colorSortRule = getRandomColorSortRule();
        List<String> nameSortRule = getRandomNameSortRule();

        associateOrdinalValues(roundCarts, colorSortRule, nameSortRule);
        List<CartModel> sortedCarts = getSortedCarts(roundCarts, sortStrategy);

        GameRoundDto gameRound = new GameRoundDto();
        gameRound.setRoundCarts(roundCarts);
        gameRound.setSortedRoundCarts(sortedCarts);
        gameRound.setColorSortRule(colorSortRule);
        gameRound.setNameSortRule(nameSortRule);

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

    private List<CartModel> getSortedCarts(Set<CartModel> carts, CartSortStrategy strategy) {
        List<CartModel> sortedCarts = new ArrayList<>(carts);
        sortedCarts.sort(strategy.getStrategy());

        return sortedCarts;
    }

    private void associateOrdinalValues(Set<CartModel> roundCarts, List<String> colorSortRule, List<String> nameSortRule) {
        for (CartModel card : roundCarts) {
            card.setOrdinalColorValue(colorSortRule.indexOf(card.getColor()));
            card.setOrdinalNameValue(nameSortRule.indexOf(card.getName()));
        }
    }

    /**
     * The order of card names in the list
     * is the random order that should be used in this round
     */
    private List<String> getRandomNameSortRule() {
        List<String> cardNames = new ArrayList<>(GameConstants.cardNames);
        Collections.shuffle(cardNames);
        return cardNames;
    }

    /**
     * The order of colors in the list
     * is the random order that should be used in this round
     */
    private List<String> getRandomColorSortRule() {
        List<String> cardColors = new ArrayList<>(GameConstants.cardColors);
        Collections.shuffle(cardColors);
        return cardColors;
    }

    @Autowired
    public void setCartRepository(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }
}

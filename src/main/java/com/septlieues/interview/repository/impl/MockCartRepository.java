package com.septlieues.interview.repository.impl;

import com.septlieues.interview.models.CartModel;
import com.septlieues.interview.repository.CartRepository;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

@Component
public class MockCartRepository implements CartRepository {


    private static Set<CartModel> carts = new LinkedHashSet<>();

    static {
        // Stocker l'ensemble des cartes dans cette Set pour simuler un repository de données

        carts.add(new CartModel("As", 1, "Carreaux", 1));
        carts.add(new CartModel("As", 1, "Carreaux", 1));
        carts.add(new CartModel("2", 8, "Carreaux", 1));
        carts.add(new CartModel("3", 9, "Carreaux", 1));
        carts.add(new CartModel("4", 7, "Carreaux", 1));
        carts.add(new CartModel("5", 2, "Carreaux", 1));
        carts.add(new CartModel("6", 5, "Carreaux", 1));
        carts.add(new CartModel("7", 6, "Carreaux", 1));
        carts.add(new CartModel("8", 4, "Carreaux", 1));
        carts.add(new CartModel("9", 10, "Carreaux", 1));
        carts.add(new CartModel("10", 3, "Carreaux", 1));
        carts.add(new CartModel("Dame", 11, "Carreaux", 1));
        carts.add(new CartModel("Valet", 13, "Carreaux", 1));
        carts.add(new CartModel("Roi", 12, "Carreaux", 1));

        carts.add(new CartModel("As", 1, "Coeur", 2));
        carts.add(new CartModel("2", 8, "Coeur", 2));
        carts.add(new CartModel("3", 9, "Coeur", 2));
        carts.add(new CartModel("4", 7, "Coeur", 2));
        carts.add(new CartModel("5", 2, "Coeur", 2));
        carts.add(new CartModel("6", 5, "Coeur", 2));
        carts.add(new CartModel("7", 6, "Coeur", 2));
        carts.add(new CartModel("8", 4, "Coeur", 2));
        carts.add(new CartModel("9", 10, "Coeur", 2));
        carts.add(new CartModel("10", 3, "Coeur", 2));
        carts.add(new CartModel("Dame", 11, "Coeur", 2));
        carts.add(new CartModel("Valet", 13, "Coeur", 2));
        carts.add(new CartModel("Roi", 12, "Coeur", 2));

        carts.add(new CartModel("As", 1, "Pique", 3));
        carts.add(new CartModel("2", 8, "Pique", 3));
        carts.add(new CartModel("3", 9, "Pique", 3));
        carts.add(new CartModel("4", 7, "Pique", 3));
        carts.add(new CartModel("5", 2, "Pique", 3));
        carts.add(new CartModel("6", 5, "Pique", 3));
        carts.add(new CartModel("7", 6, "Pique", 3));
        carts.add(new CartModel("8", 4, "Pique", 3));
        carts.add(new CartModel("9", 10, "Pique", 3));
        carts.add(new CartModel("10", 3, "Pique", 3));
        carts.add(new CartModel("Dame", 11, "Pique", 3));
        carts.add(new CartModel("Valet", 13, "Pique", 3));
        carts.add(new CartModel("Roi", 12, "Pique", 3));

        carts.add(new CartModel("As", 1, "Trèfle", 4));
        carts.add(new CartModel("2", 8, "Trèfle", 4));
        carts.add(new CartModel("3", 9, "Trèfle", 4));
        carts.add(new CartModel("4", 7, "Trèfle", 4));
        carts.add(new CartModel("5", 2, "Trèfle", 4));
        carts.add(new CartModel("6", 5, "Trèfle", 4));
        carts.add(new CartModel("7", 6, "Trèfle", 4));
        carts.add(new CartModel("8", 4, "Trèfle", 4));
        carts.add(new CartModel("9", 10, "Trèfle", 4));
        carts.add(new CartModel("10", 3, "Trèfle", 4));
        carts.add(new CartModel("Dame", 11, "Trèfle", 4));
        carts.add(new CartModel("Valet", 13, "Trèfle", 4));
        carts.add(new CartModel("Roi", 12, "Trèfle", 4));
    }

    @Override
    public Set<CartModel> findAll() {
        return carts;
    }


}

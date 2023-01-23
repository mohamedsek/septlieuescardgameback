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

        carts.add(new CartModel("As", "Carreaux", "01_of_diamonds.svg"));
// This cart is intentionally duplicate value to test method Cart's "equals" is working fine with "Set"
        carts.add(new CartModel("As", "Carreaux", "01_of_diamonds.svg"));
        carts.add(new CartModel("2", "Carreaux", "02_of_diamonds.svg"));
        carts.add(new CartModel("3", "Carreaux", "03_of_diamonds.svg"));
        carts.add(new CartModel("4", "Carreaux", "04_of_diamonds.svg"));
        carts.add(new CartModel("5", "Carreaux", "05_of_diamonds.svg"));
        carts.add(new CartModel("6", "Carreaux", "06_of_diamonds.svg"));
        carts.add(new CartModel("7", "Carreaux", "07_of_diamonds.svg"));
        carts.add(new CartModel("8", "Carreaux", "08_of_diamonds.svg"));
        carts.add(new CartModel("9", "Carreaux", "09_of_diamonds.svg"));
        carts.add(new CartModel("10", "Carreaux", "10_of_diamonds.svg"));
        carts.add(new CartModel("Valet", "Carreaux", "Jack_of_diamonds.svg"));
        carts.add(new CartModel("Dame", "Carreaux", "Queen_of_diamonds.svg"));
        carts.add(new CartModel("Roi", "Carreaux", "King_of_diamonds.svg"));

        carts.add(new CartModel("As", "Coeur", "01_of_hearts.svg"));
        carts.add(new CartModel("2", "Coeur", "02_of_hearts.svg"));
        carts.add(new CartModel("3", "Coeur", "03_of_hearts.svg"));
        carts.add(new CartModel("4", "Coeur", "04_of_hearts.svg"));
        carts.add(new CartModel("5", "Coeur", "05_of_hearts.svg"));
        carts.add(new CartModel("6", "Coeur", "06_of_hearts.svg"));
        carts.add(new CartModel("7", "Coeur", "07_of_hearts.svg"));
        carts.add(new CartModel("8", "Coeur", "08_of_hearts.svg"));
        carts.add(new CartModel("9", "Coeur", "09_of_hearts.svg"));
        carts.add(new CartModel("10", "Coeur", "10_of_hearts.svg"));
        carts.add(new CartModel("Valet", "Coeur", "Jack_of_hearts.svg"));
        carts.add(new CartModel("Dame", "Coeur", "Queen_of_hearts.svg"));
        carts.add(new CartModel("Roi", "Coeur", "King_of_hearts.svg"));

        carts.add(new CartModel("As", "Pique", "01_of_spades.svg"));
        carts.add(new CartModel("2", "Pique", "02_of_spades.svg"));
        carts.add(new CartModel("3", "Pique", "03_of_spades.svg"));
        carts.add(new CartModel("4", "Pique", "04_of_spades.svg"));
        carts.add(new CartModel("5", "Pique", "05_of_spades.svg"));
        carts.add(new CartModel("6", "Pique", "06_of_spades.svg"));
        carts.add(new CartModel("7", "Pique", "07_of_spades.svg"));
        carts.add(new CartModel("8", "Pique", "08_of_spades.svg"));
        carts.add(new CartModel("9", "Pique", "09_of_spades.svg"));
        carts.add(new CartModel("10", "Pique", "10_of_spades.svg"));
        carts.add(new CartModel("Valet", "Pique", "Jack_of_spades.svg"));
        carts.add(new CartModel("Dame", "Pique", "Queen_of_spades.svg"));
        carts.add(new CartModel("Roi", "Pique", "King_of_spades.svg"));

        carts.add(new CartModel("As", "Trèfle", "01_of_clubs.svg"));
        carts.add(new CartModel("2", "Trèfle", "02_of_clubs.svg"));
        carts.add(new CartModel("3", "Trèfle", "03_of_clubs.svg"));
        carts.add(new CartModel("4", "Trèfle", "04_of_clubs.svg"));
        carts.add(new CartModel("5", "Trèfle", "05_of_clubs.svg"));
        carts.add(new CartModel("6", "Trèfle", "06_of_clubs.svg"));
        carts.add(new CartModel("7", "Trèfle", "07_of_clubs.svg"));
        carts.add(new CartModel("8", "Trèfle", "08_of_clubs.svg"));
        carts.add(new CartModel("9", "Trèfle", "09_of_clubs.svg"));
        carts.add(new CartModel("10", "Trèfle", "10_of_clubs.svg"));
        carts.add(new CartModel("Valet", "Trèfle", "Jack_of_clubs.svg"));
        carts.add(new CartModel("Dame", "Trèfle", "Queen_of_clubs.svg"));
        carts.add(new CartModel("Roi", "Trèfle", "King_of_clubs.svg"));
    }

    @Override
    public Set<CartModel> findAll() {
        return carts;
    }


}

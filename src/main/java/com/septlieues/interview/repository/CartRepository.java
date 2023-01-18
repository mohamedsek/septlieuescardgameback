package com.septlieues.interview.repository;

import com.septlieues.interview.models.CartModel;

import java.util.Set;

public interface CartRepository {

    Set<CartModel> findAll();

}

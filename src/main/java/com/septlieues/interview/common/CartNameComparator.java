package com.septlieues.interview.common;

import com.septlieues.interview.models.CartModel;

import java.util.Comparator;
import java.util.Objects;

public class CartNameComparator implements Comparator<CartModel> {

    @Override
    public int compare(CartModel o1, CartModel o2) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);

        int nameCompareResult = o1.getOrdinalNameValue().compareTo(o2.getOrdinalNameValue());

        if(nameCompareResult == 0) {
            return o1.getOrdinalColorValue().compareTo(o2.getOrdinalColorValue());
        }

        return nameCompareResult;
    }

}

package com.septlieues.interview.common;

import com.septlieues.interview.models.CartModel;

import java.util.Comparator;
import java.util.Objects;

public class CartColorComparator implements Comparator<CartModel> {

    @Override
    public int compare(CartModel o1, CartModel o2) {
        Objects.requireNonNull(o1);
        Objects.requireNonNull(o2);

        int colorCompareResult = o1.getOrdinalColorValue().compareTo(o2.getOrdinalColorValue());

        if(colorCompareResult == 0) {
            return o1.getOrdinalNameValue().compareTo(o2.getOrdinalNameValue());
        }

        return colorCompareResult;
    }

}

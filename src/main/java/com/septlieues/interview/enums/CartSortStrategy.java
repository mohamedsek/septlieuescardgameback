package com.septlieues.interview.enums;

import com.septlieues.interview.common.CartColorComparator;
import com.septlieues.interview.common.CartNameComparator;

import java.util.Comparator;

public enum CartSortStrategy {

    COLOR("color"),
    NAME("name") {

        @Override
        public Comparator getStrategy() {
            return new CartNameComparator();
        }
    };

    private final String name;

    CartSortStrategy(String sortStrategy) {
        this.name = sortStrategy;
    }

    public String getName() {
        return name;
    }

    public Comparator getStrategy() {
        return new CartColorComparator();
    }
}

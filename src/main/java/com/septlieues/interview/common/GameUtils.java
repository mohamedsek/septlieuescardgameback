package com.septlieues.interview.common;

import java.util.Random;

public class GameUtils {

    public static int getRandomInt(int minInclusive, int maxExclusive) {

        Random random = new Random();
        return random.ints(minInclusive, maxExclusive)
                .findFirst()
                .getAsInt();
    }

}

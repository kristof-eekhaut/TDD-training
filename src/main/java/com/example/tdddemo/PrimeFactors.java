package com.example.tdddemo;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class PrimeFactors {

    public static List<Integer> of(int number) {
        ArrayList<Integer> factors = newArrayList();
        for (int divisor = 2; number > 1; divisor++)
            for ( ; number % divisor == 0; number /= divisor)
                factors.add(divisor);
        return factors;
    }
}

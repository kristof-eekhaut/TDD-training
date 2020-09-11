package com.example.tdddemo;

import org.junit.jupiter.api.Test;

import static com.example.tdddemo.PrimeFactors.of;
import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.newArrayList;

public class PrimeFactorTest {

    @Test
    void primeFactorsOf1_isEmptyList() {
        assertThat(of(1)).isEqualTo(emptyList());
    }

    @Test
    void primeFactorsOf2_are2() {
        assertThat(of(2)).isEqualTo(newArrayList(2));
    }

    @Test
    void primeFactorsOf3_are3() {
        assertThat(of(3)).isEqualTo(newArrayList(3));
    }

    @Test
    void primeFactorsOf4_are2_2() {
        assertThat(of(4)).isEqualTo(newArrayList(2, 2));
    }

    @Test
    void primeFactorsOf6_are2_3() {
        assertThat(of(6)).isEqualTo(newArrayList(2, 3));
    }

    @Test
    void primeFactorsOf8_are2_2_2() {
        assertThat(of(8)).isEqualTo(newArrayList(2, 2, 2));
    }

    @Test
    void primeFactorsOf9_are3_3() {
        assertThat(of(9)).isEqualTo(newArrayList(3, 3));
    }

    @Test
    void acceptanceTest() {
        assertThat(of(2*2*2*3*5*5*11*11)).isEqualTo(newArrayList(2,2,2,3,5,5,11,11));
    }
}

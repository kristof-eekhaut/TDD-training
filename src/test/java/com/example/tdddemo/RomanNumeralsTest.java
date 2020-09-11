package com.example.tdddemo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsTest {

    @Test
    void romanNumeralOf1IsI() {
        assertThat(RomanNumerals.of(1)).isEqualTo("I");
    }

    @Test
    void romanNumeralOf5_isV() {
        assertThat(RomanNumerals.of(5)).isEqualTo("V");
    }

    @Test
    void romanNumeralOf2_isII() {
        assertThat(RomanNumerals.of(2)).isEqualTo("II");
    }

    @Test
    void romanNumeralOf6_isVI() {
        assertThat(RomanNumerals.of(6)).isEqualTo("VI");
    }

    @Test
    void romanNumeralOf7_isVII() {
        assertThat(RomanNumerals.of(7)).isEqualTo("VII");
    }

    @Test
    void romanNumeralOf10_isX() {
        assertThat(RomanNumerals.of(10)).isEqualTo("X");
    }

    @Test
    void romanNumeralOf4_isIV() {
        assertThat(RomanNumerals.of(4)).isEqualTo("IV");
    }

    @Test
    void romanNumeralOf9_isIX() {
        assertThat(RomanNumerals.of(9)).isEqualTo("IX");
    }
}

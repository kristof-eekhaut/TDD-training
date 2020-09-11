package com.example.tdddemo;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

class RomanNumerals {

    private static final RomanCharacter I = new RomanCharacter(1, "I", null);
    private static final RomanCharacter V = new RomanCharacter(5, "V", I);
    private static final RomanCharacter X = new RomanCharacter(10, "X", I);
    private static final RomanCharacter L = new RomanCharacter(50, "L", X);

    private static final List<RomanCharacter> ROMAN_CHARACTERS = Lists.newArrayList(I, V, X, L);

    public static String of(Integer number) {
        StringBuilder romanBuilder = new StringBuilder();
        for (int i = ROMAN_CHARACTERS.size() - 1; i >= 0; i--) {
            RomanCharacter romanCharacter = ROMAN_CHARACTERS.get(i);
            while (number >= romanCharacter.getValue()) {
                romanBuilder.append(romanCharacter.getCharacter());
                number -= romanCharacter.getValue();
            }
            if (romanCharacter.getSubtractor().isPresent()) {
                RomanCharacter subtractor = romanCharacter.getSubtractor().get();
                while (number >= romanCharacter.getValue() - subtractor.getValue()) {
                    romanBuilder.append(subtractor.getCharacter()).append(romanCharacter.getCharacter());
                    number -= romanCharacter.getValue() - subtractor.getValue();
                }
            }
        }
        return romanBuilder.toString();
    }

    private static class RomanCharacter {
        private int value;
        private String character;
        private RomanCharacter subtractor;

        public RomanCharacter(int value, String character, RomanCharacter subtractor) {
            this.value = value;
            this.character = character;
            this.subtractor = subtractor;
        }

        public String getCharacter() {
            return character;
        }

        public int getValue() {
            return value;
        }

        public Optional<RomanCharacter> getSubtractor() {
            return Optional.ofNullable(subtractor);
        }
    }
}

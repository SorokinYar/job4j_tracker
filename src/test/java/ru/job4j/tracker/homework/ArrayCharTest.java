package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayCharTest {
    @Test
    void whenPrefEqualWord() {
        char[] word = new char[] {'П', 'p', 'и', 'в', 'е', 'т'};
        char[] pref = new char[] {'П', 'p', 'и'};
        boolean result = ArrayChar.starWith(word, pref);
        assertThat(result).isTrue();
    }

    @Test
    void whenPrefNotEqualWord() {
        char[] word = new char[] {'П', 'p', 'и', 'в', 'е', 'т'};
        char[] pref = new char[] {'П', 'p', 'е'};
        boolean result = ArrayChar.starWith(word, pref);
        assertThat(result).isFalse();
    }
}
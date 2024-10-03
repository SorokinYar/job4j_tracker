package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EndWithTest {

    @Test
    void whenPostfixEqualWord() {
        char[] postfix = new char[] {'l', 'o'};
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        boolean result = EndWith.endsWith(word,postfix);
        assertThat(result).isTrue();
    }

    @Test
    void whenPostfixNonEqualWord() {
        char[] postfix = new char[] {'l', 'a'};
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        boolean result = EndWith.endsWith(word,postfix);
        assertThat(result).isFalse();
    }

}
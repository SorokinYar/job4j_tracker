package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TurnTest {
    @Test
    void whenArrayHaveEvenAmountOfElement() {
        int[] array = new int[] {1, 2, 3, 4};
        int[] result = Turn.reverse(array);
        int[] expected = new int[] {4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenArrayHaveNonEvenAmountOfElement() {
        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] result = Turn.reverse(array);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

}
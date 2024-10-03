package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {8, 12, 4};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whetElementFound() {
        int[] data = new int[] {1, 2, 3, 4, 5};
        int element = 3;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexRange(data, element, start, finish);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whetElementNotFound() {
        int[] data = new int[] {1, 2, 3, 4, 5};
        int element = 1;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexRange(data, element, start, finish);
        int expected = - 1;
        assertThat(result).isEqualTo(expected);
    }
}
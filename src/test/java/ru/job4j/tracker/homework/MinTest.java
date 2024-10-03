package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinTest {
    @Test
    void whenFirstMin() {
        int[] array = new int[] {1, 2, 3, 4, 5};
        int expected = 1;
        int result = Min.findMin(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLastMin() {
        int[] array = new int[] {1, 2, 3, 4, 0};
        int expected = 0;
        int result = Min.findMin(array);
        assertThat(result).isEqualTo(expected);
    }
}
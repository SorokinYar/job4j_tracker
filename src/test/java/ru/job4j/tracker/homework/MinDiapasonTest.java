package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinDiapasonTest {

    @Test
    void whenMinFound() {
        int[] array = new int[] {1, 5, 4, 8, 10, 34, 0, 43, 6, 87};
        int start = 2;
        int finish = 7;
        int expected = 0;
        int result = MinDiapason.findMin(array, start,finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMinLast() {
        int[] array = new int[] {1, 5, 0};
        int start = 0;
        int finish = 2;
        int expected = 0;
        int result = MinDiapason.findMin(array, start,finish);
        assertThat(result).isEqualTo(expected);
    }

}
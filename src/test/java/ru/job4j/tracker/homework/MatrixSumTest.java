package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MatrixSumTest {
    @Test
    void whenSingle() {
        int[][] array = {
                {5}
        };
        int expected = 5;
        int result = MatrixSum.sum(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void wheTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int expected = 6;
        int result = MatrixSum.sum(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenThree() {
        int[][] array = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        int expected = 18;
        int result = MatrixSum.sum(array);
        assertThat(result).isEqualTo(expected);
    }

}
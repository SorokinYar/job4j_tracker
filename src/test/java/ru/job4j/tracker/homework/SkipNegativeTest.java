package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class SkipNegativeTest {
    @Test
    void whenHave1NeganiveElement() {
        int[][] array = {
                {-1, 1},
                {1, 1}
        };
        int[][] expected = {
                {0, 1},
                {1, 1}
        };
        int[][] result = SkipNegative.skip(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenHave3NegativeElements() {
        int[][] array = {
                {1, -1, 2},
                {-1, 2, 3},
                {2, 3, -1, -4}
        };
        int[][] expected = {
                {1, 0, 2},
                {0, 2, 3},
                {2, 3, 0, 0}
        };
        int[][] result = SkipNegative.skip(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenDontHaveNegativeElements() {
        int[][] array = {
                {1},
                {2, 4, 0},
                {3}
        };
        int[][] expected = {
                {1},
                {2, 4, 0},
                {3}
        };
        int[][] result = SkipNegative.skip(array);
        assertThat(result).isEqualTo(expected);
    }
}
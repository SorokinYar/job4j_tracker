package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MatrixCheckTest {
    @Test
    void whenHasMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean result = MatrixCheck.monoHotizontal(board, row);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotHasMonoHorizontal() {
        char[][] board = {
                {' ', 'X', ' '},
                {'X', ' ', 'X'},
                {'X', ' ', ' '}
        };
        int row = 0;
        boolean result = MatrixCheck.monoHotizontal(board, row);
        assertThat(result).isFalse();
    }

}
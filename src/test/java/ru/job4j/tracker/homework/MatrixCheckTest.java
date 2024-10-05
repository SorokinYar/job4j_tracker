package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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

    @Test
    void whenHasBonoVertical() {
        char[][] board = {
                {'X', 'X', ' '},
                {'X', ' ', 'X'},
                {'X', ' ', ' '}
        };
        int column = 0;
        boolean result = MatrixCheck.monoVertical(board, column);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotHasMonoVertical() {
        char[][] board = {
                {' ', 'X', ' '},
                {'X', ' ', 'X'},
                {'X', ' ', ' '}
        };
        int column = 0;
        boolean result = MatrixCheck.monoVertical(board, column);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotHasMonoVerticalMiddle() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', ' ', 'X'},
                {'X', ' ', ' '}
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(board, column);
        assertThat(result).isFalse();
    }

    @Test
    void whenArraySize2() {
        char[][] board = {
                {'X', ' '},
                {' ', 'C'}
        };
        char[] expected = {'X', 'C'};
        char[] result = MatrixCheck.extractDiagonal(board);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whevArraySize4() {
        char[][] board = {
                {'q', ' ', ' ', 'r'},
                {'q', 'w', ' ', 'r'},
                {'q', ' ', 'e', 'r'},
                {'q', ' ', ' ', 'r'}
    };
        char[] expected = {'q', 'w', 'e', 'r'};
        char[] result = MatrixCheck.extractDiagonal(board);
        assertThat(result).containsExactly(expected);
}
    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] board = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(board);
        assertThat(result).isTrue();
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result).isFalse();
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result).isTrue();
    }

    @Test
    public void whenDataDiagMonoIsTrueThenFalse() {
        char[][] input = {
                {'X', ' ', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', ' ', 'X', ' '},
                {' ', ' ', ' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result).isFalse();
    }

}
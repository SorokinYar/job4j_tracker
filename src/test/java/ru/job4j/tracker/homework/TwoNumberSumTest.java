package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoNumberSumTest {

    @Test
    void whenArrayHaveNumbersForSum() {
        int[] array = new int[] {1, 32, 42, 6, 10};
        int target = 7;
        int[] expected = new int[] {0, 3};
        int[] result = TwoNumberSum.getIndex(array,target);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenArrayNotHaveNumbersForSum() {
        int[] array = new int[] {1, 2, 3, 4, 5, 10};
        int target = 88;
        int[] expected = new int[0];
        int[] result = TwoNumberSum.getIndex(array, target);
        assertThat(result).containsExactly(expected);
    }
    @Test
    void whenArrayHaveNegativeNumbersForSum() {
        int[] array = new int[] {2, 32, - 10, 6, 10};
        int target = - 8;
        int[] expected = new int[] {0, 2};
        int[] result = TwoNumberSum.getIndex(array,target);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTwoEqualsNumbersYesTarget() {
        int[] array = {5, 5};
        int target = 10;
        int[] result = TwoNumberSum.getIndex(array, target);
        int[] expected = {0, 1};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoEqualsNumbersNoTarget() {
        int[] array = {5, 5};
        int target = 12;
        int[] result = TwoNumberSum.getIndex(array, target);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenWithNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] result = TwoNumberSum.getIndex(array, target);
        int[] expected = {1, 4};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenWithoutNegativeNumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int target = 15;
        int[] result = TwoNumberSum.getIndex(array, target);
        int[] expected = {2, 4};
        assertThat(result).isEqualTo(expected);
    }
}
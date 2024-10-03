package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RollBackArrayTest {

    @Test
    void when3Elements() {
        int[] array = new int[] {1, 2, 3};
        int[] expected = new int[] {3, 2, 1};
        int[] result =  RollBackArray.rollBack(array);
        assertThat(result).containsExactly(expected);
    }
    @Test
    void when0Element() {
        int[] array = new int[]{};
        int[] expected = new int[]{};
        int[] result = RollBackArray.rollBack(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void when1Element() {
        int[] array = new int[]{1};
        int[] expected = new int[]{1};
        int[] result = RollBackArray.rollBack(array);
        assertThat(result).containsExactly(expected);
    }

}
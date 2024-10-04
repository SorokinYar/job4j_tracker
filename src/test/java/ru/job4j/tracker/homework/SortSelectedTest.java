package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SortSelectedTest {

    @Test
    void whenArrayHave3Element() {
        int[] data = new int[]{3, 4, 2, 1};
        int[] expected = new int[]{1, 2, 3, 4};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenArrayHave6Elements() {
        int[] data = new int[]{6, 5, 4, 3, 2, 1};
        int[] expected = new int[] {1, 2, 3, 4, 5, 6};
        int[] result =  SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }
}
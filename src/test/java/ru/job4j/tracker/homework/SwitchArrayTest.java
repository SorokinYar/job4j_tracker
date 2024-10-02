package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenArrayLength4() {
        int[] array = new int[] {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(array);
        int[] expected = new int[] {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenArrayLenght1(){
        int[] array = new int[] {1};
        int[] result = SwitchArray.swapBorder(array);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

}
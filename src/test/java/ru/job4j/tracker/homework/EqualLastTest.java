package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EqualLastTest {

    @Test
    void whenLastElementsEqual(){
        int[] left = new int[] {1, 2, 3};
        int[] right = new int[] {3, 2, 3};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    void whenLastElementsNotEqual(){
        int[] left = new int[] {1, 2, 3};
        int[] right = new int[] {3, 2, 1};
        boolean result = EqualLast.check(left, right);
        assertThat(result).isFalse();
    }

}
package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CheckTest {
    @Test
    void whenDataAllTrueThenTrue() {
        boolean[] data = new boolean[] {true, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isTrue();
    }

    @Test
    void whenDataNotAllTrueThenFalse() {
        boolean data[] = new boolean[] {false, true, true};
        boolean result = Check.mono(data);
        assertThat(result).isFalse();
    }

}
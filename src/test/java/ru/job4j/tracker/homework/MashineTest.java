package ru.job4j.tracker.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MashineTest {

    @Test
    void whenPrise35Money60() {
        int prise = 35;
        int money = 50;
        int[] expected = new int[] {10, 5};
        int[] result =Mashine.change(money, prise);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMoneyEqualsPrice() {
        int money = 100;
        int price = 100;
        int[] result = Mashine.change(money, price);
        int[] expected = {};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMoney50Price35() {
        int money = 50;
        int price = 35;
        int[] result = Mashine.change(money, price);
        int[] expected = {10, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMoney50Price21() {
        int money = 50;
        int price = 21;
        int[] result = Mashine.change(money, price);
        int[] expected = {10, 10, 5, 2, 2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMoney50Price32() {
        int money = 50;
        int price = 32;
        int[] result = Mashine.change(money, price);
        int[] expected = {10, 5, 2, 1};
        assertThat(result).containsExactly(expected);
    }
}
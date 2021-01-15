package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {2, 3, 4, 5, 6};
        int[] result = Turn.back(input);
        int[] expect = new int[] {6, 5, 4, 3, 2};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithTwoElementsThenTurnedArray() {
        int[] input = new int[] {2, 3};
        int[] result = Turn.back(input);
        int[] expect = new int[] {3, 2};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOneElementThenTurnedArray() {
        int[] input = new int[] {2};
        int[] result = Turn.back(input);
        int[] expect = new int[] {2};
        assertThat(result, is(expect));
    }
}
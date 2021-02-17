package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxOfOneTwoThreeThen3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMaxOfOneTwoZeroThen2() {
        int result = Max.max(1, 2, 0);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxOfOneTwoThreeFourThen4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMaxOfFourTwoThreeZeroThen4() {
        int result = Max.max(4, 2, 3, 0);
        assertThat(result, is(4));
    }
}
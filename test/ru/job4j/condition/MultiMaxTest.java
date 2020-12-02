package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(9, 4, 2);
        assertThat(result, is(9));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 11);
        assertThat(result, is(11));
    }

    @Test
    public void whenEqual() {
        int result = MultiMax.max(1, 1, 1);
        assertThat(result, is(1));
    }
}
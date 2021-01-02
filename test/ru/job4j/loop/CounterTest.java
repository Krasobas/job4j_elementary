package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenStart0Finish5Then15() {
        int result = Counter.sum(0, 5);
        assertThat(result, is(15));
    }

    @Test
    public void whenStart3Finish6Then18() {
        int result = Counter.sum(3, 6);
        assertThat(result, is(18));
    }

    @Test
    public void whenStart4Finish7Then22() {
        int result = Counter.sum(4, 7);
        assertThat(result, is(22));
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromElevenToTwentyThenEighty() {
        int rsl = Counter.sumByEven(11, 20);
        int expected = 80;
        assertThat(rsl, is(expected));
    }
}
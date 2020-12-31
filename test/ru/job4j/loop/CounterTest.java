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
}
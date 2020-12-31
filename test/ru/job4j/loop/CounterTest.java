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
}
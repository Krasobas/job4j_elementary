package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultipleSwitchWeekTest {

    @Test
    public void whenSaturdayThen6() {
        int rsl = MultipleSwitchWeek.numberOfDay("Суббота");
        assertThat(rsl, is(6));

    }

    @Test
    public void whenHelloThenDefault() {
        int rsl = MultipleSwitchWeek.numberOfDay("Hello");
        assertThat(rsl, is(-1));

    }
}
package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SwitchWeekTest {

    @Test
    public void when7ThenSunday() {
    String rsl = SwitchWeek.nameOfDay(7);
    assertThat(rsl, is("Воскресенье"));
    }

    @Test
    public void when9ThenError() {
        String rsl = SwitchWeek.nameOfDay(9);
        assertThat(rsl, is("Ошибка"));
    }
}
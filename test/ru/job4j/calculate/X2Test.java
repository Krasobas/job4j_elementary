package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA1B1C1X1Then3() {
        /* Входные параметры.*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        /* Ожидаемое значение.*/
        int expected = 3;
        /* Вызов метода. */
        /* Результат вычисления.*/

        int rsl = X2.calc(a, b, c, x);
        /* Сравнение полученного значения с ожидаемым. */
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        /* Входные параметры.*/
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        /* Ожидаемое значение.*/
        int expected = 2;
        /* Вызов метода. */
        /* Результат вычисления.*/

        int rsl = X2.calc(a, b, c, x);
        /* Сравнение полученного значения с ожидаемым. */
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        /* Входные параметры.*/
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        /* Ожидаемое значение.*/
        int expected = 2;
        /* Вызов метода. */
        /* Результат вычисления.*/

        int rsl = X2.calc(a, b, c, x);
        /* Сравнение полученного значения с ожидаемым. */
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        /* Входные параметры.*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        /* Ожидаемое значение.*/
        int expected = 1;
        /* Вызов метода. */
        /* Результат вычисления.*/

        int rsl = X2.calc(a, b, c, x);
        /* Сравнение полученного значения с ожидаемым. */
        Assert.assertEquals(expected, rsl);
    }
}

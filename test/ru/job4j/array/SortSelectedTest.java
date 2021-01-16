package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class SortSelectedTest {

    @Test
    public void whenSortThree() {
        int[] input = new int[] {9, 0, 7};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {0, 7, 9};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortFive() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
}
package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0;
        int x = 0;
        int y = 0;

        while (index < rsl.length) {
            if (x < left.length && left[x] <= right[y]) {
                rsl[index] = left[x];
                index++;
                x++;
            } else {
                rsl[index] = right[y];
                index++;
                y++;
            }
        }

        return rsl;
    }
}

package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int x = 0;
        int y = 0;
        if (left.length == 0 || right.length == 0) {
            rsl = left.length == 0 ? right : left;
        } else {
            for (int index = 0; index < rsl.length; index++) {
                if (x < left.length && left[x] <= right[y]) {
                    rsl[index] = left[x];
                    x++;
                } else {
                    rsl[index] = right[y];
                    y++;
                }
            }
        }
        return rsl;
    }
}

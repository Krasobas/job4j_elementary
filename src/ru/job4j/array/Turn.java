package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp = 0;
        // swap the first and the last elements
        if (array.length > 1) {
            temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }

        if (array.length <= 3) {
            return array;
        }
        // the loop stops in the middle of the array
        // if the length of the array is even: array.length % 2 - 1 = -1
        // if the length of the array is odd: array.length % 2 - 1 = 0
        for (int index = 1; index <= (array.length / 2 + array.length % 2 - 1); index++) {
            temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }

        return array;
    }
}

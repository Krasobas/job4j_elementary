package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int empty = index;
                for (int full = empty; full < array.length; full++) {
                    if (array[full] != null) {
                        array = SwitchArray.swap(array, empty, full);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
}

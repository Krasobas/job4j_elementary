package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index;
                for (int notNullIndex = nullIndex; notNullIndex < array.length; notNullIndex++) {
                    if (array[notNullIndex] != null) {
                        array = SwitchArray.swap(array, nullIndex, notNullIndex);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
}

package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        Short[] ages = new Short[10];
        String[] surnames = new String[100500];
        String[] names = new String[4];
        Float[] prices = new Float[40];
        names[0] = "Вера";
        names[1] = "Надежда";
        names[2] = "Любовь";
        names[3] = "София";
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
    }
}

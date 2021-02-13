package ru.job4j;

public class Multiple {
    public static void main(String[] args) {
        int a, b;
        a = 1;
        b = 2;
        while (b < 10) {
            System.out.printf("%d * %d = %d\n", a, b, a * b);
            b++;
        }
    }
}

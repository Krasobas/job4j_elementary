package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int result = Math.abs(x1 - x2);
        result = result == Math.abs(y1 - y2) ? result : 0;
        return result;
    }
}

package game;

import java.util.ArrayList;

public class Coordinates {
    int x, y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double countDistance(Coordinates coordinates) {
        int dx = coordinates.x - this.x;
        int dy = coordinates.y - this.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    //для урока 6
    public Coordinates newPosition(Coordinates targetPos) {
        Coordinates currentPos = new Coordinates(x, y);
        //если по х больше расстояне, сокращаем:
        if (Math.abs(targetPos.x - x) > Math.abs(targetPos.y - y)) {
            currentPos.x += (targetPos.x - x);
        }
        //если по y больше расстояне, сокращаем:
        if (Math.abs(targetPos.y - y) > Math.abs(targetPos.x - x)) {
            currentPos.y += (targetPos.y - y);
        }
        return currentPos;
    }

    //для урока 6 целевая ячейка содержит своего юнита или нет, чтоб не "затоптать"

    public boolean ifEmptyPosition(Coordinates nextPosition, ArrayList<BaseUnit> friend) {
        for (BaseUnit unit : friend) {
            if (unit.coordinates == nextPosition) return false;
        }
        return true;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

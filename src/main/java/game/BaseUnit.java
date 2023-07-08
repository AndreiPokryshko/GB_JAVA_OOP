package game;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseUnit implements Intarface {
    static int number;
    static Random r;
    String name;
    float hp;
    float maxHp;
    int strength;
    Coordinates coordinates;

    static {
        BaseUnit.r = new Random();
    }

    public BaseUnit(String name, float hp, int strength, int x, int y) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.strength = strength;
        coordinates = new Coordinates(x, y);
    }

    public String getInfo() {
        return String.format("Name: %s Hp: %d Strength: %d Unit: %s (%d, %d)", this.name, Math.round(this.hp), this.strength, this.getClass().getSimpleName(), this.coordinates.x, this.coordinates.y);
    }

    public BaseUnit nearestEnemy(ArrayList<BaseUnit> enemy) {
        double nearstDistance = Double.MAX_VALUE;
        BaseUnit nearestEnemy = null;
        for (int i = 0; i < enemy.size(); i++) {
            if (coordinates.countDistance(enemy.get(i).coordinates) < nearstDistance) {
                nearstDistance = coordinates.countDistance(enemy.get(i).coordinates);
                nearestEnemy = enemy.get(i);
            }
        }
        return nearestEnemy;
    }



}

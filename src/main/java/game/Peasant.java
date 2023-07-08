package game;

import java.util.ArrayList;

public class Peasant extends BaseUnit {
    static int number=0;
    public Peasant(String name, int hp, int strength, int x, int y) {
        super(name, hp, strength, x, y);
    }

    public Peasant(int x, int y) {
        super(String.format("Крестьянин %d", ++number), 100, 1, x, y);

    }

    @Override
    public void step(ArrayList enemy) {
        BaseUnit tmpEnemy=nearestEnemy(enemy);
        System.out.println(tmpEnemy.name+""+coordinates.countDistance(tmpEnemy.coordinates));
    }
}

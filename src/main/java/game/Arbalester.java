package game;

import java.util.ArrayList;

public class Arbalester extends BaseUnit{
    static int number=0;
    public Arbalester(String name, int hp, int strength, int x, int y) {
        super(name, hp, strength, x, y);
    }

    public Arbalester(int x, int y) {
        super(String.format("Арбалетчик %d", ++number), 100, 10, x, y);
    }

    @Override
    public void step(ArrayList enemy) {
        BaseUnit tmpEnemy=nearestEnemy(enemy);
        System.out.println(tmpEnemy.name+""+coordinates.countDistance(tmpEnemy.coordinates));
    }
}

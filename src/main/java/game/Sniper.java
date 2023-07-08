package game;

import java.util.ArrayList;

public class Sniper extends Arbalester{
    static int number=0;
    public Sniper(String name, int hp, int strength, int x, int y) {
        super(name, hp, strength, x, y);
    }

    public Sniper(int x, int y) {
        super(String.format("Снайпер %d", ++number), 100, 10, x,y);
    }

    @Override
    public void step(ArrayList enemy) {
        BaseUnit tmpEnemy=nearestEnemy(enemy);
        System.out.println(tmpEnemy.name+""+coordinates.countDistance(tmpEnemy.coordinates));
    }
}

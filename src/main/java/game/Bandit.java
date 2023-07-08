package game;


import java.util.ArrayList;

public class Bandit extends Peasant{
    static int number=0;
    public Bandit(String name, int hp, int strength, int x, int y) {
        super(name, hp, strength, x, y);
    }

    public Bandit(int x, int y) {
        super(String.format("Бандит %d", ++number), 100, 10, x, y);
    }
    @Override
    public void step(ArrayList enemy) {
        BaseUnit tmpEnemy=nearestEnemy(enemy);
        System.out.println(tmpEnemy.name+""+coordinates.countDistance(tmpEnemy.coordinates));
    }
}

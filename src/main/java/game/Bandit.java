package game;


import java.util.ArrayList;

public class Bandit extends Peasant{
    static int number=0;
    public Bandit(String name, int hp, int strength, int x, int y, String statusOfPerson) {
        super(name, hp, strength, x, y,  statusOfPerson);
    }

    public Bandit(int x, int y) {
        super(String.format("Бандит %d", ++number), 100, 10, x, y, "Stand");
    }
    @Override
    public void step(ArrayList enemy, ArrayList friend) {
        BaseUnit tmpEnemy=nearestEnemy(enemy);
        System.out.println(tmpEnemy.name+""+coordinates.countDistance(tmpEnemy.coordinates));
    }
}

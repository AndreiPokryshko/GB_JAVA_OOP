package game;

import java.util.ArrayList;

public class Pikeman extends BaseUnit{
    static int number=0;
    public Pikeman(String name, int hp, int strength, int x, int y, String statusOfPerson) {
        super(name, hp, strength, x,y,  statusOfPerson);
    }

    public Pikeman(int x, int y) {
        super(String.format("Копейщик %d", ++number), 100, 10, x, y, "Stand");
    }

    @Override
    public void step(ArrayList enemy, ArrayList friend) {
        BaseUnit tmpEnemy=nearestEnemy(enemy);
        System.out.println(tmpEnemy.name+""+coordinates.countDistance(tmpEnemy.coordinates));
    }
}

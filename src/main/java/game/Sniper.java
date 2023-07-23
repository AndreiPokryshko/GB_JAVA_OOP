package game;

import java.util.ArrayList;

public class Sniper extends Arbalester{
    static int number=0;

    public Sniper(String name, int hp, int strength, int arrows, int x, int y, String statusOfPerson) {
        super(name, hp, strength, arrows, x, y,  statusOfPerson);
    }

    public Sniper(int x, int y) {
        super(String.format("Снайпер %d", ++number), 100, 10, 10, x,y, "Stand");


    }

    @Override
    public void step(ArrayList enemy, ArrayList friend) {
        if (getHelth()==0||arrows==0){
            return;
        }
        BaseUnit tmpEnemy=nearestEnemy(enemy);
        System.out.println(tmpEnemy.name+"" +coordinates.countDistance(tmpEnemy.coordinates));
    }

}

package game;

import java.util.ArrayList;

public class Magican extends BaseUnit{
    static int number=0;

    private int mana;
    private int maxMana;

    public Magican(String name, int hp, int strength, int mana, int x, int y, String statusOfPerson) {
        super(name, hp, strength, x, y,  statusOfPerson);
        this.mana=mana;
        this.maxMana=mana;

    }

    public Magican(int x, int y) {
        super(String.format("Маг %d", ++number), 100, 10, x, y, "Stand");
        this.mana=200;
        this.maxMana=mana;
    }

    @Override
    public String getInfo(){
        return String.format("%s Мана: %d", super.getInfo(), this.mana);

    }

    @Override
    public void step(ArrayList enemy, ArrayList friend) {
        BaseUnit tmpEnemy=nearestEnemy(enemy);
        System.out.println(tmpEnemy.name+""+coordinates.countDistance(tmpEnemy.coordinates));
    }
}

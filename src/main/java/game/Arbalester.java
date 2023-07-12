package game;

import java.util.ArrayList;

public class Arbalester extends BaseUnit{
    static int number=0;
    int arrows;
    public Arbalester(String name, int hp, int strength, int arrows,int x, int y) {
        super(name, hp, strength, x, y);
    }

    public Arbalester(int x, int y) {
        super(String.format("Арбалетчик %d", ++number), 100, 10, x, y);
        this.arrows=10;
    }
    @Override
    public String getInfo(){
        return String.format("%s Стрелы: %d", super.getInfo(), this.arrows);

    }
    @Override
    public void step(ArrayList enemy) {
        if (getHelth()==0||arrows==0){
            return;
        }
        BaseUnit tmpEnemy=nearestEnemy(enemy);
        tmpEnemy.getDamage(r.nextInt(40,60));
        this.useArrows();
        System.out.println(tmpEnemy.name+" health: "+ tmpEnemy.hp+"  "+coordinates.countDistance(tmpEnemy.coordinates));

    }

        public int useArrows(){
        arrows-=1;
        return arrows;
    }
}

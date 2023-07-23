package game;

import java.util.ArrayList;

public class Arbalester extends BaseUnit{
    static int number=0;
    int arrows;
    public Arbalester(String name, int hp, int strength, int arrows,int x, int y, String statusOfPerson) {
        super(name, hp, strength, x, y, statusOfPerson);
    }

    public Arbalester(int x, int y) {
        super(String.format("Арбалетчик %d", ++number), 100, 10, x, y, "Stand");
        this.arrows=10;
    }
    @Override
    public String getInfo(){
        return String.format("%s Стрелы: %d", super.getInfo(), this.arrows);

    }
    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if (getHelth()==0||arrows==0){
            return;
        }
        BaseUnit tmpEnemy=nearestEnemy(enemy);
        tmpEnemy.getDamage(r.nextInt(40,60));
        this.useArrows();
        this.statusOfPerson="Shoot";

        for (BaseUnit unit:friend) {
            if (unit instanceof Peasant && unit.statusOfPerson=="Busy"){
                return;
            }
        }



        System.out.println(tmpEnemy.name+" health: "+ tmpEnemy.hp+"  "+coordinates.countDistance(tmpEnemy.coordinates));

    }

        public int useArrows(){
        arrows--;
        return arrows;
    }
}

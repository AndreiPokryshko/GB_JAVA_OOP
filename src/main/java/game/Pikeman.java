package game;

import java.util.ArrayList;

public class Pikeman extends BaseUnit {
    static int number = 0;

    public Pikeman(String name, int hp, int strength, int x, int y, String statusOfPerson) {
        super(name, hp, strength, x, y, statusOfPerson);
    }

    public Pikeman(int x, int y) {
        super(String.format("Копейщик %d", ++number), 100, 30, x, y, "Stand");
    }

    public void move(Coordinates targetPosition, ArrayList<BaseUnit> friend) {
        if (coordinates.ifEmptyPosition(targetPosition, friend)) {
            coordinates = coordinates.newPosition(targetPosition);
        }
    }

    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        if (getHelth() == 0) {
            return;
        }
        BaseUnit tmpEnemy = nearestEnemy(enemy);
        if ((tmpEnemy.coordinates.x - this.coordinates.x) < 1 || (tmpEnemy.coordinates.y - this.coordinates.y) < 1) {
            tmpEnemy.getDamage(r.nextInt(0, this.strength));
            this.statusOfPerson = "Fight";
        } else {
            move(tmpEnemy.coordinates, friend);
            this.statusOfPerson = "Moving";
        }

        System.out.println(this.getInfo());

    }
}

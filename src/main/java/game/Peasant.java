package game;

import java.util.ArrayList;

public class Peasant extends BaseUnit {
    static int number=0;
    public Peasant(String name, int hp, int strength, int x, int y, String statusOfPerson) {
        super(name, hp, strength, x, y,  statusOfPerson);
    }

    public Peasant(int x, int y) {
        super(String.format("Крестьянин %d", ++number), 100, 1, x, y, "Stand");

    }

    @Override
    public void step(ArrayList enemy, ArrayList friend) {
        if (this.statusOfPerson!="Busy"){
            this.statusOfPerson="Stand";
            System.out.println(getInfo());
        }
        else {
            System.out.println(getInfo());
        }
    }
}

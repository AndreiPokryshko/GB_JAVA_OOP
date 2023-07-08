package game;

import java.util.ArrayList;

public class Monk extends BaseUnit{
    static int number=0;
    int elixir;
    int maxElixir;

    public Monk(String name, int hp, int strength, int elixir, int x, int y) {
        super(name, hp, strength, x, y);
        this.elixir=elixir;
        this.maxElixir=elixir;

    }


    public Monk(int x, int y) {
        super(String.format("Монах %d", ++number), 100, 10, x,y);
        this.elixir=200;
        this.maxElixir=elixir;
    }
    @Override
    public String getInfo(){
        return String.format("%s Elixir: %d", super.getInfo(), this.elixir);

    }

    @Override
    public void step(ArrayList enemy) {
        BaseUnit tmpEnemy=nearestEnemy(enemy);
        System.out.println(tmpEnemy.name+""+coordinates.countDistance(tmpEnemy.coordinates));
    }

}

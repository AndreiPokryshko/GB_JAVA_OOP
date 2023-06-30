package game;

public class Peasant extends BaseUnit {
    static int number=0;
    public Peasant(String name, int hp, int strength) {
        super(name, hp, strength);
    }

    public Peasant() {
        super(String.format("Крестьянин №%d", ++number), 100, 10);
    }
}

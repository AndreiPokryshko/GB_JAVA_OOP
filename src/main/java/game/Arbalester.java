package game;

public class Arbalester extends BaseUnit{
    static int number=0;
    public Arbalester(String name, int hp, int strength) {
        super(name, hp, strength);
    }

    public Arbalester() {
        super(String.format("Арбалетчик №%d", ++number), 100, 10);
    }
}

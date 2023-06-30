package game;

public class Sniper extends Arbalester{
    static int number=0;
    public Sniper(String name, int hp, int strength) {
        super(name, hp, strength);
    }

    public Sniper() {
        super(String.format("Снайпер №%d", ++number), 100, 10);
    }
}

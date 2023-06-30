package game;

public class Pikeman extends BaseUnit{
    static int number=0;
    public Pikeman(String name, int hp, int strength) {
        super(name, hp, strength);
    }

    public Pikeman() {
        super(String.format("Копейщик №%d", ++number), 100, 10);
    }
}

package game;


public class Bandit extends Peasant{
    static int number=0;
    public Bandit(String name, int hp, int strength) {
        super(name, hp, strength);
    }

    public Bandit() {
        super(String.format("Бандит №%d", ++number), 100, 10);
    }
}

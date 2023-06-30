package game;

public class Magican extends BaseUnit{
    static int number=0;

    private int mana;
    private int maxMana;

    public Magican(String name, int hp, int strength, int mana) {
        super(name, hp, strength);
        this.mana=mana;
        this.maxMana=mana;

    }

    public Magican() {
        super(String.format("Маг №%d", ++number), 100, 10);
        this.mana=200;
        this.maxMana=mana;
    }

    @Override
    public String getInfo(){
        return String.format("%s Мана: %d", super.getInfo(), this.mana);

    }
}

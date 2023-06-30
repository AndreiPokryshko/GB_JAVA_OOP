package game;

public class Monk extends BaseUnit{
    static int number=0;
    int elixir;
    int maxElixir;

    public Monk(String name, int hp, int strength, int elixir) {
        super(name, hp, strength);
        this.elixir=elixir;
        this.maxElixir=elixir;

    }


    public Monk() {
        super(String.format("Монах №%d", ++number), 100, 10);
        this.elixir=200;
        this.maxElixir=elixir;
    }
    @Override
    public String getInfo(){
        return String.format("%s Elixir: %d", super.getInfo(), this.elixir);

    }

}

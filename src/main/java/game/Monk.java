package game;

import java.util.ArrayList;

public class Monk extends BaseUnit{
    static int number=0;
    int elixir;
    int maxElixir;

    public Monk(String name, int hp, int strength, int elixir, int x, int y, String statusOfPerson) {
        super(name, hp, strength, x, y,  statusOfPerson);
        this.elixir=elixir;
        this.maxElixir=elixir;

    }


    public Monk(int x, int y) {
        super(String.format("Монах %d", ++number), 100, 10, x,y, "Stand");
        this.elixir=200;
        this.maxElixir=elixir;
    }
    @Override
    public String getInfo(){
        return String.format("%s Elixir: %d", super.getInfo(), this.elixir);

    }

    @Override
    public void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend) {
        this.statusOfPerson="Stand";
        float persMaxHp=friend.get(0).maxHp;
        float minhp=persMaxHp;
        BaseUnit persMinHp=friend.get(0);
        for (int i = 1; i < friend.size()-1; i++)
        {
                if (friend.get(i).statusOfPerson!="Died" && minhp > friend.get(i).hp)
                {
                    minhp = friend.get(i).hp;
                    persMinHp = friend.get(i);
                    persMaxHp=friend.get(i).maxHp;
                }
        }
        if (minhp==persMaxHp){
            System.out.println(this.getInfo()+": Некого лечить!");
            return;
        }
        float upHp=persMaxHp-minhp;
        if (this.elixir-(int) upHp>0)
        {
            this.elixir-=(int) upHp;
            persMinHp.getDamage(Float.floatToIntBits(upHp));

        }
        else
        {
            persMinHp.getDamage(Float.floatToIntBits(this.elixir));
            this.elixir=0;
        }
        this.statusOfPerson="Heal";
        System.out.println("Монах подлечил "+persMinHp.getInfo());
    }

}

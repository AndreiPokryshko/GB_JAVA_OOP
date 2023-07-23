package game;

import java.util.ArrayList;

public interface Intarface {

    String getInfo();
    void step(ArrayList<BaseUnit> enemy, ArrayList<BaseUnit> friend);

}

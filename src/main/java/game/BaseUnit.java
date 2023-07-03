package game;

import java.util.Random;

public abstract class BaseUnit implements Intarface{
static int number;
static Random r;
String name;
float hp;
int maxHp;
int strength;

static {
    BaseUnit.r=new Random();
}
public BaseUnit(String name, int hp, int strength){
    this.name=name;
    this.hp=hp;
    this.maxHp=hp;
    this.strength=strength;
}
public String getInfo(){
    return String.format("Name: %s Hp: %f Strength: %d Unit: %s", this.name, this.hp, this.strength,this.getClass().getSimpleName());
}

}

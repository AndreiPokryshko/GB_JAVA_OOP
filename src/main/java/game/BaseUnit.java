package game;

import java.util.Random;

public class BaseUnit {
static int number;
static Random r;
String name;
int hp;
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
    return String.format("Name: %s Hp: %d Strength: %d Unit: %s", this.name, this.hp, this.strength,this.getClass().getSimpleName());
}
}

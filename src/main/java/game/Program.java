//Task1: Проанализировать и описать персонажей:
// Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
// На базе описания персонажей описать простейшую иерархию классов.
//        В основной программе создать по одному экземпляру каждого класса.

package game;

public class Program {
    public static void main(String[] args) {
        Peasant peasant1=new Peasant();
        System.out.println(peasant1.getInfo());
        Arbalester arbalester1 =new Arbalester();
        System.out.println(arbalester1.getInfo());
        Pikeman pikeman1  =new Pikeman();
        System.out.println(pikeman1.getInfo());
        Sniper sniper1   =new Sniper();
        System.out.println(sniper1.getInfo());
        Bandit bandit1  =new Bandit();
        System.out.println(bandit1.getInfo());
        Magican magican1  =new Magican();
        System.out.println(magican1.getInfo());
        Monk monk1  =new Monk();
        System.out.println(monk1.getInfo());
        Monk monk2  =new Monk();
        System.out.println(monk2.getInfo());

    }
}

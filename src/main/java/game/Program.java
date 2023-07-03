//Task1: Проанализировать и описать персонажей:
// Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
// На базе описания персонажей описать простейшую иерархию классов.
//        В основной программе создать по одному экземпляру каждого класса.

package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
//        Peasant peasant1 = new Peasant();
//        System.out.println(peasant1.getInfo());
//        Arbalester arbalester1 = new Arbalester();
//        System.out.println(arbalester1.getInfo());
//        Pikeman pikeman1 = new Pikeman();
//        System.out.println(pikeman1.getInfo());
//        Sniper sniper1 = new Sniper();
//        System.out.println(sniper1.getInfo());
//        Bandit bandit1 = new Bandit();
//        System.out.println(bandit1.getInfo());
//        Magican magican1 = new Magican();
//        System.out.println(magican1.getInfo());
//        Monk monk1 = new Monk();
//        System.out.println(monk1.getInfo());
//        Monk monk2 = new Monk();
//        System.out.println(monk2.getInfo());

        int teamcount = 7;
        List<BaseUnit> teams = new ArrayList<>();
        List<BaseUnit> teams2 = new ArrayList<>();

        for (int i = 0; i < teamcount; i++) {
            int val = BaseUnit.r.nextInt(teamcount);

            switch (val) {
                case 0:
                    teams.add(new Bandit());
                    teams2.add(new Monk());
                    break;
                case 1:
                    teams.add(new Monk());
                    teams2.add(new Bandit());
                    break;
                case 2:
                    teams.add(new Arbalester());
                    teams2.add(new Magican());
                    break;
                case 3:
                    teams.add(new Magican());
                    teams2.add(new Arbalester());
                    break;
                case 4:
                    teams.add(new Pikeman());
                    teams2.add(new Peasant());
                    break;
                case 5:
                    teams.add(new Peasant());
                    teams2.add(new Pikeman());
                    break;
                default:
                    teams.add(new Sniper());
                    break;
            }
            System.out.println("Команда 1: " + teams.get(i).getInfo());
            System.out.println("Команда 2: " + teams2.get(i).getInfo());
        }


//        if (teams.get(0) instanceof Monk) {
//            int elix= ((Monk) teams.get(0)).elixir;
    }
}


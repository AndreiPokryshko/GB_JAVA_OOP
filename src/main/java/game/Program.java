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

        int teamcount = 5;
        ArrayList<BaseUnit> teams = new ArrayList<>();
        ArrayList<BaseUnit> teams2 = new ArrayList<>();

        System.out.println("Команда №1: ");
        for (int i = 0; i < teamcount; i++) {
            int val = BaseUnit.r.nextInt(teamcount);

            switch (val) {
                case 0:
                    teams.add(new Bandit(1, i + 1));
                    break;
                case 1:
                    teams.add(new Monk(1, i + 1));
                    break;
                case 2:
                    teams.add(new Arbalester(1, i + 1));
                    break;
                case 3:
                    teams.add(new Magican(1, i + 1));
                    break;
                case 4:
                    teams.add(new Pikeman(1, i + 1));
                    break;
                case 5:
                    teams.add(new Peasant(1, i + 1));
                    break;
                default:
                    teams.add(new Sniper(1, i + 1));
                    break;
            }
            System.out.println(i + 1 + ". " + teams.get(i).getInfo());
        }
        System.out.println("---------------");
        System.out.println("Команда №2: ");
        for (int i = 0; i < teamcount; i++) {
            int val = BaseUnit.r.nextInt(teamcount);

            switch (val) {
                case 0:
                    teams2.add(new Monk(10, i + 1));
                    break;
                case 1:
                    teams2.add(new Bandit(10, i + 1));
                    break;
                case 2:
                    teams2.add(new Magican(10, i + 1));
                    break;
                case 3:
                    teams2.add(new Arbalester(10, i + 1));
                    break;
                case 4:
                    teams2.add(new Peasant(10, i + 1));
                    break;
                case 5:
                    teams2.add(new Pikeman(10, i + 1));
                    break;
                default:
                    teams2.add(new Sniper(10, i + 1));
                    break;
            }
            System.out.println(i + 1 + ". " + teams2.get(i).getInfo());
        }

       teams.forEach(n-> n.step(teams2));
//        System.out.println("Nearest Person: ");
//
//        System.out.println("К "+ teams.get(0).getInfo() +" ближайший враг: "+ teams.get(0).nearestEnemy(teams2).getInfo());


//        if (teams.get(0) instanceof Monk) {
//            int elix= ((Monk) teams.get(0)).elixir;

    }
//    private static String  getName()
//    {String s= java.lang.String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
//        return s;
//    }
}


//Task1: Проанализировать и описать персонажей:
// Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
// На базе описания персонажей описать простейшую иерархию классов.
//        В основной программе создать по одному экземпляру каждого класса.

package game;

import java.util.*;
import game.View;

public class Program {
    public static ArrayList<BaseUnit> teams = new ArrayList<>();
    public static ArrayList<BaseUnit> teams2 = new ArrayList<>();
    public static ArrayList<BaseUnit> allTeam= new ArrayList<>();
    public static void main(String[] args) {
        int teamcount = 10;//количество персонажей в команде
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

        allTeam.addAll(teams);
        allTeam.addAll(teams2);
        allTeam.sort(new Comparator<BaseUnit>() {
            @Override
            public int compare(BaseUnit o1, BaseUnit o2) {
                return o1.strength- o2.strength;
            }
        });
View.view();
System.out.println("==========выполнение степ: ");
       teams.forEach(n-> n.step(teams2, teams));

//        for (BaseUnit pers:teams) {
//            if (pers instanceof Arbalester){
//                pers.step(teams2, teams);
//            }
//        }
        System.out.println("=========== ИНформация по первой команде после степа: ");
        teams.forEach(n-> System.out.println(n.getInfo()));


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


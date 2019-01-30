import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Monster[] monsterArray = {new Monster(), new Monster(), new Monster(), new Monster(), new Monster()};

        monsterArray[0].setLives(50);
        monsterArray[0].setName("Slime");

        monsterArray[1].setLives(100);
        monsterArray[1].setName("Legendary Horse");

        monsterArray[2].setLives(70);
        monsterArray[2].setName("Kama Sutra Monster");

        monsterArray[3].setLives(60);
        monsterArray[3].setName("Devilman");

        monsterArray[4].setLives(20);
        monsterArray[4].setName("Foot Fungus");


        Scanner sc = new Scanner(System.in);
        System.out.println("Kill all of the monsters. " +
                "If you want to attack a monster, you have to state the following 'Attack Monstername'." +
                "When the HP of the monster reaches 0, attack another monster."

        );

        while (!(monsterArray[0] == null &&
                monsterArray[1] == null &&
                monsterArray[2] == null &&
                monsterArray[3] == null &&
        monsterArray[4] == null)){
            for (int i = 0; i < monsterArray.length; i++) {
                if(monsterArray[i] != null){
                    System.out.println(monsterArray[i].getName() + " " + monsterArray[i].getLives());
                }
            }

            String Attack = sc.nextLine();
            for (int i = 0; i < monsterArray.length ; i++) {
                if(monsterArray[i] != null){
                    if(monsterArray[i].getLives() == 0){
                        monsterArray[i] = null;
                        break;
                    }

                    if(Attack.equalsIgnoreCase("Attack" + " " + monsterArray[i].getName())){
                        monsterArray[i].setLives(monsterArray[i].getLives() - 10);
                        System.out.println("You've attacked " + monsterArray[i].getName() + " -10 lives " + monsterArray[i].getLives() + " lives left");
                        System.out.println(" ");
                    }
                }

            }

        }

        System.out.println("Congratulations! You've killed all of the monsters!");
    }
}

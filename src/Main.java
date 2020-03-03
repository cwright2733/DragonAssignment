/*
The program should look like this in the console, the player input is in bold:

You are in a land full of dragons. In front of you,

you see two caves. In one cave, the dragon is friendly

and will share his treasure with you. The other dragon

is greedy and hungry and will eat you on sight.

Which cave will you go into? (1 or 2)

 */
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "\n" +
                "and will share his treasure with you. The other dragon\n" +
                "\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "\n");

        Scanner inputCave = new Scanner(System.in);

        System.out.println("Which cave will you go into? (1 or 2)");
        int cave = inputCave.nextInt();

        inputCave.close();


        int playersPick = cave;

        if (playersPick == 1) {
            System.out.println("You approach the cave...\n" +
                    "\n" +
                    "It is dark and spooky...\n" +
                    "\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                    "\n" +
                    "Gobbles you down in one bite!");
            return;

        } else if (playersPick == 2) {

            System.out.println("You Have Found Treasure");


        }


    }
}

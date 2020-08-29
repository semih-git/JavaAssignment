package Game;

import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player-1 character name enter: ");
        String player1Name = scanner.next().toUpperCase();

        System.out.print("Player-2 character name enter: ");
        String player2Name = scanner.next().toUpperCase();

        Player1 player1 = new Player1(player1Name);
        Player2 player2 = new Player2(player2Name);

        System.out.println("Players are ready....");

        while (!player1.isDead() && !player2.isDead()){
//             you can Thread - multithread used.
            player1.attack(player2);
            if(player2.isDead()){
                System.out.println(">>>>>"+player2.getName()+" is dead... "+player1Name+" won!");
                break;
            }
            player2.attack(player1);
            if(player1.isDead()){
                System.out.println(">>>>>"+player1.getName()+" is dead... "+player2Name+" won! <<<<<<");
                break;
            }

        }
    }
}

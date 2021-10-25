package com.haobg2004110027.Baihoc.Outline;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSiccors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continues;
        boolean i = true;
        
        do {
            print();
            playerMove();
            
            System.out.println("Do you want to continues play? (Y/N)");
            continues = input.nextLine();

            if(continues == "N"){
                i = false;
            }
        } while (i == true);
}

    private static void print(){
        System.out.println("R = Rock");
        System.out.println("P = Paper");
        System.out.println("S = Scissors");

    }
    private static void playerMove(){
        Scanner input = new Scanner(System.in);
        String playerMove = null;
        boolean continues = false;

        while (continues) {
        System.out.print("Choose your Move: ");
        playerMove = input.nextLine();        
            switch (playerMove) {
                case "R":
                    System.out.println("You chose Rock!");
                    continues = false;
                    break;
                case "P":
                    System.out.println("You chose Paper!");
                    continues = false;
                    break;
                case "S":
                    System.out.println("You chose Scissors!");
                    continues = false;
                    break;
                default:
                    System.out.println("Invalid Move! - Choose again!");
                    continues = true;
                    break;
            }
        }
        
        Random computeRandom = new Random();

        String computerMove = null;

        int computerRand = computeRandom.nextInt(3);

        switch (computerRand) {
            case 0:
                System.out.println("Computer chose Rock!");
                computerMove = "R";
                break;
            case 1:
                System.out.println("Computer chose Paper!");
                computerMove = "P";
                break;
            case 2:
                System.out.println("Computer chose Scissors!");
                computerMove = "S";
                break;
            default:
                break;
        }

        winable(playerMove, computerMove);
    }

    //    Rock > Scissors > Paper > Rock
    private static void winable(String playerMove, String computerMove){
        if(playerMove == computerMove){
            System.out.println("The game was a tie!");
        } else if(playerMove == "R" && computerMove == "S" || playerMove == "S" && computerMove == "P" || playerMove == "P" && computerMove == "R") {
            System.out.println("The player won!");
        } else {
            System.out.println("The player lose!");
        }
    }
}

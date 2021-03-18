package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaper {
    public static void main(String[] args) {
        System.out.println("***Welcome to Rock Paper Scissor Game***");
        System.out.println("Press 1 for Rock");
        System.out.println("Press 2 for Paper");
        System.out.println("Press 3 for Scissor");
        Scanner sc = new Scanner(System.in);
        int max = 3;
        int min = 1;
        int i = 1;
        int userScore=0, compScore=0;
        while (i <=5){
            System.out.println("Match " +i);
            int user = sc.nextInt();
            int computer = (int)(Math.random() * (max - min + 1) + min);
            System.out.println(computer);
            if (user == 1 && computer == 2 || user == 2 && computer==3 || user == 3 && computer ==1)
            {
                compScore++;
            }
            else if (user == computer){
                userScore = userScore + 0;
                compScore = compScore + 0;

            }
            else
                userScore++;
            i++;

        }
        System.out.println("Computer Score: "+compScore);
        System.out.println("Yours Score: "+userScore);
        if (compScore>userScore){
            System.out.println("You lose the game.");
        }
        else if (compScore == userScore){
            System.out.println("Match is tie.Try Again!!");
        }
        else
            System.out.println("Congratulations!!! you won.");

    }
}

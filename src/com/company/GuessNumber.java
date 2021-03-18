package com.company;
import java.util.Scanner;

class Game{
    int min = 1;
    int max = 50;
    int random;
    int input;
    int numberOfGuess = 0;
    public int userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        return input = sc.nextInt();
    }
    public Game(){
        random = (int)(Math.random()*(max - min + 1) + min);
    }

    public void isCorrectNumber() {
        userInput();
        if(input != random) {
            while (input != random) {
                if (input > random) {
                    System.out.println("Your number is greater");
                    numberOfGuess++;
                    break;
                } else {
                    System.out.println("Your number is smaller");
                    numberOfGuess++;
                    break;
                }
            }
            isCorrectNumber();
        }
        else{
            System.out.println("Congratulations you got it...");
            System.out.println("No of guess: " + numberOfGuess);
        }


    }

}


public class GuessNumber {
    public static void main(String[] args) {
        Game g = new Game();
        System.out.println(g.random);
        g.isCorrectNumber();


    }
}

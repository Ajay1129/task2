package com.project_1;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    
    public static String getComputerChoice() {
        Random rand = new Random();
        int choice = rand.nextInt(3);
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return null;
        }
    }

    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        }

        switch (userChoice) {
            case "rock":
                return computerChoice.equals("scissors") ? "You win!" : "Computer wins!";
            case "paper":
                return computerChoice.equals("rock") ? "You win!" : "Computer wins!";
            case "scissors":
                return computerChoice.equals("paper") ? "You win!" : "Computer wins!";
            default:
                return "Invalid input!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice, computerChoice;
        String playAgain;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        do {
            System.out.println("Enter rock, paper, or scissors: ");
            userChoice = scanner.nextLine().toLowerCase();

            computerChoice = getComputerChoice();
            System.out.println("Computer chose: " + computerChoice);

            System.out.println(determineWinner(userChoice, computerChoice));

            System.out.println("Do you want to play again? (yes/no)");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

package com.rps.controller;

import java.util.Scanner;

import com.rps.model.RPSModel;

public class Game {
	public static void main(String[] args){

        RPSModel model = new RPSModel();
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Please choose ROCK, PAPER, or SCISSORS");
            String playerChoice = scanner.nextLine().toUpperCase();
            //String player2Choice = scanner.nextLine().toUpperCase();
            String comChoice = model.getComInput();

            System.out.println("You chose " + playerChoice + ".");
            //System.out.println("Player2 Chose " + player2Choice + ".");
            System.out.println("Computer chose " + comChoice + " ");

            //RPSModel.GameResult outcome = model.getGameResult(playerChoice, player2Choice);
            RPSModel.GameResult outcome = model.getGameResult(playerChoice, comChoice);
            if(outcome == RPSModel.GameResult.WIN){
                System.out.println("You won the game!");
            }
            else if(outcome == RPSModel.GameResult.LOSE){
                System.out.println("Computer won the game!");
            }
            else{
                System.out.println("The game was a tie!");
            }

            System.out.println("Wins: " + model.getWins());
            System.out.println("Losses: " + model.getlost());
            System.out.println("Ties: " + model.gettie());
            System.out.println("No of Rock Move: "+ model.getRockMove());
            System.out.println("No of Paper Move: " + model.getPaperMove());
            System.out.println("No of Scissors Move: "+ model.getScissorsMove());

            System.out.println("Do you want to play again? (yes/no)");

            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("no")){
                //user wants to quit, end the input loop
                break;
            }

        }

        scanner.close();
    }
}

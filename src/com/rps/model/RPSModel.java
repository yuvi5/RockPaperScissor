package com.rps.model;

public class RPSModel {

	private int wins = 0;
    private int lost = 0;
    private int tie = 0;

    private int rockMove = 0;
    private int paperMove = 0;
    private int scissorsMove = 0;

    
    public static enum GameResult{
        WIN, LOSE, TIE;
    }   
    
    
   /*public static enum Move{
    	ROCK, PAPER, SCISSORS;
    }*/
    
   	//player against player
    /*public GameResult getGameResult(String userInput, String user2Input){

    	if(userInput.equalsIgnoreCase("ROCK")){

            if(user2Input.equalsIgnoreCase("PAPER")){
                //rock lose to paper
                lost++;
                return GameResult.LOSE;
            }
            else if(user2Input.equalsIgnoreCase("SCISSORS")){
                //rock wings against Scissors
                wins++;
                return GameResult.WIN;
            }
        }
        else if(userInput.equalsIgnoreCase("PAPER")){

            if(user2Input.equalsIgnoreCase("SCISSORS")){
                //paper is cut by scissors
                lost++;
                return GameResult.LOSE;
            }
            else if(user2Input.equalsIgnoreCase("ROCK")){
                //paper covers rock
                wins++;
                return GameResult.WIN;
            }
        }
        else if(userInput.equalsIgnoreCase("SCISSORS")){

            if(user2Input.equals("ROCK")){
                //rock smashes scissors
                lost++;
                return GameResult.LOSE;
            }
            else if(user2Input.equalsIgnoreCase("PAPER")){
                //scissors cut paper
                wins++;
                return GameResult.WIN;
            }
        }

        tie++;
        return GameResult.TIE;
    }*/

   //player against computer
    public GameResult getGameResult(String userInput, String comInput){

    	if(userInput.equalsIgnoreCase("ROCK")){
    		rockMove++;

            if(comInput.equalsIgnoreCase("PAPER")){
                //rock lose to paper
            	paperMove++;
                lost++;
                return GameResult.LOSE;
            }
            else if(comInput.equalsIgnoreCase("SCISSORS")){
                //rock wings against Scissors
            	scissorsMove++;
                wins++;
                return GameResult.WIN;
            }
        }
        else if(userInput.equalsIgnoreCase("PAPER")){
        	paperMove++;
            if(comInput.equalsIgnoreCase("SCISSORS")){
                //paper is cut by scissors
                scissorsMove++;
            	lost++;
                return GameResult.LOSE;
            }
            else if(comInput.equalsIgnoreCase("ROCK")){
                //paper covers rock
            	rockMove++;
                wins++;
                return GameResult.WIN;
            }
        }
        else if(userInput.equalsIgnoreCase("SCISSORS")){
        	scissorsMove++;
            if(comInput.equals("ROCK")){
                //rock smashes scissors
                rockMove++;
            	lost++;
                return GameResult.LOSE;
            }
            else if(comInput.equalsIgnoreCase("PAPER")){
                //scissors cut paper
            	paperMove++;
                wins++;
                return GameResult.WIN;
            }
        }

        tie++;
        return GameResult.TIE;
    }
   

    //creating com decisions using .random
    
    public String getComInput(){
        double d = Math.random();

        if(d < .33){
            return "ROCK";
        }
        else if(d < .66){
            return "PAPER";
        }
        else{
            return "SCISSORS";
        }
    	
    }
    public int getWins(){
        return wins;
    }

    public int getlost(){
        return lost;
    }

    public int gettie(){
        return tie;
    }


	public int getRockMove() {
		return rockMove;
	}


	public int getPaperMove() {
		return paperMove;
	}


	public int getScissorsMove() {
		return scissorsMove;
	}
	
		
	}
    



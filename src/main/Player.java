package main;

import java.util.ArrayList;

public class Player {

	private ArrayList<Token> Tokens = new ArrayList<>();
	//If the player already won
	private boolean won = false;
	//If Player is currently in game
	private boolean inGame = false;
	//Start will have 4 possible values in pos: 5,22,39,56
	private Start start;
	private Home home;
	private int color = -1;

	public Player(int color, Home home) {
		Tokens = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			// Create 4 tokens ****** To do: Change constructer due to Tokens constructor ********
			Tokens.add(new Token());
		}

		//If color is not between 0 and 6 then print error
		if (color<5&&color>0) {
			this.color = color;
		}else {
			System.out.println("Trying to create a player with a invalid color: "+color);
		}
		
		this.home = home;
		
		//If home.front.getPos() != 5,22,39,56 trow exception. To do: Removce this line if class Start already has a method that checks if the start is valid
		if (home.front.getPos() != 5 && home.front.getPos() != 22 && home.front.getPos() != 39 && home.front.getPos() != 56) {
			System.out.println("Trying to create a player with a invalid start position: "+home.front.getPos());
		}else {
			this.start = home.front;
		}
	}

	public ArrayList<Token> getTokens() {
		return Tokens;
	}

	public void setTokens(ArrayList<Token> Tokens) {
		this.Tokens = Tokens;
	}

	public void setWin(boolean b) {
		won = b;
	}

	public boolean hasWon() {
		return won;
	}

	public void setInGame(boolean b) {
		inGame = b;
	}

	public boolean isInGame() {
		return inGame;
	}

	public void setStartPos(int i) {
		start.setPos(i);
	}

	public int getStartPos() {
		return start.getPos();
	}

	public Home getHome() {
		return home;
	}

	public void setHome(Home h) {
		home = h;
	}

	public void setColor(int i) {
		color = i;
	}

	public int getColor() {
		return color;
	}

	//this method will simulate a dice roll
	public int rollDice() {
		return (int) (Math.random() * 6) + 1;
	}

	//This method will override the toString method and returnn a String with the player's color, inGame, won and tokens in this format:
	//Player: color: red, inGame: true, won: false, Tokens: \n[Token: color: red, number: 1\nToken: color: red, number: 2]
	@Override
	public String toString() {
		String res = "Player: color: " + color + ", inGame: " + inGame + ", won: " + won + ", Tokens: \n[";
		for (int i = 0; i < Tokens.size(); i++) {
			res += Tokens.get(i).toString();
			if (i != Tokens.size() - 1) {
				res += "\n";
			}
		}
		res += "]";
		return res;
	}

	public static void main(String[] args) {
	}
}

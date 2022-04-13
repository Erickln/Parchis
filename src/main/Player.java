package main;

import java.util.ArrayList;

public class Player {

	private ArrayList<Token> Tokens = new ArrayList<>();
	//If the player already won
	private boolean won = false;
	//If Player is currently in game
	private boolean inGame = false;
	private int startPos;
	private Home home;
	private int color;

	public Player(int color, int startPos, Home home) {
		Tokens = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			// Create 4 tokens ****** To do: Change constructer due to Tokens constructor ********
			Tokens.add(new Token());
		}
		this.color = color;
		this.startPos = home.front.getPos();
		this.home = home;
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

	public boolean getWin() {
		return won;
	}

	public void setInGame(boolean b) {
		inGame = b;
	}

	public boolean getInGame() {
		return inGame;
	}

	public void setStartPos(int i) {
		startPos = i;
	}

	public int getStartPos() {
		return startPos;
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

	//This method will make inGame value false

	public static void main(String[] args) {
		//Home home = new Home(player, front);
	}
}

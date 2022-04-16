package main;

import java.util.ArrayList;

public class Node {
	// Tokens in the node
	protected ArrayList<Token> Tokens = new ArrayList<>();
	// Father of the node
	protected Node back;
	// Children of the node
	protected Node front;
	// Posotion of the node in the Board
	protected int pos;
	protected int playerOwner = -1;

	public Node() {
		this.Tokens = new ArrayList<>();
		back = null;
		front = null;
		pos = -1;
	}

	public Node(Node back, Node front, int pos, int playerOwner) {
		this.Tokens = new ArrayList<>();
		this.back = back;
		this.front = front;
		this.pos = pos;
		// If playerOwner is not between -1 and 6 then print error and cancel
		// construction else set playerOwner
		if (playerOwner <= 6 && playerOwner >= -1) {
			this.playerOwner = playerOwner;
		} else {
			System.out.println("Trying to create a node with a invalid playerOwner: " + playerOwner + "\nSafe in "
					+ this.getClass().getSimpleName() + " setted into -1");
		}
	}

	public Node(Node back, Node front, int pos) {
		this.Tokens = new ArrayList<>();
		this.back = back;
		this.front = front;
		this.pos = pos;
		this.playerOwner = -1;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getPlayerOwner() {
		return playerOwner;
	}

	public void setPlayerOwner(int playerOwner) {
		this.playerOwner = playerOwner;
	}

	// This method will return the previous node
	public Node prev() {
		return back;
	}

	public void setBack(Node back) {
		this.back = back;
	}

	// This method will return the next node
	public Node next() {
		return front;
	}

	public void setFront(Node front) {
		this.front = front;
	}

	// If Token does not contain in the token it adds it
	public void add(Token token) {
		if (Tokens.size() >= 2) {
			System.out.println(this.getClass().getSimpleName() + " in pos" + pos
					+ " is full and you tried to add a token\n" + this);
		} else if (Tokens.contains(token)) {
			System.out.println("You tried to add a  Token in a " + this.getClass().getSimpleName()
					+ " that already contains that Token \n " + this.getClass().getSimpleName()
					+ " already contains a token of color with number: " + token.getColor() + " : " + token.getNumber()
					+ "\n" + this);
			// To do: change token.getColor() and token.getNumber() to token.toString()
		} else {
			Tokens.add(token);
		}
	}

	// This methos will recieve a token and pop it from Tokes else it will return
	// null
	public Token pop(Token token) {
		if (Tokens.contains(token)) {
			Tokens.remove(token);
			return token;
		}
		return null;
	}

	// If Tokens has fewer than 2 tokens it returns true
	public boolean hasSpace() {
		return Tokens.size() < 2;
	}

	@Override
	public String toString() {
		// This will return the position of the node, the number of tokens and the
		// tokens
		// In this format: Node: pos: 0, Tokens: 2, Tokens: \n[Token: color: red,
		// number: 1\nToken: color: red, number: 2]
		String res = this.getClass().getSimpleName() + ": pos: " + pos + ", Tokens: " + Tokens.size() + ", Tokens: \n[";
		for (int i = 0; i < Tokens.size(); i++) {
			res += Tokens.get(i).toString();
			if (i != Tokens.size() - 1) {
				res += "\n";
			}
		}
		res += "]";
		return res;
	}

}

class Home extends Node {

	Start front;

	// This constructor will create a home with a start and a playerOwner
	// back is null because it is not provided
	public Home(int playerOwner, Start front) {
		super(null, front, 0, playerOwner);
	}

	// This constructor will create a home with a start
	// back is null and playerOwner is -1 because there were not provided
	public Home(Start front) {
		super(null, front, 0, -1);
	}

	// This constructor will create a home with playerOwner
	// back is null, front is null and playerOwner is -1 because there were not
	// provided
	public Home(int playerOwner) {
		super(null, null, 0, -1);
		this.playerOwner = playerOwner;
	}

	@Override
	public void add(Token token) {
		if (Tokens.size() >= 4) {
			System.out.println(this.getClass().getSimpleName() + " in pos" + pos
					+ " is full and you tried to add a token\n" + this);
		} else if (Tokens.contains(token)) {
			System.out.println("You tried to add a  Token in a " + this.getClass().getSimpleName()
					+ " that already contains that Token \n " + this.getClass().getSimpleName()
					+ " already contains a token of color with number: " + token.getColor() + " : " + token.getNumber()
					+ "\n" + this);
			// To do: change token.getColor() and token.getNumber() to token.toString()
		} else {
			Tokens.add(token);
		}
	}

}

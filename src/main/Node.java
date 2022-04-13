package main;

import java.util.ArrayList;

public class Node {
	//Tokens in the node
	ArrayList<Token> Tokens = new ArrayList<>();
	//Father of the node
	Node back;
	//Children of the node
	Node front;
	//Posotion of the node in the Board
	int pos;
	int safe = -1;



	public Node(ArrayList<Token> Tokens, Node back, Node front, int pos, int safe) {
		this.Tokens = Tokens;
		this.back 	= back;
		this.front 	= front;
		this.pos 	= pos;
		this.safe 	= safe;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getSafe() {
		return safe;
	}

	public void setSafe(int safe) {
		this.safe = safe;
	}

	//This method will return the previous node
	public Node prev(){
		return back;
	}

	public void setBack(Node back) {
		this.back = back;
	}

	//This method will return the next node
	public Node next(){
		return front;
	}

	public void setFront(Node front) {
		this.front = front;
	}


	//If Token does not contain in the token it adds it
	public void add(Token token) {
		if(Tokens.size()>=2){
			System.out.println(this.getClass().getSimpleName()+" in pos"+pos+" is full and you tried to add a token\n"+this);
		}else if(Tokens.contains(token)){
			System.out.println("You tried to add a  Token in a "+this.getClass().getSimpleName()+" that already contains that Token \n "
			+this.getClass().getSimpleName()+" already contains a token of color with number: "+token.getColor()+" : "+token.getNumber()+"\n"+this);
			//To do: change token.getColor() and token.getNumber() to token.toString()
		}else {
			Tokens.add(token);
		}
	}

	//This methos will recieve a token and pop it from Tokes else it will return null
	public Token pop(Token token) {
		if(Tokens.contains(token)){
			Tokens.remove(token);
			return token;
		}
		return null;
	}

	//If Tokens has fewer than 2 tokens it returns true
	public boolean hasSpace(){
		return Tokens.size() < 2;
	}

	@Override
	public String toString(){
		//This will return the position of the node, the number of tokens and the tokens
		//In this format: Node: pos: 0, Tokens: 2, Tokens: \n[Token: color: red, number: 1\nToken: color: red, number: 2]
		String res = this.getClass().getSimpleName()+": pos: "+pos+", Tokens: "+Tokens.size()+", Tokens: \n[";
		for(int i = 0; i < Tokens.size(); i++){
			res += Tokens.get(i).toString();
			if(i != Tokens.size()-1){
				res += "\n";
			}
		}
		res += "]";
		return res;
	}

}

class Home extends Node {

	public Home(Player player, Start front) {
		super(player.getTokens(), null, front, 0, -1);
	}

	@Override
	public void add(Token token) {
		if(Tokens.size()>=4){
			System.out.println(this.getClass().getSimpleName()+" in pos"+pos+" is full and you tried to add a token\n"+this);
		}else if(Tokens.contains(token)){
			System.out.println("You tried to add a  Token in a "+this.getClass().getSimpleName()+" that already contains that Token \n "
			+this.getClass().getSimpleName()+" already contains a token of color with number: "+token.getColor()+" : "+token.getNumber()+"\n"+this);
			//To do: change token.getColor() and token.getNumber() to token.toString()
		}else {
			Tokens.add(token);
		}
	}

}

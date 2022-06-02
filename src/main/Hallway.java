package main;

import java.util.ArrayList;

public class Hallway extends Node {
	
	public Hallway() {
		
	}
	
	public Hallway(Node back, Node front, int pos, int player) {
		this.Tokens = new ArrayList<>();
		this.back = back;
		this.front = front;
		this.pos = pos;
		this.playerOwner = -1;
	}

	public Hallway(Node node) {
		super(node);
	}
	
	
}

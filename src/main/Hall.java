package main;

import java.util.ArrayList;

public class Hall extends Node {
	public Hall() {
		
	}
	
	public Hall(Node back, Node front, int pos, int player) {
		this.Tokens = new ArrayList<>();
		this.back = back;
		this.front = front;
		this.pos = pos;
		this.playerOwner = -1;
	}
	
	
}

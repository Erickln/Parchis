package main;

import java.util.ArrayList;

public class SafeZone extends Node{
	
	public SafeZone(){
		
	}
	
	public SafeZone(Node back, Node front, int pos) {
		this.Tokens = new ArrayList<>();
		this.back = back;
		this.front = front;
		this.pos = pos;
		this.playerOwner = -1;
	}
	
	public SafeZone(Node node){
		this.Tokens = new ArrayList<>();
		this.back = node.back;
		this.front = node.front;
		this.pos = node.pos;
		this.playerOwner = node.playerOwner;
	}

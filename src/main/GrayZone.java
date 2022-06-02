package main;

import java.util.ArrayList;

public class GrayZone extends SafeZone {

	public GrayZone(Node back, Node front, int pos, int player) {
		this.Tokens = new ArrayList<>();
		this.back = back;
		this.front = front;
		this.pos = pos;
		this.playerOwner = -1;
	}

	public GrayZone(Node node){
		this.Tokens = new ArrayList<>();
		this.back = node.back;
		this.front = node.front;
		this.pos = node.pos;
		this.playerOwner = node.playerOwner;
	}

}

package main;

import java.util.ArrayList;

public class GrayZone extends Node {  

	public GrayZone(Node node){
		this.Tokens = new ArrayList<>();
		this.back = node.back;
		this.front = node.front;
		this.pos = node.pos;
		this.playerOwner = node.playerOwner;
	}

}

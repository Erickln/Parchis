package main;

import java.util.ArrayList;

public class GrayZone extends Node {

  private PreHallway side;

	public GrayZone(Node node){
		this.Tokens = new ArrayList<>();
		this.back = node.back;
		this.front = node.front;
		this.pos = node.pos;
		this.playerOwner = node.playerOwner;
	}
  public GrayZone(Node back, Node front, int pos, int player) {
    this.Tokens = new ArrayList<>();
    this.back = back;
    this.front = front;
    this.pos = pos;
    this.playerOwner = -1;
    this.side = new PreHallway(this, player); //constructor para que en cuanto se cree el grayzone se cree solamente en grayzone, los prehalls
  }

}

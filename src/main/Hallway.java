package main;

public class Hallway extends Node {

  public Hallway() {}

  public Hallway(Node back, Node front, int pos, int player) {
    super(back, front, pos, player);
  }

  public Hallway(Node node) {
		super(node);
	}

  public Hallway(PreHallway back, int player) {
    this.back = back;
    this.playerOwner = player;

    Node nodeaux = null;
    Node node = new Node(null, nodeaux, 1, player);

    for (int i = 2; i < 7; i++) { //creación de un Hallway como una lista doblemente linkeada me falta agregar la meta
      nodeaux.setBack(node);
      node = new Node(nodeaux.back, nodeaux, i, player);
      nodeaux.back.setFront(node);
    }
  }
}

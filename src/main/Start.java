package main;

import java.util.ArrayList;

public class Start extends Node {

  public Start() {
    super();
    back = null;
  }

  // if pos is not 5,22,39 or 56 then print error and cancel construction else set
  // pos
  public Start(Node back, Node front, int pos, int playerOwner) {
    //no entiendo demasiado bien porqué el start tiene home, no necesita nada de ahí . . . creo
    super(back, front, pos, playerOwner);
    back.front = this;
    front.back = this;
  }

  	public Start(Node node, Home home){
		super(node);
	}

  public Start(Home home, int pos, int playerOwner) {
    super(null, null, pos, playerOwner);
  }

  public void setFront(Node front) {
    this.front = front;
  }

  public boolean canEat(Token token, int playerOwner) { //al chile y de huevos me hice bolas con la safezone XD. Método para evaluar en el Move si puede comer, ya que esta zona es segura solo para un jugador.
    if (playerOwner == token.getPlayerOwner()) {
      return false;
    } else {
      return true;
    }
  }
}

package main;

import java.util.ArrayList;

public class Start extends Node {

  private Home home;

  public Start() {
    super();
    back = null;
  }

  // if pos is not 5,22,39 or 56 then print error and cancel construction else set
  // pos
  public Start(Home home, Node back, Node front, int pos, int playerOwner) {
    //no entiendo demasiado bien porqué el start tiene home, no necesita nada de ahí . . . creo
    super(back, front, pos, playerOwner);
    back.front = this;
    front.back = this;
    this.home = home;
    this.home.front = this;

    if (pos != 5 || pos != 22 || pos != 39 || pos != 56) { //cambié los && por ||, creo que era imposible que pos tuviera 4 valores al mismo tiempo
      System.out.println(
        "Trying to create a start with a invalid pos: " +
        pos +
        "\nSafe in " +
        this.getClass().getSimpleName() +
        " setted into 5"
      );
      this.pos = pos; // cambié el 5 x "pos"
    }
  }

  public Start(Home home, int pos, int playerOwner) {
    super(null, null, pos, playerOwner);
    this.home = home;
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

package main;

public class PreHallway extends GrayZone {

  public PreHallway(GrayZone back, Hallway front, int player) { //la posicion del prehall siempre va a ser 0 porque es la cabeza
    super(back, front, 0, player);
    //if (back.passHall(player)) {}
  }

  public PreHallway(Node back, Hallway hallway, int player) {
    super(back, hallway, 0, player);
  }
  // public PreHallway(Node node, Hallway hallway) {
  //   super(node);
  //   this.Hallway = hallway;
  // }
}

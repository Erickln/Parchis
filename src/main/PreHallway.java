package main;

public class PreHallway extends GrayZone {

  private static Hall hall;

  public PreHallway(GrayZone back, Hall front, int player) { //la posicion del prehall siempre va a ser 0 porque es la cabeza
    super(back, front, 0, player);
    if (back.passHall(player)) {}
  }

  public PreHallway(GrayZone back, int player) {
    super(back, hall, 0, player);
  }


  public PreHallway(Node node, Hall hallway) {
    super(node);
    this.hall = hallway;
}
}

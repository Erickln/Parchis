package main;

public class PreHallway extends GrayZone {

    Hallway hallway;

    public PreHallway(Node back, Node front, int pos, int player) {
        super(back, front, pos, player);
    }

    public PreHallway(Node node, Hallway hallway) {
        super(node);
        this.hallway = hallway;
    }


}

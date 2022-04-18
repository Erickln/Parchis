package main;

import java.util.ArrayList;

public class Board {
	private ArrayList<Node> circuit = new ArrayList<>();
	private Node nodeAux;
	private SafeZone safeZone;
	private GrayZone grayZone;
	private ArrayList<Node> hall = new ArrayList<>();
	int player;
	Home home;
	Token token;

	public Board(int nodes) {
		// creation of the numbered spaces in the board
		for (int i = 1; i < nodes; i++) {
			if (i == 1) {
				circuit.add(1, new Node(null, nodeAux, 1));
				nodeAux.setBack(circuit.get(1));
				nodeAux.setFront(null);
			} else if (i == 63 || i == 29 || i == 12 || i == 46) { // hardcoding for safezones
				circuit.add(i, new SafeZone(nodeAux.back, nodeAux, i));
				nodeAux.back.setFront(circuit.get(i));
				nodeAux.setBack(circuit.get(i));
				nodeAux.setFront(null);

			} else if (i == 68 || i == 17 || i == 34 || i == 51) { // hardcoding for halls
				if (grayZone.passHall(player)) {
					grayZone.setBack(circuit.get(i));
					for (int j = 0; j < 7; j++) {
						hall.add(j, new Hall(grayZone.back, grayZone, j, player));
						grayZone.back.setFront(hall.get(j));
						grayZone.setBack(hall.get(j));
						grayZone.setFront(null);
					}

				}
			} else {
				circuit.add(i, new Node(nodeAux.back, nodeAux, i));
				nodeAux.back.setFront(circuit.get(i));
				nodeAux.setBack(circuit.get(i));
				nodeAux.setFront(null);
			}
		}
	}

	public void initialize(int numberOfPlayers) {
		Board board = new Board(68);
		Player player = new Player(this.player, this.home);
	}
	
	public Node getPos(int pos) {
		return this.circuit.get(pos);
	}
	
	// This method is used to get the position of the node in the circuit
	// In progres...
	public int getPosToken(Token token) {
		for (int i = 0; i < circuit.size(); i++) {
			if (circuit.get(i).Tokens.contains(token)) {
				return i;
			}
		}
		return -2;
	}
}

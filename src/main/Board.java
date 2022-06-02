package main;

import java.util.ArrayList;
import java.util.LinkedList;

public class Board {
	// The board is a LinkedList of Nodes
	Node head;
	ArrayList<Home> homes = new ArrayList<>(4);
	// Creating a doubly linked list of hallways
	LinkedList<Hallway> hallways = new LinkedList<>();
	int length = 68;

	public Board() {
		//Creating 4 homes and adding them to the homes arraylist
		for (int i = 0; i < 4; i++) {
			homes.add(new Home(i + 1));
		}

		// Filling the hallways wirth 8 hallways
		for (int i = 0; i < 4; i++) {
			Hallway Hallhead = new Hallway(null, null, 1, i+1);
			Node aux = Hallhead;
			for (int j = 0; j < 7; j++) {
				Hallway Hall = new Hallway(aux, null, j+1, i+1);
				aux.setFront(Hall);
				aux = Hall;
				hallways.add(Hall);
			}
			hallways.get(i).setFront(Hallhead);
		}

		// Create the board in a circular LinkedList    ****Just Nodes
		head = new Node(null, null, 1);
		Node aux = head;
		for (int i = 0; i < 67; i++) {
			head.front= new Node(head, null, i+2);
			head = head.front;
		}	
		head = aux;

		// Setting GrayZones in the positions 11,28,45,62
		for (int i = 0; i < 4; i++) {
			this.setPos(
			new GrayZone(this.getPos((i*17) - 5 - 1)),
			(i*17) - 5
						);
		}
		
		// Setting the start positions in the positions 4,21,38,55
		for (int i = 0; i < 4; i++) {
			this.setPos(
			new Start(this.getPos((i*17) - 12 - 1),this.homes.get(i)),
			(i*17) - 12
						);
		}

		

		// Setting the PreHallways in the positions 16,33,50,67
		for (int i = 0; i < 4; i++) {
			this.setPos(
			new PreHallway(this.getPos((i*17) - 0 - 1),this.hallways.get(i)),
			(i*17) + 8
						);
		}


		// Setting the PreHallway positions in the positions 16,33,50,67
		// for (int i = 0; i < 4; i++) {
		// 	this.setPos(
		// 	new PreHallway(this.getPos((i*17) - 0 - 1),this.homes.get(i)),
		// 	(i*17) - 19
		// 				);
		// }




		System.out.println("Holi");
	}

	//This method returns the node in the board at the position pos
	public Node getPos(int pos) {
		Node aux = head;
		for (int i = 0; i < pos; i++) {
			aux = aux.front;
		}
		return aux;
	}

	//This method sets the position of the node in the board
	public void setPos(Node node, int pos) {
		Node aux = head;
		for (int i = 0; i < pos; i++) {
			aux = aux.front;
		}
		node.back = aux.back;
		node.front = aux;
		aux.back.front = node;
		aux.back = node;
	}

	public static void main(String[] args) {
		Board board = new Board();
		for (int i = 0; i < board.length; i++) {
			System.out.println(board.getPos(i));
		}
	}





}

package main;

import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		Home home = new Home(1);
		Start start = new Start(home, new Node(null, null, 4), new Node(null, null, 6), 5, 1);
		home.setFront(start);
		Player player = new Player(1, home);
	}

}
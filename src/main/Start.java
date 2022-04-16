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
		super(back, front, pos, playerOwner);
		back.front = this;
		front.back = this;
		this.home = home;
		this.home.front = this;

		if (pos != 5 && pos != 22 && pos != 39 && pos != 56) {
			System.out.println("Trying to create a start with a invalid pos: " + pos + "\nSafe in "
					+ this.getClass().getSimpleName() + " setted into 5");
			this.pos = 5;
		}
	}

	public Start(Home home, int pos, int playerOwner) {
		super(null, null, pos, playerOwner);
		this.home = home;
	}

	public void setFront(Node front) {
		this.front = front;
	}

}

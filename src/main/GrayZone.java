package main;

import java.util.ArrayList;

public class GrayZone extends SafeZone {

	public GrayZone(Node back, Node front, int pos, int player) {
		this.Tokens = new ArrayList<>();
		this.back = back;
		this.front = front;
		this.pos = pos;
		this.playerOwner = -1;
	}

	public boolean passHall(int player) {
		switch (player) {
		case 1:
			if (this.pos == 68) {
				return true;
			} else {
				return false;
			}
		case 2:
			if (this.pos == 17) {
				return true;
			} else {
				return false;
			}
		case 3:
			if (this.pos == 34) {
				return true;
			} else {
				return false;
			}
		case 4:
			if (this.pos == 51) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
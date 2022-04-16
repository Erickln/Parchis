package main;

public class Token {
	
	private int number;
	private Node node;
	private Board board;
	private boolean exit;
	private Player player;
	private int pos;
	
	
	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public Token() {
		
	}
	
	public void move(int dice, boolean canmove) {
		
	}
	
	public void restart() {
		
	}
	
	public void eat(Token token) {
		
	}
	
	public void win() {
		
	}
	
	public void start () {
		
	}
	
	public boolean isClear(int pos) {
		if(node.hasSpace()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean someoneWon() {
		if(player.hasWon()) {
			return true;
		}
		else {
			return false;
		}
	}
	
    public String getColor() {
        return null;
    }

    public String getStringNumber() {
        return null;
    }
    
    public int getNumber() {
    	return number;
    }
    
    
    public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}

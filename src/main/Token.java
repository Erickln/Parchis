package main;

public class Token {
	
	private int number;
	private Node node; // Me parece que el nombre del nodo puede ser más intuitivo, algo como "casilla" en inglés
	private Board board;
	private boolean exit;
	private Player player;
	private int pos;

	public Token() {
		
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}
	
	public void move(int dice, boolean canmove) {
		
	}
	
	public void restart() {
		
	}
	
	public void eat(Token token) {
		
	}
	
	public void win() { // This method will be called when the player wins the game
		this.player.setWin(true);
	}
	
	public void start () {
		
	}
	
	public boolean isClear(int pos) { 	// ** ¿Por qué pediríamos la posición si ya tenemos acceso a la posición del nodo?
		if(node.hasSpace()) {
			return true;
		}
		else {
			return false;				
		}
	}

	public boolean isClear() {			// ** Creo que esto es lo que buscabas hacer
		if(node.hasSpace()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean someoneWon() { //** Creo que esto es lo que buscabas hacer es mejor hacerlo desde Board
		if(player.hasWon()) {
			return true;
		}
		else {
			return false;
		}
	}
	
    public String getColor() {
        return "" + this.player.getColor();
    }

    public String getStringNumber() {
        return "" + this.number;
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

	public void exit(){		// ** Me parece que estos son más intuitivo que el de arriba
		this.exit = true;
	}

	public void enter(){
		this.exit = false;
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

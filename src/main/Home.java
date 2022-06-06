package main;

class Home extends Node {

  Start front;

  // This constructor will create a home with a start and a playerOwner
  // back is null because it is not provided
  public Home(int playerOwner, Start front) {
    super(null, front, 0, playerOwner);
  }

  // This constructor will create a home with a start
  // back is null and playerOwner is -1 because there were not provided
  public Home(Start front) {
    super(null, front, 0, -1);
  }

  // This constructor will create a home with playerOwner
  // back is null, front is null and playerOwner is -1 because there were not
  // provided
  public Home(int playerOwner) {
    super(null, null, 0, -1); //¿por qué no haces "...pos:0, playerOwner" en su lugar?
    this.playerOwner = playerOwner;
  }

  @Override
  public void add(Token token) {
    if (Tokens.size() >= 4) {
      System.out.println(
        this.getClass().getSimpleName() +
        " in pos" +
        pos +
        " is full and you tried to add a token\n" +
        this
      );
    } else if (Tokens.contains(token)) {
      System.out.println(
        "You tried to add a  Token in a " +
        this.getClass().getSimpleName() +
        " that already contains that Token \n " +
        this.getClass().getSimpleName() +
        " already contains a token of color with number: " +
        token.getColor() +
        " : " +
        token.getNumber() +
        "\n" +
        this
      );
      // To do: change token.getColor() and token.getNumber() to token.toString()
    } else {
      Tokens.add(token);
    }
  }
}

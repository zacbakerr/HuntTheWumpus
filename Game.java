public class Game extends Map {

  // Game the panel for the game and instantiates 
  // new map and moveshoot objects

  public Game(int game) {

    // Initializing the Panel including size, location, Title, Background, etc.

    setSize(950, 600);
    setTitle("Hunt The Wumpus");
    setBackground(new java.awt.Color(204, 166, 166));
    setLocationRelativeTo(null);

    // Creating a map and a moveShoot for the Panel

    new Map();
    new MoveShoot();

    // Passes the parameter of the game mode to MoveShoot

    setNum(game);
  }
}

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame {
	
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	public BoardGame()
	{
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new LinkedHashMap<String, Location>();
	}
	
	/**
	 * Adds a player to the board game object. Players are uniquely 
	 * associated with a game piece. These game pieces represent the 
	 * player in the board game. Each player has only one game piece, 
	 * and each game piece can be associated with only one player. As 
	 * such, when adding a player, a check must be done to ensure that 
	 * a player is not already associated with the game piece. Players 
	 * are represented by their names. Players/GamePieces are given a 
	 * location in the board game (a location inside a mansion). 
	 * Multiple Players/GamePieces may be in the same location. Remember 
	 * that a player is uniquely associated with a single game piece, 
	 * so a "player at a location" is essentially the same as a "game 
	 * piece at a location".
	 * @param playerName - The name of the player to be added
	 * @param gamePiece - The game piece to be associated with the player
	 * @param initialLocation - The initial location of the game piece
	 * @return false if there already is a player associated with the game piece
	 */
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
	{
		//TODO: check to see if the variable should be "initialLocation" and not
		// "intialLocation like in the UML
		
		if(playerPieces.containsValue(gamePiece))
		{
			return false;
		}
		else
		{
			
		}
	}
	
	/**
	 * 
	 * @param playerName - The player name for which we want to find an associated game pice
	 * @return The GamePiece associated with the player
	 */
	public GamePiece getPlayerGamePiece(String playerName)
	{
		//TODO: NOT SURE IF THIS IS RIGHT!!!
		return playerPieces.get(playerName);
	}
	
	/**
	 * 
	 * @param gamePiece - The game piece for which we want to find an associated player
	 * @return If a player is correlated with the game piece, return that player name
	 * 		   Else, return null
	 */
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		//TODO
		
	}
	
	/**
	 * 
	 * @param playerName - The player to be moved
	 * @param newLocation - The new location for the player
	 */
	public void movePlayer(String playerName, Location newLocation)
	{
		//TODO
		
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		//TODO
	}
	
	public Location gerPlayersLocation(String player)
	{
		//TODO: NOT SURE IF THIS IS RIGHT!!!
		return playerLocations.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		//TODO
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		//TODO
	}
	
	public Set<String> getPlayers()
	{
		//TODO: NOT SURE IF RIGHT!!!
		return playerPieces.keySet();
	}
	
	public Set<Location> getPlayerLocations()
	{
		//TODO
	}
	
	public Set<GamePiece> getPlayerPieces()
	{
		//TODO
	}

}

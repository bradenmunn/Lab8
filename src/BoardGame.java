import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame {
	
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	public BoardGame()
	{
		//TODO
	}
	
	/*
	 * Adds a player to the BoardGame
	 * @par
	 * 
	 */
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
	{
		//TODO: check to see if the variable should be "initialLocation" and not
		// "intialLocation like in the UML
	}
	
	public GamePiece getPlayerGamePiece(String playerName)
	{
		//TODO: NOT SURE IF THIS IS RIGHT!!!
		return playerPieces.get(playerName);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		//TODO
	}
	
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
		//TODO
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

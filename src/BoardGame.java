import java.util.ArrayList;
import java.util.HashSet;
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
		
		if(playerPieces.containsValue(gamePiece))
		{
			return false;
		}
		else
		{
			playerPieces.put(playerName, gamePiece);
			playerLocations.put(playerName, initialLocation);
			return true;
		}
	}
	
	/**
	 * 
	 * @param playerName - The player name for which we want to find an associated game pice
	 * @return The GamePiece associated with the player
	 */
	public GamePiece getPlayerGamePiece(String playerName)
	{
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
		Set<String> players = playerPieces.keySet();
		for(String name: players)
		{
			if(playerPieces.get(name).equals(gamePiece))
			{
				return name;
			}
		}
		
		return null;
	}
	
	/**
	 * 
	 * @param playerName - The player to be moved
	 * @param newLocation - The new location for the player
	 */
	public void movePlayer(String playerName, Location newLocation)
	{
		playerLocations.put(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		String[] playersMoved = new String[2];
		
		//The piece to be moved first, based on priority
		GamePiece first = GamePiece.movesFirst(playerPieces.get(playerNames[0]), playerPieces.get(playerNames[1]));
		
		
		if(first.equals(playerPieces.get(playerNames[0])))
		{
			//Moves the players in order of priority
			playersMoved[0] = playerNames[0];
			playerLocations.put(playerNames[0], newLocations[0]);
			
			playersMoved[1] = playerNames[1];
			playerLocations.put(playerNames[1], newLocations[1]);
		}
		else
		{
			playersMoved[0] = playerNames[1];
			playerLocations.put(playerNames[1], newLocations[1]);
			
			playersMoved[1] = playerNames[0];
			playerLocations.put(playerNames[0], newLocations[0]);
		}
		
		return playersMoved;
	}
	
	public Location getPlayersLocation(String player)
	{
		return playerLocations.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		ArrayList<String> playersAtLoc = new ArrayList<String>();
		Set<String> players = playerLocations.keySet();
		
		for(String i: players)
		{
			if(playerLocations.get(i).equals(loc))
			{
				playersAtLoc.add(i);
			}
		}
		
		return playersAtLoc;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> pieces = new ArrayList<GamePiece>();
		Set<String> players = playerLocations.keySet();
		
		for(String i: players)
		{
			if(playerLocations.get(i).equals(loc))
			{
				pieces.add(playerPieces.get(i));
			}
		}
		
		return pieces;
	
	}
	
	public Set<String> getPlayers()
	{
		//TODO: NOT SURE IF RIGHT!!!
		return playerPieces.keySet();
	}
	
	public Set<Location> getPlayerLocations()
	{
		return new HashSet<Location>(playerLocations.values());
	}
	
	public Set<GamePiece> getPlayerPieces()
	{
		return new HashSet<GamePiece>(playerPieces.values());
	}

}

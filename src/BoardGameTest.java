import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest {
	
	@Test
	public void addPlayersTest()
	{
		BoardGame board = new BoardGame();
		
		// Tests addPlayer
		Assert.assertEquals("Player adding was incorrect", true, 
				board.addPlayer("Braden", GamePiece.BLUE_BOOT, Location.BALLROOM));
		Assert.assertEquals("Player adding was incorrect", false, 
				board.addPlayer("Will", GamePiece.BLUE_BOOT, Location.BALLROOM));
	}
	
	@Test
	public void getPlayerGamePieceTest()
	{
		BoardGame board = new BoardGame();
		board.addPlayer("Braden", GamePiece.BLUE_BOOT, Location.BALLROOM);
		
		// Tests getPlayerGamePiece
		Assert.assertEquals("Incorrect game piece", GamePiece.BLUE_BOOT, board.getPlayerGamePiece("Braden"));
	}
	
	@Test
	public void getPlayerWithGamePiece()
	{
		BoardGame board = new BoardGame();
		board.addPlayer("Braden", GamePiece.BLUE_BOOT, Location.BALLROOM);
		
		// Tests getPlayerWithGamePiece
		Assert.assertEquals("Incorrect player name", "Braden", board.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
		
	}
		
	@Test
	public void movePlayerTest()
	{
		BoardGame board = new BoardGame();
		board.addPlayer("Braden", GamePiece.BLUE_BOOT, Location.BALLROOM);
		
		// Tests movePlayer
		board.movePlayer("Braden", Location.STUDY);
		Assert.assertEquals("Player moved incorrectly", Location.STUDY, board.getPlayersLocation("Braden"));
	}
	
	@Test
	public void moveTwoPlayersTest()
	{
		BoardGame board = new BoardGame();
		board.addPlayer("Braden", GamePiece.BLUE_BOOT, Location.BALLROOM);
		board.addPlayer("Will", GamePiece.RED_THIMBLE, Location.HALL);
		
		String[] players = {"Braden", "Will"};
		Location[] locations = {Location.STUDY, Location.KITCHEN};
		
		String[] orderMoved = board.moveTwoPlayers(players, locations);
		
		Assert.assertEquals("Incorrect first player moved", "Braden", orderMoved[0]);
		Assert.assertEquals("Incorrect second player moved", "Will", orderMoved[1]);
		
		Assert.assertEquals("Incorrect movement for Braden", Location.STUDY, board.getPlayersLocation("Braden"));
		Assert.assertEquals("Incorrect movement for Will", Location.KITCHEN, board.getPlayersLocation("Will"));

	}
	
	@Test
	public void getPlayersLocationTest()
	{
		BoardGame board = new BoardGame();
		board.addPlayer("Braden", GamePiece.BLUE_BOOT, Location.BALLROOM);
		board.addPlayer("Will", GamePiece.RED_THIMBLE, Location.HALL);
		
		Assert.assertEquals("Incorrect player location", Location.BALLROOM, board.getPlayersLocation("Braden"));
	}
	
	@Test
	public void getPlayersAtLocation()
	{
		BoardGame board = new BoardGame();
		board.addPlayer("Braden", GamePiece.BLUE_BOOT, Location.HALL);
		board.addPlayer("Will", GamePiece.RED_THIMBLE, Location.HALL);
		
		ArrayList<String> playersPresent = new ArrayList<String>();
		playersPresent.add("Braden");
		playersPresent.add("Will");
		
		Assert.assertEquals("Incorrect players at location", playersPresent, board.getPlayersAtLocation(Location.HALL));
	}
	
	@Test
	public void getGamePiecesAtLocation()
	{
		BoardGame board = new BoardGame();
		board.addPlayer("Braden", GamePiece.BLUE_BOOT, Location.HALL);
		board.addPlayer("Will", GamePiece.RED_THIMBLE, Location.HALL);
		
		ArrayList<GamePiece> piecesPresent = new ArrayList<GamePiece>();
		piecesPresent.add(GamePiece.BLUE_BOOT);
		piecesPresent.add(GamePiece.RED_THIMBLE);
		
		Assert.assertEquals("Incorrect pieces at location", piecesPresent, board.getGamePiecesAtLocation(Location.HALL));
	}
	
	@Test
	public void getPlayersTest()
	{
		BoardGame board = new BoardGame();
		board.addPlayer("Braden", GamePiece.BLUE_BOOT, Location.HALL);
		board.addPlayer("Will", GamePiece.RED_THIMBLE, Location.HALL);
		
		Set<String> players = new HashSet<String>();
		players.add("Braden");
		players.add("Will");
		
		Assert.assertEquals("Incorrect players list", players, board.getPlayers());
	}
	
	@Test
	public void getPlayerLocationsTest()
	{
		BoardGame board = new BoardGame();
		board.addPlayer("Braden", GamePiece.BLUE_BOOT, Location.HALL);
		board.addPlayer("Will", GamePiece.RED_THIMBLE, Location.STUDY);
		
		Set<Location> locations = new HashSet<Location>();
		locations.add(Location.HALL);
		locations.add(Location.STUDY);
		
		Assert.assertEquals("Incorrect locations list", locations, board.getPlayerLocations());
	}
	
	@Test
	public void getPlayerPiecesTest()
	{
		BoardGame board = new BoardGame();
		board.addPlayer("Braden", GamePiece.BLUE_BOOT, Location.HALL);
		board.addPlayer("Will", GamePiece.RED_THIMBLE, Location.HALL);
		
		Set<GamePiece> pieces = new HashSet<GamePiece>();
		pieces.add(GamePiece.BLUE_BOOT);
		pieces.add(GamePiece.RED_THIMBLE);
		
		Assert.assertEquals("Incorrect pieces list", pieces, board.getPlayerPieces());
	}
	

}

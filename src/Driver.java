
public class Driver {

	public static void main(String[] args) {
		
		BoardGame board = new BoardGame();
		
		board.addPlayer("Braden", GamePiece.BLUE_BOOT, Location.BALLROOM);
		board.addPlayer("Will", GamePiece.RED_THIMBLE, Location.CONSERVATORY);
		
		System.out.println(board.getPlayerGamePiece("Braden"));
		System.out.println(board.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
		
		board.movePlayer("Braden", Location.KITCHEN);
		
		// Moving players
		String[] players = {"Braden", "Will"};
		Location[] locations = {Location.STUDY, Location.HALL};
		board.moveTwoPlayers(players, locations);
		System.out.println(board.getPlayersLocation("Braden"));
		System.out.println(board.getPlayersLocation("Will"));
		
		// All player names at certain location
		System.out.println(board.getPlayersAtLocation(Location.HALL));
		
		// All game pieces at certain location
		System.out.println(board.getGamePiecesAtLocation(Location.STUDY));
		
		// Get all players
		System.out.println(board.getPlayers());
		
		// Get all locations
		System.out.println(board.getPlayerLocations());
		
		//Get all pieces
		System.out.println(board.getPlayerPieces());
		

	}

}


public enum GamePiece implements BoardGame{
	RED_RACER, BLUE_RACER, MAGENTA_RACER, RED_THIMBLE,
	BLUE_BOOT, GREEN_BOOT, YELLOW_BOOT;
	
	private GamePieceAppearance appearance;
	private int priority;
	
	private GamePiece(GamePieceAppearance appearance, int priority)
	{
		this.appearance = appearance;
		this.priority = priority;
	}
	
	public Color getColor()
	{
		return appearance.getColor();
	}
	
	public Shape getShape()
	{
		return appearance.getShape();
	}
	
	public static GamePiece movesFirst(GamePiece a, GamePiece b)
	{
		if(a.priority < b.priority)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	public String toString()
	{
		//TODO
	}
}



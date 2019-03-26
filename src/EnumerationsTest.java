import org.junit.Assert;
import org.junit.Test;

public class EnumerationsTest {

	@Test
	public void gamePieceTest()
	{
		GamePiece blueBoot = GamePiece.BLUE_BOOT;
		
		// Tests getColor
		Assert.assertEquals("Incorrect color", Color.BLUE, blueBoot.getColor());
		
		// Tests getShape
		Assert.assertEquals("Incorrect shape", Shape.BOOT, blueBoot.getShape());
		
		// Tests toString
		Assert.assertEquals("Incorrect toString", "BLUE_BOOT: a BLUE boot with priority 5", blueBoot.toString());
		
		// Tests GamePieceAppearance class methods
		GamePieceAppearance g = new GamePieceAppearance(Color.BLUE, Shape.BOOT);
		
		Assert.assertEquals("Incorrect color", Color.BLUE, g.getColor());
		Assert.assertEquals("Incorrect shape", Shape.BOOT, g.getShape());
		
	}
	
}

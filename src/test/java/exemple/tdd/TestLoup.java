package exemple.tdd;

import junit.framework.TestCase;

public class TestLoup extends TestCase {
	
	public void testPositionInitialAuNord() {
		
		Loup loup = new Loup();
		
		assertEquals(Orientation.NORD, loup.getOrientation());
	}
	
      public void testTournerUneFois() {
		
		Loup loup = new Loup();
		loup.tourner();
		assertEquals(Orientation.EST, loup.getOrientation());
	}

}


import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_firstThrow5_secondThrow5_isSpare() {
		Frame frame = new Frame(5,5);
		assertTrue(frame.isSpare());
		
		//fail("Not yet implemented");
	}

}

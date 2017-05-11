import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_firstThrow5_secondThrow5_isSpare() throws BowlingException{
		Frame frame = new Frame(5,5);
		assertTrue(frame.isSpare());
		
		//fail("Not yet implemented");
	}
	@Test 
	public void test_firstThrow3_secondThrow5_notSpare() throws BowlingException {
		Frame frame = new Frame(3,5);
		assertFalse(frame.isSpare());
	}
	@Test 
	public void test_firstThrow10_isStrike() throws BowlingException{
		Frame frame = new Frame(10,0);
		assertTrue(frame.isStrike());
	}
	@Test
	public void test_firstThrow8_notStrike() throws BowlingException{
		Frame frame = new Frame(8,1);
		assertFalse(frame.isStrike());
	}
	@Test
	public void test_firstThrowframeScore() throws BowlingException{
		Frame frame = 
	}

}

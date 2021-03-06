import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:20:52
// Student ID:IT36/2015

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int bonusGame = 0;
	public BowlingGame(){}
	private int score=0;
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		//to be implemented
		if(frames.size()==10)
			throw new BowlingException();
		else
			frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
			
		for(int i = 0; i<frames.size();i++){
			if(frames.get(i).isStrike()){
				bonus = frames.get(i+1);
				bonusGame+=bonus.score();
			}
			else if (frames.get(i).isSpare()){
				bonus = frames.get(i+1);
				bonusGame+=bonus.getFirstThrow();
			}
		}
	}
	
	// Returns the game score
	public int score(){
		
		//to be implemented: should return game score 
		for(int i = 0; i<frames.size();i++){
			score +=  frames.get(i).score();
			
		}
		return score + bonusGame;
	}

	public int getBonusGame() {
		return bonusGame;
	}

	
}

package epicmice.game.XTBSG;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class XTBSG extends StateBasedGame {
	
	private static final int WIDTH = 1280;
	private static final int HEIGHT = 720;
	private static final boolean FULLSCREEN = false;
	
	public XTBSG() {
		super("XTBSG");
	}
	
	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer game = new AppGameContainer(new XTBSG());
		
		game.setDisplayMode(WIDTH, HEIGHT, FULLSCREEN);
		game.setShowFPS(true);
		game.start();
	}

}

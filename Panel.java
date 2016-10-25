package flappyPlane;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{

	private Tower tower = new Tower();
	
	private int gameXsize = 500;
	private int gameYsize = 500;
	private int tempX = 500;
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(tower.getTowerColor());
		g.fillRect(tower.getTowerX(), tower.getTowerY(), tower.getTowerWidth(), tower.getTowerHeight());
		
//		towerXposition = towerXposition - tower.getTowerMS();
//		tower.getTower().setLocation(tower.getTowerX()-tower.getTowerMS(), 0);
		tower.getTower().setLocation(tower.getTower().x - tower.getTowerMS(), 0);
		
		if(tower.getTower().x < -(tower.getTowerWidth())){
			tower.getTower().setLocation(gameXsize, 0);
		}
	}
	public int getGameXsize(){
		return gameXsize;
	}
	public int getGameYsize(){
		return gameYsize;
	}
}
package flappyPlane;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class Panel extends JPanel{

	private Tower tower = new Tower();
	
	private int gameXsize = 500;
	private int gameYsize = 500;
	private int towerXposition = tower.getTowerX();
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(tower.getTowerColor());
		g.fillRect(tower.getTowerX(), tower.getTowerY(), tower.getTowerWidth(), tower.getTowerHeight());
		
//		towerXposition = towerXposition - tower.getTowerMS();
//		tower.getTower().setLocation(tower.getTowerX()-tower.getTowerMS(), 0);
		tower.getTower().setLocation(tower.getTower().x - 1, 0);
		
//		if(rec.x > 300){
//			rec.setLocation(-rec.width, -rec.height);
//			x = -rec.width;
//			y = -rec.height;
//		}
//		else{
//			rec.setLocation(x, y);
//		}
	}
	public int getGameXsize(){
		return gameXsize;
	}
	public int getGameYsize(){
		return gameYsize;
	}
}

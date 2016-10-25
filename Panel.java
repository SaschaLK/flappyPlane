package flappyPlane;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	private View view = new View();
	
	private Tower tower = new Tower();
	//private int towerPositionX = view.getGameXsize();
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(tower.getTowerColor());
		g.fillRect(tower.getTowerX(), tower.getTowerY(), tower.getTowerWidth(), tower.getTowerHeight());
		
		//towerPositionX = towerPositionX - tower.getTowerMS();
		
	}
	
}

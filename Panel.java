package flappyPlane;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{

	private Tower tower = new Tower();
	private Model model = new Model();
	
	private int gameXsize = 500;
	private int gameYsize = 500;
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (Tower o : model.getTowerList()) {
			g.setColor(o.getTowerColor());
			g.fillRect(o.getTowerX(), o.getTowerY(), o.getTowerWidth(), o.getTowerHeight());
			
			tower.getTower().setLocation(tower.getTower().x - tower.getTowerMS(), 0);
			
			if(tower.getTower().x < -(tower.getTowerWidth())){
				tower.getTower().setLocation(gameXsize, 0);
			}
		}
		
	}
	public int getGameXsize(){
		return gameXsize;
	}
	public int getGameYsize(){
		return gameYsize;
	}
}
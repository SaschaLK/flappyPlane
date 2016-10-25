package flappyPlane;

import javax.swing.JFrame;

public class View extends JFrame{
	
	private int gameXsize = 500;
	private int gameYsize = 500;
	
	private Panel panel = new Panel();
	
	public View(){
		
		setTitle("Flappy Plane");
		
		add(panel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(gameXsize, gameYsize);
		setResizable(false);
		setVisible(true);
	}
	
	public int getGameXsize(){
		return gameXsize;
	}
	
	public void updateView(){
		panel.repaint();
	}

}

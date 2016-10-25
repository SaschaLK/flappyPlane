package flappyPlane;

import javax.swing.JFrame;

public class View extends JFrame{
	
	private Panel panel = new Panel();
	
	public View(){
		
		setTitle("Flappy Plane");
		
		add(panel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(panel.getGameXsize(), panel.getGameYsize());
		setResizable(false);
		setVisible(true);
	}
	public void updateView(){
//		panel.move();
		panel.repaint();
	}

}

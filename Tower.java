package flappyPlane;

import java.awt.Color;
import java.awt.Rectangle;

public class Tower {
	
//	private int towerX = 480;
//	private int towerY = 0;
//	private int towerWidth = 50;
//	private int towerHeight = 200;
	private int towerMS = 1;
	private Color towerColor = new Color(200, 100, 100);
	
//	private Rectangle tower = new Rectangle(towerX, towerY, towerWidth, towerHeight);
	private Rectangle tower;

    public Tower(){
        tower = new Rectangle(400, 0, 50, 200);
    }
	
	public Rectangle getTower(){
		return tower;
	}
	public int getTowerX() {
		return tower.x;
	}
	public int getTowerY() {
		return tower.y;
	}
	public int getTowerWidth() {
		return (int)tower.getWidth();
	}
	public int getTowerHeight() {
		return (int)tower.getHeight();
	}
	public int getTowerMS(){
		return towerMS;
	}
	public Color getTowerColor(){
		return towerColor;
	}
}
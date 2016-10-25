package flappyPlane;

import java.awt.Color;
import java.awt.Rectangle;

public class Tower {
	
	private int towerX = 500;
	private int towerY = 0;
	private int towerWidth = 50;
	private int towerHeight = 200;
	private int towerMS = 1;
	private Color towerColor = new Color(200, 100, 100);
	
	private Rectangle tower = new Rectangle(towerX, towerY, towerWidth, towerHeight);
	
//	public Tower(){
//		
//	}
	
	public int getTowerX() {
		return towerX;
	}
	public int getTowerY() {
		return towerY;
	}
	public int getTowerWidth() {
		return towerWidth;
	}
	public int getTowerHeight() {
		return towerHeight;
	}
	public int getTowerMS(){
		return towerMS;
	}
	public Color getTowerColor(){
		return towerColor;
	}
}

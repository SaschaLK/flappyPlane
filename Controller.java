package flappyPlane;

import javax.swing.Timer;

public class Controller {
	
	private Timer timer;
	
	public Controller(View view){
		
		timer = new Timer(10, listener->{
			view.updateView();
//			System.out.println("Hello");
		});
		timer.start();
	}
	
}

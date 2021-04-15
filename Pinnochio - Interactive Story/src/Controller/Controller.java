package Controller;
import Model.Logic;
import processing.core.PApplet;

public class Controller {
	PApplet app;
	public Logic logic;
	
	public Controller() {
		this.app = app;
		logic = new Logic(app);
		
	}
	public void drawMagic() {
		Logic.drawMagic();	
	}
	
	public void dragMagic() {
		
		Logic.dragMagic();
	}
}
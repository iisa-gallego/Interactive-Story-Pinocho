package View;
import java.util.ArrayList;
import processing.core.PApplet;


public class Main extends PApplet {
	
	PApplet app;
	public InterScreen interScreen;
	String [] pinocchio;
	ArrayList<String> finalPinocchio;
	ArrayList<String> pinocchioWords;
	
	public static void main(String[] args) {

		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size (1440, 1024);
	}

	public void setup(){
		interScreen = new InterScreen(this);
	}
	public void draw() {
		background (0);
		imageMode(CENTER);

	
}
}



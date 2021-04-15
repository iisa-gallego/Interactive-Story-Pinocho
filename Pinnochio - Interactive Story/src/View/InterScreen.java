package View;

import Controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class InterScreen {

	PApplet app;
	PImage scene;
	public Controller control;

	public InterScreen(PApplet app) {

		this.app = app;
	    control = new Controller();
		scene = app.loadImage("Pantalla escena.png");
	}
	public void paintScene() {
		app.image(scene,639.5f,359.5f);
	}
}
	


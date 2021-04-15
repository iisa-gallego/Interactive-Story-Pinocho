package Model;

import processing.core.PApplet;

public class Life extends Element {

	public Life(int posX, int posY, PApplet app) {
		super(posX, posY, app);

	}

	@Override
	public void draw(PApplet app) {
		app.imageMode(app.CENTER);
		app.image(life, posX, posY);
		app.imageMode(app.CORNER);

	}
}

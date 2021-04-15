package Model;

import processing.core.PApplet;

public class Reaction extends Element {

	public Reaction(int posX, int posY, PApplet app) {
		super(posX, posY, app);

	}

	@Override
	public void draw(PApplet app) {
		app.imageMode(app.CENTER);
		app.image(reaction, posX, posY);
		app.imageMode(app.CORNER);

	}
}
package Model;

import processing.core.PApplet;

public class Magic extends Element {

	public Magic(int posX, int posY, PApplet app) {
		super(posX, posY, app);

	}

	@Override
	public void draw(PApplet app) {
		app.imageMode(app.CENTER);
		app.image(magic, posX, posY);
		app.imageMode(app.CORNER);

	}
}

package Model;

import processing.core.PApplet;

public class Book extends Element {

	public Book(int posX, int posY, PApplet app) {
		super(posX, posY, app);

	}

	@Override
	public void draw(PApplet app) {
		app.imageMode(app.CENTER);
		app.image(book, posX, posY);
		app.imageMode(app.CORNER);

	}

}

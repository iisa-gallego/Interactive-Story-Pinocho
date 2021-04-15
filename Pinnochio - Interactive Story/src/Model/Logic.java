package Model;

import processing.core.PApplet;

public class Logic extends PApplet{

	PApplet app;
	public Book book;
	public Life life;
	public Magic magic;
	public Reaction reaction;
	
	public Logic(PApplet app) {
		
		this.app=app;
		book = new  Book(80, 625, app);
		life = new Life(450, 415, app);
		magic = new Magic(820, 105, app);
		reaction = new Reaction(1150, 185, app);

	}
	public void drawMagic() {
		
		magic.drawElement(app);
	}
	
	public void dragMagic() {
		
		magic.dragElement(app);
	}
	
}


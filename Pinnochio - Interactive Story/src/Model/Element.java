package Model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Element {
	protected PApplet app;
	protected int posX, posY;
	PImage book, life, magic, reaction;

	public Element(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;
		
		book = app.loadImage("libros.png");
		life = app.loadImage("vida.png");
		magic = app.loadImage("magia.png");
		reaction = app.loadImage("contento.png");
		
	}
	public abstract void draw (PApplet app);
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}

	}

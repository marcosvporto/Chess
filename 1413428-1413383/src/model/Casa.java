package model;

import java.awt.geom.Rectangle2D;

public class Casa {
	
	
	int largura;
	int altura;
	int x;
	int y;
	String cor;
	public Rectangle2D rect;
	Peca p;
	public boolean vazia = true;
	
	public Casa(int x, int y, int largura, int altura ) {
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
		rect = new Rectangle2D.Double(x,y,largura,altura);
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Rectangle2D getRectangulo2D() {
		return this.rect;
	}
	
	public double returnCenterX(Rectangle2D rt) {
		return rt.getCenterX();
	}
	
	public double returnCenterY(Rectangle2D rt) {
		return rt.getCenterY();
	}
	
	public void setPeca(Peca p) {
		this.p = p;
		this.vazia = false;
	}
	
	public Peca getPeca() {
		return this.p;
	}
	
}

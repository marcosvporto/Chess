package model;

import java.awt.Graphics2D;
import java.awt.Image;

public class Tabuleiro {
	
	int linhas;
	int colunas;
	int posTop;
	int posEsq;
	public Casa [][] matriz;

	public Tabuleiro() {
		this.matriz = new Casa[8][8];
		this.posTop = 100;
		this.posEsq = 100;
		
		setMatrizCasas();
	}
	
	public void setMatrizCasas() {
		for (int i = 0; i < 8; i++) {  
			for (int j = 0; j < 8; j++) {
				
				int dim = 80; // altura e largura do quadrado
				int x = posEsq+(j*dim);
				int y = posTop+(i*dim);
				Casa c = new Casa(x,y,dim, dim);
				this.matriz[i][j] = c;
			}
		}
	}
	
	public void setBoard(Graphics2D g2d) {

		for (int i = 0; i < 8; i+=1) {  
			for (int j = 0; j < 8; j++) {  
				g2d.draw(this.matriz[i][j].rect);
				
				if( (i%2)==0 && ((j%2)!=0) ) {
					g2d.fill(this.matriz[i][j].rect);
				}
				
				if( (i%2)!=0 && ((j%2)==0) ) {
					g2d.fill(this.matriz[i][j].rect);
				}
			}
		}
	}
	
	public void setPieces(Graphics2D g2d) {
		for (int i = 0;i<8;i+=1) {
			for(int j = 0;j < 8; j++) {
				Casa c = this.matriz[i][j];
				
					if(c != null) {
						int pX = c.x;
						int pY = c.y;
						int pecaX = c.getPeca().img.getHeight(null);
						int pecaY = c.getPeca().img.getWidth(null);
						int realX = pX +(pecaX/2);
						int realY = pY +(pecaY/2);
						g2d.drawImage(c.getPeca().img,realX,realY,null);
					}
		
			}
			
		}
	}

}

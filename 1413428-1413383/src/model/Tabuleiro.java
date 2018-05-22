package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;

public class Tabuleiro {
	
	int linhas;
	int colunas;
	int posTop;
	int posEsq;
	public Casa [][] matriz;
	int dimCasa = 80;

	public Tabuleiro() {
		this.matriz = new Casa[8][8];
		this.posTop = 100;
		this.posEsq = 100;
		
		setMatrizCasas();
	}
	
	public void setMatrizCasas() {
		for (int i = 0; i < 8; i++) {  
			for (int j = 0; j < 8; j++) {
				
				 // altura e largura do quadrado
				int x = posEsq+(j*dimCasa);
				int y = posTop+(i*dimCasa);
				Casa c = new Casa(x,y,dimCasa, dimCasa);
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
				
					if(!c.vazia) {
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
	public void alteraCorRectSelecionado(Graphics2D g2d , Casa c) {
		int i,j;
		for(i=0;i<8;i++) {
			for(j=0;j<8;j++) {
				if (this.matriz[i][j].equals(c)) {
					if( (i%2)==0 && ((j%2)!=0) ) {
						g2d.setPaint(Color.GRAY);
						g2d.fill(c.rect);
						
					}
					else if( (i%2)!=0 && ((j%2)==0)) {
						g2d.setPaint(Color.GRAY);
						g2d.fill(c.rect);
					}
					else {
						g2d.setPaint(Color.lightGray);
						g2d.fill(c.rect);
					}
				}
			}
		}
		
	}
	public Casa selecionaCasa(int x, int y) {
		
		int i,j;
		for(i=0;i<8;i++) {
			for(j=0;j<8;j++) {
				Rectangle2D rect2d = this.matriz[i][j].getRectangulo2D();
				if(rect2d.contains(x,y))
						return this.matriz[i][j];
			}
		}
		return this.matriz[0][0];		
	}

}

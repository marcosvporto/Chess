package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Peca {
	
	String tipo;
	String cor;
	Image img;
	int posX;
	int posY;
	int movimentos=0;

	
	public Peca(String tipo, String cor ) {
		
		this.cor = cor;
		this.tipo = tipo;
		char inicialCor = cor.charAt(0);
		String url = "U:\\INF1636\\WS\\1413428-1413383\\src\\images\\"+inicialCor+"_"+tipo+".gif";

		try {
			this.img = ImageIO.read(new File(url));
		}catch(IOException e) {
			System.out.println(e.getMessage());
			System.out.println("Erro ao tentar carregar a imagem");
			System.exit(1);
		}
	}

	public void setPosicaoCasa(int x, int y) {
		this.posX = x;
		this.posY = y;
	}

}

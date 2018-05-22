package controller;

import model.Tabuleiro;
import model.*;

public class Partida {
	
	public static void comecarPartida(Tabuleiro tab) {
		int i;
	
		
		for (i=0;i<8;i++) {
				
			switch(i) {
			case 0: tab.matriz[0][i].setPeca(new Torre("preta"));break;
			case 1: tab.matriz[0][i].setPeca(new Bispo("preta"));break;
			case 2: tab.matriz[0][i].setPeca(new Cavalo("preta"));break;
			case 3: tab.matriz[0][i].setPeca(new Rei("preta"));break;
			case 4: tab.matriz[0][i].setPeca(new Dama("preta"));break;
			case 5: tab.matriz[0][i].setPeca(new Cavalo("preta"));break;
			case 6: tab.matriz[0][i].setPeca(new Bispo("preta"));break;
			case 7: tab.matriz[0][i].setPeca(new Torre("preta"));break;
			}
		}
		
		for (i=0;i<8;i++) {
			
			switch(i) {
			case 0: tab.matriz[7][i].setPeca(new Torre("branca"));break;
			case 1: tab.matriz[7][i].setPeca(new Bispo("branca"));break;
			case 2: tab.matriz[7][i].setPeca(new Cavalo("branca"));break;
			case 3: tab.matriz[7][i].setPeca(new Dama("branca"));break;
			case 4: tab.matriz[7][i].setPeca(new Rei("branca"));break;
			case 5: tab.matriz[7][i].setPeca(new Cavalo("branca"));break;
			case 6: tab.matriz[7][i].setPeca(new Bispo("branca"));break;
			case 7: tab.matriz[7][i].setPeca(new Torre("branca"));break;
			}
		}
		
		for(i=0;i<8;i++) {
			tab.matriz[1][i].setPeca(new Peao("preta"));
			tab.matriz[6][i].setPeca(new Peao("branca"));
		}
		
		
	}		
	
	
			
			
			
		
	

}

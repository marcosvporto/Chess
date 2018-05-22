package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import model.Peca;
import model.Tabuleiro;
import model.Torre;

import java.awt.Color;
import javax.swing.JPanel;

import controller.Partida;

import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;



public class ChessPanel extends JPanel {
	
	
	private static int pos_x = 0;
	private static int pos_y = 0;
	public Rectangle2D [][] matrix;
	int i, j;
	double leftX=100.0;
	double topY=100.0;
	double larg=80.0;
	double alt=80.0;
	public BufferedImage image;
	
	public Tabuleiro tabuleiro;

	public ChessPanel(int x, int y) {
		Peca c;
		setBackground(Color.WHITE);
		pos_x = x;
		pos_y = y;
		matrix = new Rectangle2D[8][8];
		
		tabuleiro = new Tabuleiro();
		Partida.comecarPartida(tabuleiro);
		this.repaint();
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		tabuleiro.setBoard(g2d);
		tabuleiro.setPieces(g2d);
		
		
	}

	
	public double returnCenterX(Rectangle2D rt) {
		return rt.getCenterX();
	}
	
	public double returnCenterY(Rectangle2D rt) {
		return rt.getCenterY();
	}

}

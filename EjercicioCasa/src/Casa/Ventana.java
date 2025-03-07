package Casa;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
private static final String Graphics2d = null;


public  Ventana () {

		
		this.setVisible(true);
		this.setSize(500, 500);
		//442,620 Medidas calculadora A mano
		this.setLocationRelativeTo(null);
		
		
		
		this.setTitle("Ejercicio 31");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(300,300));
		
		this.setResizable(true);
		
		
		
		this.repaint(); 
		this.revalidate();
		
		
}

@Override
public void paint(Graphics g) {
	
	super.paint(g);
	
	Graphics2D g2 =  (Graphics2D) g.create();
	
	g2.setStroke(new BasicStroke(5));
	
	g2.setColor(Color.cyan);
	g2.fillRect(0, 0, 500, 500);
	
	g2.setColor(Color.LIGHT_GRAY);
	g2.fillRect(0, 475, 500, 500);
	
	
	g2.setColor(Color.decode("#7f4f24"));
	g2.fillRect(0, 400, 500, 75);
	
	g2.setColor(Color.decode("#e9c46a"));
	g2.fillRect(0, 275, 500, 50);
	
	g2.setColor(Color.decode("#6a994e"));
	g2.fillRect(0, 375, 500, 25);
	
	g2.setColor(Color.decode("#a3b18a"));
	g2.fillRect(0, 350, 500, 25);
	
	g2.setColor(Color.decode("#d4a373"));
	g2.fillRect(10, 250, 25, 100);
	
	g2.setColor(Color.decode("#d4a373"));
	g2.fillRect(40, 250, 25, 100);
	
	g2.setColor(Color.decode("#d4a373"));
	g2.fillRect(70, 250, 25, 100);
	
	g2.setColor(Color.decode("#d4a373"));
	g2.fillRect(100, 250, 25, 100);
	
	g2.setColor(Color.decode("#d4a373"));
	g2.fillRect(130, 250, 25, 100);
	
	g2.setColor(Color.decode("#d4a373"));
	g2.fillRect(465, 250, 25, 100);
	
	g2.setColor(Color.decode("#d4a373"));
	g2.fillRect(435, 250, 25, 100);
	
	g2.setColor(Color.decode("#d4a373"));
	g2.fillRect(405, 250, 25, 100);
	
	g2.setColor(Color.decode("#d4a373"));
	g2.fillRect(375, 250, 25, 100);
	
	g2.setColor(Color.decode("#d4a373"));
	g2.fillRect(345, 250, 25, 100);
	
	g2.setColor(Color.decode("#bb9457"));
	g2.fillRect(140, 150, 220, 200);
	
	// Chimenea
	
		g2.setColor(Color.decode("#7f7f7f"));
		g2.fillRect(300, 75, 50, 75);
		
		g2.setColor(Color.decode("#595959"));
		g2.fillRect(290, 65, 70, 25);
	
	g2.setColor(Color.decode("#e63946"));
	
		
	int[] x = {250,100,400};
	int[] y = {50,150,150};

	g2.fillPolygon(x, y, 3);
	
	g2.setColor(Color.decode("#a8dadc"));
	g2.fillRect(125, 325, 250, 25);
	
	//Lineas
	
	
	g2.setColor(Color.decode("#582f0e"));
	g2.drawLine(143, 200, 357, 200);
	
	g2.setColor(Color.decode("#582f0e"));
	g2.drawLine(143, 175, 357, 175);
	
	g2.setColor(Color.decode("#582f0e"));
	g2.drawLine(143, 225, 357, 225);
	
	g2.setColor(Color.decode("#582f0e"));
	g2.drawLine(143, 250, 357, 250);
	
	g2.setColor(Color.decode("#582f0e"));
	g2.drawLine(143, 275, 357, 275);
	
	g2.setColor(Color.decode("#582f0e"));
	g2.drawLine(143, 300, 357, 300);
	
	
	//puerta y ventana
	
	g2.setColor(Color.decode("#99582a"));
	g2.fillRect(150, 200, 75, 125);
	
	g2.setColor(Color.decode("#ae2012"));
	g2.drawRect(150, 200, 75, 125);
	
	g2.setColor(Color.decode("#a8dadc"));
	g2.fillRect(125, 325, 250, 25);
	
	g2.setColor(Color.decode("#f8f9fa"));
	g2.fillArc(200, 250, 20, 20, 0, 360);
	
	g2.setColor(Color.decode("#ffffff"));
	g2.fillRect(275, 175, 75, 75);
	
	g2.setColor(Color.decode("#ae2012"));
	g2.drawRect(275, 175, 75, 75);
	
	
	
	
	
	
	
	
	

	
	

	
	
	
}
	

}

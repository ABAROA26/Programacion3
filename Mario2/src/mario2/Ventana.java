package mario2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	
public  Ventana () {

		
		this.setVisible(true);
		this.setSize(1200, 800);
		//442,620 Medidas calculadora A mano
		this.setLocationRelativeTo(null);
		
		
		
		this.setTitle("Ejercicio 33");
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
	
	g2.setStroke(new BasicStroke(3));
//Fondoo
	g2.setColor(Color.cyan);
	g2.fillRect(0, 0, 1200, 800);
	
	//Base del camino
	g2.setColor(Color.decode("#bb9457"));
	g2.fillRect(0, 700, 1200, 100);
	
	g2.setColor(Color.decode("#38b000"));
	g2.fillRect(0, 650, 1200, 50);
	
	
	
	//Nubes
	
	g2.setColor(Color.decode("#dee2e6"));
	
	g2.fillRoundRect(-50, 200, 150, 50, 100, 100);
	g2.fillRoundRect(0, 600, 300, 50, 100, 100);
	g2.fillRoundRect(200, 450, 200, 50, 100, 100);
	g2.fillRoundRect(350, 550, 200, 50, 100, 100);
	g2.fillRoundRect(400, 350, 600, 50, 100, 100);
	g2.fillRoundRect(350, 250, 200, 50, 100, 100);
	g2.fillRoundRect(900, 250, 200, 50, 100, 100);




	//Bases redondas
	
	g2.setColor(Color.decode("#ccdbfd"));
	g2.fillRect(50, 400, 200, 250);
	
	g2.setColor(Color.decode("#ccdbfd"));
	g2.fillArc(50, 350, 200, 100, 0, 180);

	
	g2.setColor(Color.decode("#1b98e0"));
	g2.fillRect(-50, 550, 200, 100);
	
	g2.setColor(Color.decode("#1b98e0"));
	g2.fillArc(-50, 500, 200, 100, 0, 180);
	
	g2.setColor(Color.decode("#ccdbfd"));
	g2.fillRect(450, 350, 200, 300);
	
	g2.setColor(Color.decode("#ccdbfd"));
	g2.fillArc(450, 300, 200, 100, 0, 180);
	
	g2.setColor(Color.decode("#ccdbfd"));
	g2.fillRect(650, 250, 200, 400);
	
	g2.setColor(Color.decode("#ccdbfd"));
	g2.fillArc(650, 200, 200, 100, 0, 180);
	
	g2.setColor(Color.decode("#1b98e0"));
	g2.fillRect(450, 550, 250, 100);
	
	g2.setColor(Color.decode("#1b98e0"));
	g2.fillArc(450, 500, 250, 100, 0, 180);
	
	g2.setColor(Color.decode("#1b98e0"));
	g2.fillRect(700, 450, 250, 200);
	
	g2.setColor(Color.decode("#1b98e0"));
	g2.fillArc(700, 400, 250, 100, 0, 180);
	
	
	
	
	
	//Planta
	
	g2.setColor(Color.green);
	
	int[] x = {319,332,337,345,361,373,376,386,391};
	int[] y = {650,630,643,624,630,625,638,625,650};
	
	g2.fillPolygon(x, y, 9);
	
	
	g2.setColor(Color.decode("#000000"));
	g2.drawRect(0, 650, 1200, 50);
	

	//Nubes
	
	g2.setColor(Color.white);
	//g2.fillOval(-10, 400, 150, 25);
	
	
	// Puntos en los bloques
	
	g2.fillOval(200, 400, 30, 50);
	g2.fillOval(200, 550, 30, 50);
	g2.fillOval(100, 450, 30, 50);
	g2.fillOval(480, 400, 30, 50);
	
	g2.fillOval(570, 350, 30, 50);
	
	g2.fillOval(700, 350, 30, 50);
	g2.fillOval(800, 250, 30, 50);
	g2.fillOval(900, 550, 30, 50);
	g2.fillOval(725, 450, 30, 50);
	
	//Tubos
	
	

	g2.setColor(Color.decode("#5e548e"));

	g2.fillRect(550, 550, 100, 100);
	
	g2.setColor(Color.black);

	g2.drawRect(550, 550, 100, 100);
	g2.drawRect(537, 520, 125, 50);
	
	g2.setColor(Color.decode("#5e548e"));
	
	g2.fillRect(537, 520, 125, 50);
	g2.fillRect(1100, 550, 100, 100);
	
	g2.setColor(Color.black);
	g2.drawRect(537, 520, 125, 50);
	g2.drawRect(1100, 550, 100, 100);
	
	g2.setColor(Color.decode("#5e548e"));
	g2.fillRect(1075, 530, 150, 50);
	g2.setColor(Color.decode("#000000"));
	g2.drawRect(1075, 530, 150, 50);
	
	
	
	//Bloques Obsta
	
	g2.setColor(Color.decode("#adb5bd"));
	g2.fillRect(1000, 600, 50, 50);
	g2.fillRect(1000, 550, 50, 50);
	g2.fillRect(1000, 500, 50, 50);
	g2.fillRect(1000, 450, 50, 50);
	
	g2.setColor(Color.decode("#ffbe0b"));
	g2.fillRect(1050, 450, 50, 50);
	g2.fillRect(1100, 450, 50, 50);
	g2.fillRect(1150, 450, 50, 50);
	
	//ContornoBloques

	g2.setColor(Color.decode("#000000"));
	g2.drawRect(1000, 600, 50, 50);
	g2.drawRect(1000, 550, 50, 50);
	g2.drawRect(1000, 500, 50, 50);
	g2.drawRect(1000, 450, 50, 50);
	g2.drawRect(1050, 450, 50, 50);
	g2.drawRect(1100, 450, 50, 50);
	g2.drawRect(1150, 450, 50, 50);
	
	

	g2.setColor(Color.decode("#008000"));
	for(int i = 0; i < 30; i++) {
		int base = 40 + (i*40);
		int[] xs = {base, base - 40, base + 20};
		int[] ys = {680,650,650};
		g2.fillPolygon(xs, ys, 3);
	}
	
	//bOTON DE LOS CUADORS AMARILLOS
	
	g2.setColor(Color.BLACK);
	g2.fillOval(1075, 465, 10, 20);
	g2.fillOval(1060, 465, 10, 20);

	





	
	
	
	
	g2.setColor(Color.decode("#000000"));
	g2.drawRect(0, 650, 1200, 50);
	
	
	g2.setColor(Color.decode("#000000"));
	//g2.drawRect(0, 650, 1200, 100);


	


	
}

}

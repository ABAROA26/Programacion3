package Mario;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Ventana extends JFrame{
	
public  Ventana () {

		
		this.setVisible(true);
		this.setSize(800, 500);
		//442,620 Medidas calculadora A mano
		this.setLocationRelativeTo(null);
		
		
		
		this.setTitle("Ejercicio 32");
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
	
	//Fondo
	g2.setColor(Color.decode("#90e0ef"));
	g2.fillRect(0, 0, 800, 500);
	
	//Base del camino
	g2.setColor(Color.decode("#ffe5d9"));
	g2.fillRect(0, 450, 800, 50);
	
	g2.setColor(Color.decode("#000000"));
	g2.drawRect(0, 450, 800, 50);
	
	//Bloques
	g2.setColor(Color.decode("#e07a5f"));
	g2.fillRect(50, 150, 50, 50);
	
	g2.setColor(Color.decode("#000000"));
	g2.drawRect(50, 150, 50, 50);
	
	g2.setColor(Color.decode("#e07a5f"));
	g2.fillRect(150, 50, 50, 50);
	
	g2.setColor(Color.decode("#000000"));
	g2.drawRect(150, 50, 50, 50);
	
	g2.setColor(Color.decode("#e07a5f"));
	g2.fillRect(200, 50, 50, 50);
	
	g2.setColor(Color.decode("#000000"));
	g2.drawRect(200, 50, 50, 50);
	
	g2.setColor(Color.decode("#e07a5f"));
	g2.fillRect(700, 150, 50, 50);
	
	g2.setColor(Color.decode("#000000"));
	g2.drawRect(700, 150, 50, 50);
	
	//Obstaculos
	
	g2.setColor(Color.decode("#457b9d"));
	g2.fillRoundRect(250, 250, 150, 200, 10, 10);
	
	g2.setColor(Color.decode("#000000"));
	g2.drawRoundRect(250, 250, 150, 200, 10, 10);
	
	g2.setColor(Color.decode("#ffe5d9"));
	g2.fillRoundRect(150, 350, 150, 100, 10, 10);
	
	g2.setColor(Color.decode("#000000"));
	g2.drawRoundRect(150, 350, 150, 100, 10, 10);
	
	g2.setColor(Color.decode("#38b000"));
	g2.fillRoundRect(700, 350, 100, 100, 10, 10);
	
	g2.setColor(Color.decode("#000000"));
	g2.drawRoundRect(700, 350, 100, 100, 10, 10);
	
	//Planta
	
	g2.setColor(Color.decode("#a7c957"));
	
	int[] x = {22,42,65,85,100};
	int[] y = {450,419,407,423,450};
	
	g2.fillPolygon(x, y, 5);
	
	g2.setColor(Color.decode("#000000"));

	g2.drawPolygon(x, y, 5);
	
	//Circulos
	
	g2.setColor(Color.decode("#adb5bd"));
	
	g2.fillArc(160, 360, 20, 20, 0, 360);
	
	g2.fillArc(160, 420, 20, 20, 0, 360);
	
	g2.fillArc(275, 420, 20, 20, 0, 360);
	
	g2.fillArc(275, 360, 20, 20, 0, 360);
	
	g2.fillArc(260, 260, 20, 20, 0, 360);
	
	g2.fillArc(375, 260, 20, 20, 0, 360);

	g2.fillArc(375, 420, 20, 20, 0, 360);

	g2.fillArc(711, 420, 20, 20, 0, 360);

	g2.fillArc(711, 360, 20, 20, 0, 360);
	
	g2.setColor(Color.decode("#000000"));

	g2.fillArc(55, 155, 5, 5, 0, 360);
	
	g2.fillArc(55, 190, 5, 5, 0, 360);
	
	g2.fillArc(90, 190, 5, 5, 0, 360);

	g2.fillArc(90, 155, 5, 5, 0, 360);
	
	g2.fillArc(155, 55, 5, 5, 0, 360);
	
	g2.fillArc(155, 90, 5, 5, 0, 360);
	
	g2.fillArc(190, 55, 5, 5, 0, 360);
	
	g2.fillArc(190, 90, 5, 5, 0, 360);
	//////
	g2.fillArc(205, 55, 5, 5, 0, 360);
	
	g2.fillArc(205, 90, 5, 5, 0, 360);
	
	g2.fillArc(240, 55, 5, 5, 0, 360);
	
	g2.fillArc(240, 90, 5, 5, 0, 360);
//////////////////////////////////
	g2.fillArc(705, 155, 5, 5, 0, 360);
	
	g2.fillArc(705, 190, 5, 5, 0, 360);
	
	g2.fillArc(740, 155, 5, 5, 0, 360);
	
	g2.fillArc(740, 190, 5, 5, 0, 360);



	
	//Marco Circulos
	
	g2.setColor(Color.decode("#000000"));
	
	g2.drawArc(160, 360, 20, 20, 0, 360);
	
	g2.drawArc(160, 420, 20, 20, 0, 360);
	
	g2.drawArc(275, 420, 20, 20, 0, 360);
	
	g2.drawArc(275, 360, 20, 20, 0, 360);

	g2.drawArc(260, 260, 20, 20, 0, 360);
	
	g2.drawArc(375, 260, 20, 20, 0, 360);

	g2.drawArc(375, 420, 20, 20, 0, 360);
	
	g2.drawArc(711, 420, 20, 20, 0, 360);

	g2.drawArc(711, 360, 20, 20, 0, 360);
	
	
	
	/////	Tubo
	
	g2.setColor(Color.decode("#007200"));
	
	g2.fillRoundRect(500, 350, 120, 100,10,10);
	
	g2.setColor(Color.decode("#000000"));
	
	g2.drawRoundRect(500, 350, 120, 100,10,10);
	
	g2.setColor(Color.decode("#008000"));
	
	g2.fillRoundRect(485, 320, 150, 40,10,10);

	g2.setColor(Color.decode("#000000"));

	g2.drawRoundRect(485, 320, 150, 40,10,10);

	
	//Imagen
	
	try {
		BufferedImage image = ImageIO.read(new File("C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Mario\\src\\Mario/\\Sin título.png"));
		
		g2.drawImage(image, 525, 213, null);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	
	

	




	
	
	
	
	
	
	

	

	
	

	
	
	
}
	


}

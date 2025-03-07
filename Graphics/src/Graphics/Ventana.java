package Graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ventana extends JFrame{
	
public  Ventana () {

		
		this.setVisible(true);
		this.setSize(800, 800);
		//442,620 Medidas calculadora A mano
		this.setLocationRelativeTo(null);
		
		
		
		this.setTitle("Interfaz");
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
	
	Graphics2D g2 = (Graphics2D) g.create();
	
	g2.setStroke(new BasicStroke(5));
	
	g2.setColor(Color.cyan);
	
	g2.drawRect(125, 125, 100, 100);
	
	g2.setColor(Color.pink);
	
	g2.fillRect(135, 135, 100, 100);
	
	g2.setFont(new Font("American Typewriter",Font.BOLD,60));
	g2.drawString("Holas", 300, 300);
	
	g2.drawLine(0, 0, 800, 800);
	
	int[] x = {400,350,450};
	int[] y = {200,250,250};

	g2.drawPolygon(x, y, 3);
	
	g2.setColor(Color.orange);
	int[] xs = {600,700,650,550,500,460};
	int[] ys = {500,536,675,450,389,455};
	g2.drawPolygon(xs,ys,6);
	
	g2.fillArc(50, 50, 60, 60, 0, 360);
	
	g2.setColor(Color.cyan);

	g2.drawArc(50, 50, 250, 250, 0, 360);
	
	g2.drawArc(350, 400, 200, 250, 0, 180);

	g2.drawOval(240, 470, 50, 100);
	
	g2.setColor(Color.pink);
	g2.drawOval(250, 470, 50, 100);
	
	g2.setColor(Color.BLACK);
	g2.drawRoundRect(500, 545, 100, 100, 35, 35);
	
	g2.setColor(Color.YELLOW);
	g2.fillOval(100, 470, 50, 100);
	
	g2.setColor(Color.orange);
	g2.drawArc(250, 100, 100, 100, 0, 180);
	g2.setColor(Color.red);
	g2.fillArc(250, 100, 100, 100, 0, 180);


	


	
	try {
		BufferedImage image = ImageIO.read(new File("C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Graphics\\src\\Graphics\\fra.jpg"));
		
		g2.drawImage(image, 600, 150, null);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		
	
	}
	
	
	
	
	
	


	
	
}

	

}

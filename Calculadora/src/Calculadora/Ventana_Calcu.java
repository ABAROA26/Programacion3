package Calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana_Calcu extends JFrame {
	
	public Ventana_Calcu() {
		
		this.setVisible(true);
		this.setSize(400, 500);
		//442,620 Medidas calculadora A mano
		this.setLocationRelativeTo(null);
		
		
		
		this.setTitle("Calculadora");
		
		ImageIcon user = new ImageIcon("C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Calculadora\\src\\Calculadora\\icono.png");
		Image img=user.getImage();
		Image imgScaled=img.getScaledInstance(25, 30, Image.SCALE_SMOOTH);
		ImageIcon imgIcon = new 	ImageIcon(imgScaled);
		
		this.setIconImage(img);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(300,300));
		
		this.setResizable(true);
		
		this.add(calcu());
		//this.add(calcuLayout());
		
		this.repaint(); 
		this.revalidate();
		
	}
	
	public JPanel calcu() {
		
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.black);
		panel.setOpaque(true);
		panel.setSize(400, 600);
		panel.setLocation(0, 0);
		panel.setLayout(null); //Poder colocar las cosas donde nosotros queramos
				
		JLabel blanco = new JLabel();
		blanco.setSize(421, 50);
		blanco.setLocation(3, 3);
		blanco.setOpaque(true);
		blanco.setBackground(Color.WHITE);
		//blanco.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
		//blanco.setFont(new Font("Broadway",Font.BOLD,50));
		panel.add(blanco);
		
		JButton CE = new JButton("CE");
		CE.setSize(100,100);
		CE.setLocation(3,60 );
		CE.setOpaque(true);
		//CE.setLayout(new GridLayout());
		CE.setBackground(Color.WHITE);
		CE.setForeground(Color.BLACK);
		CE.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(CE);
		
		JButton siete = new JButton("7");
		siete.setSize(100, 100);
		siete.setLocation(3,165);
		siete.setOpaque(true);
		//CE.setLayout(new GridLayout());
		siete.setBackground(Color.WHITE);
		siete.setForeground(Color.BLACK);
		siete.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(siete);
		
		JButton cuatro = new JButton("4");
		cuatro.setSize(100, 100);
		cuatro.setLocation(3,270);
		cuatro.setOpaque(true);
		//CE.setLayout(new GridLayout());
		cuatro.setBackground(Color.WHITE);
		cuatro.setForeground(Color.BLACK);
		cuatro.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(cuatro);
		
		JButton uno = new JButton("1");
		uno.setSize(100, 100);
		uno.setLocation(3,375);
		uno.setOpaque(true);
		//CE.setLayout(new GridLayout());
		uno.setBackground(Color.WHITE);
		uno.setForeground(Color.BLACK);
		uno.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(uno);
		
		JButton cero = new JButton("0");
		cero.setSize(100, 100);
		cero.setLocation(3,480);
		cero.setOpaque(true);
		//CE.setLayout(new GridLayout());
		cero.setBackground(Color.WHITE);
		cero.setForeground(Color.BLACK);
		cero.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(cero);
		
		JButton punto = new JButton(".");
		punto.setSize(100, 100);
		punto.setLocation(110,480);
		punto.setOpaque(true);
		//CE.setLayout(new GridLayout());
		punto.setBackground(Color.WHITE);
		punto.setForeground(Color.BLACK);
		punto.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(punto);

		JButton igual = new JButton("=");
		igual.setSize(100, 100);
		igual.setLocation(217,480);
		igual.setOpaque(true);
		//CE.setLayout(new GridLayout());
		igual.setBackground(Color.ORANGE);
		igual.setForeground(Color.BLACK);
		igual.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(igual);
		
		JButton suma = new JButton("+");
		suma.setSize(100, 100);
		suma.setLocation(324,480);
		suma.setOpaque(true);
		//CE.setLayout(new GridLayout());
		suma.setBackground(Color.ORANGE);
		suma.setForeground(Color.BLACK);
		suma.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(suma);
		
		JButton resta = new JButton("-");
		resta.setSize(100, 100);
		resta.setLocation(324,375);
		resta.setOpaque(true);
		//CE.setLayout(new GridLayout());
		resta.setBackground(Color.ORANGE);
		resta.setForeground(Color.BLACK);
		resta.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(resta);
		
		JButton multi = new JButton("*");
		multi.setSize(100, 100);
		multi.setLocation(324,270);
		multi.setOpaque(true);
		//CE.setLayout(new GridLayout());
		multi.setBackground(Color.ORANGE);
		multi.setForeground(Color.BLACK);
		multi.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(multi);
		
		JButton divi = new JButton("/");
		divi.setSize(100, 100);
		divi.setLocation(324,165);
		divi.setOpaque(true);
		//CE.setLayout(new GridLayout());
		divi.setBackground(Color.ORANGE);
		divi.setForeground(Color.BLACK);
		divi.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(divi);
		
		JButton ocho = new JButton("8");
		ocho.setSize(100, 100);
		ocho.setLocation(110,165);
		ocho.setOpaque(true);
		//CE.setLayout(new GridLayout());
		ocho.setBackground(Color.WHITE);
		ocho.setForeground(Color.BLACK);
		ocho.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.setSize(100, 100);
		nueve.setLocation(217,165);
		nueve.setOpaque(true);
		//CE.setLayout(new GridLayout());
		nueve.setBackground(Color.WHITE);
		nueve.setForeground(Color.BLACK);
		nueve.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(nueve);
		
		JButton seis = new JButton("6");
		seis.setSize(100, 100);
		seis.setLocation(217,270);
		seis.setOpaque(true);
		//CE.setLayout(new GridLayout());
		seis.setBackground(Color.WHITE);
		seis.setForeground(Color.BLACK);
		seis.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(seis);
		
		JButton tres = new JButton("3");
		tres.setSize(100, 100);
		tres.setLocation(217,375);
		tres.setOpaque(true);
		//CE.setLayout(new GridLayout());
		tres.setBackground(Color.WHITE);
		tres.setForeground(Color.BLACK);
		tres.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(tres);

		JButton dos = new JButton("2");
		dos.setSize(100, 100);
		dos.setLocation(110,375);
		dos.setOpaque(true);
		//CE.setLayout(new GridLayout());
		dos.setBackground(Color.WHITE);
		dos.setForeground(Color.BLACK);
		dos.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(dos);
		
		JButton cinco = new JButton("5");
		cinco.setSize(100, 100);
		cinco.setLocation(110,270);
		cinco.setOpaque(true);
		//CE.setLayout(new GridLayout());
		cinco.setBackground(Color.WHITE);
		cinco.setForeground(Color.BLACK);
		cinco.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(cinco);
		
		JButton enter = new JButton("C");
		enter.setSize(100, 100);
		enter.setLocation(110,60);
		enter.setOpaque(true);
		//CE.setLayout(new GridLayout());
		enter.setBackground(Color.WHITE);
		enter.setForeground(Color.BLACK);
		enter.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(enter);
		
		JButton borrar = new JButton("<");
		borrar.setSize(100, 100);
		borrar.setLocation(217,60);
		borrar.setOpaque(true);
		//CE.setLayout(new GridLayout());
		borrar.setBackground(Color.WHITE);
		borrar.setForeground(Color.BLACK);
		borrar.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(borrar);
		
		JButton nada = new JButton("");
		nada.setSize(100, 100);
		nada.setLocation(324,60);
		nada.setOpaque(true);
		//CE.setLayout(new GridLayout());
		nada.setBackground(Color.ORANGE);
		nada.setFont(new Font("Dubai medium",Font.BOLD,50));
		panel.add(nada);



		
		return panel;
	} 
	
	public JPanel calcuLayout() {
		
		Font fuente = new Font("Dubai medium",Font.BOLD,50);
		
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.gray);
		panel.setOpaque(true);
		panel.setLayout(new BorderLayout()); //Poder colocar las cosas donde nosotros queramos
		
		JLabel resultado = new JLabel("30.00");
		resultado.setBackground(Color.WHITE);		
		resultado.setOpaque(true);
		resultado.setFont(fuente);
		resultado.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(resultado,BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		resultado.setBackground(Color.gray);
		resultado.setOpaque(true);
		centro.setLayout(new BorderLayout());
		panel.add(centro,BorderLayout.CENTER);
		
		JPanel numeros = new JPanel();
		numeros.setLayout(new GridLayout(4,3));
		centro.add(numeros,BorderLayout.CENTER);
		
		String [] numeros1 = {"1","2","3","4","5","6","7","8","9","0","."};
		
		for (String poner_numeros : numeros1) {
			
			JButton numeros3 = new JButton(poner_numeros);
			
			
			
		}
		
		
		
		return null;
	}

}
/*panel.add(new JButton("1"));
panel.add(new JButton("2"));
panel.add(new JButton("3"));
panel.add(new JButton("4"));
panel.add(new JButton("5"));
panel.add(new JButton("6"));
panel.add(new JButton("7"));
panel.add(new JButton("8"));
panel.add(new JButton("9"));
panel.add(new JButton("0"));
panel.add(new JButton("+"));
panel.add(new JButton("-"));
panel.add(new JButton("*"));
panel.add(new JButton("/"));
panel.add(new JButton("CE"));
panel.add(new JButton("="));
panel.add(new JButton("."));*/

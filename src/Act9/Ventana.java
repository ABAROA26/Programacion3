package Act9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
	
		this.setVisible(true);
		this.setSize(500, 700);
		this.setLocationRelativeTo(null);
		
		this.setTitle("Login");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(300,300));
		
		this.setResizable(true);
		
		//this.add(this.login());
		this.add(this.registro());
		this.repaint(); 
		
		
		
	}
	
	public JPanel login() {
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.gray);
		panel.setOpaque(true);
		panel.setSize(500, 500);
		panel.setLocation(0, 0);
		panel.setLayout(null); //Poder colocar las cosas donde nosotros queramos
		
		
		JLabel titulo = new JLabel("Bienvenido");
		titulo.setSize(100, 30);
		//titulo.setOpaque(true);
		//titulo.setBackground(Color.WHITE);
		titulo.setLocation(200, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		panel.add(titulo);
		
		JLabel correo = new JLabel("Ingrese su correo");
		correo.setSize(200, 30);
		correo.setLocation(40, 130);
		correo.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		panel.add(correo);

		JTextField escribeCorreo = new JTextField();
		escribeCorreo.setSize(350, 30);
		escribeCorreo.setLocation(40, 160);
		escribeCorreo.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		panel.add(escribeCorreo);
		
		JLabel contraseña = new JLabel("Ingrese su contraseña");
		contraseña.setSize(200, 30);
		contraseña.setLocation(40, 220);
		contraseña.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		panel.add(contraseña);
		
		JPasswordField ecribeContraseña =  new JPasswordField();
		ecribeContraseña.setSize(350, 30);
		ecribeContraseña.setLocation(40, 250);
		ecribeContraseña.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		panel.add(ecribeContraseña);
		
		JLabel olvido = new JLabel("¿Olvido su contraseña?");
		olvido.setSize(200, 30);
		olvido.setLocation(200, 280);
		olvido.setHorizontalAlignment(JLabel.RIGHT);
		olvido.setFont(new Font("Baskerville Old Face",Font.BOLD,13));
		panel.add(olvido);
		
		//olvido.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
		JLabel recordar = new JLabel("Recordarme");
		recordar.setSize(200, 30);
		recordar.setLocation(50, 280);
		recordar.setHorizontalAlignment(JLabel.LEFT);
		recordar.setFont(new Font("Baskerville Old Face",Font.BOLD,13));
		panel.add(recordar);
		
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setBounds(100, 350, 200, 50);
		panel.add(acceder);
		
		JButton confirmar = new JButton();
		confirmar.setBounds(35, 288, 10, 10);
		panel.add(confirmar);
		
		return panel;
		
	}
	
	public JPanel registro() {
		JPanel regis = new JPanel();
		
		regis.setBackground(Color.LIGHT_GRAY);
		regis.setOpaque(true);
		regis.setSize(500, 700);
		regis.setLocation(0, 0);
		regis.setLayout(null); //Poder colocar las cosas donde nosotros queramos
		
		
		JLabel titulo = new JLabel("Registro");
		titulo.setSize(100, 30);
		//titulo.setOpaque(true);
		//titulo.setBackground(Color.WHITE);
		titulo.setLocation(200, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		regis.add(titulo);
		
		JLabel correo = new JLabel("Ingrese su nombre completo");
		correo.setSize(300, 30);
		correo.setLocation(40, 100);
		correo.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		regis.add(correo);

		JTextField escribeNombre = new JTextField();
		escribeNombre.setSize(350, 30);
		escribeNombre.setLocation(40, 130);
		escribeNombre.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		regis.add(escribeNombre);
		
		JLabel contraseña = new JLabel("Descripcion Personal");
		contraseña.setSize(200, 30);
		contraseña.setLocation(40, 190);
		contraseña.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		regis.add(contraseña);
		
		JTextArea descripcion =  new JTextArea();
		descripcion.setSize(350, 100);
		descripcion.setLocation(40, 220);
		descripcion.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		regis.add(descripcion);
		
		JLabel preferencias = new JLabel("Preferencias");
		preferencias.setSize(200, 30);
		preferencias.setLocation(40, 340);
		preferencias.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		regis.add(preferencias);
		
		JCheckBox prefe = new JCheckBox("Frio",false);
		prefe.setSize(60, 30);
		prefe.setLocation(40, 370);
		prefe.setFont(new Font("Baskerville Old Face",Font.BOLD,15));
		//prefe.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		regis.add(prefe);
		
		JCheckBox prefe1 = new JCheckBox("Calor",false);
		prefe1.setSize(70, 30);
		prefe1.setLocation(120, 370);
		prefe1.setFont(new Font("Baskerville Old Face",Font.BOLD,15));
		//prefe.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		regis.add(prefe1);
		
		JCheckBox prefe2 = new JCheckBox("Neutro",false);
		prefe2.setSize(80, 30);
		prefe2.setLocation(200, 370);
		prefe2.setFont(new Font("Baskerville Old Face",Font.BOLD,15));
		//prefe.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		regis.add(prefe2);
		
		JLabel colonia = new JLabel("Elige la colonia donde vives");
		colonia.setSize(300, 30);
		colonia.setLocation(40, 420);
		colonia.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		regis.add(colonia);
		
		String dataset [] = {" ","Camino Real","Centro","Chametla","Centenario","Progreso"};
		
		JComboBox colonias = new JComboBox(dataset);
		colonias.setSize(120, 30);
		colonias.setLocation(40, 450);
		colonias.setFont(new Font("Baskerville Old Face",Font.BOLD,15));
		regis.add(colonias);
		
		JLabel terms = new JLabel("Terminos y Condiciones");
		terms.setSize(300, 30);
		terms.setLocation(40, 500);
		terms.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		regis.add(terms);
		
		JRadioButton acepto = new JRadioButton("Acepto los términos",false);
		acepto.setSize(140,20);
		acepto.setLocation(40, 530);
		acepto.setFont(new Font("Baskerville Old Face",Font.BOLD,13));
		regis.add(acepto);
		
		JRadioButton NoAcepto = new JRadioButton("No acepto los términos",false);
		NoAcepto.setSize(150,20);
		NoAcepto.setLocation(200, 530);
		NoAcepto.setFont(new Font("Baskerville Old Face",Font.BOLD,13));
		regis.add(NoAcepto);
		
		
		
		
		
 
		return regis;
	}

	
	

	
}

package Act9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
	
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		
		this.setTitle("Login");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(300,300));
		
		this.setResizable(true);
		
		this.add(this.login());
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
		
		JTextField ecribeContraseña = new JTextField();
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

	
}

package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import models.AuthModel;

public class AuthView extends JFrame{

	public AuthView() {
	}


public void  login() {
	JFrame ventana = new JFrame();
	
	//this.setVisible(true);
	ventana.setSize(1000, 1000);
	ventana.setLocationRelativeTo(null);

	ventana.setTitle("Login");

	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	ventana.setMaximumSize(new Dimension(800, 800));
	ventana.setMinimumSize(new Dimension(300, 300));

	ventana.setResizable(true);

	/*ImageIcon user = new ImageIcon(
			"C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\user.png");
	Image img = user.getImage();
	Image imgScaled = img.getScaledInstance(25, 35, Image.SCALE_SMOOTH);
	ImageIcon imgIcon = new ImageIcon(imgScaled);*/
	

	JPanel panel = new JPanel();
	
	panel.setBackground(Color.PINK);
	panel.setOpaque(true);
	panel.setSize(1000, 1000);
	panel.setLocation(0, 0);
	panel.setBorder(BorderFactory.createLineBorder(Color.CYAN, 10));

	panel.setLayout(null);
	
	JLabel fondo = new JLabel();
	//fondo.setIcon(imgIcon);
	fondo.setBounds(290, 155, 200, 200);        
	fondo.setOpaque(false);
	ventana.add(fondo);

	/*ImageIcon contra = new ImageIcon(
			"C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\contra2.png");
	Image imgContra = contra.getImage();
	Image imgScaledContra = imgContra.getScaledInstance(25, 30, Image.SCALE_SMOOTH);
	ImageIcon imgIconContra = new ImageIcon(imgScaledContra);*/

	JLabel contra1 = new JLabel();
	//contra1.setIcon(imgIconContra);
	contra1.setBounds(290, 275, 200, 200);
	contra1.setOpaque(false);
	panel.add(contra1);

	/*ImageIcon flecha = new ImageIcon(
			"C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\flecha.png");
	Image imgflecha = flecha.getImage();
	Image scaledFlecha = imgflecha.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	ImageIcon imgIconFlecha = new ImageIcon(scaledFlecha);*/

	JLabel flecha1 = new JLabel();
	//flecha1.setIcon(imgIconFlecha);
	flecha1.setBounds(570, 425, 200, 200);
	flecha1.setOpaque(false);
	panel.add(flecha1);

	/*
	 * ImageIcon fondo1 = new
	 * ImageIcon("C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\fondologin.jpg"
	 * ); Image imgfondo1=fondo1.getImage(); Image
	 * saledFondo=imgfondo1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	 * ImageIcon iconFondo = new ImageIcon(saledFondo)
	 * 
	 * JLabel fondo2 = new JLabel(); fondo2.setIcon(iconFondo); fondo2.setBounds(0,
	 * 0, 100, 100); fondo2.setOpaque(false); panel.add(fondo2);
	 */

	 // Poder colocar las cosas donde nosotros queramos

	JLabel titulo = new JLabel("Bienvenidos");
	titulo.setSize(400, 80);
	// titulo.setOpaque(true);
	// titulo.setBackground(Color.WHITE);
	titulo.setLocation(290, 30);
	titulo.setHorizontalAlignment(JLabel.CENTER);
	titulo.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
	titulo.setFont(new Font("Broadway", Font.BOLD, 50));
	panel.add(titulo);

	JLabel correo = new JLabel("Ingrese su correo");
	correo.setSize(200, 30);
	correo.setLocation(390, 200);
	correo.setFont(new Font("Broadway", Font.BOLD, 20));
	correo.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
	panel.add(correo);

	JTextField escribeCorreo = new JTextField();
	escribeCorreo.setSize(350, 30);
	escribeCorreo.setLocation(315, 240);
	escribeCorreo.setFont(new Font("Broadway", Font.BOLD, 15));
	panel.add(escribeCorreo);

	JLabel contraseña = new JLabel("Ingrese su contraseña");
	contraseña.setSize(255, 30);
	contraseña.setLocation(360, 320);
	contraseña.setFont(new Font("Broadway", Font.BOLD, 20));
	contraseña.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
	panel.add(contraseña);

	JPasswordField ecribeContraseña = new JPasswordField();
	ecribeContraseña.setSize(350, 30);
	ecribeContraseña.setLocation(315, 360);
	ecribeContraseña.setFont(new Font("Broadway", Font.BOLD, 20));
	panel.add(ecribeContraseña);

	JLabel olvido = new JLabel("¿Olvido su contraseña?");
	olvido.setSize(250, 30);
	olvido.setLocation(420, 390);
	olvido.setHorizontalAlignment(JLabel.RIGHT);
	olvido.setFont(new Font("Broadway", Font.BOLD, 13));
	panel.add(olvido);

	// olvido.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

	JCheckBox recordar = new JCheckBox("Recordarme");
	recordar.setSize(200, 30);
	recordar.setLocation(310, 390);
	recordar.setOpaque(false);
	recordar.setHorizontalAlignment(JLabel.LEFT);
	recordar.setFont(new Font("Broadway", Font.BOLD, 13));
	panel.add(recordar);

	JButton acceder = new JButton();
	acceder.setText("Acceder");
	acceder.setOpaque(true);
	acceder.setBackground(Color.CYAN);
	acceder.setBounds(390, 500, 200, 50);
	acceder.setFont(new Font("Broadway", Font.BOLD, 30));

	acceder.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			Boolean flag1 = false, flag2 = false;

			if (escribeCorreo.getText().equals("")) {
				escribeCorreo.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
			} else {
				escribeCorreo.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				flag1 = true;
			}
			String pass = new String(ecribeContraseña.getPassword());
			if (pass.equals("")) {
				ecribeContraseña.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

			} else {
				ecribeContraseña.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				flag2 = true;
			}

			if (flag1 && flag2) {
				
				AuthModel am = new AuthModel();
				boolean is_login = am.login(escribeCorreo.getText(), pass);
				
				
				if (is_login) {
					JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
				} else {
					JOptionPane.showMessageDialog(null, "Error en el acceso", "Hello", JOptionPane.ERROR_MESSAGE);

				}
			}

		}
	});

	panel.add(acceder);

	JButton ir_registro = new JButton();
	ir_registro.setText("Ir al registro");
	ir_registro.setOpaque(true);
	ir_registro.setBackground(Color.CYAN);
	ir_registro.setBounds(390, 600, 200, 50);
	ir_registro.setFont(new Font("Broadway", Font.BOLD, 20));
	ir_registro.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			ventana.dispose();
			AuthView.this.registro();

		//	router("registro");
		}

	});

	panel.add(ir_registro);
	
	ventana.add(panel);
	ventana.repaint();
	ventana.revalidate();
	ventana.setVisible(true);


}

public void registro() {

	JFrame ventana = new JFrame();
	
	ventana.setVisible(true);
	ventana.setSize(1000, 1000);
	ventana.setLocationRelativeTo(null);

	ventana.setTitle("Login");

	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	ventana.setMaximumSize(new Dimension(800, 800));
	ventana.setMinimumSize(new Dimension(300, 300));

	ventana.setResizable(true);

	
	
	
	
	
	
	JPanel regis = new JPanel();

	regis.setBackground(Color.PINK);
	regis.setOpaque(true);
	regis.setSize(1000, 1000);
	regis.setLocation(0, 0);
    regis.setBorder(BorderFactory.createLineBorder(Color.CYAN, 10));

	regis.setLayout(null); // Poder colocar las cosas donde nosotros queramos

	JLabel titulo = new JLabel("Registrarse");
	titulo.setSize(200, 50);
	titulo.setOpaque(true);
	titulo.setBackground(Color.CYAN);
	titulo.setLocation(150, 30);
	titulo.setHorizontalAlignment(JLabel.CENTER);
	titulo.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
	regis.add(titulo);

	JLabel correo = new JLabel("Ingrese su nombre completo");
	correo.setSize(300, 30);
	correo.setLocation(40, 100);
	correo.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	correo.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));

	regis.add(correo);

	JTextField escribeNombre = new JTextField();
	escribeNombre.setSize(350, 30);
	escribeNombre.setLocation(40, 135);
	escribeNombre.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	regis.add(escribeNombre);

	JLabel contraseña = new JLabel("Descripcion Personal");
	contraseña.setSize(200, 30);
	contraseña.setLocation(40, 190);
	contraseña.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	contraseña.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));

	regis.add(contraseña);

	JTextArea descripcion = new JTextArea();
	descripcion.setSize(350, 100);
	descripcion.setLocation(40, 230);
	descripcion.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	regis.add(descripcion);

	JLabel preferencias = new JLabel("Preferencias");
	preferencias.setSize(200, 30);
	preferencias.setLocation(40, 340);
	preferencias.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	preferencias.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));

	regis.add(preferencias);

	JCheckBox prefe = new JCheckBox("Frio", false);
	prefe.setSize(60, 30);
	prefe.setLocation(40, 375);
	prefe.setOpaque(false);
	prefe.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	regis.add(prefe);

	JCheckBox prefe1 = new JCheckBox("Calor", false);
	prefe1.setSize(70, 30);
	prefe1.setLocation(120, 375);
	prefe1.setOpaque(false);

	prefe1.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	// prefe.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
	regis.add(prefe1);

	JCheckBox prefe2 = new JCheckBox("Neutro", false);
	prefe2.setSize(80, 30);
	prefe2.setLocation(200, 375);
	prefe2.setOpaque(false);

	prefe2.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	// prefe.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
	regis.add(prefe2);

	JLabel colonia = new JLabel("Elige la colonia donde vives");
	colonia.setSize(300, 30);
	colonia.setLocation(40, 420);
	colonia.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	colonia.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));

	regis.add(colonia);

	String dataset[] = { " ", "Camino Real", "Centro", "Chametla", "Centenario", "Progreso" };

	JComboBox colonias = new JComboBox(dataset);
	colonias.setSize(120, 30);
	colonias.setLocation(40, 460);
	colonias.setFont(new Font("Baskerville Old Face", Font.BOLD, 15));
	regis.add(colonias);

	JLabel terms = new JLabel("Terminos y Condiciones");
	terms.setSize(300, 30);
	terms.setLocation(40, 500);
	terms.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
	terms.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));

	regis.add(terms);

	JRadioButton acepto = new JRadioButton("Acepto los términos", true);
	acepto.setSize(140, 20);
	acepto.setLocation(40, 540);
	acepto.setOpaque(false);

	acepto.setFont(new Font("Baskerville Old Face", Font.BOLD, 13));
	regis.add(acepto);

	JRadioButton NoAcepto = new JRadioButton("No acepto los términos", false);
	NoAcepto.setSize(150, 20);
	NoAcepto.setLocation(200, 540);
	NoAcepto.setOpaque(false);

	NoAcepto.setFont(new Font("Baskerville Old Face", Font.BOLD, 13));
	regis.add(NoAcepto);

	ButtonGroup opcion = new ButtonGroup();
	opcion.add(NoAcepto);
	opcion.add(acepto);

	JButton acceder = new JButton();
	acceder.setText("Crear Cuenta");
	acceder.setLocation(150, 590);
	acceder.setSize(200, 50);
	acceder.setOpaque(true);
	acceder.setBackground(Color.CYAN);
	acceder.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));

	acceder.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (escribeNombre.getText().equals("")) {
				escribeNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
			} else {
				escribeNombre.setBorder(BorderFactory.createLineBorder(Color.green, 3));

			}
			if (descripcion.getText().equals("")) {
				descripcion.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

			} else {
				descripcion.setBorder(BorderFactory.createLineBorder(Color.green, 3));

			}

		}
	});

	regis.add(acceder);

	JButton ir_login = new JButton();
	ir_login.setText("Ir al login");
	ir_login.setLocation(150, 650);
	ir_login.setSize(200, 50);
	ir_login.setOpaque(true);
	ir_login.setBackground(Color.CYAN);
	ir_login.setFont(new Font("Baskerville Old Face", Font.BOLD, 25));

	ir_login.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			//router("login");
			ventana.dispose();
			AuthView.this.login();
		}

	});
	
	

	regis.add(ir_login);
	

	ventana.add(regis);
	ventana.repaint();
	ventana.revalidate();
	ventana.setVisible(true);
	
	
}


}


		

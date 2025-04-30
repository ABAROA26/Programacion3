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
	
	/*JLabel fondo = new JLabel();
	//fondo.setIcon(imgIcon);
	fondo.setBounds(290, 155, 200, 200);        
	fondo.setOpaque(false);
	ventana.add(fondo);*/

	/*ImageIcon contra = new ImageIcon(
			"C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\contra2.png");
	Image imgContra = contra.getImage();
	Image imgScaledContra = imgContra.getScaledInstance(25, 30, Image.SCALE_SMOOTH);
	ImageIcon imgIconContra = new ImageIcon(imgScaledContra);*/

	/*JLabel contra1 = new JLabel();
	//contra1.setIcon(imgIconContra);
	contra1.setBounds(290, 275, 200, 200);
	contra1.setOpaque(false);
	panel.add(contra1);*/

	/*ImageIcon flecha = new ImageIcon(
			"C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\flecha.png");
	Image imgflecha = flecha.getImage();
	Image scaledFlecha = imgflecha.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	ImageIcon imgIconFlecha = new ImageIcon(scaledFlecha);*/

	/*JLabel flecha1 = new JLabel();
	//flecha1.setIcon(imgIconFlecha);
	flecha1.setBounds(570, 425, 200, 200);
	flecha1.setOpaque(false);
	panel.add(flecha1);*/

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
				if (escribeCorreo.getText().equals("diegoemiln_23"))
					;
				if (pass.equals("123456")) {
					JOptionPane.showMessageDialog(null, "Bienvenido al sistema", "Hello",
							JOptionPane.WARNING_MESSAGE);
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
	
}


}


		

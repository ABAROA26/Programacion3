package Act9;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
	
		this.setVisible(true);
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
		
		this.setTitle("Login");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(300,300));
		
		this.setResizable(true);
		
		//this.add(this.login());
		//this.add(this.registro());
		//this.add(this.tabla());
		
		JMenuBar menu = new JMenuBar();
		
		JMenu file = new JMenu("Archivo");
		menu.add(file);
		
		JMenuItem abrir = new JMenuItem("Abrir");
		file.add(abrir);
		
		JMenuItem cerrar = new JMenuItem("Cerrar");
		file.add(cerrar);
		
		JMenuItem guardar = new JMenuItem("Guardar");
		file.add(guardar);
		
		JMenu guardar2 = new JMenu("Guardar como");
		file.add(guardar2);
		
		JRadioButtonMenuItem pdf = new JRadioButtonMenuItem("Archivo PDF");
		guardar2.add(pdf);
		
		JRadioButtonMenuItem word = new JRadioButtonMenuItem("Archivo Word");
		guardar2.add(word);
		
		JRadioButtonMenuItem xlsx = new JRadioButtonMenuItem("Archivo XLSX");
		guardar2.add(xlsx);
		
		JRadioButtonMenuItem texto = new JRadioButtonMenuItem("Archivo de Texto");
		guardar2.add(texto);
		
		
		
		JMenu menu2 = new JMenu("Ayuda");
		menu.add(menu2);
		
	//	JMenuItem img = new JMenuItem(new ImageIcon("C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\ayuda2.png"));
		//menu2.add(img);
		
		//JMenuItem img2 = new JMenuItem("Both text and icon",
          //      new ImageIcon("C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\ayuda2.png"));
		//img2.setMnemonic(KeyEvent.VK_B);
		//menu2.add(img2);

		JMenuItem ayuda1 = new JMenuItem("Manual de Uusario");
		menu2.add(ayuda1);
		
		JMenuItem ayuda2 = new JMenuItem("Reportar Problema");
		menu2.add(ayuda2);
		
		JMenuItem ayuda3 = new JMenuItem("Tips de usuario");
		menu2.add(ayuda3);
		
		JMenu menu_configuracion = new JMenu("Configuracion");
		menu.add(menu_configuracion);
		 
		JCheckBoxMenuItem op_1 = new JCheckBoxMenuItem("Problema 1");
		menu_configuracion.add(op_1);
		
		JCheckBoxMenuItem op_2 = new JCheckBoxMenuItem("Problema 4");
		menu_configuracion.add(op_2);
		
		JCheckBoxMenuItem op_3 = new JCheckBoxMenuItem("Problema 3");
		menu_configuracion.add(op_3);
		
		JRadioButtonMenuItem op_4 = new JRadioButtonMenuItem("Problemas al guardar archivo");
		menu_configuracion.add(op_4);
		
		JMenu menu3 = new JMenu("Cuenta");
		
			JMenuItem op_5 = new JMenuItem("Registro");
			op_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("registro");
				}
			
			});
		menu3.add(op_5);
		
		JMenuItem op_6 = new JMenuItem("Login");
		op_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("login");
			}
			
			});
		menu3.add(op_6);
		
		menu.add(menu3);
		
		
		
		
		this.setJMenuBar(menu);
		this.add(this.login());
		//this.add(this.registro());
		//this.add(this.tabla());
		this.repaint(); 
		this.revalidate();
		
		
		
	}
	
	public JPanel login() {
		JPanel panel = new JPanel();
		

		ImageIcon user = new ImageIcon("C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\user.png");
		Image img=user.getImage();
		Image imgScaled=img.getScaledInstance(25, 30, Image.SCALE_SMOOTH);
		ImageIcon imgIcon = new 	ImageIcon(imgScaled);
		
		JLabel fondo = new JLabel();
		fondo.setIcon(imgIcon);
		fondo.setBounds(290, 155, 200, 200);
		fondo.setOpaque(false);
		panel.add(fondo);
		
		ImageIcon contra = new ImageIcon("C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\contra2.png");
		Image imgContra=contra.getImage();
		Image imgScaledContra=imgContra.getScaledInstance(25, 30, Image.SCALE_SMOOTH);
		ImageIcon imgIconContra = new 	ImageIcon(imgScaledContra);
		
		JLabel contra1 = new JLabel();
		contra1.setIcon(imgIconContra);
		contra1.setBounds(290, 275, 200, 200);
		contra1.setOpaque(false);
		panel.add(contra1);
		
		ImageIcon flecha = new ImageIcon("C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\flecha.png");
		Image imgflecha=flecha.getImage();
		Image scaledFlecha=imgflecha.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon imgIconFlecha = new 	ImageIcon(scaledFlecha);
		
		JLabel flecha1 = new JLabel();
		flecha1.setIcon(imgIconFlecha);
		flecha1.setBounds(570, 425, 200, 200);
		flecha1.setOpaque(false);
		panel.add(flecha1);
		
		/*ImageIcon fondo1 = new ImageIcon("C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Programacion3-master (1).zip_expanded\\Programacion3-master\\src\\fondologin.jpg");
		Image imgfondo1=fondo1.getImage();
		Image saledFondo=imgfondo1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon iconFondo = new 	ImageIcon(saledFondo)
		
		JLabel fondo2 = new JLabel();
		fondo2.setIcon(iconFondo);
		fondo2.setBounds(0, 0, 100, 100);
		fondo2.setOpaque(false);
		panel.add(fondo2);*/
	
		panel.setBackground(Color.PINK);
		panel.setOpaque(true);
		panel.setSize(1000, 700);
		panel.setLocation(0, 0);
		panel.setLayout(null); //Poder colocar las cosas donde nosotros queramos
		
		
		JLabel titulo = new JLabel("Bienvenidos");
		titulo.setSize(400, 80);
		//titulo.setOpaque(true);
		//titulo.setBackground(Color.WHITE);
		titulo.setLocation(290, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
		titulo.setFont(new Font("Broadway",Font.BOLD,50));
		panel.add(titulo);
		
		
		JLabel correo = new JLabel("Ingrese su correo");
		correo.setSize(200, 30);
		correo.setLocation(390, 200);
		correo.setFont(new Font("Broadway",Font.BOLD,20));
		correo.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
		panel.add(correo);

		JTextField escribeCorreo = new JTextField();
		escribeCorreo.setSize(350, 30);
		escribeCorreo.setLocation(315, 240);
		escribeCorreo.setFont(new Font("Broadway",Font.BOLD,15));
		panel.add(escribeCorreo);
		
		JLabel contraseña = new JLabel("Ingrese su contraseña");
		contraseña.setSize(255, 30);
		contraseña.setLocation(360, 320);
		contraseña.setFont(new Font("Broadway",Font.BOLD,20));
		contraseña.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
		panel.add(contraseña);
		
		JPasswordField ecribeContraseña =  new JPasswordField();
		ecribeContraseña.setSize(350, 30);
		ecribeContraseña.setLocation(315, 360);
		ecribeContraseña.setFont(new Font("Broadway",Font.BOLD,20));
		panel.add(ecribeContraseña);
		
		JLabel olvido = new JLabel("¿Olvido su contraseña?");
		olvido.setSize(250, 30);
		olvido.setLocation(420, 390);
		olvido.setHorizontalAlignment(JLabel.RIGHT);
		olvido.setFont(new Font("Broadway",Font.BOLD,13));
		panel.add(olvido);
		
		//olvido.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setSize(200, 30);
		recordar.setLocation(310, 390);
		recordar.setOpaque(false);
		recordar.setHorizontalAlignment(JLabel.LEFT);
		recordar.setFont(new Font("Broadway",Font.BOLD,13));
		panel.add(recordar);
		
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setOpaque(true);
		acceder.setBackground(Color.CYAN);
		acceder.setBounds(390, 500, 200, 50);
		acceder.setFont(new Font("Broadway",Font.BOLD,30));
		
		acceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Boolean flag1 = false, flag2 = false;
				
				if(escribeCorreo.getText().equals("")) {
					escribeCorreo.setBorder(BorderFactory.createLineBorder(Color.RED,3));
				}else {
					escribeCorreo.setBorder(BorderFactory.createLineBorder(Color.green,3));
					flag1 = true;
				}
				String pass = new String(ecribeContraseña.getPassword());
				if(pass.equals("")) {
					ecribeContraseña.setBorder(BorderFactory.createLineBorder(Color.RED,3));

				}else {
					ecribeContraseña.setBorder(BorderFactory.createLineBorder(Color.green,3));
					flag2=true;
				}
				
				if(flag1 && flag2) {
					if(escribeCorreo.getText().equals("diegoemiln_23"));
						if(pass.equals("123456")) {
							JOptionPane.showMessageDialog(null, "Bienvenido al sistema" , "Hello", JOptionPane.WARNING_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Error en el acceso" , "Hello", JOptionPane.ERROR_MESSAGE);

				}
				}
				
			}});

		panel.add(acceder);
		
		JButton ir_registro = new JButton();
		ir_registro.setText("Ir al registro");
		ir_registro.setOpaque(true);
		ir_registro.setBackground(Color.CYAN);
		ir_registro.setBounds(390, 600, 200, 50);
		ir_registro.setFont(new Font("Broadway",Font.BOLD,20));
		ir_registro.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				router("registro");
			}
			
			
		});
		
		
		
		panel.add(ir_registro);
		
		
		
		return panel;
		
	}
	
	public JPanel registro() {
		JPanel regis = new JPanel();
		
		regis.setBackground(Color.PINK);
		regis.setOpaque(true);
		regis.setSize(500, 700);
		regis.setLocation(0, 0);
		regis.setLayout(null); //Poder colocar las cosas donde nosotros queramos
		
		
		JLabel titulo = new JLabel("Registrarse");
		titulo.setSize(200, 50);
		titulo.setOpaque(true);
		titulo.setBackground(Color.CYAN);
		titulo.setLocation(150, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Baskerville Old Face",Font.BOLD,30));
		regis.add(titulo);
		
		JLabel correo = new JLabel("Ingrese su nombre completo");
		correo.setSize(300, 30);
		correo.setLocation(40, 100);
		correo.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		correo.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));

		regis.add(correo);

		JTextField escribeNombre = new JTextField();
		escribeNombre.setSize(350, 30);
		escribeNombre.setLocation(40, 135);
		escribeNombre.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		regis.add(escribeNombre);
		
		JLabel contraseña = new JLabel("Descripcion Personal");
		contraseña.setSize(200, 30);
		contraseña.setLocation(40, 190);
		contraseña.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		contraseña.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));

		regis.add(contraseña);
		
		JTextArea descripcion =  new JTextArea();
		descripcion.setSize(350, 100);
		descripcion.setLocation(40, 230);
		descripcion.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		regis.add(descripcion);
		
		JLabel preferencias = new JLabel("Preferencias");
		preferencias.setSize(200, 30);
		preferencias.setLocation(40, 340);
		preferencias.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		preferencias.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));

		regis.add(preferencias);
		
		JCheckBox prefe = new JCheckBox("Frio",false);
		prefe.setSize(60, 30);
		prefe.setLocation(40, 375);
		prefe.setOpaque(false);
		prefe.setFont(new Font("Baskerville Old Face",Font.BOLD,15));
		regis.add(prefe);
		
		JCheckBox prefe1 = new JCheckBox("Calor",false);
		prefe1.setSize(70, 30);
		prefe1.setLocation(120, 375);
		prefe1.setOpaque(false);

		prefe1.setFont(new Font("Baskerville Old Face",Font.BOLD,15));
		//prefe.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		regis.add(prefe1);
		
		JCheckBox prefe2 = new JCheckBox("Neutro",false);
		prefe2.setSize(80, 30);
		prefe2.setLocation(200, 375);
		prefe2.setOpaque(false);

		prefe2.setFont(new Font("Baskerville Old Face",Font.BOLD,15));
		//prefe.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		regis.add(prefe2);
		
		JLabel colonia = new JLabel("Elige la colonia donde vives");
		colonia.setSize(300, 30);
		colonia.setLocation(40, 420);
		colonia.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		colonia.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));

		regis.add(colonia);
		
		String dataset [] = {" ","Camino Real","Centro","Chametla","Centenario","Progreso"};
		
		JComboBox colonias = new JComboBox(dataset);
		colonias.setSize(120, 30);
		colonias.setLocation(40, 460);
		colonias.setFont(new Font("Baskerville Old Face",Font.BOLD,15));
		regis.add(colonias);
		
		JLabel terms = new JLabel("Terminos y Condiciones");
		terms.setSize(300, 30);
		terms.setLocation(40, 500);
		terms.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		terms.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));

		regis.add(terms);
		
		JRadioButton acepto = new JRadioButton("Acepto los términos",true);
		acepto.setSize(140,20);
		acepto.setLocation(40, 540);
		acepto.setOpaque(false);

		acepto.setFont(new Font("Baskerville Old Face",Font.BOLD,13));
		regis.add(acepto);
		
		JRadioButton NoAcepto = new JRadioButton("No acepto los términos",false);
		NoAcepto.setSize(150,20);
		NoAcepto.setLocation(200, 540);
		NoAcepto.setOpaque(false);

		NoAcepto.setFont(new Font("Baskerville Old Face",Font.BOLD,13));
		regis.add(NoAcepto);
		
		ButtonGroup opcion = new ButtonGroup();
		opcion.add(NoAcepto);
		opcion.add(acepto);
		
		JButton acceder = new JButton();
		acceder.setText("Crear Cuenta");
		acceder.setLocation(150,590);
		acceder.setSize(200, 50);
		acceder.setOpaque(true);
		acceder.setBackground(Color.CYAN);
		acceder.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
		
		acceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(escribeNombre.getText().equals("")) {
					escribeNombre.setBorder(BorderFactory.createLineBorder(Color.RED,3));
				}else {
					escribeNombre.setBorder(BorderFactory.createLineBorder(Color.green,3));

				}
				if(descripcion.getText().equals("")) {
					descripcion.setBorder(BorderFactory.createLineBorder(Color.RED,3));

				}else {
					descripcion.setBorder(BorderFactory.createLineBorder(Color.green,3));

				}
								
				
				
				
				
			}});
		
		regis.add(acceder);
		
		JButton ir_login = new JButton();
		ir_login.setText("Ir al login");
		ir_login.setLocation(150,650);
		ir_login.setSize(200, 50);
		ir_login.setOpaque(true);
		ir_login.setBackground(Color.CYAN);
		ir_login.setFont(new Font("Baskerville Old Face",Font.BOLD,25));
		
		ir_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("login");
			}
			
		});
		
		regis.add(ir_login);
		
		
		
 
		return regis;
	}

	public void router(String route) {
		this.getContentPane().removeAll();
		
		if(route.equals("registro")) {
			this.add(this.registro());
		}
		if(route.equals("login")) {
			this.add(this.login());
		}
		
		this.repaint();
		this.revalidate();
	}
	
	
	public JPanel tabla() {
		JPanel tabla = new JPanel();
		
		tabla.setBackground(Color.PINK);
		tabla.setOpaque(true);
		tabla.setSize(1000, 700);
		tabla.setLocation(0, 0);
		tabla.setLayout(null); //Poder colocar las cosas donde nosotros queramos
		
		JLabel titulo = new JLabel("Bienvenidos");
		titulo.setSize(300, 50);
		titulo.setOpaque(false);
		titulo.setBackground(Color.CYAN);
		titulo.setLocation(350, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Baskerville Old Face",Font.BOLD,50));
		tabla.add(titulo);
		
		JLabel noUsuarios = new JLabel("No. Usuarios");
		noUsuarios.setSize(200, 50);
		noUsuarios.setOpaque(false);
		noUsuarios.setBackground(Color.CYAN);
		noUsuarios.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));
		noUsuarios.setLocation(60, 120);
		noUsuarios.setHorizontalAlignment(JLabel.CENTER);
		noUsuarios.setFont(new Font("Baskerville Old Face",Font.BOLD,30));
		tabla.add(noUsuarios);
		
		JLabel numero = new JLabel("100");
		numero.setSize(200, 50);
		numero.setOpaque(false);
		numero.setBackground(Color.CYAN);
		//numero.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));
		numero.setLocation(60, 170);
		numero.setHorizontalAlignment(JLabel.CENTER);
		numero.setFont(new Font("Baskerville Old Face",Font.BOLD,30));
		tabla.add(numero);
		
		JButton Descargar = new JButton();
		Descargar.setText("Descargar");
		Descargar.setLocation(655,240);
		Descargar.setSize(125, 25);
		Descargar.setOpaque(true);
		Descargar.setBackground(Color.CYAN);
		Descargar.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		tabla.add(Descargar);
		
		JButton añadir = new JButton();
		añadir.setText("Añadir");
		añadir.setLocation(785,240);
		añadir.setSize(125, 25);
		añadir.setOpaque(true);
		añadir.setBackground(Color.CYAN);
		añadir.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
		tabla.add(añadir);
		
		
		String titulos[] = {"ID","Nombre", "Apellido", "Edad","Estado"};
		
		String datos[][]= {
				
				  {"001", "Juan", "Martínez", "1991", "Casado"},
				  {"002", "María", "González", "1997", "Soltera"},
				  {"003", "Carlos", "Rodríguez", "1980", "Divorciado"},
				  {"004", "Ana", "López", "1994", "Casada"},
				  {"005", "Pedro", "Sánchez", "1986", "Casado"},
				  {"006", "Laura", "Fernández", "1999", "Soltera"},
				  {"007", "Miguel", "Pérez", "1983", "Casado"},
				  {"008", "Sofia", "Díaz", "1996", "Soltera"},
				  {"009", "Diego", "Torres", "1988", "Divorciado"},
				  {"010", "Carmen", "Ruiz", "1992", "Casada"},
				  {"011", "José", "García", "1977", "Casado"},
				  {"012", "Paula", "Moreno", "2000", "Soltera"},
				  {"013", "Alberto", "Jiménez", "1984", "Divorciado"},
				  {"014", "Isabel", "Romero", "1989", "Casada"},
				  {"015", "Roberto", "Navarro", "1981", "Casado"},
				  {"016", "Elena", "Molina", "1998", "Soltera"},
				  {"017", "Francisco", "Castro", "1975", "Casado"},
				  {"018", "Lucía", "Ortiz", "1993", "Divorciada"},
				  {"019", "Andrés", "Delgado", "1987", "Soltero"},
				  {"020", "Marina", "Vargas", "1995", "Casada"},
				  {"021", "Antonio", "Medina", "1979", "Casado"},
				  {"022", "Clara", "Ramos", "1997", "Soltera"},
				  {"023", "Javier", "Gil", "1990", "Divorciado"},
				  {"024", "Beatriz", "Santos", "1994", "Casada"},
				  {"025", "Manuel", "Guerrero", "1982", "Casado"},
				  {"026", "Patricia", "Cruz", "1996", "Soltera"},
				  {"027", "Ricardo", "Herrera", "1985", "Divorciado"},
				  {"028", "Victoria", "Núñez", "1991", "Casada"},
				  {"029", "Fernando", "Iglesias", "1978", "Casado"},
				  {"030", "Silvia", "Reyes", "1999", "Soltera"},
				  {"031", "Raúl", "Morales", "1986", "Casado"},
				  {"032", "Natalia", "Vega", "1992", "Divorciada"},
				  {"033", "Eduardo", "Campos", "1980", "Casado"},
				  {"034", "Cristina", "Fuentes", "1997", "Soltera"},
				  {"035", "Gabriel", "Silva", "1983", "Divorciado"},
				  {"036", "Adriana", "Mendoza", "1994", "Casada"},
				  {"037", "Pablo", "Luna", "1988", "Soltero"},
				  {"038", "Mónica", "Rojas", "1996", "Soltera"},
				  {"039", "Óscar", "Flores", "1981", "Casado"},
				  {"040", "Daniela", "Acosta", "1993", "Divorciada"},
				  {"041", "Jorge", "Benítez", "1977", "Casado"},
				  {"042", "Andrea", "Cordero", "1998", "Soltera"},
				  {"043", "Luis", "Aguilar", "1984", "Divorciado"},
				  {"044", "Rosa", "Pacheco", "1990", "Casada"},
				  {"045", "Emilio", "Vera", "1979", "Casado"},
				  {"046", "Julia", "Soto", "1995", "Soltera"},
				  {"047", "Marcos", "Valenzuela", "1987", "Divorciado"},
				  {"048", "Diana", "Ríos", "1992", "Casada"},
				  {"049", "Héctor", "Parra", "1982", "Casado"},
				  {"050", "Valeria", "Miranda", "1997", "Soltera"},
				  {"051", "Guillermo", "Escobar", "1980", "Divorciado"},
				  {"052", "Carolina", "Bravo", "1994", "Casada"},
				  {"053", "Alejandro", "Contreras", "1986", "Soltero"},
				  {"054", "Teresa", "Guzmán", "1991", "Casada"},
				  {"055", "Salvador", "Varela", "1978", "Casado"},
				  {"056", "Pilar", "Quintero", "1996", "Soltera"},
				  {"057", "Ramón", "Cervantes", "1983", "Divorciado"},
				  {"058", "Alicia", "Aguirre", "1989", "Casada"},
				  {"059", "Felipe", "Velasco", "1985", "Casado"},
				  {"060", "Susana", "Castillo", "1998", "Soltera"},
				  {"061", "Ignacio", "León", "1981", "Divorciado"},
				  {"062", "Regina", "Espinoza", "1993", "Casada"},
				  {"063", "Arturo", "Barrera", "1977", "Casado"},
				  {"064", "Lorena", "Paredes", "1995", "Soltera"},
				  {"065", "Sergio", "Zamora", "1984", "Divorciado"},
				  {"066", "Mariana", "Méndez", "1990", "Casada"},
				  {"067", "Vicente", "Ochoa", "1979", "Casado"},
				  {"068", "Cecilia", "Duarte", "1997", "Soltera"},
				  {"069", "Rafael", "Ibarra", "1982", "Divorciado"},
				  {"070", "Gabriela", "Salazar", "1992", "Casada"},
				  {"071", "Ernesto", "Valencia", "1976", "Casado"},
				  {"072", "Sandra", "Estrada", "1994", "Soltera"},
				  {"073", "Alfonso", "Arias", "1987", "Divorciado"},
				  {"074", "Raquel", "Figueroa", "1991", "Casada"},
				  {"075", "Hugo", "Cabrera", "1980", "Casado"},
				  {"076", "Olivia", "Montes", "1996", "Soltera"},
				  {"077", "Martín", "Rangel", "1983", "Divorciado"},
				  {"078", "Ángela", "Balderas", "1989", "Casada"},
				  {"079", "César", "Carrillo", "1978", "Casado"},
				  {"080", "Leticia", "Zúñiga", "1998", "Soltera"},
				  {"081", "Mario", "Villanueva", "1985", "Divorciado"},
				  {"082", "Verónica", "Rosales", "1993", "Casada"},
				  {"083", "Lorenzo", "Villarreal", "1981", "Casado"},
				  {"084", "Rocío", "Cortés", "1995", "Soltera"},
				  {"085", "Tomás", "Bautista", "1984", "Divorciado"},
				  {"086", "Mercedes", "Calderón", "1990", "Casada"},
				  {"087", "Armando", "Gallegos", "1979", "Casado"},
				  {"088", "Blanca", "Tapia", "1997", "Soltera"},
				  {"089", "Enrique", "Salgado", "1982", "Divorciado"},
				  {"090", "Estela", "Juárez", "1992", "Casada"},
				  {"091", "Gerardo", "Maldonado", "1977", "Casado"},
				  {"092", "Karla", "Quintana", "1994", "Soltera"},
				  {"093", "Rodrigo", "Camacho", "1986", "Divorciado"},
				  {"094", "Yolanda", "Arellano", "1991", "Casada"},
				  {"095", "Marco", "Carrasco", "1980", "Casado"},
				  {"096", "Claudia", "Pineda", "1996", "Soltera"},
				  {"097", "Leonardo", "Orozco", "1983", "Divorciado"},
				  {"098", "Norma", "Aranda", "1988", "Casada"},
				  {"099", "Ismael", "Andrade", "1981", "Casado"},
				  {"100", "Rebeca", "Trujillo", "1995", "Soltera"}
				  //name
				  
				
				
		};
		
		JTable tablas = new JTable(datos,titulos);
		JScrollPane scroll = new JScrollPane(tablas);
		scroll.setSize(850, 350);
		scroll.setLocation(60, 275);
		tabla.add(scroll);
				
		
		
		return tabla;
	}
		
	
}

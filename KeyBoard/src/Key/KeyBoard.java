package Key;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.RenderingHints.Key;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.awt.Font;

public class KeyBoard implements KeyListener{

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel[] labels;
	private int teclaActual = -1;
	int seg = 0;
    private JTextField txtEntrada = new JTextField(20);
    private String palabraActual;
    private long tiempoInicio;
	Timer timer;
	
	 JLabel lblNewLabel_2_1;
	
	 ArrayList<String> palabras = new ArrayList<>(Arrays.asList(
	            "casa", "sol", "luz", "pan", "agua", "nino", "flor", "lago", "auto", "mesa",
	            "silla", "perro", "gato", "camino", "verde", "feliz", "nube", "dia", "luna", "rio",
	            "libro", "cielo", "piedra", "arbol", "playa", "bosque", "montana", "naranja", "blanco", "negro",
	            "facil", "duro", "rapido", "lento", "amigo", "hermano", "madre", "padre", "escuela", "puerta",
	            "ventana", "pintura", "zapato", "ropa", "dinero", "trabajo", "viaje", "tren", "avion", "musica",
	            "cuento", "pelicula", "teatro", "ciencia", "historia", "planeta", "universo", "galaxia", "atomo", "molecula",
	            "energia", "gravedad", "sinteis", "analisis", "filosofia", "logica", "paradoja", "hipotesis", "teorema", "axioma",
	            "algoritmo", "programa", "software", "hardware", "sistema", "estructura", "complejidad", "probabilidad", "estadistica", "parametro",
	            "fenomeno", "contexto", "consecuencia", "epistemologia", "ontologia", "metafora", "semantica", "pragmatica", "dialectica", "transcendencia",
	            "paradigma", "heuristica", "resiliencia", "idiosincrasia", "cacofonia", "prosopopeya", "sinestesia", "metonimia", "polifonia", "hiperbaton"
	        ));
	 
	
	private final String[] teclas = {
			"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P",
	        "Borrar", "A", "S", "D", "F", "G", "H", "J", "K", "L","Ñ",
	        "Enter", "Z", "X", "C", "V", "B", "N", "M", ",", ".", "-", "Espacio"
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyBoard window = new KeyBoard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KeyBoard() {
		initialize();
	}

	private JLabel crearTecla(String texto) {
		JLabel tecla = new JLabel(texto, JLabel.CENTER);
		tecla.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        tecla.setBorder(BorderFactory.createLineBorder(Color.CYAN, 5));
        tecla.setOpaque(true);
        tecla.setBackground(Color.PINK);
      
        return tecla;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("KeyBoard");
		frame.setBounds(100, 100, 999, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFocusable(true);
		frame.addKeyListener(this);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setBackground(Color.lightGray);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("Escribiendo:  ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("0:0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblNewLabel_1, BorderLayout.EAST);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.lightGray);
		panel_1.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_2_1 = new JLabel("Palabra a escribir:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel_2.add(lblNewLabel_2_1);
				
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setBackground(Color.PINK);
		panel_3.setLayout(new GridLayout(3, 10, 10, 10));
		
		labels = new JLabel[teclas.length];
		
		for(int i = 0; i < teclas.length; i++) {
			labels[i]= crearTecla(teclas[i]);
			
			 if (teclas[i].equals(",") || teclas[i].equals(".") || teclas[i].equals("-")) {
	                labels[i].setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
	            } else if (teclas[i].equals("Espacio")) {
	            	labels[i].setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
	            } else if (teclas[i].equals("Borrar") || teclas[i].equals("Enter")) {
	            	labels[i].setFont(new Font("Tahoma", Font.BOLD, 18));
	            }
			
			
			panel_3.add(labels[i]);

		}
		
		Random pala = new Random();
		String palabraAleatoria = palabras.get(pala.nextInt(palabras.size()+1));
		lblNewLabel_2_1.setText("Palabra a escribir: " + palabraAleatoria);
		
		ActionListener taskPerformer = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String [] split_String = lblNewLabel_1.getText().split(":");
			int mil = Integer.parseInt(split_String[1]);
			
			mil += 1;
			
			if(mil >= 10) {
				seg++;
				mil=1;
			}
			
			lblNewLabel_1.setText(seg + ":" + mil + "");
		}
		};
		
		 
	
		
		timer = new Timer(100, taskPerformer);
		
		
	}
	
	
	
	  private Color colorAle() {
		  Random alea = new Random();
		  return new Color(alea.nextInt(256), alea.nextInt(256), alea.nextInt(256));
	  }
	  
	  private void nuevaPalabra() {
	        palabraActual = palabras.get(new Random().nextInt(palabras.size()));
	        lblNewLabel_2_1.setText("Palabra a escribir: " + palabraActual);
	        txtEntrada.setText("");
	        tiempoInicio = System.currentTimeMillis();
	        seg = 0;
	        if (timer != null) timer.stop();
	    }

	

	@Override
	public void keyPressed(KeyEvent e) {

		
		  int keyCode = e.getKeyCode();
	        String teclaPresionada = KeyEvent.getKeyText(keyCode);
	        
	        if (txtEntrada.getText().isEmpty() && !timer.isRunning()) {
	            tiempoInicio = System.currentTimeMillis();
	            timer.start();
	        }
	        
	        if (teclaActual != -1) {
	            labels[teclaActual].setBackground(Color.PINK);
	        }
	        
	        for (int i = 0; i < teclas.length; i++) {
	            if (teclaPresionada.equalsIgnoreCase(teclas[i])) {
	                labels[i].setBackground(colorAle());
	                teclaActual = i;
	                break;
	            }
	        }
	        
	        if (keyCode == KeyEvent.VK_ENTER) {
	            validarPalabra();
	        } 
	        }
		 
		 
	
	
	 private void validarPalabra() {
		 
	        timer.stop();
	        double tiempo = (System.currentTimeMillis() - tiempoInicio) / 1000.0;
	        
	        if (txtEntrada.getText().equals(palabraActual)) {
	            JOptionPane.showMessageDialog(frame, 
	                "¡Correcto!\nTiempo: " + String.format("%.2f", tiempo) + " segundos",
	                "Resultado", 
	                JOptionPane.INFORMATION_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(frame, 
	                "Incorrecto. Era: " + palabraActual + "\nTiempo: " + String.format("%.2f", tiempo) + "s",
	                "Resultado", 
	                JOptionPane.WARNING_MESSAGE);
	        }
	        
	        nuevaPalabra();
	    }

	

	
	@Override
	public void keyTyped(KeyEvent e) {
	
		   char c = e.getKeyChar();
	        if (c != KeyEvent.CHAR_UNDEFINED && !Character.isISOControl(c)) {
	            txtEntrada.setText(txtEntrada.getText() + c);
	            lblNewLabel.setText("Escribiendo: " + txtEntrada.getText());
	        }// TODO Auto-generated method stub
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

}

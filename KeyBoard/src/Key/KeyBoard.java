package Key;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;

public class KeyBoard implements KeyListener{

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel[] labels;
	private int teclaActual = -1;
	
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
		
		lblNewLabel = new JLabel("Espera");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("WA");
		panel_1.add(lblNewLabel_1, BorderLayout.EAST);
				
		
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
		
		
	/*	JLabel letra_q = new JLabel("Q");
		letra_q.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		letra_q.setBackground(new Color(192, 192, 192));
		letra_q.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_q.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_q);
		
		JLabel letra_w = new JLabel("W");
		letra_w.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		letra_w.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_w.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_w);
		
		JLabel letra_e = new JLabel("E");
		letra_e.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		letra_e.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_e.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_e);
		
		JLabel lblNewLabel_4_16_3 = new JLabel("R");
		lblNewLabel_4_16_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_16_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_4_16_3.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_16_3.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_16_3);
		
		JLabel lblNewLabel_4_16_2 = new JLabel("T");
		lblNewLabel_4_16_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_16_2.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_16_2.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_16_2);
		
		JLabel lblNewLabel_4_16_1 = new JLabel("Y");
		lblNewLabel_4_16_1.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_16_1.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_16_1);
		
		JLabel lblNewLabel_4_16 = new JLabel("U");
		lblNewLabel_4_16.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_16.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_16);
		
		JLabel lblNewLabel_4_15 = new JLabel("I");
		lblNewLabel_4_15.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_15.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_15);
		
		JLabel lblNewLabel_4_11 = new JLabel("O");
		lblNewLabel_4_11.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_11.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_11);
		
		JLabel lblNewLabel_4_13 = new JLabel("P");
		lblNewLabel_4_13.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_13.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_13);
		
		
		JLabel Borrar = new JLabel("Borrar");
		Borrar.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		Borrar.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(Borrar);
		
		JLabel lblNewLabel_4_6 = new JLabel("A");
		lblNewLabel_4_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_6.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_6.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_4_12 = new JLabel("S");
		lblNewLabel_4_12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_12.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_12.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_12);
		
		JLabel lblNewLabel_4_10 = new JLabel("D");
		lblNewLabel_4_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_10.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_10.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_10);
		
		JLabel lblNewLabel_4_9 = new JLabel("F");
		lblNewLabel_4_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_9.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_9.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_9);
		
		JLabel lblNewLabel_4_8 = new JLabel("G");
		lblNewLabel_4_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_8.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_8.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_8);
		
		JLabel lblNewLabel_4_7 = new JLabel("H");
		lblNewLabel_4_7.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_7.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_7);
		
		JLabel lblNewLabel_4_5 = new JLabel("J");
		lblNewLabel_4_5.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_5.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_4 = new JLabel("K");
		lblNewLabel_4_4.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_4.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_3 = new JLabel("L");
		lblNewLabel_4_3.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_3.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_2 = new JLabel("Ñ");
		lblNewLabel_4_2.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_2.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_2);
		
		JLabel Enter = new JLabel("Enter");
		Enter.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		Enter.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(Enter);
		
		JLabel lblNewLabel_4_1 = new JLabel("Z");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_1.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_1.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_ = new JLabel("X");
		lblNewLabel_4_.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_4_.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_);
		
		JLabel letra_C = new JLabel("C");
		letra_C.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		letra_C.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_C.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_C);
		
		JLabel letra_V = new JLabel("V");
		letra_V.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		letra_V.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_V.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_V);
		
		JLabel letra_B = new JLabel("B");
		letra_B.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		letra_B.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_B.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_B);
		
		JLabel letra_N = new JLabel("N");
		letra_N.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		letra_N.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_N.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_N);
		
		JLabel letra_M = new JLabel("M");
		letra_M.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		letra_M.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_M.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_M);
		
		JLabel Coma = new JLabel(",");
		Coma.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		Coma.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		Coma.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(Coma);
		
		JLabel Punto = new JLabel(".");
		Punto.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		Punto.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		Punto.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(Punto);
		
		JLabel Guion = new JLabel("-");
		Guion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		Guion.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		Guion.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(Guion);
		
		JLabel Espacio = new JLabel("Espacio");
		Espacio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		Espacio.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		Espacio.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(Espacio);
*/

	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		String teclaPresionada = KeyEvent.getKeyText(keyCode);
		lblNewLabel.setText("Tecla: " + teclaPresionada);
		
		  if (teclaActual != -1) {
	            labels[teclaActual].setBackground(Color.PINK);
	        }
		
		 for (int i = 0; i < teclas.length; i++) {
	            // Comparar con letras normales
	            if (teclaPresionada.equalsIgnoreCase(teclas[i])) {
	                labels[i].setBackground(Color.YELLOW);
	                teclaActual=i;
	                return;
	            }
		 }
		 
		 
	};
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

}

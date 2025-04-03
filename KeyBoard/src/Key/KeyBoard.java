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

public class KeyBoard implements KeyListener{

	private JFrame frame;

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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 999, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setBackground(Color.lightGray);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Espera");
		panel_1.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("WA");
		panel_1.add(lblNewLabel_1, BorderLayout.EAST);
		
		
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setBackground(Color.PINK);
		panel_3.setLayout(new GridLayout(3, 10, 10, 10));
		
		JLabel letra_q = new JLabel("Q");
		letra_q.setBackground(new Color(192, 192, 192));
		letra_q.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_q.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_q);
		
		JLabel letra_w = new JLabel("W");
		letra_w.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_w.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_w);
		
		JLabel letra_e = new JLabel("E");
		letra_e.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_e.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_e);
		
		JLabel lblNewLabel_4_16_3 = new JLabel("R");
		lblNewLabel_4_16_3.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_16_3.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_16_3);
		
		JLabel lblNewLabel_4_16_2 = new JLabel("T");
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
		lblNewLabel_4_6.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_6.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_4_12 = new JLabel("S");
		lblNewLabel_4_12.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_12.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_12);
		
		JLabel lblNewLabel_4_10 = new JLabel("D");
		lblNewLabel_4_10.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_10.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_10);
		
		JLabel lblNewLabel_4_9 = new JLabel("F");
		lblNewLabel_4_9.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_9.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_9);
		
		JLabel lblNewLabel_4_8 = new JLabel("G");
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
		lblNewLabel_4_1.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_1.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_ = new JLabel("X");
		lblNewLabel_4_4.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		lblNewLabel_4_.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(lblNewLabel_4_);
		
		JLabel letra_C = new JLabel("C");
		letra_C.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_C.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_C);
		
		JLabel letra_V = new JLabel("V");
		letra_V.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_V.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_V);
		
		JLabel letra_B = new JLabel("B");
		letra_B.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_V.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_B);
		
		JLabel letra_N = new JLabel("N");
		letra_N.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_N.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_N);
		
		JLabel letra_M = new JLabel("M");
		letra_M.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		letra_M.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(letra_M);
		
		JLabel Coma = new JLabel(",");
		Coma.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		Coma.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(Coma);
		
		JLabel Punto = new JLabel(".");
		Punto.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		Punto.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(Punto);
		
		JLabel Guion = new JLabel("-");
		Guion.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		Guion.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(Guion);
		
		JLabel Espacio = new JLabel("Espacio");
		Espacio.setBorder(BorderFactory.createLineBorder(Color.cyan, 5));
		Espacio.setHorizontalAlignment(JLabel.CENTER);
		panel_3.add(Espacio);


	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

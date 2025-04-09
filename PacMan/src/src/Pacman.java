package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;

public class Pacman implements KeyListener {

	private JFrame frame;
	private DrawingPanel tablero;
	private int x = 475, y = 200;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacman window = new Pacman();
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
	public Pacman() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_norte = new JPanel();
		panel_norte.setBackground(new Color(128, 0, 128));
		frame.getContentPane().add(panel_norte, BorderLayout.NORTH);
		panel_norte.setLayout(new BorderLayout(0, 0));
		
		JLabel label_score = new JLabel("Score");
		label_score.setForeground(new Color(255, 255, 255));
		label_score.setBackground(new Color(128, 0, 128));
		panel_norte.add(label_score);
		
		JPanel panel_sur = new JPanel();
		panel_sur.setBackground(new Color(128, 0, 128));
		frame.getContentPane().add(panel_sur, BorderLayout.SOUTH);
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				x = 200;
				y = 100;
				
				tablero.repaint();
				tablero.requestFocus();
			}
			
		});
		panel_sur.add(reiniciar);
		
		
		
		tablero = new DrawingPanel();
		tablero.setBackground(Color.BLACK);
		tablero.setBorder(BorderFactory.createEmptyBorder(5, 5, 5,5));
		frame.getContentPane().add(tablero, BorderLayout.CENTER);
		
		tablero.addKeyListener(this);
		tablero.setFocusable(true);
		
		
	}
	
	class DrawingPanel extends JPanel{
		
		public DrawingPanel() {
			setBackground(Color.WHITE);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.setColor(Color.YELLOW);
			g2d.fillOval(x, y, 30, 30);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getKeyCode()==39) {
			x+= 5;
			if(x >= 990) {
				x=-25;
			}
		}
		if(e.getKeyCode()==38) {
			y-= 5;
			
		}
		if(e.getKeyCode()==40) {
			y+= 5;
			if(y >= 575) {
				y=+5;
			}
		}
		if(e.getKeyCode()==37) {
			x-= 5;
			if(x <= -40) {
				x=+1000;
			}
		}
		tablero.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

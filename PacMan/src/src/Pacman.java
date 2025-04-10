package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;

public class Pacman implements KeyListener {

	private JFrame frame;
	private DrawingPanel tablero;
	private int x = 475, y = 200;
	private Player pacman;
    private List<Player> paredes = new ArrayList<>();
    Timer timer;
    private int lastPress = 0;
    


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
		
		pacman = new Player(475,200,30,30,Color.yellow);
		
		paredes.add(new Player(120, 150, 200, 30, Color.PINK));
		paredes.add(new Player(350, 300, 200, 30, Color.PINK));

		
		
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
				pacman.x = 475;
				pacman.y = 200;
				
				tablero.repaint();
				tablero.requestFocus();
			}
			
		});
		panel_sur.add(reiniciar);
		
		
		
		tablero = new DrawingPanel();
		tablero.setBackground(Color.BLACK);
		tablero.setBorder(BorderFactory.createEmptyBorder(5, 5, 5,5));
		frame.getContentPane().add(tablero, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 0, 128));
		frame.getContentPane().add(panel_1, BorderLayout.EAST);
		
		tablero.addKeyListener(this);
		tablero.setFocusable(true);
		
		ActionListener taskPerformer = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				update();
				}
			};
			timer = new Timer(1, taskPerformer);
		
		
		
	}
	
	//x 475 y 200
	
	class DrawingPanel extends JPanel{
		
		public DrawingPanel() {
			setBackground(Color.WHITE);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.setColor(pacman.c);
			g2d.fillOval(pacman.x, pacman.y, pacman.w, pacman.h);
			
			for(Player pared : paredes) {
				g2d.setColor(pared.c);
				g2d.fillRect(pared.x, pared.y, pared.w, pared.h);
			}
			
		

		}
	}

	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		lastPress = e.getKeyCode();
		
		timer.start();
		
		update();
		
	}
	
	public void update() {
		Boolean colision = false;
		
		for (Player pared : paredes) {
			if(pacman.colision(pared)) {
				colision = true;
			}
		}
		
		if(lastPress==39) {
			if(!colision) {
				pacman.x+= 2;
			}
			else{
				pacman.x-=4;
				lastPress = 0;
			}
			
			if(pacman.x >= 990) {
				pacman.x=-25;
 			}
			
		}
		
		if(lastPress==38) {
			if(!colision) {
				pacman.y-= 2;
			}else {
				pacman.y+=4;
				lastPress = 0;
			}
			
			if(pacman.y <= -25) {
				pacman.y = 512;
			}
			
		}
		
		if(lastPress==40) {
			if(!colision) {
				pacman.y+= 2;
			}else {
				pacman.y-= 4;
				lastPress = 0;
			}
			
			if(pacman.y >= 512) {
				pacman.y=+ -20;
			}
		}
		
		if(lastPress==37) {
			if(!colision) {
				pacman.x-= 2;
			}else {
				pacman.x+= 4;
				lastPress = 0;
			}
			
			if(pacman.x <= -40) {
				pacman.x=+1000;
			}
		}
		
		tablero.repaint();
	}
	
	class Player {
		
		int x, y, w,h;
		Color c;
		
		public Player(int x, int y, int w, int h, Color c) {
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			this.c = c;
		}
		
		public Boolean colision(Player target) {
			
			if(this.x < target.x + target.w && 
					this.x + this.w > target.x &&
					this.y < target.y + target.h &&
					this.y + this.h > target.y) {
				
				return true;
			}
			
			return false;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
    private long tiempoInicio = 0;
    private boolean tiempoCorriendo = false;
    private Timer timerTiempo;
    private JLabel  label_tiempo = new JLabel("Tiempo: 0s");
    private List<Player> puntos = new ArrayList<>();
    private int score = 0;
    private JLabel label_score;
    


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
		
		Color colo_pared = new Color(0,0,0,0);
		colo_pared =  Color.BLUE;
		
		
		//Tamaño drawing panel 900 * 500
		
		//Cadro donde aparece el pacman
		paredes.add(new Player(370, 155, 20, 140, colo_pared));
		paredes.add(new Player(575, 155, 20, 140, colo_pared));
		
		paredes.add(new Player(385, 275, 200, 20, colo_pared));
		paredes.add(new Player(385, 155, 60, 20, colo_pared));
		paredes.add(new Player(525, 155, 60, 20, colo_pared));


		
		//Paredes de los costados
		paredes.add(new Player(875, 50, 20, 350, colo_pared));

		
		
		JPanel panel_norte = new JPanel();
		panel_norte.setBackground(new Color(128, 0, 128));
		frame.getContentPane().add(panel_norte, BorderLayout.NORTH);
		panel_norte.setLayout(new BorderLayout(0, 0));
		
		label_score = new JLabel("Score: 0");
	    label_score.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	    label_score.setForeground(Color.WHITE);
		panel_norte.add(label_score);
		
		  // Crear mapa completo
	    crearMapa();
	    // Crear bolitas
	    crearPuntos();
	    
		
		label_tiempo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		label_tiempo.setForeground(new Color(255, 255, 255));
		label_tiempo.setBackground(new Color(128, 0, 128));
		panel_norte.add(label_tiempo, BorderLayout.SOUTH);
		
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
		
			 timerTiempo = new Timer(1000, new ActionListener() {
			        @Override
			        public void actionPerformed(ActionEvent e) {
			            if (tiempoCorriendo) {
			                long segundos = (System.currentTimeMillis() - tiempoInicio) / 1000;
			                label_tiempo.setText("Tiempo: " + segundos + "s");
			            }
			        }
			    });
			    timerTiempo.start();
				panel_norte.add(label_tiempo, BorderLayout.SOUTH);
				 		
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
			
			 for(Player punto : puntos) {
			        g2d.setColor(punto.c);
			        g2d.fillOval(punto.x, punto.y, punto.w, punto.h);
			    }

		}
	}
	
	private void crearMapa() {
	    Color colorPared = Color.BLUE;
	    
	  
	    
	    //Mapa
	    paredes.add(new Player(150, 100, 20, 150, colorPared));
	    paredes.add(new Player(150, 100, 200, 20, colorPared));
	    paredes.add(new Player(350, 100, 20, 150, colorPared));
	    paredes.add(new Player(550, 100, 20, 150, colorPared));
	    paredes.add(new Player(550, 100, 200, 20, colorPared));
	    paredes.add(new Player(750, 100, 20, 150, colorPared));
	    
	    paredes.add(new Player(250, 250, 100, 20, colorPared));
	    paredes.add(new Player(450, 250, 100, 20, colorPared));
	    paredes.add(new Player(650, 250, 100, 20, colorPared));
	    
	    paredes.add(new Player(150, 300, 20, 100, colorPared));
	    paredes.add(new Player(150, 300, 200, 20, colorPared));
	    paredes.add(new Player(350, 300, 20, 100, colorPared));
	    paredes.add(new Player(550, 300, 20, 100, colorPared));
	    paredes.add(new Player(550, 300, 200, 20, colorPared));
	    paredes.add(new Player(750, 300, 20, 100, colorPared));
	    
	}
	
	private void crearPuntos() {
	    // Puntos normales (pequeños)
	    for (int i = 100; i < 870; i += 60) {
	        for (int j = 100; j < 470; j += 60) {

	        	boolean enPared = false;
	            Player punto = new Player(i, j, 20, 20, Color.WHITE);
	            
	            for (Player pared : paredes) {
	                if (punto.colision(pared)) {
	                    enPared = true;
	                    break;
	                }
	            }
	            
	            if (!enPared) {
	                puntos.add(punto);
	            }
	        }
	    }
	    
	   
	}

	

	@Override
	public void keyPressed(KeyEvent e) {

		 int key = e.getKeyCode();
		    
		    if ((key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT || 
		         key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) && !tiempoCorriendo) {
		        tiempoInicio = System.currentTimeMillis();
		        tiempoCorriendo = true;
		    }
		    
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
		
		 Iterator<Player> iter = puntos.iterator();
		    while (iter.hasNext()) {
		        Player punto = iter.next();
		        if (pacman.colision(punto)) {
		            iter.remove();
		            score += (punto.w == 8) ? 10 : 50; 
		            label_score.setText("Score: " + score);
		            
		            if(puntos.isEmpty()) {
		                timer.stop();
		                timerTiempo.stop();
		                int opcion = JOptionPane.showConfirmDialog(frame, 
		                    "¡Has ganado! ¿Quieres jugar de nuevo?", 
		                    "Felicidades", 
		                    JOptionPane.YES_NO_OPTION);
		                
		                if(opcion == JOptionPane.YES_OPTION) {
		                   // reiniciarJuego();
		                } else {
		                    System.exit(0);
		                }
		            }
		            break;
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

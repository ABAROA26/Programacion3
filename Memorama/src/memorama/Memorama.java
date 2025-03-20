package memorama;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;

public class Memorama {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memorama window = new Memorama();
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
	public Memorama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 192));
		frame.setBounds(100, 100, 850, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(5, 5));
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel, BorderLayout.EAST);
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30,30));
		panel.setLayout(new GridLayout(3, 1, 1, 1));
		
		JLabel lblNewLabel_1 = new JLabel("Pares encontrados:");
		//lblNewLabel_1.setOpaque(true);
		//lblNewLabel_1.setBackground(new Color(128, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tiempo:");
		//lblNewLabel_2.setOpaque(true);
		//lblNewLabel_2.setBackground(new Color(255, 128, 128));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("No. Movimientos:");
		//lblNewLabel_3.setOpaque(true);
		//lblNewLabel_3.setBackground(new Color(128, 255, 128));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Juego de Memorama");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 192));
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4,4));
		panel_2.setLayout(new GridLayout(4, 4, 5, 5));
		
		JButton btnNewButton = new JButton("7 X 1");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 40));
		//btnNewButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5,5));
		btnNewButton.setBackground(Color.CYAN);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_1.setBackground(Color.CYAN);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_11 = new JButton("7 X 3");
		btnNewButton_11.setBackground(Color.CYAN);
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_11);
		
		JButton btnNewButton_10 = new JButton("21");
		btnNewButton_10.setBackground(Color.CYAN);
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("9 X 3");
		btnNewButton_9.setBackground(Color.decode("#cdb4db"));
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("27");
		btnNewButton_8.setBackground(Color.decode("#cdb4db"));
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("9 X 5");
		btnNewButton_7.setBackground(Color.decode("#cdb4db"));
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("45");
		btnNewButton_6.setBackground(Color.decode("#cdb4db"));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("6 X 6");
		btnNewButton_5.setBackground(Color.decode("#80ed99"));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("36");
		btnNewButton_4.setBackground(Color.decode("#80ed99"));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_4_2 = new JButton("6 X 9");
		btnNewButton_4_2.setBackground(Color.decode("#80ed99"));
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_4_2);
		
		JButton btnNewButton_4_1 = new JButton("54");
		btnNewButton_4_1.setBackground(Color.decode("#80ed99"));
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_4_1);
		
		JButton btnNewButton_3_2 = new JButton("8 X 3");
		btnNewButton_3_2.setBackground(Color.decode("#b6ad90"));
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_1 = new JButton("24");
		btnNewButton_3_1.setBackground(Color.decode("#b6ad90"));
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_3_1);
		
		JButton btnNewButton_3 = new JButton("8 X 8");
		btnNewButton_3.setBackground(Color.decode("#b6ad90"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("64");
		btnNewButton_2.setBackground(Color.decode("#b6ad90"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_12 = new JButton("Reiniciar Juego");
		btnNewButton_12.setBackground(new Color(255, 128, 192));
		btnNewButton_12.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		frame.getContentPane().add(btnNewButton_12, BorderLayout.SOUTH);
	}

}

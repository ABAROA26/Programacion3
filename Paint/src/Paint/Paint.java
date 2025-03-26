package Paint;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSlider;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JScrollBar;

public class Paint {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint window = new Paint();
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
	public Paint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(69, 69, 69));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10,10));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(10, 10, 297, 543);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(128, 0, 255));
		btnNewButton.setBounds(106, 41, 85, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\r\n");
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.setBounds(106, 10, 85, 21);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(255, 0, 128));
		btnNewButton_3.setBounds(10, 41, 85, 21);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(64, 0, 64));
		btnNewButton_2.setBounds(201, 41, 85, 21);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_2_5 = new JButton("");
		btnNewButton_2_5.setBackground(new Color(0, 128, 255));
		btnNewButton_2_5.setBounds(201, 10, 85, 21);
		panel_1.add(btnNewButton_2_5);
		
		JButton btnNewButton_2_3 = new JButton("");
		btnNewButton_2_3.setBackground(new Color(255, 128, 0));
		btnNewButton_2_3.setBounds(10, 72, 85, 21);
		panel_1.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("");
		btnNewButton_2_4.setBackground(new Color(0, 0, 0));
		btnNewButton_2_4.setBounds(10, 102, 85, 21);
		panel_1.add(btnNewButton_2_4);
		
		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.setBackground(new Color(255, 255, 0));
		btnNewButton_2_2.setBounds(106, 72, 85, 21);
		panel_1.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setBackground(new Color(255, 255, 255));
		btnNewButton_2_1.setBounds(106, 102, 85, 21);
		panel_1.add(btnNewButton_2_1);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(128, 255, 0));
		btnNewButton_5.setBounds(201, 72, 85, 21);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(255, 0, 0));
		btnNewButton_4.setBounds(10, 10, 85, 21);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(128, 128, 128));
		btnNewButton_6.setBounds(201, 102, 85, 21);
		panel_1.add(btnNewButton_6);
		
		JLabel lblNewLabel = new JLabel("Custom Colors:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(10, 133, 181, 25);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 10));
		textField.setBounds(10, 166, 276, 25);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("SET BACKGROUND");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		btnNewButton_7.setBounds(10, 201, 276, 21);
		panel_1.add(btnNewButton_7);
		
		JLabel lblNewLabel_1 = new JLabel("Size:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(10, 345, 67, 25);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_10 = new JButton("BRUSH");
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		btnNewButton_10.setBounds(10, 418, 85, 21);
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("ERASE");
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		btnNewButton_11.setBounds(201, 418, 85, 21);
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("CLEAN");
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		btnNewButton_12.setBounds(10, 461, 276, 21);
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("SAVE");
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		btnNewButton_13.setBounds(10, 500, 276, 21);
		panel_1.add(btnNewButton_13);
		
		JSlider slider = new JSlider();
		slider.setBounds(10, 380, 276, 26);
		panel_1.add(slider);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(333, 10, 643, 543);
		panel.add(panel_2);
		
}	
}

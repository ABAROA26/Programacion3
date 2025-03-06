package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.ImageIcon;

public class Interfaz2 {

	private JFrame frame;
	private JTextField txtJuanCarlos;
	private JTextField txtArcila;
	private JTextField txtDaz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz2 window = new Interfaz2();
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
	public Interfaz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 839, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0,255,0),20));
		panel.setBackground(new Color(0, 255, 0));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Registro de usuario");
		lblNewLabel.setBackground(new Color(0, 255, 0));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Georgia", Font.ITALIC, 23));
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 0));

		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(new Color(0, 0, 0));
		panel_3.setBackground(new Color(128, 255, 128));
		Border border;
		panel_3.setBorder(new TitledBorder("Datos Generales"));
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(128, 255, 128));
		panel_4.setBorder(BorderFactory.createEmptyBorder(5, 5, 5,5));
		panel_3.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(6, 6, 10, 10));
		
		JLabel lblNewLabel_3 = new JLabel("Nombres");
		panel_4.add(lblNewLabel_3);
		
		txtJuanCarlos = new JTextField();
		txtJuanCarlos.setText("Juan Carlos");
		panel_4.add(txtJuanCarlos);
		txtJuanCarlos.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido paterno");
		panel_4.add(lblNewLabel_4);
		
		txtArcila = new JTextField();
		txtArcila.setText("Arcila");
		panel_4.add(txtArcila);
		txtArcila.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Apellido materno");
		panel_4.add(lblNewLabel_5);
		
		txtDaz = new JTextField();
		txtDaz.setText("Díaz");
		panel_4.add(txtDaz);
		txtDaz.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha de nacimiento");
		panel_4.add(lblNewLabel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(128, 255, 128));
		panel_4.add(panel_7);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "18", "29", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		panel_7.add(comboBox_4);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		panel_7.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000"}));
		panel_7.add(comboBox_3);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo");
		panel_4.add(lblNewLabel_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(128, 255, 128));
		panel_4.add(panel_8);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnNewRadioButton.setOpaque(false);
		panel_8.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnNewRadioButton_1.setOpaque(false);
		rdbtnNewRadioButton_1.setBackground(new Color(240, 240, 240));
		panel_8.add(rdbtnNewRadioButton_1);
		
		ButtonGroup opcion = new ButtonGroup();
		opcion.add(rdbtnNewRadioButton_1);
		opcion.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_7 = new JLabel("Nacionalidad");
		panel_4.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Peru", "Mexico", "Colombia"}));
		comboBox.setEditable(true);
		panel_4.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 128));
		panel_2.setBorder(new TitledBorder("Datos Generales"));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 128, 128));
		panel_5.setBorder(BorderFactory.createEmptyBorder(50, 50, 50,50));

		panel_2.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Imagen");
		panel_5.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar foto de perfil\r\n");
		chckbxNewCheckBox_1.setOpaque(false);
		panel_5.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxNewCheckBox.setOpaque(false);
		panel_5.add(chckbxNewCheckBox);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setToolTipText("");
		panel_5_1.setForeground(new Color(0, 0, 0));
		panel_5_1.setBackground(new Color(255, 128, 128));

		panel_5_1.setBorder(new TitledBorder("Datos Opcionales"));

		panel_1.add(panel_5_1);
		panel_5_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 128, 128));
		panel_6.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
		panel_5_1.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblNewLabel_11 = new JLabel("Preferencias");
		//lblNewLabel_11.setHorizontalAlignment(25);
		lblNewLabel_11.setForeground(new Color(0, 0, 0));
	
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_6.add(lblNewLabel_11);
		
		JLabel lblNewLabel_10 = new JLabel("Descripcion");
		lblNewLabel_10.setForeground(new Color(0, 0, 0));
		lblNewLabel_10.setToolTipText("");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_6.add(lblNewLabel_10);
		
		JTextArea txtrHolaAmigosDe = new JTextArea();
		txtrHolaAmigosDe.setText("Hola amigos de youtube, gracias por compartir mis videao");
		txtrHolaAmigosDe.setWrapStyleWord(true);
		txtrHolaAmigosDe.setLineWrap(true);
		txtrHolaAmigosDe.setTabSize(5);
		txtrHolaAmigosDe.setFont(new Font("Monospaced", Font.PLAIN, 13));
		panel_6.add(txtrHolaAmigosDe);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Cantar", "Escuchar Musica", "Leer", "Deportes", "Otros"}));
		panel_6.add(comboBox_1);
		panel_5_1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel_6, lblNewLabel_11, lblNewLabel_10, txtrHolaAmigosDe, comboBox_1}));
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setBackground(new Color(0, 255, 128));
		panel_5_2.setBorder(BorderFactory.createEmptyBorder(25, 25, 25,25));

		panel_1.add(panel_5_2);
		panel_5_2.setLayout(new GridLayout(3, 3, 150, 50));
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setEnabled(true);
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		panel_5_2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_5_2.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		panel_5_2.add(btnNewButton_2);
	}

}

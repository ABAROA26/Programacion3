package Exa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Font;

public class Unidad2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtCalle;
	private JTextField txtJhonDoe;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtAgua;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField txtLeche;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField txtCereal;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Unidad2 window = new Unidad2();
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
	public Unidad2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 596, 667);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.CYAN);
		frame.getContentPane().setLayout(new GridLayout(5, 0, 5, 5));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.CYAN);
		panel_7.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("            Factura en Java - NetBeans - ArrayListo y POO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel_7.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new TitledBorder("Datos del Cliente"));
		panel.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
		panel.setLayout(new BorderLayout(0, 0));
		//frame.getContentPane().add(panel);

		JLabel lblNewLabel_1 = new JLabel("Datos del Cliente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 4, 5, 5));
		
		JLabel lblNewLabel_4 = new JLabel("Documento:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_4.setOpaque(false);
		panel_1.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("123456");
		textField.setOpaque(false);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombres:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_1.add(lblNewLabel_3);
		
		txtJhonDoe = new JTextField();
		txtJhonDoe.setEditable(false);
		txtJhonDoe.setOpaque(false);
		txtJhonDoe.setText("Jhon Doe");
		panel_1.add(txtJhonDoe);
		txtJhonDoe.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Dirección:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_1.add(lblNewLabel_2);
		
		txtCalle = new JTextField();
		txtCalle.setEditable(false);
		txtCalle.setText("Calle 1 # 123");
		txtCalle.setOpaque(false);
		panel_1.add(txtCalle);
		txtCalle.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Teléfono:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_1.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setOpaque(false);
		textField_3.setText("5554433");
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panel_2);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("Datos de factura");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_2.add(lblNewLabel_6, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(192, 192, 192));
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("N° Factura:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_3.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setOpaque(false);
		textField_4.setText("1");
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Fecha:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_3.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setText("2021/50/21");
		textField_5.setOpaque(false);
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panel_4);
		panel_4.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("Listado de facturas");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_4.add(lblNewLabel_9, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(192, 192, 192));
		panel_4.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(4, 4, 5, 5));
		
		JLabel lblNewLabel_11 = new JLabel("Producto");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_6.add(lblNewLabel_11);
		
		JLabel lblNewLabel_10 = new JLabel("Cantidad");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_6.add(lblNewLabel_10);
		
		JLabel lblNewLabel_13 = new JLabel("Valor");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_6.add(lblNewLabel_13);
		
		JLabel lblNewLabel_12 = new JLabel("Sub Total");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		panel_6.add(lblNewLabel_12);
		
		txtAgua = new JTextField();
		txtAgua.setText("Agua");
		panel_6.add(txtAgua);
		txtAgua.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setText("2");
		panel_6.add(textField_8);
		textField_8.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setText("500");
		panel_6.add(textField_7);
		textField_7.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setText("1000.0");
		textField_17.setColumns(10);
		panel_6.add(textField_17);
		
		txtCereal = new JTextField();
		txtCereal.setText("Cereal");
		txtCereal.setColumns(10);
		panel_6.add(txtCereal);
		
		textField_15 = new JTextField();
		textField_15.setText("5");
		textField_15.setColumns(10);
		panel_6.add(textField_15);
		
		textField_14 = new JTextField();
		textField_14.setText("1000");
		textField_14.setColumns(10);
		panel_6.add(textField_14);
		
		textField_13 = new JTextField();
		textField_13.setText("5000.0");
		textField_13.setColumns(10);
		panel_6.add(textField_13);
		
		txtLeche = new JTextField();
		txtLeche.setBackground(new Color(128, 255, 255));
		txtLeche.setText("Leche");
		txtLeche.setColumns(10);
		panel_6.add(txtLeche);
		
		textField_11 = new JTextField();
		textField_11.setBackground(new Color(128, 255, 255));
		textField_11.setText("2");
		textField_11.setColumns(10);
		panel_6.add(textField_11);
		
		textField_10 = new JTextField();
		textField_10.setBackground(new Color(128, 255, 255));
		textField_10.setText("300");
		textField_10.setColumns(10);
		panel_6.add(textField_10);
		
		textField_9 = new JTextField();
		textField_9.setBackground(new Color(128, 255, 255));
		textField_9.setText("600.0");
		textField_9.setColumns(10);
		panel_6.add(textField_9);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(192, 192, 192));
		frame.getContentPane().add(panel_5);
		panel_5.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2));
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("Sub Total:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_14.setBounds(10, 10, 84, 13);
		panel_5.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("% de descuento:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_15.setBounds(10, 39, 106, 13);
		panel_5.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("IVA 19%:");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_16.setBounds(10, 62, 45, 13);
		panel_5.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Total Factura:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_17.setBounds(10, 85, 84, 13);
		panel_5.add(lblNewLabel_17);
		
		textField_18 = new JTextField();
		textField_18.setText("6600.0");
		textField_18.setBounds(114, 7, 45, 19);
		panel_5.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setText("5");
		textField_19.setBounds(114, 36, 45, 19);
		panel_5.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setText("1254.0");
		textField_20.setBounds(114, 59, 45, 19);
		panel_5.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setText("7524.0");
		textField_21.setBounds(114, 82, 45, 19);
		panel_5.add(textField_21);
		textField_21.setColumns(10);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		btnNewButton.setBounds(331, 95, 140, 21);
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		btnNewButton_1.setBounds(487, 95, 85, 21);
		panel_5.add(btnNewButton_1);
		
		JLabel lblNewLabel_18 = new JLabel("Valor descontado:");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		lblNewLabel_18.setBounds(193, 39, 122, 13);
		panel_5.add(lblNewLabel_18);
		
		textField_22 = new JTextField();
		textField_22.setText("330.0");
		textField_22.setBounds(291, 36, 45, 19);
		panel_5.add(textField_22);
		textField_22.setColumns(10);
		
		
	}
}

package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Ventana extends JFrame {
	
	public  Ventana () {
		
		this.setVisible(true);
		this.setSize(400, 500);
		//442,620 Medidas calculadora A mano
		this.setLocationRelativeTo(null);
		
		
		
		this.setTitle("Interfaz");
		
		ImageIcon user = new ImageIcon("C:\\Users\\emili\\OneDrive\\Documentos\\Programacion3\\Calculadora\\src\\Calculadora\\icono.png");
		Image img=user.getImage();
		Image imgScaled=img.getScaledInstance(25, 30, Image.SCALE_SMOOTH);
		ImageIcon imgIcon = new 	ImageIcon(imgScaled);
		
		this.setIconImage(img);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(300,300));
		
		this.setResizable(true);
		
		this.add(Interfaz());
		
		
		
		
		this.repaint(); 
		this.revalidate();
		
		
	}

	public JPanel Interfaz() {
		
		JPanel interfaz = new JPanel();
		
		Font fuente = new Font("Dubai medium",Font.BOLD,15);
		
		interfaz.setBackground(Color.white);
		interfaz.setOpaque(true);
		interfaz.setBorder(BorderFactory.createEmptyBorder(10, 10, 10,10));
		
		JLabel inte = new JLabel("Interés");
		inte.setBackground(Color.white);		
		inte.setFont(fuente);
		inte.setHorizontalAlignment(JLabel.LEFT);
		interfaz.add(inte,BorderLayout.NORTH);

		interfaz.setLayout(new BorderLayout()); //Poder colocar las cosas donde nosotros queramos

		
		JLabel resultado = new JLabel("Calculando Interés");
		resultado.setBackground(Color.green);		
		resultado.setOpaque(true);
		resultado.setFont(fuente);
		resultado.setHorizontalAlignment(JLabel.LEFT);
		interfaz.add(resultado,BorderLayout.NORTH);
		

		
		JPanel datos_centro = new JPanel();
		datos_centro.setBackground(Color.green);
		//datos_centro.setSize(200, 300);
		datos_centro.setBorder(BorderFactory.createEmptyBorder(50, 50, 50,50));
		datos_centro.setLayout(new GridLayout(4,2,10,10));
		//datos_centro.setBorder();
		interfaz.add(datos_centro,BorderLayout.CENTER);
		
		
		
		/*JLabel dato = new JLabel("Calculando Interés");
		dato.setBackground(Color.cyan);		
		//dato.setOpaque(true);
		dato.setFont(fuente);
		dato.setHorizontalAlignment(JLabel.LEFT);
		datos_centro.add(dato,BorderLayout.WEST);
		
		
		
		
		/*JLabel calcular_interes = new JLabel("Calcular Interés");
		calcular_interes.setForeground(Color.BLACK);
		calcular_interes.setBackground(Color.green);
		calcular_interes.setFont(fuente);
		//calcular_interes.setAlignmentY(BOTTOM_ALIGNMENT);t
		datos_centro.add(calcular_interes);
		*/
		JLabel capital = new JLabel("Capital:");
		capital.setForeground(Color.BLACK);
		capital.setBackground(Color.green);
		capital.setOpaque(false);
		capital.setFont(fuente);
		datos_centro.add(capital);
		
		
		JTextField capital1 = new JTextField("1500");
		capital1.setOpaque(true);
		capital1.setFont(fuente);
		datos_centro.add(capital1);
		
		JLabel tiempo = new JLabel("Tiempo:");
		tiempo.setForeground(Color.BLACK);
		tiempo.setBackground(Color.green);
		tiempo.setFont(fuente);
		datos_centro.add(tiempo);
		
		JTextField capital2 = new JTextField("2");
		capital2.setOpaque(true);
		capital2.setFont(fuente);
		datos_centro.add(capital2);
		
		JLabel tasa_interes = new JLabel("Tasa de interés:");
		tasa_interes.setForeground(Color.BLACK);
		tasa_interes.setBackground(Color.green);
		tasa_interes.setFont(fuente);
		datos_centro.add(tasa_interes);
		
		JTextField capital3 = new JTextField("0.1");
		capital3.setOpaque(true);
		capital3.setFont(fuente);
		datos_centro.add(capital3);
		
		JButton calcular = new JButton("Calcular");
		calcular.setForeground(Color.BLACK);
		calcular.setBackground(Color.gray);
		calcular.setFont(fuente);
		datos_centro.add(calcular);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setForeground(Color.BLACK);
		cancelar.setBackground(Color.gray);
		cancelar.setFont(fuente);
	//	cancelar.setOpaque(true);
		datos_centro.add(cancelar);
		
		JPanel datos_final = new JPanel();
		datos_final.setBackground(Color.red);
		datos_final.setBorder(BorderFactory.createEmptyBorder(50, 50, 50,50));
		datos_final.setLayout(new GridLayout(2,2,15,15));
		interfaz.add(datos_final,BorderLayout.PAGE_END);
		
		JLabel interes1 = new JLabel("Interés:");
		interes1.setForeground(Color.BLACK);
		interes1.setBackground(Color.green);
		interes1.setFont(fuente);
		datos_final.add(interes1);
		
		JTextField pon_inte = new JTextField("315.000002");
		pon_inte.setOpaque(true);
		pon_inte.setFont(fuente);
		datos_final.add(pon_inte);
		
		JLabel monto = new JLabel("Monto:");
		monto.setForeground(Color.BLACK);
		monto.setBackground(Color.green);
		monto.setFont(fuente);
		datos_final.add(monto);
		
		JTextField pon_monto = new JTextField("1815.000002");
		pon_monto.setOpaque(true);
		pon_monto.setFont(fuente);
		datos_final.add(pon_monto);
		
		
		
		
		
		//JButton 
		
		/*JPanel abajo = new JPanel();
		abajo.setBackground(Color.pink);
		abajo.setOpaque(true);
		abajo.setLayout(new BorderLayout());
		interfaz.add(abajo,BorderLayout.PAGE_END);*/
		
		
		return interfaz;
	}

}

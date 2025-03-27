package Paint;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Paint implements MouseListener, MouseMotionListener {

    private JFrame frame;
    private JPanel panel_2;
    private JSlider slider;
    private int brushSize = 3; // Tamaño inicial del pincel
    private Color brushColor = Color.BLACK;
    private List<Stroke> strokes = new ArrayList<>();
    private Stroke currentStroke;

    // Clase interna para almacenar información de cada trazo
    private class Stroke {
        List<Point> points;
        int size;
        Color color;

        public Stroke(int size, Color color) {
            this.points = new ArrayList<>();
            this.size = size;
            this.color = color;
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Paint window = new Paint();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Paint() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(192, 192, 192));
        frame.getContentPane().setLayout(new BorderLayout(0, 0));
        frame.setBounds(100, 100, 1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(69, 69, 69));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        panel_2 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                for (Stroke stroke : strokes) {
                    g2d.setStroke(new BasicStroke(stroke.size));
                    g2d.setColor(stroke.color);
                    for (int i = 1; i < stroke.points.size(); i++) {
                        g2d.drawLine(stroke.points.get(i - 1).x, stroke.points.get(i - 1).y,
                                stroke.points.get(i).x, stroke.points.get(i).y);
                    }
                }
            }
        };
        panel_2.setBounds(333, 10, 643, 543);
        panel_2.setBackground(Color.WHITE);
        panel.add(panel_2);
        panel_2.addMouseListener(this);
        panel_2.addMouseMotionListener(this);

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
        btnNewButton_1.setBounds(106, 133, 85, 21);
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
        btnNewButton_2_5.setBounds(201, 102, 85, 21);
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
        btnNewButton_4.setBounds(10, 133, 85, 21);
        panel_1.add(btnNewButton_4);
        
        JButton btnNewButton_6 = new JButton("");
        btnNewButton_6.setIcon(new ImageIcon("src/img/circulo-de-color (1).png"));
        btnNewButton_6.setBackground(new Color(192, 192, 192));
        btnNewButton_6.setBounds(201, 133, 85, 21);
        panel_1.add(btnNewButton_6);
        
        btnNewButton_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(frame, "Selecciona un color", Color.black);
                if(selectedColor != null) {
                    panel_2.setBackground(selectedColor);
                }
            }
        });
        
        JLabel lblNewLabel = new JLabel("Custom Colors");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel.setBounds(10, 10, 181, 25);
        panel_1.add(lblNewLabel);
        
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
         btnNewButton_12.addActionListener(e -> {
                strokes.clear();
                panel_2.repaint();
            });
        panel_1.add(btnNewButton_12);
        
        btnNewButton_12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel_2.removeAll();
                panel_2.revalidate();
                panel_2.repaint();
                panel_2.setBackground(new Color(240,240,240));
            }
        });
        
        JButton btnNewButton_13 = new JButton("SAVE");
        btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        btnNewButton_13.setBounds(10, 500, 276, 21);
        panel_1.add(btnNewButton_13);
        
        JLabel lblNewLabel_2 = new JLabel("Canvas Color:");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel_2.setBounds(10, 310, 149, 25);
        panel_1.add(lblNewLabel_2);
        
        JButton btnNewButton_14 = new JButton("");
        btnNewButton_14.setIcon(new ImageIcon("src/img/circulo-de-color (1).png"));
        btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnNewButton_14.setBounds(182, 310, 79, 32);
        panel_1.add(btnNewButton_14);
        
        btnNewButton_14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(frame, "Selecciona un color", Color.black);
                if(selectedColor != null) {
                    panel_2.setBackground(selectedColor);
                }
            }
        });

        slider = new JSlider(1, 20, brushSize);
        slider.setBounds(10, 380, 276, 26);
        slider.addChangeListener(e -> brushSize = slider.getValue());
        panel_1.add(slider);

       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        currentStroke = new Stroke(brushSize, brushColor);
        strokes.add(currentStroke);
        currentStroke.points.add(e.getPoint());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        currentStroke.points.add(e.getPoint());
        panel_2.repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        currentStroke.points.add(e.getPoint());
        panel_2.repaint();
    }

    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
    @Override public void mouseMoved(MouseEvent e) {}
}


package Aplcicacion;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Aplcicacion.paint.PaintPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class juegoCuadro extends JFrame implements KeyListener  {

	
	private JPanel contentPane;
	private PaintPanel panel;
	int x=10,y=10;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					juegoCuadro frame = new juegoCuadro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public juegoCuadro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new PaintPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(e-> {
			x=10;
			y=10;
			repaint();
		});
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel_2.add(lblNewLabel);

		addKeyListener((KeyListener) this);       
		setFocusable(true);         
		requestFocusInWindow();     
	}

	class PaintPanel extends JPanel {

		public PaintPanel() {
			this.setBackground(Color.WHITE);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(Color.LIGHT_GRAY);
			g2.fillRect(x, y, 20, 20);
		}
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch (key) {
			case KeyEvent.VK_LEFT:
				x -= 5;
				System.out.println("presionada "+key);
				break;
			case KeyEvent.VK_RIGHT:
				x += 5;
				System.out.println("presionada "+key);
				break;
			case KeyEvent.VK_UP:
				y -= 5;
				System.out.println("presionada "+key);
				break;
			case KeyEvent.VK_DOWN:
				y += 5;
				System.out.println("presionada "+key);
				break;
			default:
                System.out.println("Otra tecla presionada: " + key);
        
		}
		
		
		int ancho = panel.getWidth();
		int alto = panel.getHeight();
		int cuad=20;
		if (x + cuad <= 0) {
			x = ancho - cuad;
		}
		if (x >= ancho) {
			x = 0;
		}
		if (y + cuad <= 0) {
			y = alto - cuad;
		}
		if (y >= alto) {
			y = 0;
		}
		panel.repaint();
	}

	public void keyReleased(KeyEvent e) {}

	public void keyTyped(KeyEvent e) {}
}

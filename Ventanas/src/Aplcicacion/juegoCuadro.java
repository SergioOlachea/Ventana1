package Aplcicacion;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import Aplcicacion.paint.PaintPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class juegoCuadro extends JFrame implements KeyListener  {

	
	private JPanel contentPane;
	private PaintPanel panel;
	private Player player;
	private Player sombra;
	private Timer timer,timer2;
	int ultimapresionada=0;
	
	private ArrayList<Player> obstaculos = new ArrayList<>();
	Color rd=new Color(147,112,219);
	int xm,ym,r,g,b,al,an,x=25,y=25,seg=0,min=0,hor=0;
	Random rand = new Random();
	
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
		
		JTextField textField_2 = new JTextField("00:00:00");
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(e-> {
			player.x = 10;
		    player.y = 10;
		    sombra.x = player.x;
		    sombra.y = player.y;
		    seg=0;
		    min=0;
		    hor=0;
		    textField_2.setText("00:00:00");
		    timer.stop();
		    repaint();  
		    requestFocusInWindow();
		});
		panel_1.add(btnNewButton);
		
		
	
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.NORTH);
		
		
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
	    textField_2.setEditable(false);
		panel_2.add(textField_2);
		
		timer = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
           	 seg++;
                if (seg == 60) {
                    seg = 0;
                    min++;
                    if (min == 60) {
                        min = 0;
                        hor++;
                    }
                }
                actualizarCronometro();
            }
           private void actualizarCronometro() {
	       String tiempo = String.format("%02d:%02d:%02d", hor, min, seg);
	       textField_2.setText(tiempo);
           }
        });
		
		timer2 = new Timer(40, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
           	 
            	update();
              System.out.println("mov");
           }
        });
		addKeyListener((KeyListener) this);       
		setFocusable(true);         
		requestFocusInWindow();     
		player=new Player(x,y,25,25,rd);
		sombra = new Player(player.x, player.y, player.alto, player.ancho, null);
		
		// Creacion de Medidas Colores y Coordenadas aleatorias para obstaculos
		for (int i = 0; i < 5; i++) {
		    xm = rand.nextInt(600);      
		    ym = rand.nextInt(350);       
		    al = 20 + rand.nextInt(50);   
		    an = 20 + rand.nextInt(50);   
		    r = rand.nextInt(256);        
		    g = rand.nextInt(256);       
		    b = rand.nextInt(256);       

		    Color colorAleatorio = new Color(r, g, b);
		    obstaculos.add(new Player(xm, ym, an, al, colorAleatorio));
		}
		
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
			g2.fillRect(player.x, player.y, player.alto, player.ancho);
			for(Player muro:obstaculos) {
				g2.setColor(muro.c);
				g2.fillRect(muro.x, muro.y, muro.ancho, muro.alto);
			}
		}
	}

	public void keyPressed(KeyEvent e) {
		timer.start();
		timer2.start();
		ultimapresionada= e.getKeyCode();
	}
	
	void update(){
		
		boolean movimiento = true;
		
		
		sombra.x = player.x;
		sombra.y = player.y;
		
		switch (ultimapresionada) {
		
		 case KeyEvent.VK_LEFT: 
	        case KeyEvent.VK_A:     
	            player.x -= 1;
	            break;
	        case KeyEvent.VK_RIGHT:
	        case KeyEvent.VK_D:     
	            player.x += 1;
	            break;
	        case KeyEvent.VK_UP:    
	        case KeyEvent.VK_W:     
	            player.y -= 1;
	            break;
	        case KeyEvent.VK_DOWN:  
	        case KeyEvent.VK_S:     
	            player.y += 1;
	            break;
			default:
				System.out.println("Otra tecla presionada: " + ultimapresionada);
				System.out.println(KeyEvent.getKeyText(ultimapresionada));
				break;
		}
	
		// Verificar Colisiones
		for (Player muro : obstaculos) {
			if (player.colision(muro)) {
				System.out.println("Chocaste");
				movimiento = false;
				timer2.stop();
				ultimapresionada=0;
				break;
			} else {
				System.out.println("Sigue");
			}
		}
	
		
		if (movimiento) {
			
			sombra.x = player.x;
			sombra.y = player.y;
		} else {
			
			player.x = sombra.x;
			player.y = sombra.y;
		}
	
		// Condiciones para regresarar al panel
		int ancho = panel.getWidth();
		int alto = panel.getHeight();
		int cuad = 20;
	
		if (player.x + cuad <= 0) player.x = ancho - cuad;
		if (player.x >= ancho) player.x = 0;
		if (player.y + cuad <= 0) player.y = alto - cuad;
		if (player.y >= alto) player.y = 0;
	
		panel.repaint();
	}
	

	public void keyReleased(KeyEvent e) {}

	public void keyTyped(KeyEvent e) {}

	
	class Player {
		int x=0, y=0, alto=0, ancho=0;
		Color c;
		public Player(int x, int y, int alto, int ancho, Color c) {
			this.x=x;
			this.y=y;
			this.ancho=ancho;
			this.alto=alto;
			this.c=c;
			
		}
		public Boolean colision(Player target){
			if(this.x < target.x + target.ancho &&
		       this.x + this.ancho > target.x &&
		       this.y < target.y + target.alto &&
		       this.y + this.alto > target.y) {
				return true;
				
			}else {
					return false;
			}
		}
	}
}
	


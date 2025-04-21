package Aplcicacion;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import Aplcicacion.paint.PaintPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;

public class juegoCuadro extends JFrame implements KeyListener  {

	
	private JPanel contentPane;
	private PaintPanel panel;
	private Player player;
	private Player sombra, meta;
	private Timer timer,timer2;
	int ultimapresionada=0;
	private Image fondo; 
	
	private ArrayList<Player> obstaculos = new ArrayList<>();
	Color rd=new Color(97, 54, 29);
	int x=50,y=50,seg=0,min=0,hor=0;
	Random rand = new Random();
	int silencio=0,tamMuro=25;
	
	Sonido sonido;

	
	private BufferedImage jugador;
	private JTextField textField_2;
	ImageIcon iconoSonando = new ImageIcon(getClass().getResource("/Aplcicacion/silenciar.png"));
	ImageIcon iconoSilencio = new ImageIcon(getClass().getResource("/Aplcicacion/activar.png"));
	
	int[][] laberinto = {
		    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
		    {1,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,0,1,1,0,0,0,0,1,0,0,0,1},
		    {1,0,1,0,1,1,1,0,1,1,0,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,0,1,1,0,1,1,1,1,0,1,0,0,1,0,0,1,0,1,0,0,1,1},
		    {1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,1,1,0,1,0,1,1,0,1,0,0,1,1},
		    {1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,1,0,1,1,0,1,1,1,0,1,1,0,0,0,0,1,0,1,0,1,1,0,0,1,0,1,1},
		    {1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1,1,0,1,0,0,0,0,0,1,0,0,0,0,0,1,1},
		    {1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,0,0,0,1,0,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1},
		    {1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,1,0,1,1,1,1,1,0,1,0,1,0,1,0,0,0,1,0,0,0,0,1},
		    {1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,0,0,1,0,0,1,0,1,0,1,0,1,1,0,1,1,1,0,1,0,1},
		    {1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,1,1,0,1,1,1,1,0,1,1,0,0,1,0,1},
		    {1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,1,0,0,1,0,1,1,0,1,0,1,0,0,0,0,0,1,0,0,1,0,1},
		    {1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,0,1,0,0,1,0,1,0,1,0,1,1,0,0,1,0,0,1,0,1},
		    {1,1,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1,1,0,0,0,0,0,0,1,1,0,0,0,1,0,0,1,0,0,1,0,0,0,0,1},
		    {1,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,1,1,0,1,0,0,1,0,1,0,1,0,0,1,1,1,1,1,0,1,1,1},
		    {1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,0,1,1,1,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1},
		    {1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,1,1,0,1,1,0,1,0,1,1,1,1,0,1,0,1,0,1,0,1,0,1},
		    {1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,1,0,0,1,0,0,1,1,1,0,1,0,0,1,0,1,0,1,0,1,0,1},
		    {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,1,0,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1,0,1},
		    {1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,1,0,1,0,0,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,1},
		    {1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,1,1,0,1,1,0,1,0,0,0,1,0,1,0,1,1,1,1,0,1},
		    {1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,0,1,1,1,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,1},
		    {1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,1,0,1,0,0,0,0,1,1,0,0,1,0,1,1,1,1,1,0,1,0,1,1,0,1},
		    {1,1,1,1,0,1,1,0,1,1,1,0,1,1,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,0,0,1,0,0,1,1,1,1,1,1,0,0,0,0,0,1,0,0,1,0,1},
		    {1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1,1,1,1,1,2,2,0,0,0,0,0,0,1,1,0,0,1,0,0,1,0,1},
		    {1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,0,0,0,0,0,1,2,2,0,0,1,0,1,0,0,1,0,0,1,1,0,1,0,1},
		    {1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,1,1,0,1,0,0,0,0,1,0,1,0,0,1,0,0,1,0,0,0,0,1},
		    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
		};


	
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
		setBounds(100,0, 1315, 805);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new PaintPanel();
		JScrollPane scrollPane = new JScrollPane(panel);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(50, 205, 50));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		sonido = new Sonido("/Aplcicacion/pulgaSonido.wav"); 
		sonido.reproducir();
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
		btnNewButton.addActionListener(e-> {
			reiniciar();
		});
		panel_1.add(btnNewButton);
		
		
	
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.NORTH);
		
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(iconoSonando);
		btnNewButton_1.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
		        if (silencio==0) {
		            sonido.detener();
		            btnNewButton_1.setIcon(iconoSilencio);
		            silencio=1;
		        } else {
		            // Activar audio
		            sonido.reproducir();
		            silencio=0;
		            
		            btnNewButton_1.setIcon(iconoSonando);
		        }
		    }
		});
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		panel_2.add(btnNewButton_1);
		
		textField_2 = new JTextField("00:00:00");
		textField_2.setBackground(new Color(50, 205, 50));
		textField_2.setFont(new Font("Vladimir Script", Font.BOLD | Font.ITALIC, 20));
		textField_2.setText("00:00:00");
		
		
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
		
		timer2 = new Timer(5, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
           	 
            	update();
              System.out.println("mov");
           }
        });
		addKeyListener((KeyListener) this);       
		setFocusable(true);         
		requestFocusInWindow();     
		player=new Player(25,25,20,20,null,"pulga.jpg");
		sombra = new Player(player.x, player.y, player.alto, player.ancho, null);
		
		
		meta = new Player(850, 600, tamMuro, tamMuro, null,"perroMeta1.jpg");
		    	
    
		
			
			for (int fila = 0; fila < laberinto.length; fila++) {
			    for (int col = 0; col < laberinto[5].length; col++) {
			        if (laberinto[fila][col] == 1) {
			            int muroX = col * tamMuro;
			            int muroY = fila * tamMuro;
			            obstaculos.add(new Player(muroX, muroY, tamMuro, tamMuro, rd));
			    }
			}
		}	
	}

	class PaintPanel extends JPanel {

		public PaintPanel() {
			
			this.setBackground(Color.WHITE);
			URL imageUrl = getClass().getResource("/Aplcicacion/pastofondo.jpg");
            fondo = Toolkit.getDefaultToolkit().getImage(imageUrl);
		        
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			 if (fondo != null) {
	            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
		        }
			if (player.jugador != null) {
                g2.drawImage(player.jugador, player.x, player.y, player.ancho, player.alto, null);
            } else {
                g2.setColor(player.c);
                g2.fillRect(player.x, player.y, player.ancho, player.alto);
            }
			for(Player muro:obstaculos) {
				g2.setColor(muro.c);
				g2.fillRect(muro.x, muro.y, muro.ancho, muro.alto);
			}
			if (meta.jugador != null) {
                g2.drawImage(meta.jugador, meta.x, meta.y, meta.ancho, meta.alto, null);
            } else {
                g2.setColor(meta.c);
                g2.fillRect(meta.x, meta.y, meta.ancho, meta.alto);
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
		System.out.println(meta.x);
		System.out.println( meta.y);
		
		//verificar Victoria
		ImageIcon victoriagif = new ImageIcon(getClass().getResource("/Aplcicacion/victoria.gif"));
		if(player.gano(meta)) {
			sonido.detener();
			timer.stop();
			Sonido victoria = new Sonido("/Aplcicacion/victoria.wav"); 
			victoria.reproducir();
			    int opcion = JOptionPane.showOptionDialog(
			        null,
			        "¡Ganaste! tu tiempo fue"+textField_2.getText(),
			        "Juego terminado",
			        JOptionPane.DEFAULT_OPTION,
			        JOptionPane.INFORMATION_MESSAGE,
			        victoriagif,
			        new String[]{"Reiniciar", "Salir"},
			        "Reiniciar"
			    );

			    if (opcion == 0) {
			    	reiniciar();
						
				
			    } else if (opcion == 1 || opcion == JOptionPane.CLOSED_OPTION) {
			        System.exit(0);
			    }
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
		int col = (player.x - 80) / 25;
		int fila = (player.y - 40) / 25;

		
	}
	
	public void reiniciar() {
		player.x = 25;
	    player.y = 25;
	    sombra.x = player.x;
	    sombra.y = player.y;
	    seg=0;
	    min=0;
	    hor=0;
	    textField_2.setText("00:00:00");
	    timer.stop();
	    timer2.stop();
	    repaint();  
	    requestFocusInWindow();
	}

	public void keyReleased(KeyEvent e) {}

	public void keyTyped(KeyEvent e) {}

	
	class Player {
		BufferedImage jugador;
		int x=0, y=0, alto=0, ancho=0;
		Color c;
		public Player(int x, int y, int alto, int ancho, Color c,String j) {
			this.x=x;
			this.y=y;
			this.ancho=ancho;
			this.alto=alto;
			this.c=c;
		
			if (j != null) {
                try {
                    jugador = ImageIO.read(getClass().getResource(j));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
		public Player(int x, int y, int alto, int ancho, Color c) {
			this.x=x;
			this.y=y;
			this.ancho=ancho;
			this.alto=alto;
			this.c=c;
		}
		
		public Boolean gano(Player target){
			if(this.x < target.x + target.ancho &&
		       this.x + this.ancho > target.x &&
		       this.y < target.y + target.alto &&
		       this.y + this.alto > target.y) {
				return true;
				
			}else {
					return false;
			}
		}
		public Boolean meta(Player target){
			if(this.x < target.x + target.ancho &&
		       this.x + this.ancho > target.x &&
		       this.y < target.y + target.alto &&
		       this.y + this.alto > target.y) {
				return true;
				
			}else {
					return false;
			}
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
	
	
	//sub clase para el audio
	public class Sonido {
	    private Clip clip;

	    public Sonido(String nombreArchivo) {
	        try {
	            // Cargar el archivo de audio
	            AudioInputStream audioStream = AudioSystem.getAudioInputStream(
	                getClass().getResource(nombreArchivo)
	            );
	            clip = AudioSystem.getClip();
	            clip.open(audioStream);
	        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
	            e.printStackTrace();
	        }
	    }

	    public void reproducir() {
	        if (clip != null) {
	            clip.setFramePosition(0); // Reinicia el audio si ya fue reproducido
	            clip.start();
	        }
	    }

	    public void detener() {
	        if (clip != null && clip.isRunning()) {
	            clip.stop();
	        }
	    }
	}
}
	


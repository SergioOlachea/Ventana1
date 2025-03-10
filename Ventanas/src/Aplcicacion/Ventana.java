package Aplcicacion;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame {
    private JTextField pantallaCal;
    private JButton[] botones;
    JMenuItem item1, item2, item3, item4, item5, item6, item7, item8, item9;
    ImageIcon icono = new ImageIcon("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/icono.png");
    private String[] etiquetas = {
    		"C", " ", " ", " ",
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            ".", "0", "=", "+"
    };

    public Ventana() {
    	
    	this.setIconImage(icono.getImage());
    	this.setTitle(getTitle());
		this.setSize(1000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new FondoDegradado());
       
        this.setVisible(true);
		//this.add(this.ventanaRegistro());
		//this.add(Calculadora());
		//this.add(this.Tabla());
        
		
        //Crear barra
        JMenuBar barra = new JMenuBar(); 
        // Crear menús
        JMenu menu = new JMenu("Archivo");  
        JMenu menu2 = new JMenu("Ayuda");  

         // Crear elementos de menú
         item1 = new JMenuItem("Guardar");  
         item2 = new JMenuItem("Nuevo");  
         item3 = new JMenuItem("Eliminar");  
         item4 = new JMenuItem("Compartir");
         
         item5 = new JMenuItem("Buscar");  
         item6 = new JMenuItem("Consejos");  
         item7 = new JMenuItem("Contenido de ayuda");  
        
         // Añadir elementos al menú
         menu.add(item1);  
         menu.add(item2);  
         menu.add(item3);
         
         menu2.add(item5);  
         menu2.add(item6);  
         menu2.add(item7);

         
 		
        
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(500, 500));

        // Panel de fondo con degradado
        FondoDegradado fondo = new FondoDegradado();
        fondo.setBounds(0, 0, 1000, 1000);

        //this.add(this.login());
        //this.add(this.Calculadora());
       // this.add(this.CalculadoraInteres());
        

        // Agregamos los componentes al layeredPane
        layeredPane.add(fondo, JLayeredPane.DEFAULT_LAYER);
        //layeredPane.add(Calculadora(), JLayeredPane.PALETTE_LAYER);
        //layeredPane.add(CalculadoraInteres(), JLayeredPane.PALETTE_LAYER);
       // layeredPane.add(login(), JLayeredPane.PALETTE_LAYER);
        

        // Agregamos el layeredPane al JFrame
        this.setContentPane(layeredPane);
        this.setVisible(true);
         

        barra.add(menu);
        barra.add(menu2);
        this.setJMenuBar(barra);
        this.repaint();
        this.revalidate();
        
    }
    
  public void paint (Graphics g) {
    	
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
	    int pixel = 7;  
	    
	 // Fondo cielo
	    g2.setColor(Color.decode("#b3eefe"));
	    g2.fillRect(0, 0, getWidth(), getHeight());
	    for (int y = 0; y < getHeight(); y += pixel) {
	        for (int x = 0; x < getWidth(); x += pixel) {
	            if ((x + y) % 2 == 0) {
	                g2.setColor(Color.decode("#0665c0"));
	            } else {
	                g2.setColor(Color.decode("#096ecf"));
	            }
	            g2.fillRect(x, y, pixel, pixel);
	        }
	    }

	    g2.setColor(Color.decode("#bddade"));
	    g2.fillRoundRect(320, 700, 200, 50,50,50);
	    g2.fillRoundRect(290, 600, 200, 50,50,50);
	    g2.fillRoundRect(185, 650, 200, 50,50,50);
	    g2.fillRoundRect(645, 400, 200, 50,50,50);
	    g2.setColor(Color.WHITE);
	    g2.fillRoundRect(320, 700, 200, 42,50,50);
	    g2.fillRoundRect(290, 600, 200, 42,50,50);
	    g2.fillRoundRect(185, 650, 200, 42,50,50);
	    g2.fillRoundRect(645, 400, 200, 42,50,50);
	    
	    // Sombra Montañas
	    g2.setColor(Color.decode("#a8cfce"));
	    g2.fillRect(385, 402, 180, 350);
	    g2.fillArc(385, 302, 180, 200, 0, 180);//
	    g2.fillRect(566, 252, 180, 500);
	    g2.fillArc(566, 152, 180, 200, 0, 180);//
	    g2.fillRect(50, 402, 180, 350);
	    g2.fillArc(50, 302, 180, 200, 0, 180);//
	    
	    // Montañas mas lejanas
	    g2.setColor(Color.decode("#c6e3e7"));
	    g2.fillRect(385, 402, 160, 340);
	    g2.fillArc(385, 302, 160, 200, 0, 180);//
	    g2.fillRect(566, 252, 160, 500);
	    g2.fillArc(566, 152, 160, 200, 0, 180);//
	    g2.fillRect(50, 402, 160, 350);
	    g2.fillArc(50, 302, 160, 200, 0, 180);//
	    
	    //brillos
	    g2.setColor(Color.decode("#f1f4ff"));
	    g2.fillOval(410, 460, 20, 30);
		g2.fillOval(475, 405, 25, 32);
		g2.fillOval(410, 560, 20, 30);
		g2.fillOval(70, 550, 20, 30);
		g2.fillOval(150, 400, 26, 32);
		g2.fillOval(150, 530, 22, 32);
		g2.fillOval(590, 340, 22, 38);
		g2.fillOval(670, 240, 20, 34);

		    
		//nubes
	    g2.setColor(Color.decode("#bddade"));
	    g2.fillRoundRect(500, 550, 200, 50,50,50);
	    g2.fillRoundRect(230, 500, 200, 50,50,50);
	    g2.setColor(Color.WHITE);
	    g2.fillRoundRect(500, 550, 200, 42,50,50);
	    g2.fillRoundRect(230, 500, 200, 42,50,50);
	    
	    // Sombras Montañas Cercanas
	    g2.setColor(Color.decode("#2b6a94"));
	    g2.fillRect(385, 678,220, 75);
	    g2.fillArc(385, 598, 220, 180, 0, 180);
	    g2.fillRect(605, 540,220, 213);
	    g2.fillArc(605, 450, 220, 180, 0, 180);
	    g2.fillRect(-110, 657,220, 95);
	    g2.fillArc(-110, 582, 220, 150, 0, 180);
	    
	    // Montañas mas cercanas
	    g2.setStroke(new BasicStroke(7));
	    g2.drawRect(385, 678,220, 75);
	    g2.drawArc(385, 598, 220, 180, 0, 180);
	    g2.drawRect(605, 540,220, 213);
	    g2.drawArc(605, 450, 220, 180, 0, 180);
	    g2.drawRect(-110, 657,220, 95);
	    g2.drawArc(-110, 582, 220, 150, 0, 180);
	    g2.setColor(Color.decode("#77b3d8"));
	    g2.fillRect(385, 678,200, 75);
	    g2.fillArc(385, 598, 200, 180, 0, 180);//
	    g2.fillRect(607, 540,200, 213);
	    g2.fillArc(607, 450, 200, 180, 0, 180);//
	    g2.fillRect(-110, 657,200, 95);
	    g2.fillArc(-110, 582, 200, 150, 0, 180);//
	    g2.setColor(Color.decode("#bddade"));
	    g2.fillRoundRect(-25, 450, 200, 50,50,50);
	    g2.fillRoundRect(745, 350, 200, 50,50,50);
	    g2.setColor(Color.WHITE);
	    g2.fillRoundRect(-25, 450, 200, 42,50,50);
	    g2.fillRoundRect(745, 350, 200, 42,50,50);
	    
	    //Brillos
	    g2.setColor(Color.decode("#c6e4e5"));
		g2.fillOval(650, 510, 20, 30);
		g2.fillOval(730, 600, 24, 36);
		 
	    
	    // tubo
	    g2.setColor(Color.decode("#8884d1") );
	    g2.fillRect(450, 652, 95, 100);
	    g2.fillRoundRect(442, 602, 111,50,10,10);
	    // Brillo del tubo 
	    g2.setColor(Color.decode("#46438f"));
	    g2.fillRect(455,652,3,100);
	    g2.fillRect(452,602, 5,50);//
	    g2.fillRect(480,652,3,100);
	    g2.fillRect(478,602, 3,50);//
	    g2.fillRect(507,652, 6,100);
	    g2.fillRect(510,602, 3,50);
	    g2.setColor(Color.WHITE);
	    g2.fillRect(462,652,10,100);
	    g2.fillRect(462,602, 10,50);//
	    g2.setColor(Color.BLACK);
	    g2.fillRect(510,652, 3,100);
	    g2.fillRect(513,602, 5,50);//
	    g2.fillRect(520,652, 3,100);
	    g2.fillRect(520,602, 3,50);//
	    g2.fillRect(525,652,10,100);
	    g2.fillRect(528,602, 10,50);//
	    g2.fillRect(540,652,5,100);
	    g2.fillRect(542,602, 7,50);//
	    g2.setStroke(new BasicStroke(3));
	    g2.drawRoundRect(442, 602, 111,50,10,10);  
	    g2.drawRect(450, 652, 95, 100); 
	    
	    // Nube
	    g2.setColor(Color.decode("#bddade"));
	    g2.fillRoundRect(800, 587, 220, 55,50,50);
	    g2.setColor(Color.white);
	    g2.fillRoundRect(800, 587, 220, 45,50,50);
	    
	    // Montaña
	    g2.setColor(Color.decode("#77b3d8"));
	    g2.fillRect(950, 498,200, 258);
	    g2.fillArc(950, 398, 200, 250, 0, 180);//
	    
	    
	    //escuedra cubos
	    int tamañocuad =50;
	    
	    for (int y = 700; y > 700 - (4 * tamañocuad); y -= (tamañocuad + 4)) {
	    	g2.setColor(Color.decode("#9c9c9c")); // Gris medio
	        g2.fillRoundRect(800, y, tamañocuad, tamañocuad, 25, 25);

	        // Contorno negro
	        g2.setColor(Color.BLACK);
	        g2.setStroke(new BasicStroke(4));
	        g2.drawRoundRect(800, y, tamañocuad, tamañocuad, 25, 25);
	        // Brillos (puntitos blancos)
	        g2.setColor(Color.WHITE);
	        g2.fillOval(805, y + 5, 6, 6);
	        g2.fillOval(815, y + 15, 5, 5);
	        g2.fillOval(828, y + 8, 4, 4);
	    }
	    for (int x = 800 + tamañocuad + 4; x < 800 + (4 * tamañocuad); x += (tamañocuad + 4)) {
	    	int y = 700 - (3 * (tamañocuad + 4));
	        g2.setColor(Color.decode("#d9a223"));
	        g2.fillRoundRect(x, y, tamañocuad, tamañocuad, 25, 25);
	        g2.setColor(Color.BLACK);
	        g2.setStroke(new BasicStroke(5));
	        g2.drawRoundRect(x, y, tamañocuad, tamañocuad, 25, 25);
	        g2.setColor(Color.decode("#eedf30"));
	        g2.fillRoundRect(x+3,y+5 , 40, 40, 20, 20);
	        g2.setColor(Color.BLACK);
	        g2.setStroke(new BasicStroke(4));
	        g2.drawLine(x + 18, y + 18, x + 18, y + 30);
	        g2.drawLine(x + 30, y + 18, x + 30, y + 30);
	    }
	    
	    // tubo chico
	    g2.setColor(Color.decode("#8884d1") );
	    g2.fillRect(865, 700, 95, 50);
	    g2.fillRoundRect(857, 650, 111,50,10,10);
	    // Brillo del tubo chico
	    g2.setColor(Color.decode("#46438f"));
	    g2.fillRect(867, 700, 3, 50);       
	    g2.fillRect(864, 650, 5, 50);     
	    g2.fillRect(893, 700, 3, 50);       
	    g2.fillRect(891, 650, 3, 50); 
	    g2.fillRect(920, 700, 6, 50);     
	    g2.fillRect(923, 650, 3, 50); 
	    g2.setColor(Color.WHITE);
	    g2.fillRect(875, 700, 10, 50);      
	    g2.fillRect(875, 650, 10, 50); 
	    g2.setColor(Color.BLACK);
	    g2.fillRect(923, 700, 3, 50);       
	    g2.fillRect(926, 650, 5, 50); 
	    g2.fillRect(933, 700, 3, 50);        
	    g2.fillRect(933, 650, 3, 50);  
	    g2.fillRect(938, 700, 10, 50);       
	    g2.fillRect(941, 650, 10, 50); 
	    g2.fillRect(953, 700, 5, 50);        
	    g2.fillRect(955, 650, 7, 50);  
	    g2.setStroke(new BasicStroke(3));
	    g2.drawRoundRect(857, 650, 111, 50, 10, 10);
	    g2.drawRect(865, 700, 95, 50);  
	    
	    // Pasto y tierra
	    g2.setColor(Color.decode("#cd9e63")); 
	    g2.fillRect(0, getHeight() - 120, getWidth(), 100);
	    g2.setColor(Color.decode("#28bf21")); 
	    g2.fillRect(0, getHeight() - 130, getWidth(), 30);
	    for (int y = getHeight() - 120; y < getHeight(); y += pixel) {
	        for (int x = 0; x < getWidth(); x += pixel) {
	            if ((x + y) % 2 == 0) {
	                g2.setColor(Color.decode("#cd9e63"));
	            } else {
	                g2.setColor(Color.decode("#e3b865"));
	            }
	            g2.fillRect(x, y, pixel, pixel);
	        }
	    }
	    
	    // Mario
	    BufferedImage Mario;
 		try {
 			Mario = ImageIO.read(new File("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/Mario-removebg-preview.png"));
 			g2.drawImage(Mario, 325, 680,65,70,null,null);
 		}catch (IOException e ) {
 			e.printStackTrace();
 		}
 		
 		// Planta
	    BufferedImage Planta;
 		try {
 			Planta = ImageIO.read(new File("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/planta-removebg-preview.png"));
 			g2.drawImage(Planta, 458, 500,65,70,null,null);
 		}catch (IOException e ) {
 			e.printStackTrace();
 		}
	    
  }
		/* // Fondo cielo
	    g2.setColor(Color.decode("#b3eefe"));
	    g2.fillRect(0, 0, getWidth(), getHeight());
	    for (int y = 0; y < getHeight(); y += pixel) {
	        for (int x = 0; x < getWidth(); x += pixel) {
	            if ((x + y) % 2 == 0) {
	                g2.setColor(Color.decode("#b3eefe"));
	            } else {
	                g2.setColor(Color.decode("#a0d8f0"));
	            }
	            g2.fillRect(x, y, pixel, pixel);
	        }
	    }

	    // Pasto y tierra
	    
	    g2.setColor(Color.decode("#e7996b")); 
	    g2.fillRect(0, getHeight() - 100, getWidth(), 100);
	    g2.setColor(Color.decode("#fdc6b5")); 
	    g2.fillRect(0, getHeight() - 130, getWidth(), 30);
	    
	    for (int y = getHeight() - 100; y < getHeight() - 30; y += pixel) {
	        for (int x = 0; x < getWidth(); x += pixel) {
	            if ((x + y) % 2 == 0) {
	                g2.setColor(Color.decode("#e7996b"));
	            } else {
	                g2.setColor(Color.decode("#f3b59a"));
	            }
	            g2.fillRect(x, y, pixel, pixel);
	        }
	    }
	    
	    for (int y = getHeight() - 130; y < getHeight() - 100; y += pixel) {
	        for (int x = 0; x < getWidth(); x += pixel) {
	            if ((x + y) % 2 == 0) {
	                g2.setColor(Color.decode("#fdc6b5"));
	            } else {
	                g2.setColor(Color.decode("#e8a899"));
	            }
	            g2.fillRect(x, y, pixel, pixel);
	        }
	    }
	    g2.setColor(Color.BLACK);
	    g2.setStroke(new BasicStroke(3));
	    g2.drawRect(0, getHeight() - 130, getWidth(), 30);
	    
	    // bloques
	    // azul
	    g2.setColor(Color.BLACK);
	    g2.fillRoundRect(420, 527, 160, 225,9,9);
	    g2.setStroke(new BasicStroke(8));
	    g2.drawRoundRect(400, 507, 160, 245,9,9);
	    g2.setColor(Color.decode("#84c0ff") );
	    g2.fillRoundRect(400, 507, 160, 245,9,9);
	    g2.setColor(Color.decode("#1e8fde")); 
	    g2.fillRect(400, 507 + 235, 160, 10); 
	    g2.fillRect(400 + 150, 507, 10, 245);
	    for (int y = 507; y < 507 + 230; y += pixel) {
	        for (int x = 400; x < 400 + 142; x += pixel) {
	        	if ((x + y) % 2 == 0) {
	                g2.setColor(Color.decode("#a1c8f7")); 
	            } else {
	                g2.setColor(Color.decode("#84c0ff")); 
	            }
	            g2.fillRect(x, y, 10, 10); 
	        }
	    } 
	    g2.setColor(Color.GRAY); 
	    int tornillo = 10;
	    g2.fillOval(410 - tornillo / 2, 517 - tornillo / 2, tornillo, tornillo); 
	    g2.fillOval(390 + 160 - tornillo / 2, 517 - tornillo / 2, tornillo, tornillo);
	    g2.fillOval(390 + 160 - tornillo / 2, 497 + 245 - tornillo / 2, tornillo, tornillo); 
	    
	    
	    // amarillo
	    g2.setColor(Color.BLACK);
	    g2.fillRoundRect(345, 632, 155, 120,8,8);
	    g2.drawRoundRect(330, 609, 150, 145,8,8);
	    g2.setColor(Color.decode("#ffc3b8"));
	    g2.fillRoundRect(330, 609, 150, 145,8,8);
	    g2.setColor(Color.decode("#f2986e")); 
	    g2.fillRect(330, 609 + 135, 150, 10);
	    g2.fillRect(330 + 140, 609, 10, 145);
	    g2.setColor(Color.decode("#51d96b"));
	    g2.fillRoundRect(850, 609, 150, 145,8,8);
	    for (int y = 609; y < 609 + 130; y += pixel) {
	        for (int x = 330; x < 330 + 140; x += pixel) {
	        	if ((x + y) % 2 == 0) {
	                g2.setColor(Color.decode("#ffc3b8")); 
	            } else {
	                g2.setColor(Color.decode("#e9b3a9"));
	            }
	            g2.fillRect(x, y, 10, 10); 
	        }
	    } 
	    g2.setColor(Color.GRAY);
	    g2.fillOval(340 - tornillo / 2, 619 - tornillo / 2, tornillo, tornillo); 
	    g2.fillOval(320 + 150 - tornillo / 2, 619 - tornillo / 2, tornillo, tornillo); 
	    g2.fillOval(320 + 150 - tornillo / 2, 599 + 145 - tornillo / 2, tornillo, tornillo); 
	    g2.fillOval(340 - tornillo / 2, 599 + 145 - tornillo / 2, tornillo, tornillo);
	    
	    BufferedImage imagen1;
 		try {
 			imagen1 = ImageIO.read(new File("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/Captura_de_pantalla_8-3-2025_103937_www.bing.com-removebg-preview.png"));
 			g2.drawImage(imagen1, 520, 660,85,90,null,null);
 		}catch (IOException e ) {
 			e.printStackTrace();
 		}
	    
	    
	    g2.setColor(Color.BLACK);
	    g2.setStroke(new BasicStroke(8));
	    g2.drawRoundRect(850, 609, 150, 145,5,5);
	    g2.setColor(Color.decode("#257f2e"));
	    g2.fillRect(850, 609 + 135, 150, 10);
	    for (int y = 609; y < 609 + 131; y += pixel) {
	        for (int x = 850; x < 850 + 140; x += pixel) {
	            if ((x + y) % 2 == 0) {
	                g2.setColor(Color.decode("#51d96b"));
	            } else {
	                g2.setColor(Color.decode("#48aa5b"));
	            }
	            g2.fillRect(x, y, pixel, pixel);
	        }
	    }
	    g2.setColor(Color.GRAY); 
	    g2.fillOval(860 - tornillo / 2, 619- tornillo / 2, tornillo, tornillo); 
	    g2.fillOval(860 - tornillo / 2, 599 + 145 - tornillo / 2, tornillo, tornillo);   
	    
	    // tubo
	    g2.setColor(Color.decode("#1b851c") );
	    g2.fillRect(700, 632, 95, 120);
	    g2.fillRect(695, 580, 105,50);
	    g2.setColor(Color.decode("#54d96f"));
	    g2.fillRect(708,632,3,120);
	    g2.fillRect(705,580, 5,50);//
	    g2.fillRect(712,632,10,120);
	    g2.fillRect(712,580, 10,50);//
	    g2.fillRect(730,632,3,120);
	    g2.fillRect(728,580, 3,50);//
	    g2.fillRect(757,632, 6,120);
	    g2.fillRect(760,580, 3,50);
	    g2.setColor(Color.BLACK);
	    g2.fillRect(760,632, 3,120);
	    g2.fillRect(763,580, 5,50);//
	    g2.fillRect(770,632, 3,120);
	    g2.fillRect(770,580, 3,50);//
	    g2.fillRect(775,632,10,120);
	    g2.fillRect(778,580, 10,50);//
	    g2.fillRect(790,632,5,120);
	    g2.fillRect(792,580, 7,50);//
	    g2.setStroke(new BasicStroke(3));
	    g2.drawRect(695, 580, 105,50);
	    g2.drawRect(700, 632, 95, 120);
	    
	    BufferedImage imagen;
 		try {
 			imagen = ImageIO.read(new File("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/Captura_de_pantalla_8-3-2025_103628_enlinea2025-1.uabcs.mx-removebg-preview.png"));
 			g2.drawImage(imagen, 695, 480,100,100,null,null);
 		}catch (IOException e ) {
 			e.printStackTrace();
 		}
	    
	 // Lucky Blocks
	    g2.setColor(Color.BLACK);
	    g2.fillRoundRect(150, 410, 50, 50, 5, 5); 
	    g2.setStroke(new BasicStroke(6));
	    g2.drawRoundRect(140, 400, 50, 50, 5, 5);
	    g2.setColor(Color.decode("#ffb600"));
	    g2.fillRoundRect(140, 400, 50, 50, 5, 5);
	    g2.setColor(Color.decode("#e59400"));
	    g2.fillRect(140, 400, 50, 10);
	    g2.fillRect(140, 400, 10, 50);
	    g2.setColor(Color.BLACK);
	    g2.fillRoundRect(420, 430, 105, 50, 5, 5); 
	    g2.setStroke(new BasicStroke(6));
	    g2.drawRoundRect(410, 420, 105, 50, 5, 5);
	    g2.setColor(Color.WHITE);
	    g2.setFont(new Font("Arial", Font.BOLD, 30)); // Fuente y tamaño
	    g2.drawString("?", 155, 435);
	    g2.setColor(Color.decode("#ffb600"));
	    g2.fillRoundRect(410, 420, 105, 50, 5, 5);
	    g2.setColor(Color.decode("#e59400"));
	    g2.fillRect(410, 420, 105, 10);
	    g2.fillRect(410, 420, 10, 50);
	    g2.fillRect(460, 420, 10, 50);
	    int centrox = 410 + (105 / 2);
	    g2.setColor(Color.BLACK);
	    g2.drawLine(centrox, 420, centrox, 470);
	    g2.setColor(Color.BLACK);
	    g2.fillRoundRect(890, 490, 50, 50, 5, 5); 
	    g2.setStroke(new BasicStroke(6));
	    g2.drawRoundRect(880, 480, 50, 50, 5, 5);
	    g2.setColor(Color.decode("#ffb600"));
	    g2.fillRoundRect(880, 480, 50, 50, 5, 5);
	    g2.setColor(Color.decode("#e59400"));
	    g2.fillRect(880, 480, 50, 10);
	    g2.fillRect(880, 480, 10, 50);
	    
	    
    }*/
    
    public JPanel Calculadora() {

    	
    	JPanel calculadora =new JPanel();
    	setTitle("Calculadora");
        calculadora.setBounds(300, 170, 350, 460);
        calculadora.setLayout(null);
    	calculadora.setOpaque(true);
    	calculadora.setBorder(new LineBorder(Color.BLACK, 3, true));
    	calculadora.setBackground(new Color (105,105,105));
        

        // Inicializar display
        pantallaCal = new JTextField("0");
        pantallaCal.setBounds(20, 20, 300, 50);
        pantallaCal.setFont(new Font("Arial", Font.BOLD, 24));
        pantallaCal.setHorizontalAlignment(JTextField.RIGHT);
        pantallaCal.setEditable(false);
        pantallaCal.setVisible(true);
        pantallaCal.setBorder(new LineBorder(Color.BLACK, 3, true));
        

        // Panel de botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        panel.setBounds(20, 90, 300, 350);

        botones = new JButton[20];
        for (int i = 0; i < 20; i++) {
            botones[i] = new JButton(etiquetas[i]);
            botones[i].setFont(new Font("Arial", Font.BOLD, 18));
            botones[i].setFocusPainted(false);
            if (etiquetas[i].matches("[0-9]") || etiquetas[i].equals(".")) {
            	botones[i].setBackground(Color.LIGHT_GRAY);
                botones[i].setForeground(Color.BLUE);
            } else if (etiquetas[i].equals("C")) {
                botones[i].setBackground(Color.RED);
                botones[i].setForeground(Color.BLACK);
            } else {
                botones[i].setBackground(Color.ORANGE);
                botones[i].setForeground(Color.BLACK);
                
            }
            botones[i].setBorder(new LineBorder(Color.BLACK, 3, true));
            panel.add(botones[i]);
        }
        calculadora.add(pantallaCal);
        calculadora.add(panel);
        setVisible(true);
        return calculadora;
       
    }
    
    public JPanel Tabla() {
        JPanel tabla = new JPanel();
        tabla.setLayout(null);
        tabla.setSize(900, 700);
        tabla.setVisible(true);

        JLabel titulo = new JLabel("USUARIOS", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setOpaque(true);
        titulo.setBackground(Color.BLACK);
        titulo.setForeground(Color.WHITE);
        titulo.setBounds(300, 20, 300, 50);
        tabla.add(titulo);

        JPanel panelUsuarios = new JPanel();
        panelUsuarios.setLayout(null);
        panelUsuarios.setBounds(50, 100, 200, 100);
        panelUsuarios.setBackground(Color.BLACK);

        JLabel lblUsuarios = new JLabel("Total de usuarios", SwingConstants.CENTER);
        lblUsuarios.setForeground(Color.WHITE);
        lblUsuarios.setBounds(10, 10, 180, 30);
        lblUsuarios.setFont(new Font("Arial", Font.BOLD, 16));

        JLabel lblCantidad = new JLabel("100", SwingConstants.CENTER);
        lblCantidad.setForeground(Color.WHITE);
        lblCantidad.setFont(new Font("Arial", Font.BOLD, 24));
        lblCantidad.setBounds(10, 40, 180, 50);

        panelUsuarios.add(lblUsuarios);
        panelUsuarios.add(lblCantidad);
        tabla.add(panelUsuarios);

        String columnaUsuario[] = {"ID", "Nombre", "Correo electrónico", "Edad", "Estado"};
        String[][] datos = {
            {"1", "Juan Pérez", "juan.perez@example.com", "25", "Activo"},
            {"2", "María López", "maria.lopez@example.com", "30", "Inactivo"},
            {"3", "Carlos Gómez", "carlos.gomez@example.com", "28", "Activo"},
            {"4", "Ana Martínez", "ana.martinez@example.com", "35", "Activo"},
            {"5", "Pedro Ramírez", "pedro.ramirez@example.com", "40", "Inactivo"},
            {"6", "Laura Torres", "laura.torres@example.com", "22", "Activo"},
            {"7", "Diego Fernández", "diego.fernandez@example.com", "27", "Activo"},
            {"8", "Sofía Herrera", "sofia.herrera@example.com", "32", "Inactivo"},
            {"9", "Andrés Castillo", "andres.castillo@example.com", "29", "Activo"},
            {"10", "Gabriela Ríos", "gabriela.rios@example.com", "26", "Activo"}
        };

        JTable tablas = new JTable(datos, columnaUsuario);
        JScrollPane sp = new JScrollPane(tablas);
        sp.setBounds(50, 220, 800, 300);
        tabla.add(sp);

        JButton btnExportar = new JButton("Exportar");
        btnExportar.setBounds(600, 550, 100, 30);
        tabla.add(btnExportar);

        JButton btnAnadir = new JButton("Añadir");
        btnAnadir.setBounds(720, 550, 100, 30);
        tabla.add(btnAnadir);

        return tabla;
    }

	public JPanel login() {
			
			JPanel login=new JPanel();
			login.setBounds(170, 170, 500, 500);
	        login.setLayout(null);
	        login.setOpaque(true);
	        login.setBackground(new Color (255, 255, 153));
			login.setBorder(new LineBorder(Color.WHITE, 2, true)); // Color, Grosor, Esquinas redondeadas
	
		    
		    
		    ImageIcon iconoLogo = new ImageIcon("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/nike-logo-wallpaper1red.jpg");
	        JLabel lblLogo = new JLabel(iconoLogo);
	        lblLogo.setBounds(120, 20, 150, 94);
	        login.add(lblLogo);
	
	        // Iconos para usuario y contraseña
	        ImageIcon iconUser = new ImageIcon("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/user-icon.png");
	        ImageIcon iconPass = new ImageIcon("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/lock-icon.png");
	
	        // Campo usuario con icono
	        JLabel lblIconUser = new JLabel(iconUser);
	        lblIconUser.setBounds(50, 130, 30, 30);
	        login.add(lblIconUser);
	
	        JTextField txtUsuario = new JTextField();
	        txtUsuario.setBounds(90, 130, 250, 30);
	        txtUsuario.setFont(new Font("Arial", Font.PLAIN, 14));
	        login.add(txtUsuario);
	
	        // Campo contraseña con icono
	        JLabel lblIconPass = new JLabel(iconPass);
	        lblIconPass.setBounds(50, 180, 30, 30);
	        login.add(lblIconPass);
	
	        JPasswordField txtPassword = new JPasswordField();
	        txtPassword.setBounds(90, 180, 250, 30);
	        txtPassword.setFont(new Font("Arial", Font.PLAIN, 14));
	        login.add(txtPassword);
	
	        // Botón de ingresar estilizado
	        JButton btnIngresar = new JButton("Ingresar");
	        btnIngresar.setBounds(120, 240, 160, 40);
	        btnIngresar.setFont(new Font("Arial", Font.BOLD, 14));
	        btnIngresar.setForeground(Color.BLACK);
	        btnIngresar.setBorder(new LineBorder(Color.GRAY, 2, true));
	        btnIngresar.setFocusPainted(false);
	        btnIngresar.setBorder(new Redondeo (40));
	        login.add(btnIngresar);
	
	        return login;
			
		}

	public JPanel CalculadoraInteres() {

		JPanel p = new JPanel();
		
		JPanel calculadora =new JPanel();
		calculadora.setBounds(150, 170, 600, 500);
        calculadora.setLayout(new BorderLayout(50,50));
    	calculadora.setOpaque(true);
    	calculadora.setBorder(new LineBorder(Color.BLACK, 3, true));
    	
    	 JLabel lblcal = new JLabel("Calculando el Interés", SwingConstants.CENTER);
         lblcal.setFont(new Font("Arial", Font.BOLD, 18));
         lblcal.setForeground(Color.BLACK);
         calculadora.add(lblcal, BorderLayout.NORTH);

         //Panel superior
         JPanel interes = new JPanel(new GridBagLayout());
         interes.setBackground(new Color(144, 238, 144)); 
         interes.setBorder(new LineBorder(Color.BLACK, 2, true));
         
         //uso de grid layout para mayor facilidad de organizacion
         GridBagConstraints c = new GridBagConstraints();
         c.insets = new Insets(20, 1, 5, 1);
         c.fill = GridBagConstraints.HORIZONTAL;
         

         JLabel lblTitulo = new JLabel("Calcular Interés", SwingConstants.CENTER);
         lblTitulo.setFont(new Font("Arial", Font.BOLD, 14));
         c.gridx = 0; c.gridy = 0;
         interes.add(lblTitulo, c);

         JLabel lblCapital = new JLabel("Capital:", SwingConstants.CENTER);
         c.gridx = 0; c.gridy = 1;
         interes.add(lblCapital, c);
         
         JTextField txtCapital = new JTextField(20);
         c.gridx = 1;
         interes.add(txtCapital, c);
         
         JLabel lblTiempo = new JLabel("Tiempo:", SwingConstants.CENTER);
         c.gridx = 0; c.gridy = 2;
         interes.add(lblTiempo, c);
         
         JTextField txtTiempo = new JTextField(20);
         c.gridx = 1;
         interes.add(txtTiempo, c);
         
         JLabel lblTasaInt = new JLabel("Tasa Interés:", SwingConstants.CENTER);
         c.gridx = 0; c.gridy = 3;
         interes.add(lblTasaInt, c);
         
         JTextField txtTasaInt = new JTextField(20);
         c.gridx = 1;
         interes.add(txtTasaInt, c);

       
         //Panel Exclusivo para botones para facilitar su acomodo
         JPanel panelBotones = new JPanel(new FlowLayout());
         panelBotones.setBackground(new Color(144, 238, 144));

         JButton btnCalcular= new JButton("Calcular");
         //btnCalcular.addMouseListener(new Click());
         btnCalcular.setPreferredSize(new Dimension(150, 30));
         btnCalcular.setIcon(new ImageIcon("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/Calcular.jpeg"));
         panelBotones.add(btnCalcular);

         JButton btnCancelar = new JButton("Cancelar");
     	 btnCancelar.setPreferredSize(new Dimension(150, 30));
         btnCancelar.setIcon(new ImageIcon("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/Cancelar.jpeg"));
         panelBotones.add(btnCancelar);

         c.gridwidth = 2;
         c.gridx = 0; c.gridy = 4;
         interes.add(panelBotones, c);
         
         
      // Panel de resultados
         JPanel footer = new JPanel(new GridBagLayout());
         footer.setBackground(new Color(255, 160, 122)); // Rojo claro
         footer.setBorder(new LineBorder(Color.BLACK, 2, true));

         GridBagConstraints d = new GridBagConstraints();
         d.insets = new Insets(5, 10, 5, 10);
         d.fill = GridBagConstraints.HORIZONTAL;
         

         JLabel lblInteres = new JLabel("Interés:", SwingConstants.CENTER);
         
         d.gridx = 0; d.gridy = 0;
         footer.add(lblInteres, d);
         
         JTextField txtInteres = new JTextField(20);
         
         d.gridx = 1;
         footer.add(txtInteres, d);

         JLabel lblMonto = new JLabel("Monto:", SwingConstants.CENTER);
         
         d.gridx = 0; d.gridy = 1;
         footer.add(lblMonto, d);
         
         JTextField txtMonto = new JTextField(20);
         
         d.gridx = 1;
         footer.add(txtMonto, d);

         // Agregar paneles
         calculadora.add(interes, BorderLayout.CENTER);
         calculadora.add(footer, BorderLayout.SOUTH);
         
        

         return calculadora;
	}
     
	/*  class Click extends MouseAdapter{

		public void mouseClicked(MouseEvent event) {
			click++;
			txtMonto.setText(String.valueOf(click));
		}
		int click=0;
	}
	
	}*/

	/*public void paint (Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		
		// Fondo cielo
	    g2.setColor(Color.CYAN);
	    g2.fillRect(0, 0, getWidth(), getHeight());

	    // Pasto y tierra
	    g2.setColor(new Color(139, 69, 19)); 
	    g2.fillRect(0, getHeight() - 100, getWidth(), 100);
	    g2.setColor(new Color(34, 139, 34)); 
	    g2.fillRect(0, getHeight() - 130, getWidth(), 30);

	    // Cerco 
	    g2.setColor(new Color(130, 52, 5));
	    g2.setStroke(new BasicStroke(80));
	    g2.drawLine(120, 700, 900, 700);
	    g2.setColor(new Color(139, 69, 19)); 
	    for (int i = 0; i < 30; i += 3) {
	        int x = 80 + i * 30;  
	        int[] xc = {x, x + 26, x + 71};  
	        int[] yc = {605, 550, 605};  
	        g2.fillPolygon(xc, yc, 3);  
	        g2.fillRect(x, 605, 70, 150);  
	    }
	   

	    // Paredes de la casa
	    g2.setColor(Color.YELLOW);
	    g2.fillRect(150, 555, 300, 200);
	    
	    // Chimenea 
	    g2.setColor(Color.GRAY);
	    g2.fillRect(350, 470, 55, 80); 
	    g2.fillRect(360, 470, 30, 20); 
	    g2.setColor(Color.DARK_GRAY);
	    g2.fillRect(345, 450, 65, 20);
	    
	    // Techo 
	    g2.setColor(Color.RED);
	    int[] xt = {120, 300, 470};
	    int[] yt = {555, 470, 555};
	    g2.fillPolygon(xt, yt, 3);

	    // Ventana con divisiones en cruz
	    g2.setColor(Color.WHITE);
	    g2.fillRect(180, 620, 60, 60);
	    g2.setColor(Color.BLACK);
	    g2.setStroke(new BasicStroke(3));
	    g2.drawLine(210, 620, 210, 680);
	    g2.drawLine(180, 650, 240, 650);
	    g2.setColor(Color.GRAY);
	    g2.setStroke(new BasicStroke(2));
	    g2.drawRect(180, 620, 60, 60);
	    g2.setColor(Color.BLACK);
	    g2.setStroke(new BasicStroke(4));
	    g2.drawLine(180, 680, 242, 680);
	    

	    // Puerta 
	    g2.setColor(Color.BLACK);
	    g2.setStroke(new BasicStroke(3));
	    g2.drawRect(260, 634, 80, 121);
	    g2.setColor(new Color(139, 69, 19));
	    g2.fillRect(260, 635, 80, 120);
	    g2.setColor(Color.BLACK);
	    g2.fillOval(330, 689, 10, 10); 
	    
	 // Sol 
        g2.setColor(Color.YELLOW);
        g2.fillOval(50, 50, 100, 100); 
        g2.setColor(Color.BLACK);
        g2.fillOval(75, 75, 15, 15); 
        g2.fillOval(110, 75, 15, 15); 
        g2.drawArc(80, 90, 40, 30, 0, -180);
        g2.setColor(Color.YELLOW);
        g2.drawLine(100, 30, 100, 10);  
        g2.drawLine(100, 170, 100, 190); 
        g2.drawLine(30, 100, 10, 100);  
        g2.drawLine(170, 100, 190, 100);
        g2.drawLine(40, 40, 20, 20);  
        g2.drawLine(160, 40, 180, 20);  
        g2.drawLine(40, 160, 20, 180);  
        g2.drawLine(160, 160, 180, 180); 
        
        g2.setColor(Color.WHITE);

	     // Nubes
	     g2.fillOval(100, 100, 60, 40);
	     g2.fillOval(130, 90, 70, 50);
	     g2.fillOval(170, 100, 60, 40);
	     g2.fillOval(400, 80, 70, 50);
	     g2.fillOval(440, 70, 90, 60);
	     g2.fillOval(490, 80, 70, 50);
	     g2.fillOval(700, 120, 60, 40);
	     g2.fillOval(730, 110, 70, 50);
	     g2.fillOval(770, 120, 60, 40);


        // Árbol 
        int arbolX = 650;
        g2.setColor(new Color(139, 90, 19)); 
        g2.fillRect(arbolX, 550, 50, 210); // Tronco
        g2.setColor(Color.GRAY);
        g2.drawRect(arbolX, 550, 50, 210);
        g2.setColor(new Color(34, 139, 34)); 
        g2.fillOval(arbolX - 30, 460, 110, 100); // Copa del árbol
        g2.fillOval(arbolX - 30, 540, 110, 100);
        g2.fillOval(arbolX  - 1 , 500, 110, 100); //derecha
        g2.fillOval(arbolX - 80, 500, 110, 100);//izquierda

        BufferedImage imagen;
		try {
			imagen = ImageIO.read(new File("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/familia_transparente.png"));
			//imagen.setRGB(arbolX, arbolX, arbolX);
			g2.drawImage(imagen, 420,630,300,150,null);
		}catch (IOException e ) {
			e.printStackTrace();
		}
		
		
	}*/


	class FondoDegradado extends JPanel {
	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;
	        GradientPaint gp = new GradientPaint(0, 0, new Color(0, 102, 204), 0, getHeight(), new Color(0, 51, 102));
	        g2d.setPaint(gp);
	        g2d.fillRect(0, 0, getWidth(), getHeight());
	    }
	}
}


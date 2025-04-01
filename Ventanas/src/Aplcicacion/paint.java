package Aplcicacion;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.GridLayout;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class paint implements MouseListener, MouseMotionListener {
	
	JFrame frame;
	private JPanel panelContenido, panelHerramientas, panelLienzo;
    private JButton botonLimpiar;
    JMenuItem item1, item2, item3;
    private JButton botonRectangulo, botonCirculo, botonTriangulo, botonLinea, botonHerramientas;
    private JSlider deslizadorTamanio;
    private JComboBox<String> herramientas, formas;
    private Color colorSeleccionado = Color.BLACK;
    private int tamanioPincel = 5;
    private String herramienta = "Pincel";
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private PaintPanel panel_2;
    int tamaño;
    private ArrayList<Point> puntos = new ArrayList<Point>();
    
    List<List<Point>> listaDePuntos = new ArrayList<>();

    public static void main(String[] args) {
 		EventQueue.invokeLater(new Runnable() {
 			public void run() {
 				try {
 					paint window = new paint();
 					window.frame.setVisible(true);
 				} catch (Exception e) {
 					e.printStackTrace();
 				}
 			}
 		});
 	}
    

    public paint() {
    	initialize();
    }
    
    private void initialize() {
    	frame = new JFrame();
 		frame.setBounds(100, 100, 839, 567);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Aplicación de Dibujo");
        
        
        panelContenido = new JPanel();
        panelContenido.setBackground(new Color(128, 128, 128));
        panelContenido.setLayout(new BorderLayout());
        frame.setContentPane(panelContenido);
        
       /* JMenuBar barra = new JMenuBar(); 
        
        JMenu menu3 = new JMenu("Archivo");
        
        item1 = new JMenuItem("Guardar");  
        item2 = new JMenuItem("Abrir");  
        item3 = new JMenuItem("Compartir"); 
        
        menu3.add(item1);  
        menu3.add(item2);  
        menu3.add(item3);
        
        barra.add(menu3);
        frame.add(menu3);*/

        // Panel de herramientas (izquierda)
        panelHerramientas = new JPanel();
        panelHerramientas.setBackground(new Color(255, 255, 255));
        panelHerramientas.setPreferredSize(new Dimension(250,1000));
        panelHerramientas.setLayout(new GridLayout(10, 1, 5, 5));
        
     // Selector de herramientas con iconos
        String[] opcionesHerramienta = { "✏️ Lápiz", "🖌️ Pincel", "🪣 Lata de pintura", "🩹 Borrador" };
        botonHerramientas = new JButton("");
        herramientas = new JComboBox<>(opcionesHerramienta);
        panelHerramientas.add(herramientas);
        herramientas.addActionListener(e ->{
            String seleccion = (String) herramientas.getSelectedItem();
            
            if ("🩹 Borrador".equals(seleccion)) {
                colorSeleccionado = Color.WHITE; // Se cambia el color a blanco (borrador)
            
            }if ("🪣 Lata de pintura".equals(seleccion)) {
            	panel_2.setBackground(colorSeleccionado); // Cambia el color de fondo del lienzo
                panel_2.repaint(); // Repintar para aplicar cambios
            }
        });
            
        
        panelHerramientas.add(new JLabel("Tamaño de herramienta" ));
        deslizadorTamanio = new JSlider(1, 20, 5);
        deslizadorTamanio.setBorder(new LineBorder(new Color(119, 136, 153), 2));
        panelHerramientas.add(deslizadorTamanio);
        deslizadorTamanio.addChangeListener(e -> tamaño = deslizadorTamanio.getValue());
        


     // Selector de formas geométricas
        String[] opcionesForma = {"📐 Figuras", "⬛ Rectángulo", "⚪ Círculo", "🔺 Triángulo", "➖ Línea" };
        
        lblNewLabel = new JLabel("");
        panelHerramientas.add(lblNewLabel);
        formas = new JComboBox<>(opcionesForma);
        panelHerramientas.add(formas);

        // Colores
        JPanel coloresContenedor= new JPanel();
        coloresContenedor.setBorder(new LineBorder(new Color(112, 128, 144), 2));
        coloresContenedor.setLayout(new GridLayout(3,2,2,2));
        Color[] colores = {  Color.BLACK, Color.GRAY, Color.BLUE, Color.RED, Color.GREEN , Color.MAGENTA};
        ButtonGroup grupoColores = new ButtonGroup(); 
        
        for (Color color : colores) {
            JRadioButton botonColor = new JRadioButton();
            
            botonColor.setBackground(color);
            botonColor.setOpaque(true);
            botonColor.setBorderPainted(false);
        	botonColor.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                  colorSeleccionado = color; // Se actualiza el color seleccionado
              }
          });
	        grupoColores.add(botonColor);
	        coloresContenedor.add(botonColor);
	        }
        
        lblNewLabel_1 = new JLabel("");
        panelHerramientas.add(lblNewLabel_1);
        panelHerramientas.add(coloresContenedor);
        
        lblNewLabel_3 = new JLabel("");
        panelHerramientas.add(lblNewLabel_3);
        
        lblNewLabel_2 = new JLabel("");
        panelHerramientas.add(lblNewLabel_2);

        // Botón de limpiar
        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBackground(new Color(255, 0, 0));
        
        botonLimpiar.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
        		listaDePuntos.clear();
                panel_2.repaint(); 
        	
        	}
        });
        panelHerramientas.add(botonLimpiar);
        

        panelContenido.add(panelHerramientas, BorderLayout.WEST);

        // Panel de dibujo (centro)
        panelLienzo = new JPanel() ;
          
        panelLienzo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panelLienzo.setBackground(Color.WHITE);
        panelContenido.add(panelLienzo, BorderLayout.CENTER);
        
        panel_2 = new PaintPanel();
        panel_2.addMouseListener(this);
 		panel_2.addMouseMotionListener(this);
 		
 		panelContenido.add(panel_2, BorderLayout.CENTER);
 	}
 
 	@Override
 	public void mouseClicked(MouseEvent e) {
 		// TODO Auto-generated method stub
 		
 	}
 
 	@Override
 	public void mousePressed(MouseEvent e) {
 		// TODO Auto-generated method stub
 		
 	}
 
 	@Override
 	public void mouseReleased(MouseEvent e) {
 		
 		//crear una copia de los puntos
 		ArrayList ArrList2  = (ArrayList)puntos.clone();
 		
 		//se guarda en el historial de dibujos
 		listaDePuntos.add(ArrList2);
 		
 		//limpiamos el trazo actual
 		puntos.clear();
 		
 		
 	}
 
 	@Override
 	public void mouseEntered(MouseEvent e) { 
 		
 	}
 
 	@Override
 	public void mouseExited(MouseEvent e) { 
 		
 	}
 
 	@Override
 	public void mouseDragged(MouseEvent e) {
 		panel_2.repaint();
 		
 		puntos.add(e.getPoint());
 		
 	}
 
 	@Override
 	public void mouseMoved(MouseEvent e) { 
 		
 	}
 	
 	class PaintPanel extends JPanel{
 		
 		public PaintPanel()
 		{
 			this.setBackground(Color.white);
 		}
 		
 		@Override
 	   public void paintComponent(Graphics g) {
 	       super.paintComponent(g);
 	       
 	       Graphics2D g2 = (Graphics2D) g; 
 	       
 	       
 	       g2.setStroke(new BasicStroke(tamaño)); 
	       g2.setColor(colorSeleccionado);
 		   
 	       //dibujar la trayectoria de puntos 
 	       //solo cuando tengo más de 2 puntos
 	       if(puntos.size()>1) {
 	    	   
 	    	   for (int i = 1; i < puntos.size(); i++) {
 	    		   
 	    		   Point p1 = puntos.get(i-1);
 	    		   Point p2 = puntos.get(i);
 	    		   
 	    		   g2.drawLine(p1.x,p1.y,p2.x,p2.y);
 	    	   }
 	    	   
 	       }
 	       
 	       for (Iterator iterator = listaDePuntos.iterator(); iterator.hasNext();) {
 			List<Point> trazo = (List<Point>) iterator.next();
 			
 				
 				if(trazo.size()>1) {
 		    	   
 		    	   for (int i = 1; i < trazo.size(); i++) {
 		    		   
 		    		   Point p1 = trazo.get(i-1);
 		    		   Point p2 = trazo.get(i);
 		    		   
 		    		   g2.drawLine(p1.x,p1.y,p2.x,p2.y);
 		    	   }
 		    	   
 		       }
 			
 	       }
 	   }
    }
}

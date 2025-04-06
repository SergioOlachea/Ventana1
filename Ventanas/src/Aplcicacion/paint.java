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
    private JButton botonHerramienta,botonRectangulo, botonCirculo, botonTriangulo, botonLinea, botonHerramientas;
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

    int X, Y;
    private ArrayList<Point> puntos = new ArrayList<Point>();
    List<List<Point>> listaDePuntos = new ArrayList<>();
    
    private ArrayList<point> puntosNuevos = new ArrayList<>();
    private ArrayList<ArrayList<point>> listaDePuntosNuevos = new ArrayList<>();

    int tipoFig = 2; // 2 = rectángulo, 3 = círculo, 4 = línea
    boolean Click = false;
    Point puntoInicio, puntoFinal;
    int elemento=1;

    List<figura> listaFiguras = new ArrayList<>();
    
    private List<JRadioButton> botonesDeColor = new ArrayList<>();
    
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
            if ("✏️ Lápiz".equals(seleccion) || "🖌️ Pincel".equals(seleccion)) {
                elemento = 1;
            }
            if ("🩹 Borrador".equals(seleccion)) {
            	elemento = 6; 
                colorSeleccionado = Color.WHITE;
                for (JRadioButton boton : botonesDeColor) {
                    boton.setSelected(false);
                }
            }if ("🪣 Lata de pintura".equals(seleccion)) {
            	panel_2.setBackground(colorSeleccionado); 
                panel_2.repaint(); 
            }
        });
            
        
        panelHerramientas.add(new JLabel("Tamaño de herramienta" ));
        deslizadorTamanio = new JSlider(1, 20, 5);
        deslizadorTamanio.setBorder(new LineBorder(new Color(119, 136, 153), 2));
        panelHerramientas.add(deslizadorTamanio);
        deslizadorTamanio.addChangeListener(e -> tamanioPincel  = deslizadorTamanio.getValue());
        

        // Selector De Figuras
        String[] opcionesForma = {"📐 Figuras", "⬛ Rectángulo", "⚪ Círculo", "🔺 Triángulo", "➖ Línea" };
        
        botonHerramienta = new JButton("");
        panelHerramientas.add(botonHerramienta);
        formas = new JComboBox<>(opcionesForma);
        panelHerramientas.add(formas);
        formas.addActionListener(e ->{
        	String seleccion = (String) formas.getSelectedItem();
        
        	 if ("⬛ Rectángulo".equals(seleccion)) {
        		 elemento = 2;
        	        tipoFig = 2;
        	    } else if ("⚪ Círculo".equals(seleccion)) {
        	    	elemento = 3;
        	        tipoFig = 3;
        	    } else if ("➖ Línea".equals(seleccion)) {
        	    	elemento = 4;
        	        tipoFig = 4;
        	    } else if ("🔺 Triángulo".equals(seleccion)) {
        	    	elemento = 5;
        	        tipoFig = 5;
        	    }
        });

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
                if (e.getStateChange() == ItemEvent.SELECTED && elemento != 6) { // Solo si no es borrador
                    colorSeleccionado = color;
                }
            });

            grupoColores.add(botonColor);
            coloresContenedor.add(botonColor);
            botonesDeColor.add(botonColor); // Guardamos el botón
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
        
        botonLimpiar.addActionListener(e->{
        	listaDePuntos.clear();
        	listaDePuntosNuevos.clear();
        	listaFiguras.clear(); 
            puntosNuevos.clear();
            panel_2.repaint();    
        });
        panelHerramientas.add(botonLimpiar);
        

        panelContenido.add(panelHerramientas, BorderLayout.WEST);

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
        if (elemento == 2 || elemento == 3) { 
            listaFiguras.add(new figura(e.getX(), e.getY(), 50, 50, colorSeleccionado, tipoFig, tamanioPincel));
            panel_2.repaint();
        } else if (elemento == 4) { 
            if (!Click) {
                puntoInicio = e.getPoint();
                Click = true;
            } else {
                puntoFinal = e.getPoint();
                listaFiguras.add(new figura(puntoInicio.x, puntoInicio.y, puntoFinal.x, puntoFinal.y, colorSeleccionado, tipoFig, tamanioPincel)); 
                panel_2.repaint();
                Click = false;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {
        ArrayList<point> puntosTemp = new ArrayList<>(puntosNuevos);
        listaDePuntosNuevos.add(puntosTemp);
        puntosNuevos.clear();  
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        if (elemento == 1) {
            X = e.getX();
            Y = e.getY();
            
            puntosNuevos.add(new point(X, Y, colorSeleccionado, tamanioPincel));
            panel_2.repaint();
        }if (elemento == 6) {
            Iterator<figura> it = listaFiguras.iterator();
            while (it.hasNext()) {
                figura f = it.next();
                if (f.contiene(e.getPoint())) {
                    it.remove();
                }
            }
            panel_2.repaint();
        }if (elemento == 6) {
            colorSeleccionado = Color.WHITE;  
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        panel_2.repaint();
    }

    class PaintPanel extends JPanel {
        public PaintPanel() {
            this.setBackground(Color.white);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g;

            
            if (puntosNuevos.size() > 1) {
                for (int i = 1; i < puntosNuevos.size(); i++) {
                    point p1 = puntosNuevos.get(i - 1);
                    point p2 = puntosNuevos.get(i);
                    p1.nuevoTrazo(p1.getX(), p1.getY(), p2.getX(), p2.getY(), g2);
                }
            }

            for (List<point> trazo : listaDePuntosNuevos) {  
                if (trazo.size() > 1) {
                    for (int i = 1; i < trazo.size(); i++) {
                        point p1 = trazo.get(i - 1);
                        point p2 = trazo.get(i);
                        p1.nuevoTrazo(p1.getX(), p1.getY(), p2.getX(), p2.getY(), g2);
                    }
                }
            }

           
            for (figura f : listaFiguras) {  
                g2.setColor(f.color);
                g2.setStroke(new BasicStroke(f.grosor)); 
                switch (f.tipo) {
                    case 2:  // Rectángulo
                        g2.drawRect(f.x, f.y, f.ancho, f.alto);
                        break;
                    case 3:  // Círculo
                        g2.drawOval(f.x, f.y, f.ancho, f.alto);
                        break;
                    case 4:  // Línea
                        g2.drawLine(f.x, f.y, f.ancho, f.alto);
                        break;
                    case 5: // Triángulo
                        int[] xPoints = {f.x, f.x + f.ancho / 2, f.x - f.ancho / 2};
                        int[] yPoints = {f.y, f.y + f.alto, f.y + f.alto};
                        g2.drawPolygon(xPoints, yPoints, 3);
                        break;
                }
            }
            
            g2.setStroke(new BasicStroke(tamaño));
            g2.setColor(colorSeleccionado);

            if (puntos.size() > 1) {
                for (int i = 1; i < puntos.size(); i++) {
                    Point p1 = puntos.get(i - 1);
                    Point p2 = puntos.get(i);
                    g2.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }
        }
    }
    }

class point {
    private int x, y;
    private Color color;
    private int grosor;

    public point(int x, int y, Color color, int grosor) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.grosor = grosor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public int getGrosor() {
        return grosor;
    }

    public void nuevoTrazo(int p1X, int p1Y, int p2X, int p2Y, Graphics2D g2) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(grosor));
        g2.drawLine(p1X, p1Y, p2X, p2Y);
    }
}
 	
class figura {
    int x, y, ancho, alto;
    Color color;
    int grosor;
    int tipo;  // Tipo de figura: 2 para rectángulo, 3 para círculo, 4 para línea

    public figura(int x, int y, int ancho, int alto, Color color, int tipo, int grosor) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.tipo = tipo;
        this.grosor = grosor;
    }
    public boolean contiene(Point p) {
        switch (tipo) {
            case 2: // Rectángulo
                return new java.awt.Rectangle(x, y, ancho, alto).contains(p);
            case 3: // Círculo
                return new java.awt.geom.Ellipse2D.Float(x, y, ancho, alto).contains(p);
            case 4: // Línea
                return new java.awt.geom.Line2D.Float(x, y, ancho, alto).ptSegDist(p) <= grosor;
            case 5: // Triángulo
                int[] xPoints = {x, x + ancho / 2, x - ancho / 2};
                int[] yPoints = {y, y + alto, y + alto};
                return new java.awt.Polygon(xPoints, yPoints, 3).contains(p);
        }
        return false;
    }
}
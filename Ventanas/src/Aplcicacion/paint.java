package Aplcicacion;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class paint extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel panelContenido, panelHerramientas, panelLienzo;
    private JButton botonLimpiar;
    JMenuItem item1, item2, item3;
    private JButton botonRectangulo, botonCirculo, botonTriangulo, botonLinea;
    private JSlider deslizadorTamanio;
    private JComboBox<String> herramientas, formas;
    private Color colorSeleccionado = Color.BLACK;
    private int tamanioPincel = 5;
    private String herramienta = "Pincel";
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	paint frame = new paint();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public paint() {
        setTitle("Aplicación de Dibujo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 935, 542);
        
        
        panelContenido = new JPanel();
        panelContenido.setBackground(new Color(128, 128, 128));
        panelContenido.setLayout(new BorderLayout());
        setContentPane(panelContenido);
        
        JMenuBar barra = new JMenuBar(); 
        
        JMenu menu3 = new JMenu("Archivo");
        
        item1 = new JMenuItem("Guardar");  
        item2 = new JMenuItem("Abrir");  
        item3 = new JMenuItem("Compartir"); 
        
        menu3.add(item1);  
        menu3.add(item2);  
        menu3.add(item3);
        
        barra.add(menu3);
        this.setJMenuBar(barra);

        // Panel de herramientas (izquierda)
        panelHerramientas = new JPanel();
        panelHerramientas.setBackground(new Color(255, 255, 255));
        panelHerramientas.setPreferredSize(new Dimension(250, getHeight()));
        panelHerramientas.setLayout(new GridLayout(10, 1, 5, 5));
        
        // Selector de herramientas con iconos
        String[] opcionesHerramienta = { "✏️ Lápiz", "🖌️ Pincel", "🪣 Lata de pintura", "🩹 Borrador" };
        lblNewLabel_1 = new JLabel("");
        herramientas = new JComboBox<>(opcionesHerramienta);
        panelHerramientas.add(herramientas);
        
        panelHerramientas.add(new JLabel("Tamaño de herramienta" ));
        deslizadorTamanio = new JSlider(1, 20, 5);
        deslizadorTamanio.setBorder(new LineBorder(new Color(119, 136, 153), 2));
        panelHerramientas.add(deslizadorTamanio);

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
        Color[] colores = { Color.WHITE, Color.BLACK, Color.GRAY, Color.BLUE, Color.RED, Color.GREEN };
        for (Color color : colores) {
            JRadioButton botonColor = new JRadioButton();
            botonColor.setBackground(color);
            botonColor.setOpaque(true);
            botonColor.setBorderPainted(false);
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
        panelHerramientas.add(botonLimpiar);

        panelContenido.add(panelHerramientas, BorderLayout.WEST);

        // Panel de dibujo (centro)
        panelLienzo = new JPanel() ;
          
        panelLienzo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panelLienzo.setBackground(Color.WHITE);
        panelContenido.add(panelLienzo, BorderLayout.CENTER);
    }
}

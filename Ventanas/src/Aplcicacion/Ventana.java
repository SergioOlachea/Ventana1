package Aplcicacion;
import javax.swing.*;
import java.awt.*;
import java.io.File;

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
		this.add(Calculadora());
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
        this.add(this.CalculadoraInteres());
        

        // Agregamos los componentes al layeredPane
        layeredPane.add(fondo, JLayeredPane.DEFAULT_LAYER);
        //layeredPane.add(Calculadora(), JLayeredPane.PALETTE_LAYER);
        layeredPane.add(CalculadoraInteres(), JLayeredPane.PALETTE_LAYER);
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

         JButton btnCalcular = new JButton("Calcular");
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
}


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


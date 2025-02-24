import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame {
    private JTextField pantallaCal;
    private JButton[] botones;
    private String[] etiquetas = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
    };

    public Ventana() {
    	this.setTitle(getTitle());
		this.setVisible(true);
		this.setSize(1000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(this.login());
		//this.add(this.ventanaRegistro());
		//this.add(this.Calculadora());
		//this.add(this.Tabla());
		this.repaint();
    }
    public JPanel Calculadora() {

    	JPanel calculadora =new JPanel();
        setTitle("Calculadora");
        setSize(350, 500);
        setLayout(null);
        setLocationRelativeTo(null);

        // Inicializar display
        pantallaCal = new JTextField("0");
        pantallaCal.setBounds(20, 20, 300, 50);
        pantallaCal.setFont(new Font("Arial", Font.BOLD, 24));
        pantallaCal.setHorizontalAlignment(JTextField.RIGHT);
        pantallaCal.setEditable(false);
        add(pantallaCal);

        // Panel de botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        panel.setBounds(20, 90, 300, 350);

        botones = new JButton[16];
        for (int i = 0; i < 16; i++) {
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
            panel.add(botones[i]);
        }
        panel.add(calculadora);

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
		login.setSize(450, 225);
		login.setLocation(150, 150);
		login.setBackground(new Color( 255, 255, 204));
		login.setVisible(true);
		login.setLayout(null);
		login.setOpaque(true);
		Border borde = new LineBorder(Color.DARK_GRAY, 2, true); // Color, Grosor, Esquinas redondeadas
	    login.setBorder(borde);
	    
	    
	    ImageIcon icono = new ImageIcon("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/nike-logo-wallpaper1red.jpg");
	    JLabel lblImagen = new JLabel(icono);
	    lblImagen.setOpaque(true); // Habilita la opacidad para que el color de fondo sea visible
	    lblImagen.setBackground(new Color(50, 50, 50));	    
	    lblImagen.setBounds(20, 20, 150, 150); // Posicionar la imagen a la izquierda
	
	    login.add(lblImagen);

	   
	    int formX = 180;
        

	    Font fuente = new Font("Arial", Font.BOLD + Font.ITALIC, 15);

		JLabel lbletiqueta1= new JLabel("REGISTRO");
		lbletiqueta1.setSize(100,15);
		lbletiqueta1.setLocation(formX + 30, 20);
		lbletiqueta1.setBackground(Color.DARK_GRAY);
		lbletiqueta1.setFont(fuente);
		lbletiqueta1.setOpaque(false);
		lbletiqueta1.setHorizontalAlignment(SwingConstants.CENTER);;

		int centerLabelX = (login.getWidth() - lbletiqueta1.getWidth()) / 2;
	    lbletiqueta1.setLocation(centerLabelX, 20); // Y fija, X centrada
	    login.add(lbletiqueta1);
		
		JLabel lblcorreo= new JLabel("E-mail");
		lblcorreo.setSize(100,20);
		lblcorreo.setLocation(formX, 60);
		lblcorreo.setBackground(Color.DARK_GRAY);
		lblcorreo.setOpaque(false);
		login.add(lblcorreo);
		
		JTextField txtcorreot = new JTextField();
		txtcorreot.setSize(150,25);
		txtcorreot.setLocation(formX + 70, 60);
		txtcorreot.setBackground(Color.WHITE);
		txtcorreot.setForeground(Color.BLACK);
		txtcorreot.setOpaque(true);
		login.add(txtcorreot);
		
		JLabel lblcontraseña= new JLabel("Contraseña");
		lblcontraseña.setSize(100,20);
		lblcontraseña.setLocation(formX, 100);
		lblcontraseña.setBackground(Color.DARK_GRAY);
		lblcontraseña.setOpaque(false);
		login.add(lblcontraseña);
		
		JPasswordField contra = new JPasswordField();
		contra.setSize(150,25);
		contra.setLocation(formX + 70, 100);
		contra.setBackground(Color.WHITE);
		contra.setForeground(Color.BLACK);
		contra.setOpaque(true);
		login.add(contra);
		
		JButton btnIngresar= new JButton ("Ingresar");
		btnIngresar.setSize(150,40);
		btnIngresar.setLocation(formX + 35, 150);
		btnIngresar.setBackground(new Color(173, 216, 230));
		btnIngresar.setForeground(Color.BLACK);
		btnIngresar.setOpaque(true);
		Border bordebtn = new LineBorder(Color.DARK_GRAY, 4, true); // Color, Grosor, Esquinas redondeadas
	    btnIngresar.setBorder(bordebtn);
	    
		login.add(btnIngresar);
		return login;
	}
}

import javax.swing.*;
import java.awt.*;

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
		//this.add(this.login());
		//this.add(this.ventanaRegistro());
		//this.add(this.Calculadora());
		this.add(this.Tabla());
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

}

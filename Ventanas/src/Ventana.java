import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.*;

public class Ventana  extends JFrame{
	private JTextField txtUsuario;
    private JTextArea txtBio;
    private JCheckBox chkDulces, chkSalado, chkSaludable;
    private JRadioButton rdbAceptar, rdbNoAceptar;
    private JButton btnCrear;
    private ButtonGroup grupoTerminos;
    
	public Ventana (String title){
		
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(1000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.add(this.login());
		this.add(this.ventanaRegistro());
	
		this.repaint();
	}
	
	public JPanel ventanaRegistro() {
		JPanel registro=new JPanel();
		configrarPanel(registro);
		 registro.add(etiquetaTitulo());
	        registro.add(etiquetaUsuario());
	        registro.add(textoUsuario());
	        registro.add(etiquetaBio());
	        registro.add(textoBio());
	        registro.add(etiquetaPreferencias());
	        registro.add(checkDulces());
	        registro.add(checkSalado());
	        registro.add(checkSaludable());
	        registro.add(etiquetaTerminos());
	        registro.add(terminos());
	        registro.add(noterminos());
	        registro.add(comboUbicacion());
	        registro.add(botonCrearCuenta());
	        grupoTerminos = new ButtonGroup();
	        grupoTerminos.add(rdbAceptar);
	        grupoTerminos.add(rdbNoAceptar);
		return registro;
	}
	
    public void configrarPanel(JPanel panel) {
    	panel.setSize(500, 550);
    	panel.setLocation(150, 150);
    	panel.setBackground(new Color( 255, 255, 204));
    	panel.setVisible(true);
    	panel.setLayout(null);
		panel.setOpaque(true);
		Border borde = new LineBorder(Color.DARK_GRAY, 2, true); // Color, Grosor, Esquinas redondeadas
		panel.setBorder(borde);
    	
    }
    
    public JLabel etiquetaTitulo() {
	    Font fuente = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
		JLabel lblTitulo= new JLabel("REGISTRO");
		lblTitulo.setSize(100,15);
		lblTitulo.setBackground(Color.DARK_GRAY);
		lblTitulo.setFont(fuente);
		lblTitulo.setOpaque(false);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);;
		int centerLabelX = (500 - lblTitulo.getWidth()) / 2;
		//int centerLabelY = (550 - lblTitulo.getWidth()) / 2;
		lblTitulo.setLocation(centerLabelX, 10); // Y fija, X centrada
	    return lblTitulo;
    }
	    
	public JLabel etiquetaUsuario() {
		JLabel lblUsuario= new JLabel("NOMBRE DE USUARIO");
		lblUsuario.setBounds(50, 50, 200, 30);
		lblUsuario.setBackground(Color.DARK_GRAY);
		lblUsuario.setOpaque(false);
		return lblUsuario;
	}
		
	public JTextField textoUsuario() {
		JTextField txtUsuario = new JTextField();
		txtUsuario.setBounds(50, 80, 400, 30);
		txtUsuario.setBackground(Color.WHITE);
		txtUsuario.setForeground(Color.BLACK);
		Border borde = new LineBorder(Color.DARK_GRAY, 2, true); // Color, Grosor, Esquinas redondeadas
		txtUsuario.setBorder(borde);
		txtUsuario.setOpaque(true);
		return txtUsuario;
	}
		
	public JLabel etiquetaBio() {
		JLabel lblBio= new JLabel("BIO");
		lblBio.setSize(100,20);
		 lblBio.setBounds(50, 120, 200, 30);
		Border borde = new LineBorder(Color.DARK_GRAY, 2, true);
		lblBio.setBackground(Color.DARK_GRAY);
		lblBio.setOpaque(false);
		return lblBio;
	}
		
	public JTextField textoBio() {
		JTextField txtBio = new JTextField();
		txtBio.setSize(150,20);
		 txtBio.setBounds(50, 150, 400, 50);
		 txtBio.setBackground(Color.WHITE);
		txtBio.setForeground(Color.BLACK);
		Border borde = new LineBorder(Color.DARK_GRAY, 2, true); // Color, Grosor, Esquinas redondeadas
		txtBio.setBorder(borde);
		txtBio.setOpaque(true);
		return txtBio;
	}
	
	public JLabel etiquetaPreferencias() {
		JLabel lblPref= new JLabel("PREFERENCIAS");
		lblPref.setSize(100,20);
		lblPref.setBounds(50, 210, 200, 30);
		lblPref.setBackground(Color.DARK_GRAY);
		Border borde = new LineBorder(Color.DARK_GRAY, 2, true);
		lblPref.setVisible(true);
		lblPref.setOpaque(false);
		return lblPref;
	}
	
	public JCheckBox checkDulces() {
        JCheckBox chkDulces = new JCheckBox("Dulces");
        chkDulces.setBounds(50, 240, 100, 30);
        return chkDulces;
    }

    public JCheckBox checkSalado() {
        JCheckBox chkSalado = new JCheckBox("Salado");
        chkSalado.setBounds(150, 240, 100, 30);
        return chkSalado;
    }

    public JCheckBox checkSaludable() {
        JCheckBox chkSaludable = new JCheckBox("Saludable");
        chkSaludable.setBounds(250, 240, 100, 30);
        return chkSaludable;
    }
    
    public JLabel etiquetaTerminos() {
        JLabel lblTerminos = new JLabel("TÉRMINOS");
        lblTerminos.setBounds(50, 280, 200, 30);
        return lblTerminos;
    }

	public JRadioButton terminos() {
		JRadioButton rdbterminos = new JRadioButton("Acepto Terminos y Condiciones");
		rdbterminos.setBounds(50, 310, 200, 30);
		rdbterminos.setBackground(Color.GRAY);
		Border borde = new LineBorder(Color.DARK_GRAY, 2, true);
		rdbterminos.setVisible(true);
		rdbterminos.setOpaque(true);
		return rdbterminos;
	}
	
	public JRadioButton noterminos() {
		JRadioButton rdbnoTerminos = new JRadioButton("No Acepto Terminos y Condiciones");
        rdbnoTerminos.setBounds(250, 310, 200, 30);
        rdbnoTerminos.setBackground(Color.GRAY);
		Border borde = new LineBorder(Color.DARK_GRAY, 2, true);
		rdbnoTerminos.setVisible(true);
		rdbnoTerminos.setOpaque(true);
		return rdbnoTerminos;
	}
	 public JComboBox<String> comboUbicacion() {
	        String[] opciones = {" ","Centro", "Camino Real", "Centenario", "Indeco", "Pedregal"};
	        JComboBox<String> cmbUbicacion = new JComboBox<>(opciones);
	        cmbUbicacion.setBounds(50, 350, 200, 30);
	        return cmbUbicacion;
	    }

	public JButton botonCrearCuenta() {
		JButton btnCrear= new JButton ("Crear Cuenta");
		btnCrear.setBounds(150, 400, 200, 40);
	    return btnCrear;
	}

	
	
	


}

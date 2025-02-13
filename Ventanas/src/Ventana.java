import java.awt.Color;
import java.awt.Font;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import javax.swing.*;
public class Ventana  extends JFrame{
	public Ventana (String title){
		
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(this.login());
		this.repaint();
		
	}
	public JPanel login() {
		
		JPanel login=new JPanel();
		login.setSize(300, 225);
		login.setLocation(150, 150);
		login.setBackground(new Color( 255, 255, 204));
		login.setVisible(true);
		login.setLayout(null);
		login.setOpaque(true);
		Border borde = new LineBorder(Color.DARK_GRAY, 2, true); // Color, Grosor, Esquinas redondeadas
	    login.setBorder(borde);
		
	    Font fuente = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
		
		JLabel lbletiqueta1= new JLabel("REGISTRO");
		lbletiqueta1.setSize(100,15);
		lbletiqueta1.setBackground(Color.DARK_GRAY);
		lbletiqueta1.setFont(fuente);
		lbletiqueta1.setOpaque(false);
		lbletiqueta1.setHorizontalAlignment(SwingConstants.CENTER);;

		int centerLabelX = (login.getWidth() - lbletiqueta1.getWidth()) / 2;
	    lbletiqueta1.setLocation(centerLabelX, 20); // Y fija, X centrada
	    login.add(lbletiqueta1);
		
		JLabel lblcorreo= new JLabel("E-mail");
		lblcorreo.setSize(100,20);
		lblcorreo.setLocation(10,60);
		lblcorreo.setBackground(Color.DARK_GRAY);
		lblcorreo.setOpaque(false);
		login.add(lblcorreo);
		
		JTextField txtcorreot = new JTextField();
		txtcorreot.setSize(150,25);
		txtcorreot.setLocation(80,60);
		txtcorreot.setBackground(Color.WHITE);
		txtcorreot.setForeground(Color.BLACK);
		txtcorreot.setOpaque(true);
		login.add(txtcorreot);
		
		JLabel lblcontraseña= new JLabel("Contraseña");
		lblcontraseña.setSize(100,20);
		lblcontraseña.setLocation(10,100);
		lblcontraseña.setBackground(Color.DARK_GRAY);
		lblcontraseña.setOpaque(false);
		login.add(lblcontraseña);
		
		JPasswordField contra = new JPasswordField();
		contra.setSize(150,25);
		contra.setLocation(80,100);
		contra.setBackground(Color.WHITE);
		contra.setForeground(Color.BLACK);
		contra.setOpaque(true);
		login.add(contra);
		
		JButton btnIngresar= new JButton ("Ingresar");
		btnIngresar.setSize(150,40);
		btnIngresar.setLocation(75,150);
		btnIngresar.setBackground(new Color(173, 216, 230));
		btnIngresar.setForeground(Color.BLACK);
		btnIngresar.setOpaque(true);
		Border bordebtn = new LineBorder(Color.DARK_GRAY, 4, true); // Color, Grosor, Esquinas redondeadas
	    btnIngresar.setBorder(bordebtn);
	    
		login.add(btnIngresar);
		return login;
	}


}

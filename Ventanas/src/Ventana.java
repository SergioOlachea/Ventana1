import java.awt.Color;

import javax.swing.*;
public class Ventana  extends JFrame{
	public Ventana (String title){
		this.setTitle(title);
		this.setVisible(true);
		
		this.setSize(600,600);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocationRelativeTo(null);
		JLabel etiqueta1= new JLabel("Bienvenido");
		etiqueta1.setSize(150,150);
		etiqueta1.setLocation();
		etiqueta1.setBackground(Color.DARK_GRAY);
		
		this.add(etiqueta1);
		
	}

}

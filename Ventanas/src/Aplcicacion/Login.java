package Aplcicacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Aplcicacion.Ventana.FondoDegradado;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JOptionPane Bienvenida;
	private JOptionPane DatosIncorrectos;
	JMenuItem item1, item2, item3, item4, item5, item6, item7, item8, item9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
    	this.setTitle(getTitle());
		this.setSize(1000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		getContentPane().add(this.Loginpanel());
		//getContentPane().add(this.Registro());
       
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
         item6 = new JMenuItem("Registro");  
         item7 = new JMenuItem("Login");  
        
         // Añadir elementos al menú
         menu.add(item1);  
         menu.add(item2);  
         menu.add(item3);
         
         menu2.add(item5);  
         menu2.add(item6);  
         menu2.add(item7);
         
         

         barra.add(menu);
         barra.add(menu2);
         this.setJMenuBar(barra);
         this.repaint();
         this.revalidate();

	}
		
 	   
 	   public JPanel Registro() {
 		   JPanel registro=new JPanel();
			registro.setSize(500, 550);
			registro.setLocation(362, 10);
			//contentPane.add(registro);
			registro.setBackground(new Color(255, 255, 153));
		   	registro.setVisible(true);
		   	registro.setLayout(null);
		   	registro.setOpaque(true);
				
			Font fuente1 = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
			JLabel lblTitulo= new JLabel("REGISTRO");
			lblTitulo.setSize(100,15);
			lblTitulo.setBackground(Color.DARK_GRAY);
			lblTitulo.setFont(fuente1);
			lblTitulo.setOpaque(false);
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);;
			int centerLabelX1 = (500 - lblTitulo.getWidth()) / 2;
			//int centerLabelY = (550 - lblTitulo.getWidth()) / 2;
			lblTitulo.setLocation(centerLabelX1, 10); // Y fija, X centrada
			
			JLabel lblUsuario= new JLabel("NOMBRE DE USUARIO");
			lblUsuario.setBounds(50, 50, 200, 30);
			lblUsuario.setBackground(Color.DARK_GRAY);
			lblUsuario.setOpaque(false);
			
			JTextField txtUsuario = new JTextField();
			txtUsuario.setBounds(50, 80, 400, 30);
			txtUsuario.setBackground(Color.WHITE);
			txtUsuario.setForeground(Color.BLACK);
			txtUsuario.setOpaque(true);
			
			JLabel lblBio= new JLabel("BIO");
			lblBio.setSize(100,20);
			lblBio.setBounds(50, 120, 200, 30);
			lblBio.setOpaque(false);
			
			JTextField txtBio = new JTextField();
			txtBio.setSize(150,20);
			 txtBio.setBounds(50, 150, 400, 50);
			 txtBio.setBackground(Color.WHITE);
			txtBio.setForeground(Color.BLACK);
			txtBio.setOpaque(true);
			
			JLabel lblPref= new JLabel("PREFERENCIAS");
			lblPref.setSize(100,20);
			lblPref.setBounds(50, 210, 200, 30);
			lblPref.setBackground(Color.DARK_GRAY);
			lblPref.setOpaque(false);
			
			 JCheckBox chkDulces = new JCheckBox("Dulces");
	       chkDulces.setBounds(50, 240, 100, 30);
	       
	       JCheckBox chkSalado = new JCheckBox("Salado");
	       chkSalado.setBounds(150, 240, 100, 30);
	       
	       JCheckBox chkSaludable = new JCheckBox("Saludable");
	       chkSaludable.setBounds(250, 240, 100, 30);
	       
	       JLabel lblTerminos = new JLabel("TÉRMINOS");
	       lblTerminos.setBounds(50, 280, 200, 30);
	       
	      JRadioButton rdbterminos = new JRadioButton("Acepto Terminos y Condiciones");
			rdbterminos.setBounds(50, 310, 200, 30);
			//rdbterminos.setBackground(Color.GRAY);
			Border borde4 = new LineBorder(Color.DARK_GRAY, 2, true);
			rdbterminos.setVisible(true);
			rdbterminos.setOpaque(true);
			
			JRadioButton rdbnoTerminos = new JRadioButton("No Acepto Terminos y Condiciones");
	      rdbnoTerminos.setBounds(251, 310, 200, 30);
	      //rdbnoTerminos.setBackground(Color.);
			Border borde5 = new LineBorder(Color.DARK_GRAY, 2, true);
			rdbnoTerminos.setVisible(true);
			rdbnoTerminos.setOpaque(true);
			
			 String[] opciones = {" ","Centro", "Camino Real", "Centenario", "Indeco", "Pedregal"};
	      JComboBox<String> cmbUbicacion = new JComboBox<>(opciones);
	      cmbUbicacion.setBounds(50, 350, 200, 30);
	      
	      JButton btnCrear= new JButton ("Crear Cuenta");
			btnCrear.setBounds(150, 400, 200, 40);
			
			btnCrear.addActionListener(new ActionListener() {
	
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (txtUsuario.getText().equals("")) {
						txtUsuario.setBorder(BorderFactory.createLineBorder(Color.RED,5));
					}else {
						txtUsuario.setBorder(BorderFactory.createLineBorder(Color.GREEN,5));
					}
					if (txtBio.getText().equals("")) {
						txtBio.setBorder(BorderFactory.createLineBorder(Color.RED,5));
					}else {
						txtBio.setBorder(BorderFactory.createLineBorder(Color.GREEN,5));
					}
					if (!rdbnoTerminos.isSelected()&&!rdbterminos.isSelected()) {
						rdbnoTerminos.setForeground(Color.RED);
						rdbterminos.setForeground(Color.RED);
						System.out.println("m");
					}else if (!rdbnoTerminos.isSelected()){
						rdbterminos.setForeground(Color.GREEN);
						System.out.println("M");
					}else 
						rdbnoTerminos.setForeground(Color.GREEN);
						
				}
		    });
			
			ItemListener listener = new ItemListener() {
	          @Override
	          public void itemStateChanged(ItemEvent e) {
	              if (e.getSource() == rdbterminos && rdbnoTerminos.isSelected()) {
	              	rdbnoTerminos.setSelected(false);
	              } else if (e.getSource() == rdbnoTerminos && rdbterminos.isSelected()) {
	              	rdbterminos.setSelected(false);
	              }
	          }
	      };
	      rdbterminos.addItemListener(listener);
	  	rdbnoTerminos.addItemListener(listener);
	      
			registro.add(lblTitulo);
	      registro.add(lblUsuario);
	      registro.add(txtUsuario);
	      registro.add(lblBio);
	      registro.add(txtBio);
	      registro.add(lblPref);
	      registro.add(chkDulces);
	      registro.add(chkSalado);
	      registro.add(chkSaludable);
	      registro.add(lblTerminos);
	      registro.add(rdbterminos);
	      registro.add(rdbnoTerminos);
	      registro.add(cmbUbicacion);
	      registro.add(btnCrear);
	      
	      JButton btnNewButton = new JButton("volver Login");
	      btnNewButton.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		manager("Login");
	      	}
	      });
	      btnNewButton.setBounds(150, 464, 200, 40);
	      registro.add(btnNewButton);
	      return registro;
         
 	   }
 	   
 	  public JPanel Loginpanel() {
 			JPanel panel = new JPanel();
 			panel.setBackground(new Color(255, 255, 153));
 			
 			int formX = 180;
 	 	    Font fuente = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
 			panel.setBounds(36, 37, 297, 352);
 			//contentPane.add(panel);
 			JLabel lbletiqueta1= new JLabel("LOGIN");
 	 		lbletiqueta1.setSize(117,32);
 	 		lbletiqueta1.setLocation(76, 10);
 	 		lbletiqueta1.setBackground(Color.DARK_GRAY);
 	 		lbletiqueta1.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 17));
 	 		lbletiqueta1.setOpaque(false);
 	 		lbletiqueta1.setHorizontalAlignment(SwingConstants.CENTER);;
 	 
 	 		int centerLabelX = (panel.getWidth() - lbletiqueta1.getWidth()) / 2;
 	 	    panel.setLayout(null);
 	 	    lbletiqueta1.setLocation(centerLabelX, 20); // Y fija, X centrada
 	 	   panel.add(lbletiqueta1);
 	 		
 	 		JLabel lblcorreo= new JLabel("E-mail");
 	 		lblcorreo.setFont(new Font("Arial Black", Font.BOLD, 16));
 	 		lblcorreo.setSize(93,26);
 	 		lblcorreo.setLocation(108, 78);
 	 		lblcorreo.setBackground(Color.DARK_GRAY);
 	 		lblcorreo.setOpaque(false);
 	 		panel.add(lblcorreo);
 	 		
 	 		JTextField txtcorreot = new JTextField();
 	 		txtcorreot.setSize(195,32);
 	 		txtcorreot.setLocation(46, 101);
 	 		txtcorreot.setBackground(Color.WHITE);
 	 		txtcorreot.setForeground(Color.BLACK);
 	 		txtcorreot.setOpaque(true);
 	 		panel.add(txtcorreot);
 	 		
 	 		JLabel lblcontraseña= new JLabel("Contraseña");
 	 		lblcontraseña.setFont(new Font("Arial", Font.BOLD, 16));
 	 		lblcontraseña.setSize(104,26);
 	 		lblcontraseña.setLocation(97, 145);
 	 		lblcontraseña.setBackground(Color.DARK_GRAY);
 	 		lblcontraseña.setOpaque(false);
 	 		panel.add(lblcontraseña);
 	 		
 	 		JPasswordField contra = new JPasswordField();
 	 		contra.setSize(196,32);
 	 		contra.setLocation(45, 170);
 	 		contra.setBackground(Color.WHITE);
 	 		contra.setForeground(Color.BLACK);
 	 		contra.setOpaque(true);
 	 		panel.add(contra);
 	        
 	 		JButton btnIngresar= new JButton ("Iniciar sesion");
 	 		btnIngresar.setSize(111,32);
 	 		btnIngresar.setLocation(90, 296);
 	 		btnIngresar.setBackground(new Color(173, 216, 230));
 	 		btnIngresar.setForeground(Color.BLACK);
 	 		btnIngresar.setOpaque(true);
 	 		Border bordebtn = new LineBorder(Color.DARK_GRAY, 2, true); // Color, Grosor, Esquinas redondeadas
 	 	    btnIngresar.setBorder(bordebtn);
 	 	    
 	 	    btnIngresar.addActionListener(new ActionListener() {

 				@Override
 				public void actionPerformed(ActionEvent e) {
 					// TODO Auto-generated method stub
 					
 					boolean acceso= false,contras=false,correo=false;
 					
 					if (txtcorreot.getText().equals("")&& !txtcorreot.getText().equals("mataabuelitas2405@gmail.com")) {
 						txtcorreot.setBorder(BorderFactory.createLineBorder(Color.RED,5));
 					}else {
 						correo=true;
 						txtcorreot.setBorder(BorderFactory.createLineBorder(Color.GREEN,5));
 					}
 					if (contra.getText().equals("")&& !contra.getText().equals("donJuan2325")) {
 						contra.setBorder(BorderFactory.createLineBorder(Color.RED,5));
 					}else {
 						contras = true;
 						contra.setBorder(BorderFactory.createLineBorder(Color.GREEN,5));
 					}
 					if (contras && correo) {
 						acceso=true;
 					}
 					if (acceso) {
 						Bienvenida.showMessageDialog(null, "Los datos Ingreados son correctos", "Bienvenido", JOptionPane.INFORMATION_MESSAGE,null);
 					}else
 						DatosIncorrectos.showMessageDialog(null, "Los datos Ingreados no son validos", "Error", JOptionPane.INFORMATION_MESSAGE,null);	
 				}
 	 	    	
 	 	    });
 	 	   panel.add(btnIngresar);
 	 	   
 	 	   
 	 	   JLabel lblNewLabel = new JLabel("Olvidaste tu contraseña");
 	 	   lblNewLabel.setBounds(33, 212, 137, 13);
 	 	   panel.add(lblNewLabel);
 	 	   
 	 	   JButton btnIngresar_1_1 = new JButton("da click aqui");
 	 	   btnIngresar_1_1.setForeground(Color.BLACK);
 	 	   btnIngresar_1_1.setBackground(new Color(255, 255, 153));
 	 	   btnIngresar_1_1.setBounds(168, 212, 74, 13);
 	 	   Border bordebtn_1_1 = new LineBorder(Color.DARK_GRAY, 0, true); // Color, Grosor, Esquinas redondeadas
 		   btnIngresar_1_1.setBorder(bordebtn_1_1);
 	 	   btnIngresar_1_1.setOpaque(false);
 	 	   panel.add(btnIngresar_1_1);
 	 	   
	      JButton btnIngresar_1 = new JButton("Registrarse");
	      Border bordebtn1 = new LineBorder(Color.DARK_GRAY, 2, true); // Color, Grosor, Esquinas redondeadas
		  btnIngresar_1.setBorder(bordebtn1);
		   btnIngresar_1.addActionListener(new ActionListener() {
		   	public void actionPerformed(ActionEvent e) {
		   		manager("Registro");
		   		System.out.println("MM");
		   	}
		   });
		   btnIngresar_1.setOpaque(true);
		   btnIngresar_1.setForeground(Color.BLACK);
		   btnIngresar_1.setBackground(new Color(173, 216, 230));
		   btnIngresar_1.setBounds(90, 249, 111, 32);
		   panel.add(btnIngresar_1);
		   return panel;
 	  }
 	  
 	  public void manager(String target) {
 		  this.getContentPane().removeAll();
 		  if(target.equals("Registro")) {
 			  getContentPane().add(this.Registro());
 	  }else if(target.equals("Login")) {
			  getContentPane().add(this.Loginpanel());
 	  }
 		  
 		  this.revalidate();
 		  this.repaint();
		   	
	}
}

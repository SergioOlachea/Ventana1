package Aplcicacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Aplcicacion.Ventana.FondoDegradado;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	//private JPanel contentPane;
	private JOptionPane Bienvenida, Recuperacion;
	private JOptionPane DatosIncorrectos;
	JMenuItem item1, item2, item3, item4, item5, item6, item7, item8, item9;
	private JTextField textField;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_3;
	Border borde = new LineBorder(Color.DARK_GRAY, 2, true);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Login l = new Login();
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
    	this.setTitle(getTitle());
		this.setSize(917,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		this.getContentPane().add(this.Botones());
		//this.getContentPane().add(this.Loginpanel());
		//getContentPane().add(this.Registro());
		//getContentPane().add(this.Recuperarcuenta());
		//getContentPane().add(this.Alta());
		//getContentPane().add(this.Baja());
		//getContentPane().add(this.Consulta());
		//getContentPane().add(this.tutoCrearUsuario());
		//getContentPane().add(this.tutoAcceder());
		//getContentPane().add(this.tutoCambioContraseña());
       
        this.setVisible(true);
		//this.add(this.ventanaRegistro());
		//this.add(Calculadora());
		//this.add(this.Tabla());
        
		
        //Crear barra
        JMenuBar barra = new JMenuBar(); 
        // Crear menús
        JMenu menu3 = new JMenu("Archivo");  
        JMenu menu2 = new JMenu("Ususario");
        JMenu menu = new JMenu("Cuenta");
        

         // Crear elementos de menú
         item1 = new JMenuItem("Alta");  
         item2 = new JMenuItem("Baja");  
         item3 = new JMenuItem("Consultar");  
         item4 = new JMenuItem("¿Cómo crear un usuario?");
         item8 = new JMenuItem("¿Cómo acceder al sistema?");  
         item9 = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
         
         
         item5 = new JMenuItem("Recuperar cuenta");  
         item6 = new JMenuItem("Registro");  
         item7 = new JMenuItem("Login");  
        
         // Añadir elementos al menú
         menu3.add(item1);  
         menu3.add(item2);  
         menu3.add(item3);
         
         
         menu.add(item6);  
         menu.add(item7);
         menu.add(item5);  
         
         menu2.add(item4);
         menu2.add(item8);
         menu2.add(item9);    

         barra.add(menu);
         barra.add(menu2);
         barra.add(menu3);
         this.setJMenuBar(barra);
         this.repaint();
         this.revalidate();
         
         item1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               
	        		  manager("Alta");
	        		  System.out.println(",klhsdf");
                
             }
         });
         
         item2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               
	        		  manager("Baja");
	        		  System.out.println(",klhsdf");
                
             }
         });
         
         item3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               
	        		  manager("Consultar");
	        		  System.out.println(",klhsdf");
                
             }
         });
         
         item4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               
	        		  manager("¿Cómo crear un usuario?");
	        		  System.out.println(",klhsdf");
                
             }
         });
         
         item5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               
	        		  manager("Recuperar cuenta");
	        		  System.out.println(",klhsdf");
                
             }
         });
         
         item6.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               
	        		  manager("Registro");
	        		  System.out.println(",klhsdf");
                
             }
         });

         item7.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
            	
	        		  manager("Login");
	        		  System.out.println("FDJKGLDS");
	     
             }
         });
        
         item8.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
               
	        		  manager("¿Cómo acceder al sistema?");
	        		  System.out.println(",klhsdf");
                
             }
         });

         item9.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
            	
	        		  manager("¿Qué pasa si olvidé mi contraseña?");
	        		  System.out.println("FDJKGLDS");
	     
             }
         });

	}
	

	
	public JPanel Botones() {
		JPanel botones = new JPanel();
		botones.setBackground(new Color(123, 104, 238));
		botones.setBorder(new LineBorder(new Color(255, 165, 0), 3));
		botones.setSize(883, 621);
		botones.setLocation(10, 10);
		botones.setLayout(null);
		
		Random rand = new Random();
		JButton btnNewButton_4 = new JButton("haz click");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			int r=0,g=0,b=0;
			int x=0, y=0;
			int alto=0,largo=0;
			
			//coordenadas
			x = rand.nextInt(862); 
			y = rand.nextInt(521);
			
			//tamaño
			alto =  rand.nextInt(342); 
			largo = rand.nextInt(682);
			
			//Color
			r= rand.nextInt(250);
			g= rand.nextInt(250);
			b= rand.nextInt(250);
			
			 JButton hola = new JButton("Copia");
			 hola.setLocation(x,y);
			 hola.setSize(alto, largo);
			 hola.setBackground(new Color(r,g,b));
			 botones.add(hola);
			 
			 hola.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Recuperacion.showMessageDialog(null, "Codigo de color"+ hola.getBackground(), "HOLAAAAAA", JOptionPane.INFORMATION_MESSAGE,null);
						int confirmacion = JOptionPane.showConfirmDialog(null,"¿Deseas eliminar este botón?","Confirmación",JOptionPane.YES_NO_OPTION);

					        if (confirmacion == JOptionPane.YES_OPTION) {
					            botones.remove(hola);
					            botones.repaint();
					        }
					    }
					});
			 }
		});
		btnNewButton_4.setBounds(301, 239, 163, 79);
		botones.add(btnNewButton_4);
		
		return botones;
		
	}
		
 	   
 	  public JPanel Registro() {
 		   JPanel registro=new JPanel();
 		   registro.setBorder(new LineBorder(new Color(255, 165, 0), 3));
			registro.setSize(500, 550);
			registro.setLocation(91, 10);
			//contentPane.add(registro);
			registro.setBackground(new Color(135, 206, 250));
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
			lblTitulo.setLocation(199, 25); // Y fija, X centrada
			
			JLabel lblUsuario= new JLabel("NOMBRE DE USUARIO");
			lblUsuario.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblUsuario.setBounds(50, 50, 200, 30);
			lblUsuario.setBackground(Color.DARK_GRAY);
			lblUsuario.setOpaque(false);
			
			JTextField txtUsuario = new JTextField();
			txtUsuario.setBounds(50, 80, 400, 30);
			txtUsuario.setBackground(Color.WHITE);
			txtUsuario.setForeground(Color.BLACK);
			txtUsuario.setOpaque(true);
			
			JLabel lblBio= new JLabel("BIO");
			lblBio.setFont(new Font("Arial Black", Font.BOLD, 12));
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
			lblPref.setFont(new Font("Arial Black", Font.BOLD, 12));
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
	       lblTerminos.setFont(new Font("Arial Black", Font.BOLD, 12));
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
	      cmbUbicacion.setBorder(borde5);
	      
	      JButton btnCrear= new JButton ("Crear Cuenta");
			btnCrear.setBounds(150, 400, 200, 40);
			btnCrear.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
			
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
					}else {
						rdbnoTerminos.setForeground(Color.GREEN);
					}
					if (!chkDulces.isSelected()&&!chkSalado.isSelected()&&!chkSaludable.isSelected()) {
						chkDulces.setForeground(Color.RED);
						chkSalado.setForeground(Color.RED);
						chkSaludable.setForeground(Color.RED);
						System.out.println("m");
					}else if (!chkSalado.isSelected()&&!chkSaludable.isSelected()){
						chkDulces.setForeground(Color.GREEN);
						System.out.println("M");
					}else if(!chkDulces.isSelected()&&!chkSalado.isSelected()){
						chkSaludable.setForeground(Color.GREEN);
					}else if(!chkDulces.isSelected()&&!chkSaludable.isSelected()){
						chkSalado.setForeground(Color.GREEN);
					}
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
	      btnNewButton.setBorder(new LineBorder(new Color(64, 64, 64), 4, true));
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
 			panel.setBounds(81, 10, 508, 413);
 			panel.setToolTipText("");
 			Border borde12 = new LineBorder(Color.BLACK, 2, true);
 			panel.setBorder(new LineBorder(new Color(0, 255, 255), 3, true));
 			panel.setBackground(new Color(240, 255, 240));
 			
 			
 	 	    Font fuente = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
 			//panel.setBounds(36, 37, 297, 352);
 			//contentPane.add(panel);
 			JLabel lbletiqueta1= new JLabel("LOGIN");
 			lbletiqueta1.setBounds(84, 36, 117, 32);
 	 		lbletiqueta1.setBackground(Color.DARK_GRAY);
 	 		lbletiqueta1.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 17));
 	 		lbletiqueta1.setOpaque(false);
 	 		lbletiqueta1.setHorizontalAlignment(SwingConstants.CENTER);;
 	 
 	 		int centerLabelX = (panel.getWidth() - lbletiqueta1.getWidth()) / 2;
 	 	   panel.setLayout(null);
 	 	   panel.add(lbletiqueta1);
 	 		
 	 		JLabel lblcorreo= new JLabel("E-mail");
 	 		lblcorreo.setBounds(108, 78, 93, 26);
 	 		lblcorreo.setFont(new Font("Arial Black", Font.BOLD, 16));
 	 		lblcorreo.setBackground(Color.DARK_GRAY);
 	 		lblcorreo.setOpaque(false);
 	 		panel.add(lblcorreo);
 	 		
 	 		JTextField txtcorreot = new JTextField();
 	 		txtcorreot.setBounds(46, 101, 195, 32);
 	 		txtcorreot.setBackground(Color.WHITE);
 	 		txtcorreot.setForeground(Color.BLACK);
 	 		txtcorreot.setOpaque(true);
 	 		panel.add(txtcorreot);
 	 		
 	 		JLabel lblcontraseña= new JLabel("Contraseña");
 	 		lblcontraseña.setBounds(97, 145, 104, 26);
 	 		lblcontraseña.setFont(new Font("Arial", Font.BOLD, 16));
 	 		lblcontraseña.setBackground(Color.DARK_GRAY);
 	 		lblcontraseña.setOpaque(false);
 	 		panel.add(lblcontraseña);
 	 		
 	 		JPasswordField contra = new JPasswordField();
 	 		contra.setBounds(45, 170, 196, 32);
 	 		contra.setBackground(Color.WHITE);
 	 		contra.setForeground(Color.BLACK);
 	 		contra.setOpaque(true);
 	 		panel.add(contra);
 	        
 	 		JButton btnIngresar= new JButton ("Iniciar sesion");
 	 		btnIngresar.setBounds(90, 296, 111, 32);
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
 	 	   btnIngresar_1_1.setBounds(168, 212, 74, 13);
 	 	   btnIngresar_1_1.setForeground(Color.BLACK);
 	 	   btnIngresar_1_1.setBackground(new Color(255, 255, 153));
 	 	   Border bordebtn_1_1 = new LineBorder(Color.DARK_GRAY, 0, true); // Color, Grosor, Esquinas redondeadas
 		   btnIngresar_1_1.setBorder(bordebtn_1_1);
 	 	   btnIngresar_1_1.setOpaque(false);
 	 	   btnIngresar_1_1.addActionListener(new ActionListener() {
 		   	public void actionPerformed(ActionEvent e) {
 		   		manager("Recuperar cuenta");
 		   		System.out.println("MM");
 		   	}
 		   });
 	 	   panel.add(btnIngresar_1_1);
 	 	   
	      JButton btnIngresar_1 = new JButton("Registrarse");
	      btnIngresar_1.setBounds(90, 249, 111, 32);
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
		   panel.add(btnIngresar_1);
		   
		   
		   
		   ImageIcon ImagenLogin = new ImageIcon("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/Pinguino.jpg");
		   JLabel lblNewLabel_2 = new JLabel(ImagenLogin);
		   lblNewLabel_2.setBorder(new LineBorder(new Color(135, 206, 250), 4, true));
		   lblNewLabel_2.setBounds(265, 10, 223, 393);
		   panel.add(lblNewLabel_2);
		   return panel;
 	  }
 	  
 	 public JPanel Recuperarcuenta() {
		   JPanel recuperar=new JPanel();
		   recuperar.setBorder(new LineBorder(new Color(50, 205, 50), 3));
			recuperar.setSize(338, 254);
			recuperar.setLocation(147, 76);
			//contentPane.add(registro);
			recuperar.setBackground(new Color(135, 206, 250));
			recuperar.setVisible(true);
			recuperar.setLayout(null);
		   	recuperar.setOpaque(true);
		   	
				
			Font fuente1 = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
			JLabel lblTitulo= new JLabel("Recuperar Contraseña");
			lblTitulo.setSize(340,15);
			lblTitulo.setBackground(Color.DARK_GRAY);
			lblTitulo.setFont(fuente1);
			lblTitulo.setOpaque(false);
			lblTitulo.setVisible(true);
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);;
			int centerLabelX1 = (500 - lblTitulo.getWidth()) / 2;
			//int centerLabelY = (550 - lblTitulo.getWidth()) / 2;
			lblTitulo.setLocation(10, 10); // Y fija, X centrada
			recuperar.add(lblTitulo);
			
			JLabel lblNewLabel_1 = new JLabel("Correo de \r\nrecuperacion");
			lblNewLabel_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 16));
			lblNewLabel_1.setBounds(67, 35, 224, 55);
			recuperar.add(lblNewLabel_1);
			
			textField = new JTextField();
			textField.setBounds(67, 85, 224, 31);
			recuperar.add(textField);
			textField.setColumns(10);
			
			JButton btnNewButton_1 = new JButton("Enviar Correo");
			btnNewButton_1.setBorder(borde);
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int codigo[]= new int[6];
					Random rand = new Random();
					StringBuilder sb = new StringBuilder();
					String codigoc;
					for (int j = 0; j < 6; j++) {
					    codigo[j] = rand.nextInt(10); 
					    sb.append(codigo[j]);        
					}
					codigoc=sb.toString();
					
					if(textField.getText().equals("")) {
						textField.setBorder(BorderFactory.createLineBorder(Color.RED,5));
						Recuperacion.showMessageDialog(null, "Datos incorrectos", "Error", JOptionPane.INFORMATION_MESSAGE,null);
						
					}else {
						Recuperacion.showMessageDialog(null, "el codigo de recuperacion es "+ codigoc, "Codigo de recuperacion", JOptionPane.INFORMATION_MESSAGE,null);
						
					}
				}
			});
			btnNewButton_1.setBounds(104, 163, 134, 31);
			recuperar.add(btnNewButton_1);
			
			lblNewLabel_3 = new JLabel("Usar");
			lblNewLabel_3.setBounds(77, 126, 53, 13);
			recuperar.add(lblNewLabel_3);
			
			JButton btnNewButton_2 = new JButton("Numero de telefono");		
			btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
			btnNewButton_2.setBackground(new Color(0, 255, 204));
			Border bordebtn_1_1 = new LineBorder(Color.DARK_GRAY, 0, true); // Color, Grosor, Esquinas redondeadas
			btnNewButton_2.setBorder(bordebtn_1_1);
			btnNewButton_2.setOpaque(false);
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(btnNewButton_2.getText().equals("correo electronico")) {
						lblNewLabel_1.setText("Correo De Recuperacion");
						btnNewButton_2.setText("numero de telefono");
						btnNewButton_1.setText("Enviar Correo");
					}else {
						lblNewLabel_1.setText("Telefono De Recuperacion");
						btnNewButton_2.setText("correo electronico");
						btnNewButton_1.setText("Enviar SMS");
					}
				}
			});
			btnNewButton_2.setBounds(116, 126, 149, 13);
			recuperar.add(btnNewButton_2);
			
			btnNewButton_3 = new JButton("Volver Login");
			btnNewButton_3.setBorder(borde);
			btnNewButton_3.setBounds(104, 204, 134, 31);
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					manager("Login");
				}
			});
			recuperar.add(btnNewButton_3);
			return recuperar;
 	 }
 	 
 	 public JPanel Alta() {
 		JPanel alta = new JPanel();
 	    alta.setSize(325, 384);
 	    alta.setLocation(172, 10);
 	    alta.setBackground(new Color(0, 206, 209));
 	    alta.setVisible(true);
 	    alta.setLayout(null);
 	    alta.setOpaque(true);

 	    Font fuente1 = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
 	    JLabel lblTitulo = new JLabel("Dar de alta");
 	    lblTitulo.setSize(100, 15);
 	    lblTitulo.setFont(fuente1);
 	    lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
 	    int centerLabelX1 = (500 - lblTitulo.getWidth()) / 2;
 	    lblTitulo.setLocation(108, 10);
 	    alta.add(lblTitulo);

 	   
 	    JTextField txtNombre = new JTextField();
 	    txtNombre.setBounds(50, 60, 200, 25);
 	    JLabel NNombre = new JLabel("Nombre:");
 	    NNombre.setBounds(50, 35, 200, 20);
 	    alta.add(NNombre);
 	    alta.add(txtNombre);

 	    JTextField txtCorreo = new JTextField();
 	    txtCorreo.setBounds(50, 120, 200, 25);
 	    JLabel NCorreo = new JLabel("Correo:");
 	    NCorreo.setBounds(50, 95, 200, 20);
 	    alta.add(NCorreo);
 	    alta.add(txtCorreo);

 	    JTextField txtEdad = new JTextField();
 	    txtEdad.setBounds(50, 180, 200, 25);
 	    JLabel NEdad = new JLabel("Edad");
 	    NEdad.setBounds(50, 160, 200, 20);
 	    alta.add(NEdad);
 	    alta.add(txtEdad);

 	    JComboBox<String> comboEstado = new JComboBox<>(new String[]{"","Activo", "Inactivo"});
 	    comboEstado.setBounds(50, 240, 200, 25);
 	    
 	    JLabel Estado = new JLabel("Estado");
 	    Estado.setBounds(50, 220, 200, 20);
 	    alta.add(Estado);
 	    alta.add(comboEstado);

 	    JButton btnGuardar = new JButton("Guardar");
 	    btnGuardar.setBackground(new Color(127, 255, 0));
 	    btnGuardar.setBounds(33, 281, 100, 30);
 	    btnGuardar.setBorder(borde);
 	    alta.add(btnGuardar);
 	    
 	    JButton btnVerTabla = new JButton("Ver Tabla");
 	    btnVerTabla.setBackground(new Color(0, 255, 255));
 	    btnVerTabla.setBounds(182, 281, 100, 30);
 	    
 	    btnVerTabla.setBorder(borde);
 	    btnVerTabla.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		manager("Consultar");
	    	}
	    });
 	    alta.add(btnVerTabla);
 	    
 	    JButton btnSalir = new JButton("Salir");
 	    btnSalir.setBackground(new Color(255, 69, 0));
 	    btnSalir.setBorder(borde);
 	    btnSalir.addActionListener(new ActionListener() {
 	    	public void actionPerformed(ActionEvent e) {
 	    		manager("Login");
 	    	}
 	    });
 	    btnSalir.setBounds(33, 344, 100, 30);
 	    alta.add(btnSalir);

 	    btnGuardar.addActionListener(new ActionListener() {
 	        public void actionPerformed(ActionEvent e) {
 	            String nombre = txtNombre.getText();
 	            String correo = txtCorreo.getText();
 	            String edad = txtEdad.getText();
 	            String estado = comboEstado.getSelectedItem().toString();
 	        }
 	   });
 	    return alta;
 	 }
 	 
 	public JPanel Baja() {
 		JPanel baja = new JPanel();
 	    baja.setSize(500, 328);
 	    baja.setLocation(75, 10);
 	    baja.setBackground(new Color(72, 209, 204));
 	    baja.setVisible(true);
 	    baja.setLayout(null);
 	    baja.setOpaque(true);

 	    Font fuente1 = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
 	    JLabel lblTitulo = new JLabel("Dar De Baja");
 	    lblTitulo.setSize(100, 15);
 	    lblTitulo.setBackground(Color.DARK_GRAY);
 	    lblTitulo.setFont(fuente1);
 	    lblTitulo.setOpaque(false);
 	    lblTitulo.setVisible(true);
 	    lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
 	    int centerLabelX1 = (500 - lblTitulo.getWidth()) / 2;
 	    lblTitulo.setLocation(centerLabelX1, 10);
 	    baja.add(lblTitulo);

 	    JLabel lblInstruccion = new JLabel("Seleccione un usuario de la tabla para eliminar:");
 	    lblInstruccion.setBounds(50, 40, 400, 30);
 	    baja.add(lblInstruccion);

 	
 	    String columnaUsuario[] = {"Numero Control", "Nombre", "Correo electrónico", "Edad", "Estado"};
 	    String[][] datos = {
 	        {"15612311", "Juan Pérez", "juan.perez@example.com", "25", "Activo"},
 	        {"25466545", "María López", "maria.lopez@example.com", "30", "Inactivo"},
 	        {"33354621", "Carlos Gómez", "carlos.gomez@example.com", "28", "Activo"},
 	        {"44120200", "Ana Martínez", "ana.martinez@example.com", "35", "Activo"},
 	        {"55473534", "Pedro Ramírez", "pedro.ramirez@example.com", "40", "Inactivo"}
 	    };

 	    JTable tablaUsuarios = new JTable(datos, columnaUsuario);
 	    JScrollPane sp = new JScrollPane(tablaUsuarios);
 	    sp.setBounds(50, 80, 400, 150);
 	    baja.add(sp);

 	    JButton btnEliminar = new JButton("Eliminar");
 	    btnEliminar.setBounds(50, 250, 100, 30);
 	    btnEliminar.setBackground(new Color(255, 0, 0));
 	    btnEliminar.setBorder(borde);
 	    baja.add(btnEliminar);

 	    JButton btnCancelar = new JButton("Cancelar");
 	    btnCancelar.setBounds(180, 250, 100, 30);
 	    btnCancelar.setBackground(new Color(0, 255, 0));
 	    btnCancelar.setBorder(borde);
 	    baja.add(btnCancelar);

 	  
 	    btnEliminar.addActionListener(new ActionListener() {
 	        public void actionPerformed(ActionEvent e) {
 	            int filaSeleccionada = tablaUsuarios.getSelectedRow();
 	            if (filaSeleccionada != -1) {
 	                String nombreUsuario = tablaUsuarios.getValueAt(filaSeleccionada, 1).toString();
 	                JOptionPane.showMessageDialog(null, "Usuario '" + nombreUsuario + "' dado de baja.");
 	              
 	            } else {
 	                JOptionPane.showMessageDialog(null, "Seleccione un usuario para eliminar.");
 	            }
 	        }
 	    });

 	   
 	    btnCancelar.addActionListener(new ActionListener() {
 	        public void actionPerformed(ActionEvent e) {
 	            manager("Consultar");
 	        }
 	    });

 	    return baja;
	 }
 	
 	public JPanel Consulta() {
 		JPanel tabla = new JPanel();
 		tabla.setLocation(0, 0);
 		tabla.setBackground(new Color(135, 206, 235));
        tabla.setLayout(null);
        tabla.setSize(900, 477);
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

        String columnaUsuario[] = {"Numero Control", "Nombre", "Correo electrónico", "Edad", "Estado"};
        String[][] datos = {
            {"15612311", "Juan Pérez", "juan.perez@example.com", "25", "Activo"},
            {"25466545", "María López", "maria.lopez@example.com", "30", "Inactivo"},
            {"33354621", "Carlos Gómez", "carlos.gomez@example.com", "28", "Activo"},
            {"44120200", "Ana Martínez", "ana.martinez@example.com", "35", "Activo"},
            {"55473534", "Pedro Ramírez", "pedro.ramirez@example.com", "40", "Inactivo"},
            {"69256462", "Laura Torres", "laura.torres@example.com", "22", "Activo"},
            {"76450511", "Diego Fernández", "diego.fernandez@example.com", "27", "Activo"},
            {"80456046", "Sofía Herrera", "sofia.herrera@example.com", "32", "Inactivo"},
            {"97762142", "Andrés Castillo", "andres.castillo@example.com", "29", "Activo"},
            {"10943450", "Gabriela Ríos", "gabriela.rios@example.com", "26", "Activo"}
        };

        JTable tablas = new JTable(datos, columnaUsuario);
        JScrollPane sp = new JScrollPane(tablas);
        sp.setBounds(32, 210, 800, 188);
        tabla.add(sp);

        JButton btnExportar = new JButton("Baja");
        btnExportar.setBackground(new Color(220, 20, 60));
        btnExportar.setBounds(594, 174, 100, 30);
        btnExportar.setBorder(borde);
        btnExportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager("Baja");
			}
		});
        tabla.add(btnExportar);

        JButton btnAnadir = new JButton("Añadir");
        btnAnadir.setBackground(new Color(0, 255, 0));
        btnAnadir.setBounds(706, 174, 100, 30);
        btnAnadir.setBorder(borde);
        btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager("Alta");
			}
		});
        tabla.add(btnAnadir);
        
        JButton btnSalir_1 = new JButton("Salir");
        btnSalir_1.setBorder(borde);
        btnSalir_1.setBackground(new Color(255, 165, 0));
        btnSalir_1.setBounds(32, 418, 100, 30);
        btnSalir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager("Login");
			}
		});
        tabla.add(btnSalir_1);

        return tabla;
	 }
 	 
 	public JPanel tutoCrearUsuario() {
		   JPanel tutoCrear=new JPanel();
		   tutoCrear.setSize(500, 550);
		   tutoCrear.setLocation(362, 10);
			//contentPane.add(registro);
		   tutoCrear.setBackground(new Color(255, 255, 153));
		   tutoCrear.setVisible(true);
		   tutoCrear.setLayout(null);
		   tutoCrear.setOpaque(true);
				
			Font fuente1 = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
			JLabel lblTitulo= new JLabel("Tutorial crear Usuario");
			lblTitulo.setSize(500,15);
			lblTitulo.setBackground(Color.DARK_GRAY);
			lblTitulo.setFont(fuente1);
			lblTitulo.setVisible(true);
			lblTitulo.setOpaque(false);
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);;
			int centerLabelX1 = (500 - lblTitulo.getWidth()) / 2;
			//int centerLabelY = (550 - lblTitulo.getWidth()) / 2;
			lblTitulo.setLocation(centerLabelX1, 10); // Y fija, X centrada
			tutoCrear.add(lblTitulo);
			return tutoCrear;
	 }
 	
 	public JPanel tutoAcceder() {
		   JPanel tutoAcceder=new JPanel();
		   tutoAcceder.setSize(500, 550);
		   tutoAcceder.setLocation(362, 10);
			//contentPane.add(registro);
		   tutoAcceder.setBackground(new Color(255, 255, 153));
		   tutoAcceder.setVisible(true);
		   	tutoAcceder.setLayout(null);
		   	tutoAcceder.setOpaque(true);
				
			Font fuente1 = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
			JLabel lblTitulo= new JLabel("Tutorial Acceder");
			lblTitulo.setSize(500,15);
			lblTitulo.setBackground(Color.DARK_GRAY);
			lblTitulo.setFont(fuente1);
			lblTitulo.setOpaque(false);
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);;
			int centerLabelX1 = (500 - lblTitulo.getWidth()) / 2;
			//int centerLabelY = (550 - lblTitulo.getWidth()) / 2;
			lblTitulo.setLocation(centerLabelX1, 10); // Y fija, X centrada
			tutoAcceder.add(lblTitulo);
			return tutoAcceder;
	 }
 	
 	public JPanel tutoCambioContraseña() {
		   JPanel tutoCambio=new JPanel();
		   tutoCambio.setSize(500, 550);
		   tutoCambio.setLocation(362, 10);
			//contentPane.add(registro);
		   tutoCambio.setBackground(new Color(255, 255, 153));
		   tutoCambio.setVisible(true);
		   tutoCambio.setLayout(null);
		   tutoCambio.setOpaque(true);
				
			Font fuente1 = new Font("Arial", Font.BOLD + Font.ITALIC, 15);
			JLabel lblTitulo= new JLabel("Cambiio Contraseña");
			lblTitulo.setSize(500,15);
			lblTitulo.setBackground(Color.DARK_GRAY);
			lblTitulo.setFont(fuente1);
			lblTitulo.setVisible(true);
			lblTitulo.setOpaque(false);
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);;
			int centerLabelX1 = (500 - lblTitulo.getWidth()) / 2;
			//int centerLabelY = (550 - lblTitulo.getWidth()) / 2;
			lblTitulo.setLocation(centerLabelX1, 10); // Y fija, X centrada
			tutoCambio.add(lblTitulo);
			return tutoCambio;
	 }
 	
 	  public void manager(String target) {
 		  this.getContentPane().removeAll();
 		  if(target.equals("Registro")) {
 			  getContentPane().add(this.Registro());
 	  }else if(target.equals("Login")) {
			  getContentPane().add(this.Loginpanel());
 	  }else if(target.equals("Recuperar cuenta")) {
		  getContentPane().add(this.Recuperarcuenta());
	  }else if(target.equals("Alta")) {
		  getContentPane().add(this.Alta());
	  }else if(target.equals("Baja")) {
		  getContentPane().add(this.Baja());
	  }else if(target.equals("Consultar")) {
		  getContentPane().add(this.Consulta());
	  }else if(target.equals("¿Cómo crear un usuario?")) {
		  getContentPane().add(this.tutoCrearUsuario());
	  }else if(target.equals("¿Cómo acceder al sistema?")) {
		  getContentPane().add(this.tutoAcceder());
	  }else if(target.equals("¿Qué pasa si olvidé mi contraseña?")) {
		  getContentPane().add(this.tutoCambioContraseña());
	  }
 		  
 		  this.revalidate();
 		  this.repaint();
		   	
	}
}

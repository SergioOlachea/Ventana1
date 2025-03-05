package Aplcicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBoxMenuItem;
import java.awt.List;
import java.awt.Label;
import java.awt.Checkbox;
import java.awt.Button;

public class Ventana1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setBackground(new Color(100, 149, 237));
		setTitle("hola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 607);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Registro De Usuario");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 27));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(123, 104, 238));
		panel_1.setToolTipText("\"Arial\", Font.BOLD, 30");
		
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos Generales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(54, 25, 125, 20);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido Paterno");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(54, 55, 125, 20);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apellido Materno");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(54, 85, 125, 20);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Fecha De Nacimiento");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(42, 115, 137, 20);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Sexo");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(54, 157, 117, 20);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Nacionalidad");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBounds(54, 204, 125, 20);
		panel_1.add(lblNewLabel_1_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Masculino");
		chckbxNewCheckBox.setBounds(177, 157, 93, 21);
		chckbxNewCheckBox.setOpaque(false);
		panel_1.add(chckbxNewCheckBox);
		
		
		
		JCheckBox chckbxFemenino = new JCheckBox("Femenino");
		chckbxFemenino.setOpaque(false);
		chckbxFemenino.setBounds(177, 174, 93, 21);
		panel_1.add(chckbxFemenino);
		
		ItemListener listener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == chckbxFemenino && chckbxFemenino.isSelected()) {
                	chckbxNewCheckBox.setSelected(false);
                } else if (e.getSource() == chckbxNewCheckBox && chckbxNewCheckBox.isSelected()) {
                	chckbxFemenino.setSelected(false);
                }
            }
        };
        chckbxFemenino.addItemListener(listener);
        chckbxNewCheckBox.addItemListener(listener);
        
		textField = new JTextField();
		textField.setBounds(199, 26, 96, 19);
		textField.setBorder(new LineBorder(Color.BLACK, 2, true));
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(Color.BLACK, 2, true));
		textField_1.setBounds(199, 56, 96, 19);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(Color.BLACK, 2, true));
		textField_2.setBounds(199, 86, 96, 19);
		panel_1.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(189, 204, 106, 21);
		panel_1.add(comboBox);
		String[] nacionalidades = {"","Argentino", "Brasileño", "Chileno", "Colombiano", "Mexicano", 
                "Español", "Francés", "Alemán", "Italiano", "Estadounidense"};

		for (String nacionalidad : nacionalidades) {
			comboBox.addItem(nacionalidad);
		}
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(189, 204, 106, 20);
		panel_1.add(scrollBar_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(199, 116, 96, 19);
		textField_3.setBorder(new LineBorder(Color.BLACK, 2, true));
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Perfil De Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBackground(new Color(219, 112, 147));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		ImageIcon icono1 = new ImageIcon("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/usuarioOculto.jpg");
		ImageIcon icono2 = new ImageIcon("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/Usuario.jpg");
        JLabel usuario = new JLabel(icono1);
        usuario.setBorder(new LineBorder(Color.BLACK, 2, true));
        usuario.setBounds(117, 21, 167, 144);
		panel_2.add(usuario);
		
		
		Checkbox checkbox = new Checkbox("Mostrar Fecha de Nacimiento");
		checkbox.setBounds(148, 227, 199, 21);
		panel_2.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("Mostrar Usuario");
		checkbox_1.setBounds(147, 200, 137, 21);
		panel_2.add(checkbox_1);
		
		ItemListener listener1 = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
            	if (checkbox_1.getState()) {
            		usuario.setIcon(icono2);
                } else {
                	usuario.setIcon(icono1);
                }
            }
        };
        checkbox_1.addItemListener(listener1);
        
        JLabel lblNewLabel_3 = new JLabel("Fecha nacimiento(Ejemplo)");
		lblNewLabel_3.setBounds(148, 175, 136, 19);
		lblNewLabel_3.setVisible(false);
		panel_2.add(lblNewLabel_3);
		
        ItemListener listener2 = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
            	if (checkbox.getState()) {
            		lblNewLabel_3.setVisible(true);
                } else {
                	lblNewLabel_3.setVisible(false);
                }
            }
        };
        checkbox.addItemListener(listener2);
        
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Datos Opacionales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBackground(new Color(255, 105, 180));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Descripcion");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(68, 82, 85, 24);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Preferencias");
		lblNewLabel_2_1.setBounds(219, 88, 88, 13);
		panel_3.add(lblNewLabel_2_1);
		//panel_3.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(35, 116, 128, 75);
		
		panel_3.add(scrollPane);
		
		TextArea textArea = new TextArea(10, 20); 
		textArea.setText("hola a todos.\r\nEspero les guste mi pagina siles gusta\r\nme lo pueden hacer saber vcon un like \r\ny si no abranse :)");
        scrollPane.setViewportView(textArea);
        
        List list = new List();
        list.setBounds(192, 116, 104, 56);
        panel_3.add(list);
		
		String[] actividades = {"","Leer libros", "Jugar videojuegos", "Cocinar", "Hacer ejercicio", "Viajar"};
        for (String actividad : actividades) {
        	list.addItem(actividad);
        }
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(123, 104, 238));
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		ImageIcon volver = new ImageIcon("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/inicio.jpg");
		ImageIcon guardar = new ImageIcon("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/guardar.jpg");
		ImageIcon cancelar = new ImageIcon("C:/Users/smari/OneDrive/Escritorio/escuela/Programacion3/Cancelar.jpeg");
		
		JButton button = new JButton("Salir");
		button.setBounds(156, 159, 134, 30);
		button.setIcon(volver);
		panel_4.add(button);
		
		JButton button_1 = new JButton("Guardar");
		button_1.setBounds(156, 123, 134, 30);
		button_1.setIcon(guardar);
		panel_4.add(button_1);
		
		JButton button_2 = new JButton("Nuevo");
		button_2.setBounds(156, 82, 134, 30);
		button_2.setIcon(cancelar);
		panel_4.add(button_2);
		
		
		
		
	}
}

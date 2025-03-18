package Aplcicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Font;

public class Examen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtAvenidaUniversidad;
	private JTextField txtIndianaMoes;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen frame = new Examen();
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
	public Examen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos del cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 80, 472, 76);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Documento:");
		lblNewLabel_1.setBounds(24, 22, 69, 22);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Dirección:");
		lblNewLabel_1_1.setBounds(24, 44, 69, 22);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("3625");
		textField.setBounds(93, 24, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		txtAvenidaUniversidad = new JTextField();
		txtAvenidaUniversidad.setEditable(false);
		txtAvenidaUniversidad.setText("avenida Universidad #2463");
		txtAvenidaUniversidad.setColumns(10);
		txtAvenidaUniversidad.setBounds(93, 46, 96, 19);
		panel.add(txtAvenidaUniversidad);
		
		txtIndianaMoes = new JTextField();
		txtIndianaMoes.setEditable(false);
		txtIndianaMoes.setText("Indiana moes");
		txtIndianaMoes.setColumns(10);
		txtIndianaMoes.setBounds(310, 24, 96, 19);
		panel.add(txtIndianaMoes);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setText("667524938");
		textField_3.setColumns(10);
		textField_3.setBounds(310, 46, 96, 19);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nombres:");
		lblNewLabel_1_1_1.setBounds(231, 27, 69, 22);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Teléfono:");
		lblNewLabel_1_1_2.setBounds(231, 44, 69, 22);
		panel.add(lblNewLabel_1_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Datos de factura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 154, 472, 51);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("N° Factura");
		lblNewLabel_2.setBounds(24, 15, 74, 19);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("1");
		lblNewLabel_3.setBounds(96, 18, 45, 13);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Fecha:");
		lblNewLabel_2_1.setBounds(241, 18, 74, 19);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("25/06/2027");
		lblNewLabel_2_2.setBounds(305, 18, 74, 19);
		panel_1.add(lblNewLabel_2_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 207, 472, 32);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("Ver lista de facturas");
		lblNewLabel_2_3.setBounds(10, 10, 142, 13);
		panel_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Añadir");
		lblNewLabel_2_4.setBounds(307, 7, 74, 19);
		panel_2.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Eliminar");
		lblNewLabel_2_5.setBounds(391, 7, 74, 19);
		panel_2.add(lblNewLabel_2_5);
		
		 String columnaUsuario[] = {"Producto", "Cantidad", "Valor", "SubTotal"};
	        String[][] datos = {
	            {"leche", "100", "50", "5,000.00"},
	            {"Galletas", "50", "25", "1,250.00"},
	            {"Agua", "20", "238.75", "4,775.00"},
	            {"Cereal", "50", "95.5", "4,775.00"},
	        };
		
		table = new JTable(datos,columnaUsuario);
		table.setBounds(10, 235, 472, 76);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 239, 472, 72);
		contentPane.add(scrollPane);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("SubTotal:");
		lblNewLabel_2_3_1.setBounds(20, 317, 92, 13);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("% Descuento:");
		lblNewLabel_2_3_1_1.setBounds(20, 342, 92, 13);
		contentPane.add(lblNewLabel_2_3_1_1);
		
		JLabel lblNewLabel_2_3_1_2 = new JLabel("IVA 16%:");
		lblNewLabel_2_3_1_2.setBounds(20, 365, 92, 13);
		contentPane.add(lblNewLabel_2_3_1_2);
		
		JLabel lblNewLabel_2_3_1_3 = new JLabel("Total Factura:");
		lblNewLabel_2_3_1_3.setBounds(20, 388, 92, 13);
		contentPane.add(lblNewLabel_2_3_1_3);
		
		JLabel lblNewLabel_2_3_1_4 = new JLabel("Valor descontado:");
		lblNewLabel_2_3_1_4.setBounds(200, 342, 85, 13);
		contentPane.add(lblNewLabel_2_3_1_4);
		
		JLabel lblNewLabel_2_3_1_5 = new JLabel("1,580.00");
		lblNewLabel_2_3_1_5.setBounds(295, 342, 92, 13);
		contentPane.add(lblNewLabel_2_3_1_5);
		
		JLabel lblNewLabel_2_3_1_6 = new JLabel("15,800.00");
		lblNewLabel_2_3_1_6.setBounds(115, 317, 92, 13);
		contentPane.add(lblNewLabel_2_3_1_6);
		
		JLabel lblNewLabel_2_3_1_7 = new JLabel("2,528.00");
		lblNewLabel_2_3_1_7.setBounds(115, 365, 92, 13);
		contentPane.add(lblNewLabel_2_3_1_7);
		
		JLabel lblNewLabel_2_3_1_8 = new JLabel("16,748.00");
		lblNewLabel_2_3_1_8.setBounds(115, 388, 92, 13);
		contentPane.add(lblNewLabel_2_3_1_8);
		
		textField_4 = new JTextField();
		textField_4.setText("10");
		textField_4.setBounds(111, 339, 43, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(160, 338, 20, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setBounds(257, 407, 135, 21);
		contentPane.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(397, 407, 85, 21);
		contentPane.add(btnLimpiar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 205));
		panel_3.setBounds(-14, 0, 519, 61);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(35, 20, 407, 13);
		panel_3.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(0, 0, 205));
		
		JLabel lblNewLabel_4 = new JLabel("(sin base de datos)");
		lblNewLabel_4.setForeground(new Color(248, 248, 255));
		lblNewLabel_4.setBounds(45, 38, 109, 13);
		panel_3.add(lblNewLabel_4);
		
		
	}
}

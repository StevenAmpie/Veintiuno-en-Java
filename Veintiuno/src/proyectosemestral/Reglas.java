package proyectosemestral;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reglas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reglas frame = new Reglas();
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
	public Reglas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("REGLAS DEL JUEGO");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(10, 10, 810, 40);
		contentPane.add(lblTitulo);
		
		JLabel lblRegla1 = new JLabel("1. El objetivo del juego es conseguir una mano lo más cercana posible a 21 puntos sin pasarse.");
		lblRegla1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegla1.setForeground(Color.WHITE);
		lblRegla1.setBounds(16, 92, 800, 30);
		contentPane.add(lblRegla1);
		
		JLabel lblRegla2 = new JLabel("2. Cada carta tiene un valor en puntos:");
		lblRegla2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegla2.setForeground(Color.WHITE);
		lblRegla2.setBounds(16, 132, 800, 30);
		contentPane.add(lblRegla2);
		
		JLabel lblRegla2a = new JLabel("- Las cartas numéricas (2-10) valen su valor nominal.");
		lblRegla2a.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegla2a.setForeground(Color.WHITE);
		lblRegla2a.setBounds(36, 162, 800, 30);
		contentPane.add(lblRegla2a);
		
		JLabel lblRegla2b = new JLabel("- Las cartas de la J, Q y K valen 10 puntos cada una.");
		lblRegla2b.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegla2b.setForeground(Color.WHITE);
		lblRegla2b.setBounds(36, 192, 393, 30);
		contentPane.add(lblRegla2b);
		
		JLabel lblRegla2c = new JLabel("- El As puede valer 1 o 11 puntos, a elección del jugador.");
		lblRegla2c.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegla2c.setForeground(Color.WHITE);
		lblRegla2c.setBounds(36, 222, 415, 30);
		contentPane.add(lblRegla2c);
		
		JLabel lblRegla3 = new JLabel("3. El jugador y el repartidor reciben dos cartas al inicio del juego.");
		lblRegla3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegla3.setForeground(Color.WHITE);
		lblRegla3.setBounds(16, 262, 800, 30);
		contentPane.add(lblRegla3);
		
		JLabel lblRegla4 = new JLabel("4. El jugador puede optar por 'Pedir' para recibir otra carta o 'Plantarse' para no recibir más cartas.");
		lblRegla4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegla4.setForeground(Color.WHITE);
		lblRegla4.setBounds(16, 292, 800, 30);
		contentPane.add(lblRegla4);
		
		JLabel lblRegla5 = new JLabel("5. Si el jugador supera los 21 puntos, pierde automáticamente.");
		lblRegla5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegla5.setForeground(Color.WHITE);
		lblRegla5.setBounds(16, 322, 800, 30);
		contentPane.add(lblRegla5);
		
		JLabel lblRegla6 = new JLabel("6. El repartidor debe seguir ciertas reglas para tomar cartas:");
		lblRegla6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegla6.setForeground(Color.WHITE);
		lblRegla6.setBounds(16, 352, 800, 30);
		contentPane.add(lblRegla6);
		
		JLabel lblRegla6a = new JLabel("- Debe pedir cartas hasta que su mano valga al menos 17 puntos.");
		lblRegla6a.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegla6a.setForeground(Color.WHITE);
		lblRegla6a.setBounds(36, 382, 800, 30);
		contentPane.add(lblRegla6a);
		
		JLabel lblRegla6b = new JLabel("- Si el repartidor supera los 21 puntos, el jugador gana.");
		lblRegla6b.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegla6b.setForeground(Color.WHITE);
		lblRegla6b.setBounds(36, 412, 800, 30);
		contentPane.add(lblRegla6b);
		
		JLabel lblRegla7 = new JLabel("7. Si el jugador y el repartidor tienen el mismo valor en puntos, es un empate.");
		lblRegla7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegla7.setForeground(Color.WHITE);
		lblRegla7.setBounds(16, 452, 800, 30);
		contentPane.add(lblRegla7);
		
		JLabel lblDespedida = new JLabel("¡Buena suerte y diviértete jugando Veintiuno!");
		lblDespedida.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDespedida.setHorizontalAlignment(SwingConstants.CENTER);
		lblDespedida.setForeground(Color.WHITE);
		lblDespedida.setBounds(16, 492, 800, 30);
		contentPane.add(lblDespedida);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Steven\\eclipse-workspace\\PjSemestral\\imagenes\\mazo.png"));
	
		lblNewLabel.setBounds(112, 0, 100, 93); 
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Steven\\eclipse-workspace\\PjSemestral\\imagenes\\yo.png"));
															

	
		lblNewLabel_2.setBounds(637, 113, 139, 169);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Steven\\eclipse-workspace\\PjSemestral\\imagenes\\images.png"));
		
		lblNewLabel_3.setBounds(610, 322, 155, 160);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Steven\\eclipse-workspace\\PjSemestral\\imagenes\\mazo.png"));
		lblNewLabel_1.setBounds(617, 20, 107, 73);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("REGRESAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Lobby lobby = new Lobby();
				
				lobby.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(332, 544, 181, 58);
		contentPane.add(btnNewButton);
	}
}


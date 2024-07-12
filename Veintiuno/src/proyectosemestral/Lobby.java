package proyectosemestral;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import proyectosemestral.Tablero;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Lobby extends JFrame {
	
	
	
	private String root = "";
	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lobby frame = new Lobby();
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
	public Lobby() {
		
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1311, 702);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(64, 0, 0));
		panel.setBackground(new Color(64, 0, 0));
		panel.setBounds(379, 46, 516, 165);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Veintiuno");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(65, 22, 362, 121);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Vladimir Script", Font.BOLD, 99));
		
		JButton btnPlayTablero = new JButton("PLAY");
		btnPlayTablero.setBounds(562, 330, 155, 56);
		contentPane.add(btnPlayTablero);
		
		btnPlayTablero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Imagenes rd = new Imagenes();
				Tablero imagen = new Tablero();
				
				
    	        root = "C:\\Users\\Steven\\eclipse-workspace\\PjSemestral\\reverso\\reverso.png";
    	       
    	        
    	      

    	        rd.redimensionar(root, imagen.reversoMazo, 175, 170);
    	        rd.redimensionar(root, imagen.reversoCard, 175, 170);
    	   
    	        imagen.setVisible(true);
    	        
    	        
    	        
				
				
				
				
			}
		});
		btnPlayTablero.setBackground(new Color(255, 255, 255));
		btnPlayTablero.setForeground(new Color(64, 0, 0));
		btnPlayTablero.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
		
		JLabel imagenDecoracion = new JLabel("");
		imagenDecoracion.setIcon(new ImageIcon("C:\\Users\\Steven\\Downloads\\honor_clubs.png"));
		imagenDecoracion.setBounds(10, 234, 505, 351);
		contentPane.add(imagenDecoracion);
		
		JLabel imagenDecoracion2 = new JLabel("");
		imagenDecoracion2.setIcon(new ImageIcon("C:\\Users\\Steven\\Downloads\\honor_diamond.png"));
		imagenDecoracion2.setBounds(782, 263, 505, 351);
		contentPane.add(imagenDecoracion2);
		
		JButton btnNewButton = new JButton("Como se juega");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Reglas reglas = new Reglas();
				reglas.setVisible(true);
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(64, 0, 0));
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.PLAIN, 15));
		btnNewButton.setBounds(562, 448, 155, 56);
		contentPane.add(btnNewButton);
		
		JButton btnCreadores = new JButton("Creadores");
		btnCreadores.setBackground(new Color(255, 255, 255));
		btnCreadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PagPresentacion presentacion = new PagPresentacion();
				Lobby lobby = new Lobby();
				presentacion.setVisible(true);
				
				
				
				
			}
		});
		btnCreadores.setFont(new Font("Viner Hand ITC", Font.PLAIN, 30));
		btnCreadores.setBounds(57, 112, 181, 56);
		contentPane.add(btnCreadores);
	}
}

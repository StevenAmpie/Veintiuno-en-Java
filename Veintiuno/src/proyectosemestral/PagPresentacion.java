package proyectosemestral;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;


public class PagPresentacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PagPresentacion frame = new PagPresentacion();
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
	public PagPresentacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 818);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("UNIVERSIDAD TECNOLOGICA DE PANAMA");
		lblNewLabel.setBounds(295, 20, 394, 79);
		lblNewLabel.setAlignmentX(CENTER_ALIGNMENT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setPreferredSize(new Dimension(600, 30));
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("FACULTAD DE INGENIERIA EN SISTEMAS COMPUTACIONALES");
		lblNewLabel_1.setBounds(233, 55, 533, 78);
		lblNewLabel_1.setAlignmentX(CENTER_ALIGNMENT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setPreferredSize(new Dimension(600, 100));
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_10 = new JLabel("DEPARTAMENTO DE PROGRAMACION");
		lblNewLabel_10.setBounds(334, 93, 355, 78);
		lblNewLabel_10.setAlignmentX(CENTER_ALIGNMENT);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_10.setPreferredSize(new Dimension(600, 100));
		contentPane.add(lblNewLabel_10);

		JLabel lblNewLabel_2 = new JLabel("LICENCIATURA EN INGENIERIA DE SOFTWARE");
		lblNewLabel_2.setBounds(305, 130, 455, 78);
		lblNewLabel_2.setAlignmentX(CENTER_ALIGNMENT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setPreferredSize(new Dimension(600, 100));
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("PROGRAMACION DE SOFTWARE I");
		lblNewLabel_3.setBounds(363, 181, 284, 89);
		lblNewLabel_3.setAlignmentX(CENTER_ALIGNMENT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setPreferredSize(new Dimension(600, 100));
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("PROYECTO FINAL");
		lblNewLabel_4.setBounds(422, 241, 165, 78);
		lblNewLabel_4.setAlignmentX(CENTER_ALIGNMENT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setPreferredSize(new Dimension(600, 100));
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("INTEGRANTES:");
		lblNewLabel_5.setBounds(432, 280, 156, 78);
		lblNewLabel_5.setAlignmentX(CENTER_ALIGNMENT);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setPreferredSize(new Dimension(600, 100));
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("STEVEN AMPIE - 20-53-7637");
		lblNewLabel_6.setBounds(374, 329, 268, 78);
		lblNewLabel_6.setAlignmentX(CENTER_ALIGNMENT);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_6.setPreferredSize(new Dimension(600, 100));
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("LINETTE BONILLA - 8-1002-823");
		lblNewLabel_7.setBounds(363, 383, 280, 78);
		lblNewLabel_7.setAlignmentX(CENTER_ALIGNMENT);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_7.setPreferredSize(new Dimension(600, 100));
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("NAYIM RODRIGUEZ - E-8-213868");
		lblNewLabel_8.setBounds(359, 445, 288, 78);
		lblNewLabel_8.setAlignmentX(CENTER_ALIGNMENT);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_8.setPreferredSize(new Dimension(600, 100));
		contentPane.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("RICARDO SOLIS - 4-828-646");
		lblNewLabel_9.setBounds(382, 501, 236, 78);
		lblNewLabel_9.setAlignmentX(CENTER_ALIGNMENT);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_9.setPreferredSize(new Dimension(600, 100));
		contentPane.add(lblNewLabel_9);

		JLabel lblNewLabel_11 = new JLabel("GRUPO 1SF123");
		lblNewLabel_11.setBounds(432, 579, 125, 78);
		lblNewLabel_11.setAlignmentX(CENTER_ALIGNMENT);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_11.setPreferredSize(new Dimension(600, 100));
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\Steven\\eclipse-workspace\\PjSemestral\\imagenes\\logofisc.png"));
		lblNewLabel_12.setBounds(58, 30, 165, 138); 
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\Steven\\eclipse-workspace\\PjSemestral\\imagenes\\logoutp.png"));
		lblNewLabel_13.setBounds(814, -35, 172, 283); 
		contentPane.add(lblNewLabel_13);
		
		JButton siguiente = new JButton("SIGUIENTE");
		
		siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Lobby lobby = new Lobby();
				lobby.setVisible(true);
				
			}
		});
		siguiente.setBounds(743, 636, 138, 79);
		contentPane.add(siguiente);

	}
}


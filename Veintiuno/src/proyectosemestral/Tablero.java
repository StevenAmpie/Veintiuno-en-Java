package proyectosemestral;

import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.util.Random;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import proyectosemestral.Tipodecarta;
import proyectosemestral.Valor;
import javax.swing.JTextPane;
import proyectosemestral.Imagenes;

public class Tablero extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private String aux1 = "";
    private String aux2="";
    private String aux3="";
    private Random random = new Random();
    public String imagePath = "C:\\Users\\Steven\\eclipse-workspace\\PjSemestral\\cards";
    private File directory = new File(imagePath);
    private String[] files = directory.list();
    private String root1="";
    private String root2="";
    private JLabel imagenCard4;
    private JLabel imagenCard3;
    public JLabel reversoCard;
    public JLabel reversoMazo;
    private String root3 = "";
    private String root4 = "";
    public String rootAux = "";
    private JLabel imagenCardDiller;
    private JLabel imagenCard1;
    private JLabel imagenCard2;
    private int cont = 1;
    private int cont2 = 1;
    private JLabel imagenCard5;
    private JButton btnPlay;
    private int indiceValor = 0;
	private int indiceValor2 = 0; 
	private int indiceValor3 = 0;
	private int indiceTipo = 0;
	private int indiceTipo2 = 0;
	private int indiceTipo3 = 0;
    private int sumCards = 0;
    private int sumCardsDiller = 0;
    private String aux4 = "";
    private String aux5 = "";
    private String aux6 = "";
    private String aux7 = "";
    private boolean flag = false;
    private boolean flag2 = true;
    private boolean paso = false;
    private JLabel cardDiller2;
    private JLabel cardDiller3;
    private JPanel fondo;
    private JPanel panel;
    private Imagenes rd = new Imagenes();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Tablero frame = new Tablero();
                    frame.setVisible(true);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Tablero() {
    	
    	File dir = new File(imagePath);
        
        dir.getName();
    	
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1336, 845);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 85, 0));
        contentPane.setForeground(new Color(0, 85, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        cardDiller3 = new JLabel("");
        cardDiller3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        cardDiller3.setBounds(784, 76, 174, 180);
        contentPane.add(cardDiller3);
        
        cardDiller2 = new JLabel("");
        cardDiller2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        cardDiller2.setBounds(701, 76, 174, 180);
        contentPane.add(cardDiller2);
        
        
        imagenCard5 = new JLabel("");
        imagenCard5.setHorizontalAlignment(SwingConstants.CENTER);
        imagenCard5.setForeground(Color.BLACK);
        imagenCard5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        imagenCard5.setBackground(Color.BLACK);
        imagenCard5.setBounds(604, 519, 162, 168);
        contentPane.add(imagenCard5);
        
        imagenCard4 = new JLabel("");
        imagenCard4.setHorizontalAlignment(SwingConstants.CENTER);
        imagenCard4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        imagenCard4.setBackground(new Color(0, 0, 0));
        imagenCard4.setForeground(new Color(0, 0, 0));
        imagenCard4.setBounds(565, 519, 162, 168);
        contentPane.add(imagenCard4);
        
        imagenCard3 = new JLabel("");
        imagenCard3.setHorizontalAlignment(SwingConstants.CENTER);
        imagenCard3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        imagenCard3.setBounds(521, 527, 162, 153);
        contentPane.add(imagenCard3);
        
        imagenCard2 = new JLabel("");
        imagenCard2.setHorizontalAlignment(SwingConstants.CENTER);
        imagenCard2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        imagenCard2.setBounds(471, 523, 167, 161);
        contentPane.add(imagenCard2);
        
        imagenCard1 = new JLabel("");
        imagenCard1.setHorizontalAlignment(SwingConstants.LEFT);
        imagenCard1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        imagenCard1.setBounds(427, 523, 167, 161);
        contentPane.add(imagenCard1);
        
        imagenCardDiller = new JLabel("");
        imagenCardDiller.setFont(new Font("Tahoma", Font.PLAIN, 20));
        imagenCardDiller.setBounds(664, 76, 192, 180);
        contentPane.add(imagenCardDiller);
        
        reversoCard = new JLabel("");
        reversoCard.setBounds(434, 82, 174, 174);
        contentPane.add(reversoCard);
        
        panel = new JPanel();
        panel.setBackground(new Color(0, 45, 0));
        panel.setBounds(51, 214, 198, 222);
        contentPane.add(panel);
        panel.setLayout(null);
        
        reversoMazo = new JLabel("");
        reversoMazo.setBounds(0, 0, 199, 222);
        panel.add(reversoMazo);
        reversoMazo.setHorizontalAlignment(SwingConstants.CENTER);
        reversoMazo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        
        fondo = new JPanel();
        fondo.setBackground(new Color(0, 0, 64));
        fondo.setBounds(23, 32, 1289, 660);
        contentPane.add(fondo);
        fondo.setLayout(null);
        
        JButton pedir = new JButton("Pedir");
        pedir.setBounds(36, 416, 187, 81);
        fondo.add(pedir);
        pedir.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
          
        
        JButton cerrarMano = new JButton("Cerrar mano");
        cerrarMano.setBounds(1090, 459, 143, 97);
        fondo.add(cerrarMano);
        cerrarMano.setFont(new Font("Viner Hand ITC", Font.PLAIN, 18));
        
        
        btnPlay = new JButton("Jugar");
        btnPlay.setBounds(56, 42, 123, 74);
        fondo.add(btnPlay);
        btnPlay.setForeground(new Color(0, 0, 0));
        btnPlay.setBackground(new Color(255, 255, 255));
        btnPlay.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(flag2 == true) {
	        		flag = true;
	        		flag2 = false;
	        		
	        		getAux();        		
        		}else {
        			
        			Tablero tablero = new Tablero();
        			JOptionPane.showMessageDialog(tablero, "TERMINA PRIMERO LA PARTIDA");
        		}
        		
        		    root1 = imagePath + "\\"+aux1;
        	        root2 = imagePath + "\\"+aux2;
        	        root3 = "C:\\Users\\Steven\\eclipse-workspace\\PjSemestral\\reverso\\reverso.png";
        	        root4= imagePath + "\\"+aux3;
        	        rd.redimensionar(root1, imagenCard1, 120, 120);
        	        rd.redimensionar(root2, imagenCard2, 120, 120);
        	        rd.redimensionar(root3, reversoMazo, 175, 170);
        	        rd.redimensionar(root3, reversoCard, 175, 170);
        	       rd.redimensionar(root4, imagenCardDiller, 120, 120);
        	        is21(sumCards);
        		
        	}
        });
        
        
        btnPlay.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
        cerrarMano.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		if(flag2 == false) {
        		getAux3();
        		
        		 if(paso == true){
        	
	        		 if(sumCardsDiller > 21){
	        			 
	        			 is21(21);
	        			 
	        		 }else if((21-sumCards) > (21-sumCardsDiller)) {
	        			 
	        			 
	        			 is21(22);
	        			 
	        			 
	        		 }else if((21-sumCards) < (21-sumCardsDiller)){
	        			 
	        			 is21(21);
	        			 
	        		 }else if(sumCards == sumCardsDiller) {
	        			 is21(0);
	        		 }
        		}
        		 
        	}else {
        			Tablero tablero = new Tablero();
        		JOptionPane.showMessageDialog(tablero, "DALE A PLAY PARA INICIAR");
        		}
        }
        });
        
        
        pedir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		if(flag == true) {
        		
	        		flag2 = false;
	        		getAux2();
        		
        		}
        		else {
        			
        			Tablero tablero = new Tablero();
        			JOptionPane.showMessageDialog(tablero, "DALE A PLAY PARA INICIAR");
        		}
        		
        		
        	}
        	
        });
         
        
        
        
        }
    	
    void is21(int sum) {
    	
    	if(sum==21){
    		
    		
    		JOptionPane.showMessageDialog(this, "HAS GANADO!", "CONGRATULATIONS", JOptionPane.INFORMATION_MESSAGE);
    		JOptionPane.showMessageDialog(this, "SI QUIERES CONTINUAR JUGANDO, PRESIONA PLAY", "CONTINUAR?", JOptionPane.INFORMATION_MESSAGE);
    	
    		imagenCard2.setIcon(null);
    		imagenCard1.setIcon(null);
    		imagenCard3.setIcon(null);
    		imagenCard4.setIcon(null);
    		imagenCard5.setIcon(null);
    		cardDiller2.setIcon(null);
    		cardDiller3.setIcon(null);
    		rd.redimensionar(root3, reversoCard, 175, 170);
    		sumCards=0;
    		cont = 1;
    		cont2=1;
    		aux2="";
    		flag = false;
    		flag2 = true;
    	}
    	else if(sum>21){
    		
    		JOptionPane.showMessageDialog(this, "HAS PERDIDO!", "QUE MALA SUERTE!", JOptionPane.INFORMATION_MESSAGE);
    		JOptionPane.showMessageDialog(this, "SI QUIERES CONTINUAR JUGANDO, PRESIONA PLAY", "CONTINUAR?", JOptionPane.INFORMATION_MESSAGE);
    		imagenCard2.setIcon(null);
    		imagenCard1.setIcon(null);
    		imagenCard3.setIcon(null);
    		imagenCard4.setIcon(null);
    		imagenCard5.setIcon(null);
    		cardDiller2.setIcon(null);
    		cardDiller3.setIcon(null);
    		rd.redimensionar(root3, reversoCard, 175, 170);
    		sumCards=0;
    		cont = 1;
    		cont2=1;
    		aux2="";
    		flag = false;
    		flag2 = true;
    		
    	}else if(sum == 0){
    		
    		JOptionPane.showMessageDialog(this, "HAS EMPATADO!", "EMPATE", JOptionPane.INFORMATION_MESSAGE);
    		JOptionPane.showMessageDialog(this, "SI QUIERES CONTINUAR JUGANDO, PRESIONA PLAY", "CONTINUAR?", JOptionPane.INFORMATION_MESSAGE);
    		imagenCard2.setIcon(null);
    		imagenCard1.setIcon(null);
    		imagenCard3.setIcon(null);
    		imagenCard4.setIcon(null);
    		imagenCard5.setIcon(null);
    		cardDiller2.setIcon(null);
    		cardDiller3.setIcon(null);
    		rd.redimensionar(root3, reversoCard, 175, 170);
    		sumCards=0;
    		cont = 1;
    		cont2=1;
    		aux2="";
    		flag = false;
    		flag2 = true;
    	}
    }
    void getAux2() {
    	
    	if (files != null) {
        	
        	aux4 = aux5;
        
        	while(aux4 == aux1 || aux4 == aux2 || aux4 == aux5 || aux4 == aux3){
        		
        		indiceValor = random.nextInt(13);
            	indiceTipo = random.nextInt(4);
            
            	
                aux4 = Valor.values()[indiceValor].getNombreValor()+Tipodecarta.values()[indiceTipo]+".png";
                aux5 = Valor.values()[indiceValor].getNombreValor()+Tipodecarta.values()[indiceTipo]+".png";
        	}
        	root1 = imagePath + "\\"+aux4;
            if(cont == 1) {
                rd.redimensionar(root1, imagenCard3, 120, 120);
                cont++;
                sumCards=sumCards+Valor.values()[indiceValor].getNumeroValor();
                System.out.println(sumCards);
                is21(sumCards);
            }else if(cont == 2) {
            	rd.redimensionar(root1,imagenCard4, 120, 120);
            	cont++;
            	 sumCards=sumCards+Valor.values()[indiceValor].getNumeroValor();
            	 System.out.println(sumCards);
            	 is21(sumCards);
            	}
            else if(cont == 3){
            	rd.redimensionar(root1,imagenCard5, 120, 120);
            	sumCards=sumCards+Valor.values().clone()[indiceValor].getNumeroValor();
            	cont = 0;
            	System.out.println(sumCards);
            	 is21(sumCards);
            }	
        }
    }
    void getAux() {
    	
    	if (files != null) {
        	
        	aux1 = aux2;
        	aux3 = aux2;
        	while(aux1 == aux2 || aux1 == aux3){
        		
        		indiceValor = random.nextInt(13);
            	indiceValor2 = random.nextInt(13);
            	indiceValor3 = random.nextInt(13);
            	
            	indiceTipo = random.nextInt(4);
            	indiceTipo2 = random.nextInt(4);
            	indiceTipo3 = random.nextInt(4);
            	
                aux1 = Valor.values()[indiceValor].getNombreValor()+Tipodecarta.values()[indiceTipo]+".png";
                aux2 = Valor.values()[indiceValor2].getNombreValor()+Tipodecarta.values()[indiceTipo2]+".png";
                aux3 = Valor.values()[indiceValor3].getNombreValor()+Tipodecarta.values()[indiceTipo3]+".png";
                
        	
        	}
        	
        	rootAux= aux3;
        	sumCards=Valor.values()[indiceValor].getNumeroValor()+
        			Valor.values()[indiceValor2].getNumeroValor();
        	sumCardsDiller = Valor.values()[indiceValor3].getNumeroValor();
        	System.out.println(sumCards);
        	System.out.println(sumCardsDiller);
        	
        }
    	
    	
    }
    
    void getAux3(){
    
    	System.out.println("Inicio"+sumCardsDiller);
    if (files != null) {
    	
		while(sumCardsDiller < 16) {
    	
			aux6 = aux7;
    	while(aux6 == aux1 || aux6 == aux2 || aux6 == aux5 || aux6 == aux3 || aux6 == aux7){
    		
    		
    		
    		indiceValor = random.nextInt(13);
        	indiceTipo = random.nextInt(4);
        
        	
            aux6 = Valor.values()[indiceValor].getNombreValor()+Tipodecarta.values()[indiceTipo]+".png";
            aux7 = Valor.values()[indiceValor].getNombreValor()+Tipodecarta.values()[indiceTipo]+".png";
    	}
    	
    	root1 = imagePath + "\\"+aux6;
    	
        if(cont2 == 1) {
            rd.redimensionar(root1, reversoCard, 120, 120);
            cont2++;
            
            sumCardsDiller=sumCardsDiller+Valor.values()[indiceValor].getNumeroValor();
            
           
        }else if(cont2 == 2){
        	rd.redimensionar(root1, cardDiller2, 120, 120);
            cont2++;
            sumCardsDiller=sumCardsDiller+Valor.values()[indiceValor].getNumeroValor();
           
        	
        }else if(cont2 == 3){
        	
	        	rd.redimensionar(root1, cardDiller3, 120, 120);
	            cont2++;
	            sumCardsDiller=sumCardsDiller+Valor.values()[indiceValor].getNumeroValor();
	           
	            }
        	}	paso = true;
    	}
	} 
}


package proyectosemestral;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagenes {
	
	
	
	
	
	
	
	private BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_ARGB);
        java.awt.Graphics2D g2 = resizedImage.createGraphics();
        g2.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
        g2.dispose();
        return resizedImage;
    }
	
	
	
	
	void redimensionar(String ruta1, JLabel carta, int ancho, int largo) {
        BufferedImage originalImage1 = null;
       
 
        try {
            originalImage1 = ImageIO.read(new File(ruta1));
          
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        if (originalImage1 != null) {
            // Redimensionar la imagen
            BufferedImage resizedImage1 = resizeImage(originalImage1, ancho, largo); // Cambia el tamaño aquí
            
            // Crear un ImageIcon con la imagen redimensionada
            ImageIcon icon1 = new ImageIcon(resizedImage1);
            
            
           
           carta.setIcon(icon1);
           
          
       
        }
       }

}

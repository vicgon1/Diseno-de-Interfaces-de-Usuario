package com.mycompany.practica7;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


/**
 *
 * @author Víctor
 */
public class Lienzo extends JPanel{
   
    
    BufferedImage imagen = null;
    
    public Lienzo() throws IOException{
   
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
        
        }
    public void setImagen(File fichero) throws IOException{
        imagen = ImageIO.read(fichero);
        this.setPreferredSize(new Dimension(imagen.getWidth(),imagen.getHeight()));
        
    }
    
   
        
}
    
    
  
    


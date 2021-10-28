package com.mycompany.practica6;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author Víctor y Xavi
 */
public class Lienzo extends JPanel{
    private BufferedImage imagen;
    private BufferedImage imagenActual;
    private String imagenActNom;
    public Lienzo() {
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(imagenActual != null){
            g.drawImage(imagenActual, 0, 0, null);
        }
    }
     void cargarIm(File fileSelected) throws MalformedURLException, IOException {
        setImagen(fileSelected);
        Graphics g = this.getGraphics();  
        this.paintComponent(g);
    }
     
       private void cargarImActual() {
        Graphics g = this.getGraphics();  
        this.paintComponent(g);
    }
       
      private void setImagen(File fileSelected) throws IOException {
        imagen = ImageIO.read(fileSelected);
        imagenActual = imagen;
        imagenActNom = fileSelected.getName();
    }
    
    public BufferedImage getImagenAct(){
        return this.imagenActual;
    }
    
    public void thresholdPicture(int factor) throws IOException{
        Mat tresholdedMat = umbralizar(BufferedImageToMat(imagen), factor);
        imagenActual = BufferedImageToMat(tresholdedMat);
        cargarImActual();
    }
    
    public static Mat BufferedImageToMat(BufferedImage image) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", byteArrayOutputStream);
        byteArrayOutputStream.flush();
        return Imgcodecs.imdecode(new MatOfByte(byteArrayOutputStream.toByteArray()), Imgcodecs.IMREAD_UNCHANGED);
    }
    
    public static BufferedImage BufferedImageToMat(Mat matrix)throws IOException {
        MatOfByte mob=new MatOfByte();
        Imgcodecs.imencode(".jpg", matrix, mob);
        return ImageIO.read(new ByteArrayInputStream(mob.toArray()));
    }
    
    Mat umbralizar(Mat imagen_original, Integer umbral) {
        Mat imagenGris = new Mat(imagen_original.rows(),
                imagen_original.cols(),
                CvType.CV_8U);
        Mat imagenUmbralizada = new Mat(imagen_original.rows(),
                imagen_original.cols(),
                CvType.CV_8U);
        Imgproc.cvtColor(imagen_original,imagenGris,Imgproc.COLOR_BGR2GRAY);
        Imgproc.threshold(imagenGris,imagenUmbralizada,umbral,255,Imgproc.THRESH_BINARY);
        return imagenUmbralizada;
}
      public String getImagenNombre() {
        return imagenActNom.substring(0, imagenActNom.lastIndexOf("."));
    }

    
    public String getImagenFormato(){
        return imagenActNom.substring(imagenActNom.lastIndexOf("."));
    }
}

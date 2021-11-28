package com.mycompany.practica10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

/**
 *
 * @author Víctor
 */
public class fileCompress extends SwingWorker<Void, Integer> {
    
    private List<String> files;
    private String destino, origen;
    private JProgressBar progreso;
    
    public fileCompress(List<String> files, String dest, String origen, JProgressBar progreso){
        this.files = files;
        this.destino = dest;
        this.origen = origen;
        this.progreso = progreso;
    }
  @Override
    public Void doInBackground() throws Exception{
       
        int BUFFER_SIZE = 65536;
        int cont = 0;
        int percentage = 100/files.size();
        
        try{
            // Objeto para referenciar a los archivos que queremos comprimir
            BufferedInputStream origin = null;
            // Objeto para referenciar el archivo zip de salida
            FileOutputStream dest = new FileOutputStream(destino);
            ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(dest));
            
            // Buffer de transferencia para almacenar datos a comprimir
            byte[] data = new byte[BUFFER_SIZE];
            
            Iterator i = files.iterator();
            while(i.hasNext()){
                
                progreso.setValue(cont+=percentage);
                String filename = (String)i.next();
                System.out.println(filename);
                FileInputStream fi = new FileInputStream(origen + "\\" + filename);
                origin = new BufferedInputStream(fi, BUFFER_SIZE);
                ZipEntry entry = new ZipEntry( filename );
                
                out.putNextEntry( entry );
                // Leemos datos desde el archivo origen y se envían al archivo destino
                int count;
                
                while((count = origin.read(data, 0, BUFFER_SIZE)) != -1){
                    out.write(data, 0, count);
                }
                // Cerramos el archivo origen, ya enviado a comprimir
                origin.close();
                
                Thread.sleep(1000);
            }
            
            // Cerramos el archivo zip
            out.close();
            progreso.setValue(100);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public void done(){
        System.out.println("Done");
    }
}
    
    


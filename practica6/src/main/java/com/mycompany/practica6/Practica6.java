package com.mycompany.practica6;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;


/**
 *
 * @author Víctor y Xavi
 */
public class Practica6 extends javax.swing.JFrame {

    JFileChooser fc = new JFileChooser();
    FileNameExtensionFilter filtro = null;
    public Practica6() {
        initComponents();
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        setImageExtensionsFilter();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo1 = new com.mycompany.practica6.Lienzo();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuUmbral = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        menuFile.setMnemonic('F');
        menuFile.setText("File");

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        menuFile.add(open);

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        menuFile.add(save);
        menuFile.add(jSeparator1);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menuFile.add(exit);

        jMenuBar1.add(menuFile);

        menuEdit.setMnemonic('E');
        menuEdit.setText("Edit");

        menuUmbral.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuUmbral.setText("Umbralizar");
        menuUmbral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUmbralActionPerformed(evt);
            }
        });
        menuEdit.add(menuUmbral);

        jMenuBar1.add(menuEdit);

        menuHelp.setMnemonic('H');
        menuHelp.setText("Help");

        menuAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        menuHelp.add(menuAbout);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
      
        int res = fc.showOpenDialog(null);
        if(res == JFileChooser.APPROVE_OPTION){
            File fichero = fc.getSelectedFile();
            if(filtro.accept(fichero)){
                try {
                    lienzo1.cargarIm(fichero);
                     enableSaveEditOptions();
                } catch (IOException ex) {
                    Logger.getLogger(Practica6.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (res == JFileChooser.CANCEL_OPTION){
        }
    }//GEN-LAST:event_openActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        File outputFile = new File(lienzo1.getImagenNombre() + "_modified" + this.lienzo1.getImagenFormato());
        fc.setSelectedFile(outputFile);
        int jFileChooserOptionSelected = fc.showSaveDialog(this);
        try {
            saveCurrentImage(jFileChooserOptionSelected, outputFile);
        } catch (IOException ex) {
            Logger.getLogger(Practica6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void menuUmbralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUmbralActionPerformed

        String input = JOptionPane.showInputDialog("Inserte el factor de umbral: ");
        if(inputIsValido(input)){
            try {
                lienzo1.thresholdPicture(Integer.parseInt(input));
            } catch (IOException ex) {
                Logger.getLogger(Practica6.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ERROR: Debe ser un número entero", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_menuUmbralActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed

        JOptionPane.showMessageDialog(rootPane, "Ayuda:\n"
                + "1. Haga clic en File/Open para seleccionar la imagen\n"
                + "2. Haciendo clic en Edit/Umbralizar le aparecerá un diálogo solicitando el factor para el umbral:\n"
                + "   - Debe ser Entero.\n"
                + "   - Puede umbralizarse cuantas veces se quiera.\n"
                + "3. Haga click en File/Save una vez haya finalizado para conservar sus cambios.\n"
                + "4. Para cerrar la aplicación, haga click en File/Exit");
    }//GEN-LAST:event_menuAboutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        System.out.println("SALIR");
        int res = JOptionPane.showConfirmDialog(rootPane, "¿Desea salir de la aplicación?", "Confirmación de Salir", JOptionPane.YES_NO_OPTION,JOptionPane.CLOSED_OPTION);
        if(res==0){
            this.setVisible(false);
        }
    }//GEN-LAST:event_exitActionPerformed

    private boolean inputIsValido(String input) {
        try {
            int parseInt = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
   
    private void saveCurrentImage(int jFileChooserOptionSelected, File outputFile) throws IOException {
        if(jFileChooserOptionSelected == JFileChooser.APPROVE_OPTION){
            String fileToSave = fc.getCurrentDirectory() + "\\" + outputFile.getName();
            ImageIO.write(lienzo1.getImagenAct(), "jpg", new File(fileToSave));
        }
    }
     
    private void setImageExtensionsFilter() {
        this.filtro = new FileNameExtensionFilter("Image extensions","png","jpg","jpeg");
        this.fc.addChoosableFileFilter(filtro);
        
    }
     public void enableSaveEditOptions() {
        save.setEnabled(true);
        menuUmbral.setEnabled(true);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Practica6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private com.mycompany.practica6.Lienzo lienzo1;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuUmbral;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem save;
    // End of variables declaration//GEN-END:variables
}

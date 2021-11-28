package com.mycompany.practica10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Víctor
 */
public class Practica10 extends javax.swing.JFrame {
     JFileChooser fc = new JFileChooser();
     FileNameExtensionFilter filtro = null;
     DefaultListModel modeloFichero = new DefaultListModel();
     String origen;
     File ficheroComprimido;
     List<String> files = new ArrayList<String>();
     String[] names = new String[0];
     fileCompress fichComp;
    
    
    
    public Practica10() {
        initComponents();
        barraProgreso.setStringPainted(true);
        String uDir = System.getProperty("user.home");
        fc.setCurrentDirectory(new File(uDir+"/Desktop"));
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        botCompress.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listFiles = new javax.swing.JList<>();
        botCompress = new javax.swing.JButton();
        barraProgreso = new javax.swing.JProgressBar();
        infoBarra = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuOpen = new javax.swing.JMenuItem();
        menuClose = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuExit = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();
        menuInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listFiles);

        botCompress.setText("Comprimir");
        botCompress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botCompressActionPerformed(evt);
            }
        });

        infoBarra.setText("Progreso de la tarea: ");

        menuFile.setMnemonic('F');
        menuFile.setText("File");

        menuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuOpen.setText("Open");
        menuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenActionPerformed(evt);
            }
        });
        menuFile.add(menuOpen);

        menuClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuClose.setText("Close");
        menuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCloseActionPerformed(evt);
            }
        });
        menuFile.add(menuClose);
        menuFile.add(jSeparator1);

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        jMenuBar1.add(menuFile);

        menuAbout.setMnemonic('A');
        menuAbout.setText("About");

        menuInfo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuInfo.setText("Info");
        menuInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfoActionPerformed(evt);
            }
        });
        menuAbout.add(menuInfo);

        jMenuBar1.add(menuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botCompress)
                        .addGap(73, 73, 73)
                        .addComponent(barraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoBarra)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(infoBarra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botCompress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCloseActionPerformed
        int res = JOptionPane.showConfirmDialog(rootPane, "¿Quiere cerrar todos los archivos?", "Cerrar", JOptionPane.YES_NO_OPTION);

        if (res == JOptionPane.YES_OPTION) {
            
         
        }
    }//GEN-LAST:event_menuCloseActionPerformed

    private void menuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenActionPerformed
        int res = fc.showOpenDialog(null);
        
        if (res == JFileChooser.APPROVE_OPTION) {
            
            File fichero = fc.getSelectedFile();
            origen = fichero.getAbsolutePath();
            File[] selFich = fc.getSelectedFile().listFiles();
            modeloFichero.removeAllElements();
            
            for(File file : selFich){
                modeloFichero.addElement(file.getName());
            }
            
            listFiles.setModel(modeloFichero);
            botCompress.setVisible(true);
        }
        if (res == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "Porfavor selecciona un archivo válido", "Archivo no seleccionado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuOpenActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed

         int res = JOptionPane.showConfirmDialog(rootPane, "¿Desea salir de la aplicación?", "Confirmación de Salir", JOptionPane.YES_NO_OPTION,JOptionPane.CLOSED_OPTION);
        if(res==0){
            this.setVisible(false);
        }
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfoActionPerformed

         JOptionPane.showMessageDialog(rootPane,
            " Aplicación de Compresión de Archivos"
            + "\n \t 1. Abra el directorio. (Alt+F) y (Ctrl+O)"
            + "\n \t 2. Seleccione los archivos que desea comprimir."
            + "\n \t 3. Haga click en el botón de Comprimir."
            + "\n \t 4. Visualice el desarrolo gracias a la barra de progreso."
            + "\n \t 5. Guarde la carpeta comprimida donde desee.",
            "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuInfoActionPerformed

    private void botCompressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botCompressActionPerformed

        fc.removeChoosableFileFilter(fc.getAcceptAllFileFilter()); 
        filtro = new FileNameExtensionFilter("7Zip Compressed Files (*.zip)", "zip");
        fc.addChoosableFileFilter(filtro);
        
        int res = fc.showSaveDialog(null);
        
        if (res == JFileChooser.APPROVE_OPTION) {
            ficheroComprimido = fc.getSelectedFile();
            int resComp = JOptionPane.showConfirmDialog(rootPane, "¿Guardar los archivos " + ficheroComprimido.getName() + "?", "Comprimir y guardar", JOptionPane.YES_NO_OPTION);
            
            if (resComp == JOptionPane.YES_OPTION) {
                int[] selec = listFiles.getSelectedIndices();
                names = new String[selec.length];
        
                for(int i=0;i<selec.length;i++){
                    names[i] = (String) modeloFichero.getElementAt(selec[i]);
                    System.out.println(names[i]);
                }
                for (int i = 0; i < names.length; i++) {
                    files.add(names[i]);
                }
                
                try {
                    fichComp = new fileCompress(files, ficheroComprimido.getAbsolutePath()+".zip", origen, barraProgreso);
                    fichComp.doInBackground();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Los fichero" + ficheroComprimido.getName() + " no han sido comprimidos", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                JOptionPane.showMessageDialog(rootPane, "Los ficheros han sido comprimidos a  " + ficheroComprimido.getName() + " y guardados ", "Comprimido con éxito", JOptionPane.INFORMATION_MESSAGE);
            }
            if (resComp == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(rootPane, ficheroComprimido.getName() + "No guardado", "Error de guardado", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (res == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "Selecciona un archivo correcto", "Error de guardado", JOptionPane.ERROR_MESSAGE);
        }
    
            
    }//GEN-LAST:event_botCompressActionPerformed
    
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
            java.util.logging.Logger.getLogger(Practica10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton botCompress;
    private javax.swing.JLabel infoBarra;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JList<String> listFiles;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuItem menuClose;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuInfo;
    private javax.swing.JMenuItem menuOpen;
    // End of variables declaration//GEN-END:variables
}

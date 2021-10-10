
import java.util.Random;
/**
 *
 * @author Víctor
 */
public class Practica3 extends javax.swing.JFrame {
    int valorMax;
    int valorMin;
    int M[][];
    

    public Practica3() {
        initComponents();
        
        barraDeslizante.setMajorTickSpacing(5);
        barraDeslizante.setMinorTickSpacing(1);
        barraDeslizante.setPaintTicks(true);
        barraDeslizante.setPaintLabels(true);
        areaTexto1.setEditable(false);
        areaTexto2.setEditable(false);
        }

    private void muestraMatriz(){
       String s="";
        for(int i=0;i<M.length;i++){
             for(int j=0;j<M.length;j++){
                s+=M[i][j]+"  ";
            }
            s+="\n";
        }
        areaTexto1.setText(s);
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelArriba = new javax.swing.JPanel();
        barraDeslizante = new javax.swing.JSlider();
        etiqueta1 = new javax.swing.JLabel();
        etiqueta2 = new javax.swing.JLabel();
        valorMinimo = new javax.swing.JTextField();
        valorMaximo = new javax.swing.JTextField();
        panelAbajo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTexto2 = new javax.swing.JTextArea();
        etiqueta3 = new javax.swing.JLabel();
        etiqueta4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelArriba.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        barraDeslizante.setToolTipText("Selecciona un número para actualizar la matriz");
        barraDeslizante.setValue(0);
        barraDeslizante.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraDeslizanteStateChanged(evt);
            }
        });

        etiqueta1.setText("Introduce valor minimo:");
        etiqueta1.setToolTipText("");

        etiqueta2.setText("Introduce valor máximo:");

        valorMinimo.setToolTipText("Pulsa enter para que reciba el valor");
        valorMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorMinimoActionPerformed(evt);
            }
        });

        valorMaximo.setToolTipText("Pulsa enter 2 veces para realizar la matriz");
        valorMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorMaximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelArribaLayout = new javax.swing.GroupLayout(panelArriba);
        panelArriba.setLayout(panelArribaLayout);
        panelArribaLayout.setHorizontalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArribaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraDeslizante, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                    .addGroup(panelArribaLayout.createSequentialGroup()
                        .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta1)
                            .addComponent(etiqueta2))
                        .addGap(28, 28, 28)
                        .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(valorMinimo)
                            .addComponent(valorMaximo, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelArribaLayout.setVerticalGroup(
            panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArribaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta1)
                    .addComponent(valorMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelArribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiqueta2)
                    .addComponent(valorMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(barraDeslizante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelAbajo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jScrollPane1.setVerifyInputWhenFocusTarget(false);

        areaTexto1.setColumns(20);
        areaTexto1.setRows(5);
        areaTexto1.setMinimumSize(new java.awt.Dimension(23, 23));
        jScrollPane1.setViewportView(areaTexto1);

        jScrollPane2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        areaTexto2.setColumns(20);
        areaTexto2.setRows(5);
        areaTexto2.setMinimumSize(new java.awt.Dimension(23, 23));
        jScrollPane2.setViewportView(areaTexto2);

        etiqueta3.setForeground(new java.awt.Color(204, 0, 0));
        etiqueta3.setText("Matriz aleatoria ");

        etiqueta4.setForeground(new java.awt.Color(204, 0, 0));
        etiqueta4.setText("Matriz actualizada");

        javax.swing.GroupLayout panelAbajoLayout = new javax.swing.GroupLayout(panelAbajo);
        panelAbajo.setLayout(panelAbajoLayout);
        panelAbajoLayout.setHorizontalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAbajoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(95, 95, 95)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelAbajoLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(etiqueta3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiqueta4)
                .addGap(89, 89, 89))
        );
        panelAbajoLayout.setVerticalGroup(
            panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAbajoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta3)
                    .addComponent(etiqueta4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAbajoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelArriba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraDeslizanteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraDeslizanteStateChanged
        
         valorMin= Integer.parseInt(valorMinimo.getText());
         valorMax= Integer.parseInt(valorMaximo.getText());
         String m="";
         int valorMatrix = barraDeslizante.getValue();
         
          for(int i=0;i<M.length;i++){
            for (int j=0;j<M.length;j++){
                if(M[i][j]>valorMatrix){
                      m+=M[i][j]+"  ";
                 }else{
                     m+="--    ";
                 }
             }
             m+="\n";
         }
         areaTexto2.setText(m);     
    }//GEN-LAST:event_barraDeslizanteStateChanged

    private void valorMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorMinimoActionPerformed
         valorMin= Integer.parseInt(valorMinimo.getText());
         barraDeslizante.setMinimum(valorMin);
    }//GEN-LAST:event_valorMinimoActionPerformed

    private void valorMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorMaximoActionPerformed
        Random r= new Random();
        valorMax= Integer.parseInt(valorMaximo.getText());
        barraDeslizante.setMaximum(valorMax);
        M = new int[10][10];
        for(int i=0;i<M.length;i++){
            for (int j=0;j<M.length;j++){
                M[i][j]=r.nextInt(valorMax-valorMin+1)+valorMin;
                 }
        }
        muestraMatriz();   
    }//GEN-LAST:event_valorMaximoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Practica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto1;
    private javax.swing.JTextArea areaTexto2;
    private javax.swing.JSlider barraDeslizante;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JLabel etiqueta3;
    private javax.swing.JLabel etiqueta4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelAbajo;
    private javax.swing.JPanel panelArriba;
    private javax.swing.JTextField valorMaximo;
    private javax.swing.JTextField valorMinimo;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;
import Logic.ProducerConsumer;
import Logic.Consumer;
import Logic.Producer;
import javax.swing.DefaultListModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
/**
 *
 * @author gerar
 */
public class ThreadsVisual extends javax.swing.JFrame {

    ProducerConsumer pc = null;
    Consumer cs = null;
    Producer prod = null;
    public DefaultListModel ProduceConsumerModel;
    
    
    public ThreadsVisual() {
        initComponents();
        imgBox1.setVisible(false);
        imgBox2.setVisible(false);
        imgBox3.setVisible(false);
        imgBox4.setVisible(false);
        imgBox5.setVisible(false);
        imgBox6.setVisible(false);
        imgBox7.setVisible(false);
        imgBox8.setVisible(false);
        imgBox9.setVisible(false);
        imgBox10.setVisible(false);
        imgBox11.setVisible(false);
        imgBox12.setVisible(false);
        imgBox13.setVisible(false);
        imgBox14.setVisible(false);
        imgBox15.setVisible(false);
        imgBox16.setVisible(false);
        lblAcumulado.setVisible(false);
        txtAcumulado.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlTop = new javax.swing.JPanel();
        pnlVelocidad = new javax.swing.JPanel();
        lblVelocidad = new javax.swing.JLabel();
        btnVelocidad = new javax.swing.JButton();
        txtVelocidad = new javax.swing.JTextField();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        pnlCapacidad = new javax.swing.JPanel();
        btnCapacidad = new javax.swing.JButton();
        lblCapacidad = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        pnlBottom = new javax.swing.JPanel();
        pnlDiseño = new javax.swing.JPanel();
        imgBox1 = new javax.swing.JLabel();
        imgBox2 = new javax.swing.JLabel();
        imgBox3 = new javax.swing.JLabel();
        imgBox4 = new javax.swing.JLabel();
        imgBox9 = new javax.swing.JLabel();
        imgBox5 = new javax.swing.JLabel();
        imgBox6 = new javax.swing.JLabel();
        imgBox7 = new javax.swing.JLabel();
        imgBox8 = new javax.swing.JLabel();
        imgBox10 = new javax.swing.JLabel();
        imgBox11 = new javax.swing.JLabel();
        imgBox12 = new javax.swing.JLabel();
        imgBox13 = new javax.swing.JLabel();
        imgBox14 = new javax.swing.JLabel();
        imgBox15 = new javax.swing.JLabel();
        imgBox16 = new javax.swing.JLabel();
        lblAcumulado = new javax.swing.JLabel();
        txtAcumulado = new javax.swing.JTextField();
        pnlCantidades = new javax.swing.JPanel();
        lblProducido = new javax.swing.JLabel();
        lblCantidadProducido = new javax.swing.JLabel();
        lblConsumido = new javax.swing.JLabel();
        lblCantidadConsumido = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        lblCantidadStock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTop.setLayout(new java.awt.GridLayout(1, 0));

        pnlVelocidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVelocidad.setText("Cambiar velocidad en milisegundos:");
        pnlVelocidad.add(lblVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, -1));

        btnVelocidad.setText("Cambiar");
        btnVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVelocidadActionPerformed(evt);
            }
        });
        pnlVelocidad.add(btnVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        txtVelocidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtVelocidad.setText("1000");
        pnlVelocidad.add(txtVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, -1));

        pnlTop.add(pnlVelocidad);

        pnlTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setText("Productor-consumidor");
        pnlTitulo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        pnlTitulo.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        pnlTop.add(pnlTitulo);

        pnlCapacidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCapacidad.setText("Cambiar");
        btnCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapacidadActionPerformed(evt);
            }
        });
        pnlCapacidad.add(btnCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        lblCapacidad.setText("Modificar capacidad:");
        pnlCapacidad.add(lblCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        txtCapacidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCapacidad.setText("10");
        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });
        pnlCapacidad.add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 110, -1));

        pnlTop.add(pnlCapacidad);

        getContentPane().add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlBottom.setLayout(new java.awt.GridLayout(1, 0));

        pnlDiseño.setLayout(new java.awt.GridBagLayout());

        imgBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox1, gridBagConstraints);

        imgBox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox2, gridBagConstraints);

        imgBox3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox3, gridBagConstraints);

        imgBox4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox4, gridBagConstraints);

        imgBox9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox9, gridBagConstraints);

        imgBox5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox5, gridBagConstraints);

        imgBox6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox6, gridBagConstraints);

        imgBox7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox7, gridBagConstraints);

        imgBox8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox8, gridBagConstraints);

        imgBox10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox10, gridBagConstraints);

        imgBox11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox11, gridBagConstraints);

        imgBox12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox12, gridBagConstraints);

        imgBox13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox13, gridBagConstraints);

        imgBox14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox14, gridBagConstraints);

        imgBox15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox15, gridBagConstraints);

        imgBox16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/box.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(imgBox16, gridBagConstraints);

        lblAcumulado.setText("Acumulados:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        pnlDiseño.add(lblAcumulado, gridBagConstraints);

        txtAcumulado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAcumulado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAcumulado.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pnlDiseño.add(txtAcumulado, gridBagConstraints);

        pnlBottom.add(pnlDiseño);

        pnlCantidades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProducido.setText("Producido:");
        pnlCantidades.add(lblProducido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 60, -1));

        lblCantidadProducido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadProducido.setText("0");
        lblCantidadProducido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlCantidades.add(lblCantidadProducido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 60, -1));

        lblConsumido.setText("Consumido:");
        pnlCantidades.add(lblConsumido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 70, -1));

        lblCantidadConsumido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadConsumido.setText("0");
        pnlCantidades.add(lblCantidadConsumido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 60, -1));

        lblStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStock.setText("Stock:");
        pnlCantidades.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 60, -1));

        lblCantidadStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadStock.setText("0");
        pnlCantidades.add(lblCantidadStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 60, -1));

        pnlBottom.add(pnlCantidades);

        getContentPane().add(pnlBottom, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapacidadActionPerformed

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
           
        JLabel[] cajas = new JLabel[16];
        cajas[0] = this.imgBox1;
        cajas[1] = this.imgBox2;
        cajas[2] = this.imgBox3;
        cajas[3] = this.imgBox4;
        cajas[4] = this.imgBox5;
        cajas[5] = this.imgBox6;
        cajas[6] = this.imgBox7;
        cajas[7] = this.imgBox8;
        cajas[8] = this.imgBox9;
        cajas[9] = this.imgBox10;
        cajas[10] = this.imgBox11;
        cajas[11] = this.imgBox12;
        cajas[12] = this.imgBox13;
        cajas[13] = this.imgBox14;
        cajas[14] = this.imgBox15;
        cajas[15] = this.imgBox16;
        
        
        pc = new ProducerConsumer(this, this.lblCantidadProducido, this.lblCantidadConsumido, this.lblCantidadStock, cajas);
        
        cs = new Consumer(pc);
        prod = new Producer(pc);
        
        Thread thread1 = new Thread(cs);
        Thread thread2 = new Thread(prod);
        
        thread1.start();
        thread2.start();
                
//        try {
//            thread1.join();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(ThreadsVisual.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            thread2.join();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(ThreadsVisual.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVelocidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVelocidadActionPerformed

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
            java.util.logging.Logger.getLogger(ThreadsVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreadsVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreadsVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreadsVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThreadsVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapacidad;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnVelocidad;
    private javax.swing.JLabel imgBox1;
    private javax.swing.JLabel imgBox10;
    private javax.swing.JLabel imgBox11;
    private javax.swing.JLabel imgBox12;
    private javax.swing.JLabel imgBox13;
    private javax.swing.JLabel imgBox14;
    private javax.swing.JLabel imgBox15;
    private javax.swing.JLabel imgBox16;
    private javax.swing.JLabel imgBox2;
    private javax.swing.JLabel imgBox3;
    private javax.swing.JLabel imgBox4;
    private javax.swing.JLabel imgBox5;
    private javax.swing.JLabel imgBox6;
    private javax.swing.JLabel imgBox7;
    private javax.swing.JLabel imgBox8;
    private javax.swing.JLabel imgBox9;
    private javax.swing.JLabel lblAcumulado;
    private javax.swing.JLabel lblCantidadConsumido;
    private javax.swing.JLabel lblCantidadProducido;
    private javax.swing.JLabel lblCantidadStock;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblConsumido;
    private javax.swing.JLabel lblProducido;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlCantidades;
    private javax.swing.JPanel pnlCapacidad;
    private javax.swing.JPanel pnlDiseño;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel pnlVelocidad;
    private javax.swing.JTextField txtAcumulado;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtVelocidad;
    // End of variables declaration//GEN-END:variables
}

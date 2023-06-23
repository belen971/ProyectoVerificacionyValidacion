
package Hilos;

import javax.swing.JLabel;

/**
 * Este método contiene el código de inicialización de los componentes de la interfaz gráfica.
 * 
 * @author GRUPO#2
 * 
 *
 */
public class FrmCarrera extends javax.swing.JDialog {

  public FrmCarrera(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
  }
  
  public JLabel getLblAuto1() {
    return lblAuto1;
  }
  
  public JLabel getLblAuto2() {
    return lblAuto2;
  }
  
  public JLabel getLblMeta() {
    return lblMeta;
  }
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    btnInciarPartida = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    lblMeta = new javax.swing.JLabel();
    lblAuto2 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    lblAuto1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 153, 0));
    jLabel1.setText("CARRERA DE AUTOS");

    btnInciarPartida.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
    btnInciarPartida.setForeground(new java.awt.Color(0, 0, 153));
    btnInciarPartida.setText("INICIAR PARTIDA");
    btnInciarPartida.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnInciarPartidaActionPerformed(evt);
        }
        });

    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(
        new java.awt.Color(0, 0, 0), 2));

    lblMeta.setBorder(javax.swing.BorderFactory.createLineBorder(
        new java.awt.Color(0, 204, 204), 30));

    lblAuto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hilos/carro.png"))); 
    // NOI18N

    jLabel2.setText("_________________________________"
          + "_________________________________________");

    jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jLabel3.setText("1");

    jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jLabel4.setText("2");

    lblAuto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hilos/carro.png"))); 
    // NOI18N

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax
                .swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax
                        .swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax
                                .swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblAuto2, 
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax
                                .swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel4, javax.swing.GroupLayout
                                        .PREFERRED_SIZE, 
                                        30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel3, javax.swing.GroupLayout
                                        .PREFERRED_SIZE, 
                                        19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAuto1, javax.swing.GroupLayout.PREFERRED_SIZE,
                        83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblMeta)
                .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lblAuto1, javax.swing.GroupLayout.PREFERRED_SIZE, 
                47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(16, 16, 16)
                .addComponent(lblAuto2, javax.swing.GroupLayout.PREFERRED_SIZE, 
                47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
            .addComponent(lblMeta, javax.swing.GroupLayout.DEFAULT_SIZE, 
            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnInciarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 
                314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 
                33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInciarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 
                33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  private void btnInciarPartidaActionPerformed(java.awt.event.ActionEvent evt) { 
    //GEN-FIRST:event_btnInciarPartidaActionPerformed
    lblAuto1.setLocation(0, lblAuto1.getLocation().y);
    lblAuto2.setLocation(0, lblAuto2.getLocation().y);
    Carrera hilo1 = new Carrera(lblAuto1, this);
    Carrera hilo2 = new Carrera(lblAuto2, this);
    hilo1.start();
    hilo2.start();
  }
  //GEN-LAST:event_btnInciarPartidaActionPerformed

  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
    */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : 
            javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(FrmCarrera.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrmCarrera.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrmCarrera.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrmCarrera.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
          FrmCarrera dialog = new FrmCarrera(new javax.swing.JFrame(), true);
          dialog.addWindowListener(new java.awt.event.WindowAdapter() {
              @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                  System.exit(0);
                }
              });
          dialog.setVisible(true);
        }
        });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnInciarPartida;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;  
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lblAuto1;
  private javax.swing.JLabel lblAuto2;
  private javax.swing.JLabel lblMeta;
  // End of variables declaration//GEN-END:variables
}

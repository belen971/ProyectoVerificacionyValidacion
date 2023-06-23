
package Visual;

import javax.swing.JOptionPane;

public class FrmLogin extends javax.swing.JDialog {
    
  public FrmLogin(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    lblTotal = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    btnIngresar = new javax.swing.JButton();
    txtUsuario = new javax.swing.JTextField();
    txtPassword = new javax.swing.JTextField();

    jLabel1.setText("Total:");

    lblTotal.setText("______");

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jLabel3.setText("Usuario:");

    jLabel4.setText("Contraseña:");

    btnIngresar.setText("Ingresar");
    btnIngresar.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnIngresarActionPerformed(evt);
          }
        });

    txtUsuario.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtUsuarioActionPerformed(evt);
          }
        });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                    62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment
                .LEADING, false)
                    .addComponent(txtUsuario)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 
                    117, Short.MAX_VALUE))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 
                77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 
                25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
  } //GEN-LAST:event_txtUsuarioActionPerformed

  private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_btnIngresarActionPerformed
    String  usuario = txtUsuario.getText().trim();
    String password = txtPassword.getText().trim();
                
    if (!usuario.isEmpty() && !password.isEmpty()) {
      if (usuario.equals("admin") && password.equals("admin")) {
        new FrmMenu().setVisible(true);
        dispose();
      } else {
        JOptionPane.showMessageDialog(null, "CREDENCIALES INCORRECTAS");
      }
    } else {
      JOptionPane.showMessageDialog(null, "LLENE TODO LOS CAMPOS");
    }
            
  } //GEN-LAST:event_btnIngresarActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnIngresar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel lblTotal;
  private javax.swing.JTextField txtPassword;
  private javax.swing.JTextField txtUsuario;
  // End of variables declaration//GEN-END:variables
}

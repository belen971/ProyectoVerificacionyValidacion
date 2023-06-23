package Visual;

import control.AdmConserje;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FrmBuscarConserje extends javax.swing.JDialog {
  AdmConserje adm = AdmConserje.getAdmConserje();
  int posicion;
  JFrame menu = null;
  
  public FrmBuscarConserje(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    menu = (JFrame) parent;
  }
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    btnBuscar = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    txtCedula = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Búsqueda del Conserje");

    btnBuscar.setText("Buscar");
    btnBuscar.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBuscarActionPerformed(evt);
        }
        });

    jLabel3.setText("Cedula: ");

    txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtCedulaKeyTyped(evt);
          }
        });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 
                88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar))
                .addContainerGap(33, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_btnBuscarActionPerformed
    String cedula = txtCedula.getText().trim();
    int i = - 1;
    if (!cedula.isEmpty()) {
      i = adm.buscarCedula(cedula, posicion); 
      // si es -1 no existe la cedula
      if (i >= 0) {
        if (txtCedula.getText().length() == 10) {
          this.dispose();
          FrmEditarDocente dialog = new FrmEditarDocente(i, menu, true);
        } else {
          JOptionPane.showMessageDialog(null, "CEDULA INCOMPLETA");
        }
      } else {
        JOptionPane.showMessageDialog(null, "NO EXISTE UN ESTUDIANTE CON ESA CEDULA");
      }
    }
  } //GEN-LAST:event_btnBuscarActionPerformed

  private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {
    //GEN-FIRST:event_txtCedulaKeyTyped
    char c = evt.getKeyChar();
    if (!Character.isDigit(c) || txtCedula.getText().length() >= 10) {
      evt.consume();
    }
  } //GEN-LAST:event_txtCedulaKeyTyped

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBuscar;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JTextField txtCedula;
  // End of variables declaration//GEN-END:variables
}

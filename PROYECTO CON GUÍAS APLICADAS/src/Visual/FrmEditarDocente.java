package Visual;

import control.AdmDocente;
import java.util.Date;
import javax.swing.JOptionPane;

public class FrmEditarDocente extends javax.swing.JDialog {
  AdmDocente adm = AdmDocente.getAdmDocente();
    
  public FrmEditarDocente(int posicion, java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    if (adm.getDocentes().size() > 0) {
      adm.editarRegistro(frmFormatDocente, posicion);
      this.setVisible(true);
    } else {
      JOptionPane.showMessageDialog(null, "NO EXISTEN DATOS");
    }
  }
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    btnEditar = new javax.swing.JButton();
    frmFormatDocente = new Visual.FrmFormatDocente();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Edicion de un Docente");

    btnEditar.setText("Editar");
    btnEditar.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEditarActionPerformed(evt);
          }
        });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 
                215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addComponent(frmFormatDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(frmFormatDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(26, 26, 26))
    );

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents
    
  public FrmFormatDocente getFrmFormatDocente() {
    return frmFormatDocente;
  }

  public void setFrmFormatDocente(FrmFormatDocente frmFormatDocente) {
    this.frmFormatDocente = frmFormatDocente;
  }

  private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_btnEditarActionPerformed
    String cedula = frmFormatDocente.getTxtCedula().getText().trim();
    String nombre = frmFormatDocente.getTxtNombre().getText().trim();
    String sexo = (String) frmFormatDocente.getCmbSexo().getSelectedItem();
    String telefono = frmFormatDocente.getTxtTelefono().getText().trim();
    String direccion = frmFormatDocente.getTxtDireccion().getText().trim();
    String materia = frmFormatDocente.getTxtMateria().getText().trim();
    String titulo = frmFormatDocente.getTxtTitulo().getText().trim();
    String facultad = frmFormatDocente.getTxtFacultad().getText().trim();
    Date fechaNac = frmFormatDocente.getDtcFechaNac().getDate();
    String contenido = "";
        
    if (adm.validarEditar(cedula, nombre, sexo, fechaNac,
        telefono, direccion, materia, titulo, facultad)) {  
      JOptionPane.showMessageDialog(null, "USUARIO EDITADO");
    } else {
      JOptionPane.showMessageDialog(null, "LLENE TODOS LOS CAMPOS");
    }
    dispose();
  } //GEN-LAST:event_btnEditarActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnEditar;
  private Visual.FrmFormatDocente frmFormatDocente;
  // End of variables declaration//GEN-END:variables
}

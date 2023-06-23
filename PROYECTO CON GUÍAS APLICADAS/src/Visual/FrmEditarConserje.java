package Visual;

import control.AdmConserje;
import java.util.Date;
import javax.swing.JOptionPane;


public class FrmEditarConserje extends javax.swing.JDialog {
  AdmConserje adm = AdmConserje.getAdmConserje();
    
  public FrmEditarConserje(int posicion, java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    if (adm.getConserjes().size() > 0) {
      adm.editarRegistro(frmFormatConserje, posicion);
      this.setVisible(true);
    } else {
      JOptionPane.showMessageDialog(null, "NO EXISTEN DATOS");
    }
  }
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    btnEditar = new javax.swing.JButton();
    frmFormatConserje = new Visual.FrmFormatConserje();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Edicion de un Conserje");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 
                206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addComponent(frmFormatConserje, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(frmFormatConserje, javax.swing.GroupLayout.PREFERRED_SIZE, 
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 
                8, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(26, 26, 26))
    );

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_btnEditarActionPerformed
    String cedula = frmFormatConserje.getTxtCedula().getText().trim();
    String nombre = frmFormatConserje.getTxtNombre().getText().trim();
    String sexo = (String) frmFormatConserje.getCmbSexo().getSelectedItem();
    String telefono = frmFormatConserje.getTxtTelefono().getText().trim();
    String direccion = frmFormatConserje.getTxtDireccion().getText().trim();
    String  turno = (String) frmFormatConserje.getCmbSexo().getSelectedItem();
    String instruccion = frmFormatConserje.getTxtInstruccion().getText().trim();
    String  sector = frmFormatConserje.getTxtSector().getText().trim();
    Date fechaNac = frmFormatConserje.getDtcFechaNac().getDate();
    Date fechaIngreso = frmFormatConserje.getDtcFechaIngreso().getDate();
        
    String contenido = "";
    if (adm.validarEditar(cedula, nombre, sexo, fechaNac, telefono, 
          direccion, instruccion, sector, turno, fechaIngreso)) {  
      JOptionPane.showMessageDialog(null, "USUARIO EDITADO");
    } else {
      JOptionPane.showMessageDialog(null, "LLENE TODOS LOS CAMPOS");
    }
    dispose();
  } //GEN-LAST:event_btnEditarActionPerformed

  public FrmFormatConserje getFrmFormatConserje() {
    return frmFormatConserje;
  }

  public void setFrmFormatConserje(FrmFormatConserje frmFormatConserje) {
    this.frmFormatConserje = frmFormatConserje;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnEditar;
  private Visual.FrmFormatConserje frmFormatConserje;
  // End of variables declaration//GEN-END:variables
}

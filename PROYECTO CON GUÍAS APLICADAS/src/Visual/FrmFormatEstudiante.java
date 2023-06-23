package Visual;

import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class FrmFormatEstudiante extends javax.swing.JPanel {
  public FrmFormatEstudiante() {
    initComponents();
    dtcFechaNac.setDate(new Date());
  }
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    jLabel2 = new javax.swing.JLabel();
    lblNombre = new javax.swing.JLabel();
    txtDireccion = new javax.swing.JTextField();
    txtNombre = new javax.swing.JTextField();
    lbSexo = new javax.swing.JLabel();
    lblFecha = new javax.swing.JLabel();
    txtCedula = new javax.swing.JTextField();
    cmbSexo = new javax.swing.JComboBox<>();
    dtcFechaNac = new com.toedter.calendar.JDateChooser();
    jLabel1 = new javax.swing.JLabel();
    txtTelefono = new javax.swing.JTextField();
    lblCedula = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    cmbCarrera = new javax.swing.JComboBox<>();
    jLabel3 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    txtMateria = new javax.swing.JTextField();
    cmbSemestre = new javax.swing.JComboBox<>();

    jLabel2.setText("Dirección:");

    lblNombre.setText("Nombre:");

    txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtNombreKeyTyped(evt);
        }
        });

    lbSexo.setText("Sexo:");

    lblFecha.setText("Fecha Nac:");

    txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtCedulaKeyTyped(evt);
      }
        });

    cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Femenino", "Masculino" }));

    jLabel1.setText("Teléfono: ");

    txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtTelefonoKeyTyped(evt);
      }
        });

    lblCedula.setText("Cedula:");

    jLabel4.setText("Carrera: ");

    cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Software", "Sistemas", "Networking", "Civil" }));

    jLabel3.setText("Semestre: ");

    jLabel5.setText("Materia:");

    cmbSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Primero", "Segundo", "Tercero", "Cuarto",
            "Quinto", "Sexto", "Séptimo", "Octavo", "Noveno", "Décimo" }));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(
                            javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCedula)
                                    .addPreferredGap(
                                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCedula, 
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 
                                    152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbSexo)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 
                                    141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(
                            javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(lblNombre)
                                    .addPreferredGap(
                                    javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombre))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 
                                    66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(
                                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dtcFechaNac, javax.swing.GroupLayout
                                    .PREFERRED_SIZE, 
                                    177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 67, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefono)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 
                            269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout
                        .PREFERRED_SIZE)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout
                        .PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment
                        .BASELINE)
                            .addComponent(lbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 
                            26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 
                            26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout
                           .PREFERRED_SIZE))
                        .addComponent(dtcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout
                        .PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(112, Short.MAX_VALUE)))
    );
  } // </editor-fold>//GEN-END:initComponents

  private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {
    //GEN-FIRST:event_txtNombreKeyTyped
    char c = evt.getKeyChar();
    if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
      evt.consume();
    }
  } //GEN-LAST:event_txtNombreKeyTyped

  private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {
    //GEN-FIRST:event_txtCedulaKeyTyped
    char c = evt.getKeyChar();
    if (!Character.isDigit(c) && !Character.isSpaceChar(c) && txtCedula.getText().length() > 10) {
      evt.consume();
    }
  } //GEN-LAST:event_txtCedulaKeyTyped

  private void txtTelefonoKeyTyped(java.awt.event.KeyEvent 
        evt) { //GEN-FIRST:event_txtTelefonoKeyTyped
    char t = evt.getKeyChar();
    if (!Character.isDigit(t) && !Character.isSpaceChar(t)) {
      evt.consume();
    }
  }  //GEN-LAST:event_txtTelefonoKeyTyped

  public JComboBox<String> getCmbSexo() {
    return cmbSexo;
  }

  public void setCmbSexo(JComboBox<String> cmbSexo) {
    this.cmbSexo = cmbSexo;
  }

  public JDateChooser getDtcFechaNac() {
    return dtcFechaNac;
  }

  public void setDtcFechaNac(JDateChooser dtcFechaNac) {
    this.dtcFechaNac = dtcFechaNac;
  }

  public JTextField getTxtCedula() {
    return txtCedula;
  }

  public void setTxtCedula(JTextField txtCedula) {
    this.txtCedula = txtCedula;
  }

  public JTextField getTxtDireccion() {
    return txtDireccion;
  }

  public void setTxtDireccion(JTextField txtDireccion) {
    this.txtDireccion = txtDireccion;
  }

  public JTextField getTxtNombre() {
    return txtNombre;
  }

  public void setTxtNombre(JTextField txtNombre) {
    this.txtNombre = txtNombre;
  }

  public JTextField getTxtTelefono() {
    return txtTelefono;
  }

  public void setTxtTelefono(JTextField txtTelefono) {
    this.txtTelefono = txtTelefono;
  }

  public JComboBox<String> getCmbCarrera() {
    return cmbCarrera;
  }

  public void setCmbCarrera(JComboBox<String> cmbCarrera) {
    this.cmbCarrera = cmbCarrera;
  }

  public JComboBox<String> getCmbSemestre() {
    return cmbSemestre;
  }

  public void setCmbSemestre(JComboBox<String> cmbSemestre) {
    this.cmbSemestre = cmbSemestre;
  }

  public JTextField getTxtMateria() {
    return txtMateria;
  }

  public void setTxtMateria(JTextField txtMateria) {
    this.txtMateria = txtMateria;
  }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> cmbCarrera;
  private javax.swing.JComboBox<String> cmbSemestre;
  private javax.swing.JComboBox<String> cmbSexo;
  private com.toedter.calendar.JDateChooser dtcFechaNac;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel lbSexo;
  private javax.swing.JLabel lblCedula;
  private javax.swing.JLabel lblFecha;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JTextField txtCedula;
  private javax.swing.JTextField txtDireccion;
  private javax.swing.JTextField txtMateria;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtTelefono;
  // End of variables declaration//GEN-END:variables
}

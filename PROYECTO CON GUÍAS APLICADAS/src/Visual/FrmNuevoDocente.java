package Visual;

import control.AdmDocente;
import java.util.Date;
import javax.swing.JOptionPane;


public class FrmNuevoDocente extends javax.swing.JDialog {
  AdmDocente adm = AdmDocente.getAdmDocente();
    
  public FrmNuevoDocente(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    dtcFechaNac.setDate(new Date());
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txtMateria = new javax.swing.JTextField();
    txtFacultad = new javax.swing.JTextField();
    txtTitulo = new javax.swing.JTextField();
    btnGuardar = new javax.swing.JButton();
    lblCedula = new javax.swing.JLabel();
    lblNombre = new javax.swing.JLabel();
    txtNombre = new javax.swing.JTextField();
    lbSexo = new javax.swing.JLabel();
    lblFecha = new javax.swing.JLabel();
    txtCedula = new javax.swing.JTextField();
    cmbSexo = new javax.swing.JComboBox<>();
    dtcFechaNac = new com.toedter.calendar.JDateChooser();
    jLabel4 = new javax.swing.JLabel();
    txtTelefono = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    txtDireccion = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Registro de Docentes");

    jLabel1.setText("Título:");

    jLabel2.setText("Materia: ");

    jLabel3.setText("Facultad: ");

    txtMateria.addKeyListener(new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtMateriaKeyTyped(evt);
      }
        });

    txtFacultad.addKeyListener(new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtFacultadKeyTyped(evt);
      }
        });

    txtTitulo.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtTituloActionPerformed(evt);
      }
        });
    txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtTituloKeyTyped(evt);
      }
        });

    btnGuardar.setText("Guardar");
    btnGuardar.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnGuardarActionPerformed(evt);
      }
        });

    lblCedula.setText("Cedula:");

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

    jLabel4.setText("Teléfono: ");

    txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtTelefonoKeyTyped(evt);
      }
        });

    jLabel5.setText("Dirección:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTitulo, javax.swing.GroupLayout
                        .PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMateria))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing
                        .GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle
                                .ComponentPlacement.UNRELATED)
                                .addComponent(txtFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 
                                265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment
                            .LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout
                                    .Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblCedula)
                                            .addPreferredGap(javax.swing.LayoutStyle
                                            .ComponentPlacement.UNRELATED)
                                            .addComponent(txtCedula, javax.swing.GroupLayout
                                            .PREFERRED_SIZE, 
                                            152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lbSexo)
                                            .addGap(18, 18, 18)
                                            .addComponent(cmbSexo, javax.swing.GroupLayout
                                            .PREFERRED_SIZE, 
                                            141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout
                                    .Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(33, 33, 33)
                                            .addComponent(lblNombre)
                                            .addPreferredGap(javax.swing.LayoutStyle
                                            .ComponentPlacement.RELATED)
                                            .addComponent(txtNombre))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(31, 31, 31)
                                            .addComponent(lblFecha, javax.swing.GroupLayout
                                            .PREFERRED_SIZE, 
                                            66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle
                                            .ComponentPlacement.UNRELATED)
                                            .addComponent(dtcFechaNac, javax.swing.GroupLayout
                                            .PREFERRED_SIZE, 177, javax.swing
                                            .GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle
                                    .ComponentPlacement.RELATED)
                                    .addComponent(txtTelefono, javax.swing
                                    .GroupLayout.PREFERRED_SIZE, 
                                    167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle
                                    .ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle
                                    .ComponentPlacement.RELATED)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout
                                    .PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout
                .PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE,
                        26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dtcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtFacultad, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnGuardar)
                .addContainerGap(39, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_btnGuardarActionPerformed
    String cedula = txtCedula.getText().trim();
    String nombre = txtNombre.getText().trim();
    String sexo = (String) cmbSexo.getSelectedItem();
    String telefono = txtTelefono.getText().trim();
    String direccion = txtDireccion.getText().trim();
    String materia = txtMateria.getText().trim();
    String titulo = txtTitulo.getText().trim();
    String facultad = txtFacultad.getText().trim();
    Date fechaNac = dtcFechaNac.getDate();
    String contenido = "";

    if (adm.validar(cedula, nombre, sexo, fechaNac, telefono, 
           direccion, materia, titulo, facultad)) {
      contenido = adm.guardar(cedula, nombre, sexo, fechaNac, 
            telefono, direccion, materia, titulo, facultad);
      //adm.llenarTabla(tblEstudiante, lblTotal);
      //adm.promedio(lblPromedio);
      JOptionPane.showMessageDialog(null, "USUARIO CREADO");
    } else {
      JOptionPane.showMessageDialog(null, "Llene los campos correctamente");
    }
  }  //GEN-LAST:event_btnGuardarActionPerformed

  private void txtTituloKeyTyped(java.awt.event.KeyEvent evt) {
    //GEN-FIRST:event_txtTituloKeyTyped
    char n = evt.getKeyChar();
    if (!Character.isLetter(n) && !Character.isSpaceChar(n)) {
      evt.consume();
    }
  } //GEN-LAST:event_txtTituloKeyTyped

  private void txtMateriaKeyTyped(java.awt.event.KeyEvent evt) {
    //GEN-FIRST:event_txtMateriaKeyTyped
    char n = evt.getKeyChar();
    if (!Character.isLetter(n) && !Character.isSpaceChar(n)) {
      evt.consume();
    }
  } //GEN-LAST:event_txtMateriaKeyTyped

  private void txtFacultadKeyTyped(java.awt.event.KeyEvent evt) {
    //GEN-FIRST:event_txtFacultadKeyTyped
    char n = evt.getKeyChar();
    if (!Character.isLetter(n) && !Character.isSpaceChar(n)) {
      evt.consume();
    }
  } //GEN-LAST:event_txtFacultadKeyTyped

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

  private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {
    //GEN-FIRST:event_txtTelefonoKeyTyped
    char t = evt.getKeyChar();
    if (!Character.isDigit(t)) {
      evt.consume();
    }
  }  //GEN-LAST:event_txtTelefonoKeyTyped

  private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
  } //GEN-LAST:event_txtTituloActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnGuardar;
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
  private javax.swing.JTextField txtFacultad;
  private javax.swing.JTextField txtMateria;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtTelefono;
  private javax.swing.JTextField txtTitulo;
  // End of variables declaration//GEN-END:variables
}

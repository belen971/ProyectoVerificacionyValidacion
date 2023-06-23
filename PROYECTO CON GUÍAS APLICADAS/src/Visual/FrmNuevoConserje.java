package Visual;

import control.AdmConserje;
import java.util.Date;
import javax.swing.JOptionPane;


class FrmNuevoConserje extends javax.swing.JDialog {
  AdmConserje adm = AdmConserje.getAdmConserje();
  
  public FrmNuevoConserje(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    dtcFechaNac.setDate(new Date());
    dtcFechaIngreso.setDate(new Date());
  }
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    btnGuardar = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();
    lblNombre = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    txtDireccion = new javax.swing.JTextField();
    txtSector = new javax.swing.JTextField();
    txtNombre = new javax.swing.JTextField();
    txtInstruccion = new javax.swing.JTextField();
    lbSexo = new javax.swing.JLabel();
    lblFecha = new javax.swing.JLabel();
    cmbSexo = new javax.swing.JComboBox<>();
    txtCedula = new javax.swing.JTextField();
    dtcFechaNac = new com.toedter.calendar.JDateChooser();
    jLabel3 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    dtcFechaIngreso = new com.toedter.calendar.JDateChooser();
    txtTelefono = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    lblCedula = new javax.swing.JLabel();
    cmbTurno = new javax.swing.JComboBox<>();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Registro de Conserjes");

    btnGuardar.setText("Guardar");
    btnGuardar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          btnGuardarActionPerformed(evt);
        }
        });

    jLabel5.setText("Instrucción: ");

    lblNombre.setText("Nombre:");

    jLabel6.setText("Sector: ");

    txtSector.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
          txtSectorKeyTyped(evt);
        }
        });

    txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
          txtNombreKeyTyped(evt);
        }
        });

    txtInstruccion.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
          txtInstruccionKeyTyped(evt);
        }
        });

    lbSexo.setText("Sexo:");

    lblFecha.setText("Fecha Nac:");

    cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(
          new String[] { "Femenino", "Masculino" }));

    txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
          txtCedulaKeyTyped(evt);
      }
        });

    jLabel3.setText("Fecha de Ingreso: ");

    jLabel1.setText("Teléfono: ");

    txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
          txtTelefonoKeyTyped(evt);
      }
        });

    jLabel4.setText("Turno: ");

    lblCedula.setText("Cedula:");

    cmbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(
            new String[] { "Matutino", "Vespertino", "Nocturno" }));

    jLabel2.setText("Dirección:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment
                        .LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout
                                .Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbSexo)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbSexo, javax.swing.GroupLayout
                                        .PREFERRED_SIZE, 
                                        141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCedula)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement
                                        .RELATED)
                                        .addComponent(txtCedula, javax.swing.GroupLayout
                                        .PREFERRED_SIZE, 
                                        152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout
                                .Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(lblNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement
                                        .RELATED)
                                        .addComponent(txtNombre))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(lblFecha, javax.swing.GroupLayout
                                        .PREFERRED_SIZE, 
                                        66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement
                                        .UNRELATED)
                                        .addComponent(dtcFechaNac, javax.swing.GroupLayout
                                        .PREFERRED_SIZE, 
                                        177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE,
                                167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement
                                .UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE,
                                269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment
                        .LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtcFechaIngreso, javax.swing.GroupLayout
                                .PREFERRED_SIZE,
                                171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInstruccion, javax.swing.GroupLayout
                                .PREFERRED_SIZE, 
                                223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment
                        .TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout
                        .Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 
                                175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtSector)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                    .createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
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
                        .addComponent(lbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, 
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout
                       .PREFERRED_SIZE))
                    .addComponent(dtcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dtcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout
                        .PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtSector, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnGuardar)
                .addContainerGap(32, Short.MAX_VALUE))
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
    String instruccion = txtInstruccion.getText().trim();
    String sector = txtSector.getText().trim();
    String turno = (String) cmbTurno.getSelectedItem();
    Date fechaNac = dtcFechaNac.getDate();
    Date fechaIngreso = dtcFechaIngreso.getDate();
    String contenido = "";
        
    if (adm.validar(cedula, nombre, sexo, fechaNac, telefono, direccion, 
            instruccion, sector, turno, fechaIngreso)) {
      contenido = adm.guardar(cedula, nombre, sexo, fechaNac, telefono, 
            direccion, instruccion, sector, turno, fechaIngreso);
      //adm.llenarTabla(tblEstudiante, lblTotal);
      //adm.promedio(lblPromedio);
      JOptionPane.showMessageDialog(null, "USUARIO CREADO");
    } else {
      JOptionPane.showMessageDialog(null, "Llene los campos correctamente");
    }
  } //GEN-LAST:event_btnGuardarActionPerformed

  private void txtSectorKeyTyped(java.awt.event.KeyEvent evt) {
    //GEN-FIRST:event_txtSectorKeyTyped
    char n = evt.getKeyChar();
    if (!Character.isLetter(n)) {
      evt.consume();
    }
  }  //GEN-LAST:event_txtSectorKeyTyped

  private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {
    //GEN-FIRST:event_txtNombreKeyTyped
    char c = evt.getKeyChar();
    if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
      evt.consume();
    }
  } //GEN-LAST:event_txtNombreKeyTyped

  private void txtInstruccionKeyTyped(java.awt.event.KeyEvent evt) {
    //GEN-FIRST:event_txtInstruccionKeyTyped
    char n = evt.getKeyChar();
    if (!Character.isLetter(n)) {
      evt.consume();
    }
  } //GEN-LAST:event_txtInstruccionKeyTyped

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
    if (!Character.isDigit(t) && !Character.isSpaceChar(t)) {
      evt.consume();
    }
  } //GEN-LAST:event_txtTelefonoKeyTyped

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnGuardar;
  private javax.swing.JComboBox<String> cmbSexo;
  private javax.swing.JComboBox<String> cmbTurno;
  private com.toedter.calendar.JDateChooser dtcFechaIngreso;
  private com.toedter.calendar.JDateChooser dtcFechaNac;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel lbSexo;
  private javax.swing.JLabel lblCedula;
  private javax.swing.JLabel lblFecha;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JTextField txtCedula;
  private javax.swing.JTextField txtDireccion;
  private javax.swing.JTextField txtInstruccion;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtSector;
  private javax.swing.JTextField txtTelefono;
  // End of variables declaration//GEN-END:variables
}

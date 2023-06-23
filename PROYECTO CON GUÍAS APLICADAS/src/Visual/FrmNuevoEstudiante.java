package Visual;

import control.AdmEstudiante;
import java.util.Date;
import javax.swing.JOptionPane;


public class FrmNuevoEstudiante extends javax.swing.JDialog {
  AdmEstudiante adm = AdmEstudiante.getAdmEstudiante();
    
  public FrmNuevoEstudiante(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    dtcFechaNac.setDate(new Date());
  }
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    lblCedula = new javax.swing.JLabel();
    lblNombre = new javax.swing.JLabel();
    txtNombre = new javax.swing.JTextField();
    lbSexo = new javax.swing.JLabel();
    lblFecha = new javax.swing.JLabel();
    btnGuardar = new javax.swing.JButton();
    txtCedula = new javax.swing.JTextField();
    cmbSexo = new javax.swing.JComboBox<>();
    dtcFechaNac = new com.toedter.calendar.JDateChooser();
    jLabel1 = new javax.swing.JLabel();
    txtTelefono = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    txtDireccion = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    cmbCarrera = new javax.swing.JComboBox<>();
    jLabel3 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    txtMateria = new javax.swing.JTextField();
    cmbSemestre = new javax.swing.JComboBox<>();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Registro de Estudiantes");

    lblCedula.setText("Cedula:");

    lblNombre.setText("Nombre:");

    txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtNombreKeyTyped(evt);
      }
        });

    lbSexo.setText("Sexo:");

    lblFecha.setText("Fecha Nac:");

    btnGuardar.setText("Guardar");
    btnGuardar.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnGuardarActionPerformed(evt);
      }
        });

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

    jLabel2.setText("Dirección:");

    jLabel4.setText("Carrera: ");

    cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(
            new String[] { "Software", "Sistemas", "Networking", "Civil" }));

    jLabel3.setText("Semestre: ");

    jLabel5.setText("Materia:");

    cmbSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(
           new String[] { "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", 
               "Sexto", "Séptimo", "Octavo", "Noveno", "Décimo" }));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle
                        .ComponentPlacement.UNRELATED)
                        .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout
                    .Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing
                            .GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCedula)
                                    .addPreferredGap(javax.swing.LayoutStyle
                                    .ComponentPlacement.UNRELATED)
                                    .addComponent(txtCedula, javax.swing.GroupLayout
                                    .PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbSexo)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 
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
                                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 
                                    66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle
                                    .ComponentPlacement.UNRELATED)
                                    .addComponent(dtcFechaNac, javax.swing.GroupLayout
                                    .PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 67, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout
                            .Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 
                                61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout
                            .Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cmbCarrera, javax.swing
                                    .GroupLayout.PREFERRED_SIZE, 
                                    201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 
                                    60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement
                                    .RELATED).addComponent(cmbSemestre, javax.swing
                                    .GroupLayout.PREFERRED_SIZE, 
                                    137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTelefono)
                                    .addPreferredGap(javax.swing.LayoutStyle
                                    .ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement
                                    .RELATED)
                                    .addComponent(txtDireccion, 
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 
                                    269, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 
                214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
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
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing
                        .GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing
                    .GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing
                    .GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(27, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {
    //GEN-FIRST:event_txtNombreKeyTyped
    char c = evt.getKeyChar();
    if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
      evt.consume();
    }
  } //GEN-LAST:event_txtNombreKeyTyped

  private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_btnGuardarActionPerformed
    String cedula = txtCedula.getText().trim();
    String nombre = txtNombre.getText().trim();
    String sexo = (String) cmbSexo.getSelectedItem();
    String telefono = txtTelefono.getText().trim();
    String direccion = txtDireccion.getText().trim();
    String carrera = (String) cmbCarrera.getSelectedItem();
    String semestre = (String) cmbSemestre.getSelectedItem();
    String materia = txtMateria.getText().trim();
    Date fechaNac = dtcFechaNac.getDate();
    String contenido = "";

    if (adm.validar(cedula, nombre, sexo, fechaNac, telefono, 
        direccion, carrera, semestre, materia)) {
      contenido = adm.guardar(cedula, nombre, sexo, fechaNac, 
            telefono, direccion, carrera, semestre, materia);
      //adm.llenarTabla(tblEstudiante, lblTotal);
      //adm.promedio(lblPromedio);
      JOptionPane.showMessageDialog(null, "USUARIO CREADO");
    } else {
      JOptionPane.showMessageDialog(null, "Llene los campos correctamente");
    }
  }  //GEN-LAST:event_btnGuardarActionPerformed

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

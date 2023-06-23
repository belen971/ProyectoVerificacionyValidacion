
package Visual;

import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class FrmFormatConserje extends javax.swing.JPanel {

  public FrmFormatConserje() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

    cmbSexo = new javax.swing.JComboBox<>();
    dtcFechaNac = new com.toedter.calendar.JDateChooser();
    jLabel1 = new javax.swing.JLabel();
    txtTelefono = new javax.swing.JTextField();
    lblCedula = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    lblNombre = new javax.swing.JLabel();
    txtDireccion = new javax.swing.JTextField();
    txtNombre = new javax.swing.JTextField();
    lbSexo = new javax.swing.JLabel();
    lblFecha = new javax.swing.JLabel();
    txtCedula = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    dtcFechaIngreso = new com.toedter.calendar.JDateChooser();
    jLabel4 = new javax.swing.JLabel();
    cmbTurno = new javax.swing.JComboBox<>();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    txtSector = new javax.swing.JTextField();
    txtInstruccion = new javax.swing.JTextField();

    cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Femenino", "Masculino" }));

    jLabel1.setText("Teléfono: ");

    txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtTelefonoKeyTyped(evt);
      }
        });

    lblCedula.setText("Cedula:");

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

    jLabel3.setText("Fecha de Ingreso: ");

    jLabel4.setText("Turno: ");

    cmbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[] { "Matutino", "Vespertino", "Nocturno" }));

    jLabel5.setText("Instrucción: ");

    jLabel6.setText("Sector: ");

    txtSector.addKeyListener(new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtSectorKeyTyped(evt);
        }
        });

    txtInstruccion.addKeyListener(new java.awt.event.KeyAdapter() {
          public void keyTyped(java.awt.event.KeyEvent evt) {
            txtInstruccionKeyTyped(evt);
        }
        });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING, 
                        false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCedula)
                                        .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCedula, 
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 152,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbSexo)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbSexo, 
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
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
                                        .addComponent(lblFecha, 
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dtcFechaNac, 
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 
                                        177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 
                                167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(
                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 
                                269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtcFechaIngreso, 
                                javax.swing.GroupLayout.PREFERRED_SIZE, 
                                136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInstruccion, 
                                javax.swing.GroupLayout.PREFERRED_SIZE, 
                                223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbTurno, 
                                javax.swing.GroupLayout.PREFERRED_SIZE, 
                                175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtSector))))
                .addContainerGap())
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
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
                    .addComponent(jLabel1)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dtcFechaIngreso, 
                    javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        javax.swing.GroupLayout.DEFAULT_SIZE, 
                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtSector, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
    );
  } // </editor-fold>                        

  private void txtTelefonoKeyTyped(
      java.awt.event.KeyEvent evt) {                                     
    char t = evt.getKeyChar();
    if (!Character.isDigit(t) && !Character.isSpaceChar(t)) {
      evt.consume();
    }
  }                                    

  private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {                                   
    char c = evt.getKeyChar();
    if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
      evt.consume();
    }
  }

  private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {                                   
    char c = evt.getKeyChar();
    if (!Character.isDigit(c) && !Character.isSpaceChar(c) && txtCedula.getText().length() > 10) {
      evt.consume();
    }
  }                                  

  private void txtSectorKeyTyped(java.awt.event.KeyEvent evt) {                                   
    char n = evt.getKeyChar();
    if (!Character.isLetter(n)) {
      evt.consume();
    }
  }                                  

  private void txtInstruccionKeyTyped(java.awt.event.KeyEvent evt) {
    char n = evt.getKeyChar();
    if (!Character.isLetter(n)) {
      evt.consume();
    }
  }                                       

  public JComboBox<String> getCmbSexo() {
    return cmbSexo;
  }

  public void setCmbSexo(JComboBox<String> cmbSexo) {
    this.cmbSexo = cmbSexo;
  }

  public JComboBox<String> getCmbTurno() {
    return cmbTurno;
  }

  public void setCmbTurno(JComboBox<String> cmbTurno) {
    this.cmbTurno = cmbTurno;
  }

  public JDateChooser getDtcFechaIngreso() {
    return dtcFechaIngreso;
  }

  public void setDtcFechaIngreso(JDateChooser dtcFechaIngreso) {
    this.dtcFechaIngreso = dtcFechaIngreso;
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

  public JTextField getTxtInstruccion() {
    return txtInstruccion;
  }

  public void setTxtInstruccion(JTextField txtInstruccion) {
    this.txtInstruccion = txtInstruccion;
  }

  public JTextField getTxtNombre() {
    return txtNombre;
  }

  public void setTxtNombre(JTextField txtNombre) {
    this.txtNombre = txtNombre;
  }

  public JTextField getTxtSector() {
    return txtSector;
  }

  public void setTxtSector(JTextField txtSector) {
    this.txtSector = txtSector;
  }

  public JTextField getTxtTelefono() {
    return txtTelefono;
  }

  public void setTxtTelefono(JTextField txtTelefono) {
    this.txtTelefono = txtTelefono;
  }


  // Variables declaration - do not modify
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
  // End of variables declaration                   
}

package Visual;

import control.AdmDocente;
import javax.swing.JOptionPane;


public class FrmEliminarDocente extends javax.swing.JDialog {
  AdmDocente adm = AdmDocente.getAdmDocente();
    
  public FrmEliminarDocente(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    if (adm.getDocentes().size() > 0) { 
      adm.llenarTabla(tblContenido, lblTotal);
      this.setVisible(true);
    } else {
      JOptionPane.showMessageDialog(null, "NO EXISTEN DATOS");
    }
  }

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    tblContenido = new javax.swing.JTable();
    btnEliminar = new javax.swing.JButton();
    jLabel7 = new javax.swing.JLabel();
    lblTotal = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Eliminar ");

    tblContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Sexo", "Fecha Nac", "Teléfono", 
                "Dirección", " Edad", "Título", "Facultad", "Materia", "Pago "
            }
        ) {
          boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false, false, false, false, false
          };

          public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
      }
        });
    jScrollPane1.setViewportView(tblContenido);

    btnEliminar.setText("Eliminar");
    btnEliminar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          btnEliminarActionPerformed(evt);
        }
        });

    jLabel7.setText("Total:");

    lblTotal.setText("________");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 
                155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 
                39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 
                58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 
                183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 
                27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 
                        14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTotal)))
                .addGap(26, 26, 26))
    );

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_btnEliminarActionPerformed
    if (adm.getDocentes().size() > 0) {
      adm.eliminarTabla(tblContenido, lblTotal);
    }
  } //GEN-LAST:event_btnEliminarActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnEliminar;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblTotal;
  private javax.swing.JTable tblContenido;
  // End of variables declaration//GEN-END:variables
}

package Visual;

import control.AdmConserje;
import javax.swing.JOptionPane;


public class FrmLeerConserje extends javax.swing.JDialog {
  AdmConserje adm = AdmConserje.getAdmConserje();

  public FrmLeerConserje(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    if (adm.abrirArchivo(txtContenido, lblTotal)) {
      this.setVisible(true);
    } else {
      JOptionPane.showMessageDialog(null, "NO HA SELECCIONADO UN ARCHIVO");
    }
  }
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    txtContenido = new javax.swing.JTextArea();
    jLabel1 = new javax.swing.JLabel();
    lblTotal = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Lectura de Conserjes");

    txtContenido.setColumns(20);
    txtContenido.setRows(5);
    jScrollPane1.setViewportView(txtContenido);

    jLabel1.setText("Total Lineas:");

    lblTotal.setText("_______");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblTotal)
                .addGap(32, 32, 32))
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 
                245, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19))
    );

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblTotal;
  private javax.swing.JTextArea txtContenido;
  // End of variables declaration//GEN-END:variables
}

package Visual;

import Control.AdmEstudiante;
import javax.swing.JOptionPane;

public class FrmVisualizarEstudiante extends javax.swing.JDialog {
    AdmEstudiante adm= AdmEstudiante.getAdmEstudiante();
    public FrmVisualizarEstudiante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        if(adm.getEstudiantes().size()>0){
            adm.VisualizarPrimero(frmFormatEstudiante);
            adm.VisualizarAtras(frmFormatEstudiante);
            adm.VisualizarSiguiente(frmFormatEstudiante);
            adm.VisualizarUltimo(frmFormatEstudiante);
            this.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "No hay datos");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSiguiente = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnPrimero = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        frmFormatEstudiante = new Visual.FrmFormatEstudiante();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualización de Estudiantes");

        btnSiguiente.setText(">>");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnAtras.setText("<<");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnPrimero.setText("|<");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnUltimo.setText(">|");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnPrimero)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtras)
                        .addGap(32, 32, 32)
                        .addComponent(btnSiguiente)
                        .addGap(18, 18, 18)
                        .addComponent(btnUltimo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(frmFormatEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(frmFormatEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUltimo)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAtras)
                    .addComponent(btnPrimero))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(adm.getEstudiantes().size()>0){
            adm.VisualizarSiguiente(frmFormatEstudiante);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if(adm.getEstudiantes().size()>0){
            adm.VisualizarAtras(frmFormatEstudiante);
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        if(adm.getEstudiantes().size()>0){
            adm.VisualizarPrimero(frmFormatEstudiante);
        }
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        if(adm.getEstudiantes().size()>0){
            adm.VisualizarUltimo(frmFormatEstudiante);
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private Visual.FrmFormatEstudiante frmFormatEstudiante;
    // End of variables declaration//GEN-END:variables
}

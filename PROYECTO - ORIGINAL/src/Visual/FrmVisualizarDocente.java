package Visual;

import Control.AdmDocente;
import javax.swing.JOptionPane;

public class FrmVisualizarDocente extends javax.swing.JDialog {
    AdmDocente adm = AdmDocente.getAdmDocente();
    public FrmVisualizarDocente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        if(adm.getDocentes().size()>0){
            adm.VisualizarPrimero(frmFormatDocente);
            adm.VisualizarAtras(frmFormatDocente);
            adm.VisualizarSiguiente(frmFormatDocente);
            adm.VisualizarUltimo(frmFormatDocente);
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
        frmFormatDocente = new Visual.FrmFormatDocente();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualización de Docentes");

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
                .addGap(157, 157, 157)
                .addComponent(btnPrimero)
                .addGap(18, 18, 18)
                .addComponent(btnAtras)
                .addGap(32, 32, 32)
                .addComponent(btnSiguiente)
                .addGap(18, 18, 18)
                .addComponent(btnUltimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(frmFormatDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(frmFormatDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUltimo)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAtras)
                    .addComponent(btnPrimero))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(adm.getDocentes().size()>0){
            adm.VisualizarSiguiente(frmFormatDocente);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        if(adm.getDocentes().size()>0){
            adm.VisualizarAtras(frmFormatDocente);
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        if(adm.getDocentes().size()>0){
            adm.VisualizarPrimero(frmFormatDocente);
        }
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        if(adm.getDocentes().size()>0){
            adm.VisualizarUltimo(frmFormatDocente);
        }
    }//GEN-LAST:event_btnUltimoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private Visual.FrmFormatDocente frmFormatDocente;
    // End of variables declaration//GEN-END:variables
}

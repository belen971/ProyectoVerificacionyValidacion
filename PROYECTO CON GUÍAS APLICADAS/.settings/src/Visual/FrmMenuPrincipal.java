
package Visual;

public class FrmMenuPrincipal extends javax.swing.JDialog {
    public FrmMenuPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniEstudiante = new javax.swing.JMenuItem();
        mniDocente = new javax.swing.JMenuItem();
        mniSecretaria = new javax.swing.JMenuItem();
        mniConserje = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("María Belén Vargas Cevallos");

        jMenu1.setText("Usuarios");

        mniEstudiante.setText("Estudiante");
        jMenu1.add(mniEstudiante);

        mniDocente.setText("Docente");
        jMenu1.add(mniDocente);

        mniSecretaria.setText("Secretaria");
        mniSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSecretariaActionPerformed(evt);
            }
        });
        jMenu1.add(mniSecretaria);

        mniConserje.setText("Conserje");
        jMenu1.add(mniConserje);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSecretariaActionPerformed
        new FrmMenu().setVisible(true);
            dispose();
    }//GEN-LAST:event_mniSecretariaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniConserje;
    private javax.swing.JMenuItem mniDocente;
    private javax.swing.JMenuItem mniEstudiante;
    private javax.swing.JMenuItem mniSecretaria;
    // End of variables declaration//GEN-END:variables
}

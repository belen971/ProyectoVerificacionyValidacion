package Visual;

import Control.AdmEstudiante;
import java.util.Date;
import javax.swing.JOptionPane;

public class FrmEditarEstudiante extends javax.swing.JDialog {
    AdmEstudiante adm = AdmEstudiante.getAdmEstudiante();
    public FrmEditarEstudiante(int posicion, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        if(adm.getEstudiantes().size()>0){
            adm.EditarRegistro(frmFormatEstudiante, posicion);
            this.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "NO EXISTEN DATOS");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditar = new javax.swing.JButton();
        frmFormatEstudiante = new Visual.FrmFormatEstudiante();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edicion de un Estudiante");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(frmFormatEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(frmFormatEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String cedula=frmFormatEstudiante.getTxtCedula().getText().trim(),
                nombre=frmFormatEstudiante.getTxtNombre().getText().trim(),
                sexo=(String)frmFormatEstudiante.getCmbSexo().getSelectedItem(),
                telefono=frmFormatEstudiante.getTxtTelefono().getText().trim(),
                direccion=frmFormatEstudiante.getTxtDireccion().getText().trim(),
                carrera=(String) frmFormatEstudiante.getCmbCarrera().getSelectedItem(),
                semestre=(String)frmFormatEstudiante.getCmbSemestre().getSelectedItem(),
                materia=frmFormatEstudiante.getTxtMateria().getText().trim();
        Date fechaNac=frmFormatEstudiante.getDtcFechaNac().getDate();
        String contenido="";
        
        if(adm.ValidarEditar(cedula, nombre, sexo, fechaNac, telefono, direccion, carrera, semestre, materia)){  
            JOptionPane.showMessageDialog(null, "USUARIO EDITADO");
        }else{
            JOptionPane.showMessageDialog(null, "LLENE TODOS LOS CAMPOS");
        }
        dispose();
    }//GEN-LAST:event_btnEditarActionPerformed
    public FrmFormatEstudiante getFrmFormat(){
        return frmFormatEstudiante;
    }
    public void setFrmFormat(FrmFormatEstudiante frmFormatEstudiante){
        this.frmFormatEstudiante = frmFormatEstudiante;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private Visual.FrmFormatEstudiante frmFormatEstudiante;
    // End of variables declaration//GEN-END:variables
}

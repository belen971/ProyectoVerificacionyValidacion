package Visual;

import Control.AdmConserje;
import Control.AdmDocente;
import Control.AdmEstudiante;
import Hilos.FrmCarrera;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrmMenu extends javax.swing.JFrame {
    AdmEstudiante admE = AdmEstudiante.getAdmEstudiante();
    AdmDocente admD = AdmDocente.getAdmDocente();
    AdmConserje admC = AdmConserje.getAdmConserje();
    public FrmMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mniFiltrar = new javax.swing.JMenu();
        mniNuevo = new javax.swing.JMenu();
        mniDocenteNuevo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniEstudianteNuevo = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniConserjeNuevo = new javax.swing.JMenuItem();
        mniEditar = new javax.swing.JMenu();
        mniDocenteEditar = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniEstudianteEditar = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniConserjeEditar = new javax.swing.JMenuItem();
        mniVisualizar = new javax.swing.JMenu();
        mniDocenteVisualizar = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mniEstudianteVisualizar = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mniConserjeVisualizar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mniEliminar = new javax.swing.JMenu();
        mniDocenteEliminar = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mniEstudianteEliminar = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mniConserjeEliminar = new javax.swing.JMenuItem();
        mniAbrir = new javax.swing.JMenu();
        mniDocenteAbrir = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        mniEstudianteAbrir = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        mniConserjeAbrir = new javax.swing.JMenuItem();
        mniGuardar = new javax.swing.JMenu();
        mniDocenteGuardar = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        mniEstudianteGuardar = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        mniConserjeGuardar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        mniLeerDocente = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        mniLeerEstudiante = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        mniLeerConserje = new javax.swing.JMenuItem();
        mniAbrirB = new javax.swing.JMenu();
        mniAbrirBDocente = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        mniAbrirBEstudiante = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        mniAbrirBConserje = new javax.swing.JMenuItem();
        mniGuardarB = new javax.swing.JMenu();
        mniGuardarBDocente = new javax.swing.JMenuItem();
        jSeparator20 = new javax.swing.JPopupMenu.Separator();
        mniGuardarBEstudiante = new javax.swing.JMenuItem();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        mniGuardarBConserje = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        mniAcercaDe = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        mniCarrera = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenu9.setText("File");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar5.add(jMenu10);

        jMenu11.setText("File");
        jMenuBar6.add(jMenu11);

        jMenu12.setText("Edit");
        jMenuBar6.add(jMenu12);

        jMenu13.setText("File");
        jMenuBar7.add(jMenu13);

        jMenu14.setText("Edit");
        jMenuBar7.add(jMenu14);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de usuarios");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hilos/usuarios.png"))); // NOI18N

        mniFiltrar.setText("Secretaria");

        mniNuevo.setText("Nuevo");

        mniDocenteNuevo.setText("Docente");
        mniDocenteNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDocenteNuevoActionPerformed(evt);
            }
        });
        mniNuevo.add(mniDocenteNuevo);
        mniNuevo.add(jSeparator2);

        mniEstudianteNuevo.setText("Estudiante");
        mniEstudianteNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEstudianteNuevoActionPerformed(evt);
            }
        });
        mniNuevo.add(mniEstudianteNuevo);
        mniNuevo.add(jSeparator3);

        mniConserjeNuevo.setText("Conserje");
        mniConserjeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConserjeNuevoActionPerformed(evt);
            }
        });
        mniNuevo.add(mniConserjeNuevo);

        mniFiltrar.add(mniNuevo);

        mniEditar.setText("Editar");

        mniDocenteEditar.setText("Docente");
        mniDocenteEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDocenteEditarActionPerformed(evt);
            }
        });
        mniEditar.add(mniDocenteEditar);
        mniEditar.add(jSeparator4);

        mniEstudianteEditar.setText("Estudiante");
        mniEstudianteEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEstudianteEditarActionPerformed(evt);
            }
        });
        mniEditar.add(mniEstudianteEditar);
        mniEditar.add(jSeparator5);

        mniConserjeEditar.setText("Conserje");
        mniConserjeEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConserjeEditarActionPerformed(evt);
            }
        });
        mniEditar.add(mniConserjeEditar);

        mniFiltrar.add(mniEditar);

        mniVisualizar.setText("Visualizar");

        mniDocenteVisualizar.setText("Docente");
        mniDocenteVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDocenteVisualizarActionPerformed(evt);
            }
        });
        mniVisualizar.add(mniDocenteVisualizar);
        mniVisualizar.add(jSeparator6);

        mniEstudianteVisualizar.setText("Estudiante");
        mniEstudianteVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEstudianteVisualizarActionPerformed(evt);
            }
        });
        mniVisualizar.add(mniEstudianteVisualizar);
        mniVisualizar.add(jSeparator7);

        mniConserjeVisualizar.setText("Conserje");
        mniConserjeVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConserjeVisualizarActionPerformed(evt);
            }
        });
        mniVisualizar.add(mniConserjeVisualizar);

        mniFiltrar.add(mniVisualizar);

        jMenuItem1.setText("Filtrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mniFiltrar.add(jMenuItem1);

        mniEliminar.setText("Eliminar");

        mniDocenteEliminar.setText("Docente");
        mniDocenteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDocenteEliminarActionPerformed(evt);
            }
        });
        mniEliminar.add(mniDocenteEliminar);
        mniEliminar.add(jSeparator8);

        mniEstudianteEliminar.setText("Estudiante");
        mniEstudianteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEstudianteEliminarActionPerformed(evt);
            }
        });
        mniEliminar.add(mniEstudianteEliminar);
        mniEliminar.add(jSeparator9);

        mniConserjeEliminar.setText("Conserje");
        mniConserjeEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConserjeEliminarActionPerformed(evt);
            }
        });
        mniEliminar.add(mniConserjeEliminar);

        mniFiltrar.add(mniEliminar);

        mniAbrir.setText("Abrir");

        mniDocenteAbrir.setText("Docente");
        mniDocenteAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDocenteAbrirActionPerformed(evt);
            }
        });
        mniAbrir.add(mniDocenteAbrir);
        mniAbrir.add(jSeparator13);

        mniEstudianteAbrir.setText("Estudiante");
        mniEstudianteAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEstudianteAbrirActionPerformed(evt);
            }
        });
        mniAbrir.add(mniEstudianteAbrir);
        mniAbrir.add(jSeparator14);

        mniConserjeAbrir.setText("Conserje");
        mniConserjeAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConserjeAbrirActionPerformed(evt);
            }
        });
        mniAbrir.add(mniConserjeAbrir);

        mniFiltrar.add(mniAbrir);

        mniGuardar.setText("Guardar");

        mniDocenteGuardar.setText("Docente");
        mniDocenteGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDocenteGuardarActionPerformed(evt);
            }
        });
        mniGuardar.add(mniDocenteGuardar);
        mniGuardar.add(jSeparator11);

        mniEstudianteGuardar.setText("Estudiante");
        mniEstudianteGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEstudianteGuardarActionPerformed(evt);
            }
        });
        mniGuardar.add(mniEstudianteGuardar);
        mniGuardar.add(jSeparator12);

        mniConserjeGuardar.setText("Conserje");
        mniConserjeGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConserjeGuardarActionPerformed(evt);
            }
        });
        mniGuardar.add(mniConserjeGuardar);

        mniFiltrar.add(mniGuardar);
        mniFiltrar.add(jSeparator1);

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        mniFiltrar.add(mniSalir);

        jMenuBar1.add(mniFiltrar);

        jMenu2.setText("Acerca de ");

        jMenu1.setText("Leer");

        mniLeerDocente.setText("Docente");
        mniLeerDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLeerDocenteActionPerformed(evt);
            }
        });
        jMenu1.add(mniLeerDocente);
        jMenu1.add(jSeparator16);

        mniLeerEstudiante.setText("Estudiante");
        mniLeerEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLeerEstudianteActionPerformed(evt);
            }
        });
        jMenu1.add(mniLeerEstudiante);
        jMenu1.add(jSeparator17);

        mniLeerConserje.setText("Conserje");
        mniLeerConserje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLeerConserjeActionPerformed(evt);
            }
        });
        jMenu1.add(mniLeerConserje);

        jMenu2.add(jMenu1);

        mniAbrirB.setText("Abrir binario");

        mniAbrirBDocente.setText("Docente");
        mniAbrirBDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAbrirBDocenteActionPerformed(evt);
            }
        });
        mniAbrirB.add(mniAbrirBDocente);
        mniAbrirB.add(jSeparator18);

        mniAbrirBEstudiante.setText("Estudiante");
        mniAbrirBEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAbrirBEstudianteActionPerformed(evt);
            }
        });
        mniAbrirB.add(mniAbrirBEstudiante);
        mniAbrirB.add(jSeparator19);

        mniAbrirBConserje.setText("Conserje");
        mniAbrirBConserje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAbrirBConserjeActionPerformed(evt);
            }
        });
        mniAbrirB.add(mniAbrirBConserje);

        jMenu2.add(mniAbrirB);

        mniGuardarB.setText("Guardar binario");

        mniGuardarBDocente.setText("Docente");
        mniGuardarBDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGuardarBDocenteActionPerformed(evt);
            }
        });
        mniGuardarB.add(mniGuardarBDocente);
        mniGuardarB.add(jSeparator20);

        mniGuardarBEstudiante.setText("Estudiante");
        mniGuardarBEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGuardarBEstudianteActionPerformed(evt);
            }
        });
        mniGuardarB.add(mniGuardarBEstudiante);
        mniGuardarB.add(jSeparator21);

        mniGuardarBConserje.setText("Conserje");
        mniGuardarBConserje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGuardarBConserjeActionPerformed(evt);
            }
        });
        mniGuardarB.add(mniGuardarBConserje);

        jMenu2.add(mniGuardarB);
        jMenu2.add(jSeparator10);

        mniAcercaDe.setText("Creado por ... ");
        mniAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAcercaDeActionPerformed(evt);
            }
        });
        jMenu2.add(mniAcercaDe);

        jMenuBar1.add(jMenu2);

        jMenu15.setText("Juego");

        mniCarrera.setText("Carrera");
        mniCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCarreraActionPerformed(evt);
            }
        });
        jMenu15.add(mniCarrera);
        jMenu15.add(jSeparator15);

        jMenuBar1.add(jMenu15);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniDocenteNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDocenteNuevoActionPerformed
        FrmNuevoDocente dialog = new FrmNuevoDocente(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniDocenteNuevoActionPerformed

    private void mniEstudianteNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEstudianteNuevoActionPerformed
        FrmNuevoEstudiante dialog = new FrmNuevoEstudiante(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniEstudianteNuevoActionPerformed

    private void mniDocenteEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDocenteEditarActionPerformed
        FrmBuscarDocente dialog = new FrmBuscarDocente(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniDocenteEditarActionPerformed

    private void mniEstudianteEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEstudianteEditarActionPerformed
        FrmBuscarEstudiante dialog = new FrmBuscarEstudiante(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniEstudianteEditarActionPerformed

    private void mniDocenteVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDocenteVisualizarActionPerformed
        FrmVisualizarDocente dialog = new FrmVisualizarDocente(this, true);
    }//GEN-LAST:event_mniDocenteVisualizarActionPerformed

    private void mniEstudianteVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEstudianteVisualizarActionPerformed
        FrmVisualizarEstudiante dialog = new FrmVisualizarEstudiante(this, true);
    }//GEN-LAST:event_mniEstudianteVisualizarActionPerformed

    private void mniDocenteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDocenteEliminarActionPerformed
        FrmEliminarDocente dialog = new FrmEliminarDocente(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_mniDocenteEliminarActionPerformed

    private void mniEstudianteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEstudianteEliminarActionPerformed
        FrmEliminarEstudiante dialog = new FrmEliminarEstudiante(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_mniEstudianteEliminarActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAcercaDeActionPerformed
        JOptionPane.showMessageDialog(null, "Creado por María Belén Vargas Cevallos"
                + "\nVersión 1.0");
    }//GEN-LAST:event_mniAcercaDeActionPerformed

    private void mniConserjeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConserjeNuevoActionPerformed
        FrmNuevoConserje dialog = new FrmNuevoConserje(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniConserjeNuevoActionPerformed

    private void mniConserjeVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConserjeVisualizarActionPerformed
        FrmVisualizarConserje dialog = new FrmVisualizarConserje(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_mniConserjeVisualizarActionPerformed

    private void mniConserjeEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConserjeEditarActionPerformed
        FrmBuscarConserje dialog = new FrmBuscarConserje(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniConserjeEditarActionPerformed

    private void mniConserjeEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConserjeEliminarActionPerformed
        FrmEliminarConserje dialog = new FrmEliminarConserje(new javax.swing.JFrame(), true);
    }//GEN-LAST:event_mniConserjeEliminarActionPerformed

    private void mniDocenteGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDocenteGuardarActionPerformed
        FrmGuardarDocente dialog = new FrmGuardarDocente(this, true);
        admD.guardarArchivoD();
    }//GEN-LAST:event_mniDocenteGuardarActionPerformed

    private void mniEstudianteGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEstudianteGuardarActionPerformed
        FrmGuardarEstudiante dialog = new FrmGuardarEstudiante(this, true);
        admE.guardarArchivoE();
    }//GEN-LAST:event_mniEstudianteGuardarActionPerformed

    private void mniConserjeGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConserjeGuardarActionPerformed
        FrmGuardarConserje dialog = new FrmGuardarConserje(this, true);
        admC.guardarArchivoC();
    }//GEN-LAST:event_mniConserjeGuardarActionPerformed

    private void mniDocenteAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDocenteAbrirActionPerformed
        FrmAbrirDocente dialog = new FrmAbrirDocente(this, true);
    }//GEN-LAST:event_mniDocenteAbrirActionPerformed

    private void mniEstudianteAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEstudianteAbrirActionPerformed
        FrmAbrirEstudiante dialog = new FrmAbrirEstudiante(this, true);
    }//GEN-LAST:event_mniEstudianteAbrirActionPerformed

    private void mniConserjeAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConserjeAbrirActionPerformed
        FrmAbrirConserje dialog = new FrmAbrirConserje(this, true);
    }//GEN-LAST:event_mniConserjeAbrirActionPerformed

    private void mniCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCarreraActionPerformed
        FrmCarrera dialog = new FrmCarrera(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniCarreraActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmFiltrar dialog = new FrmFiltrar(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mniAbrirBEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAbrirBEstudianteActionPerformed
        FrmAbrirBEstudiante dialog = new FrmAbrirBEstudiante(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniAbrirBEstudianteActionPerformed

    private void mniAbrirBDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAbrirBDocenteActionPerformed
        FrmAbrirBDocente dialog = null;
        try {
            dialog = new FrmAbrirBDocente(new javax.swing.JFrame(), true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        dialog.setVisible(true);
    }//GEN-LAST:event_mniAbrirBDocenteActionPerformed

    private void mniAbrirBConserjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAbrirBConserjeActionPerformed
        FrmAbrirBConserje dialog = null;
        try {
            dialog = new FrmAbrirBConserje(new javax.swing.JFrame(), true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        dialog.setVisible(true);
    }//GEN-LAST:event_mniAbrirBConserjeActionPerformed

    private void mniLeerDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLeerDocenteActionPerformed
        FrmLeerDocente dialog = new FrmLeerDocente(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniLeerDocenteActionPerformed

    private void mniLeerEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLeerEstudianteActionPerformed
        FrmLeerEstudiante dialog = new FrmLeerEstudiante(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniLeerEstudianteActionPerformed

    private void mniLeerConserjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLeerConserjeActionPerformed
        FrmLeerConserje dialog = new FrmLeerConserje(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniLeerConserjeActionPerformed

    private void mniGuardarBDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGuardarBDocenteActionPerformed
        FrmGuardarBDocente dialog = new FrmGuardarBDocente(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniGuardarBDocenteActionPerformed

    private void mniGuardarBConserjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGuardarBConserjeActionPerformed
        FrmGuardarBConserje dialog = new FrmGuardarBConserje(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniGuardarBConserjeActionPerformed

    private void mniGuardarBEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGuardarBEstudianteActionPerformed
        FrmGuardarBEstudiante dialog = new FrmGuardarBEstudiante(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_mniGuardarBEstudianteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenu mniAbrir;
    private javax.swing.JMenu mniAbrirB;
    private javax.swing.JMenuItem mniAbrirBConserje;
    private javax.swing.JMenuItem mniAbrirBDocente;
    private javax.swing.JMenuItem mniAbrirBEstudiante;
    private javax.swing.JMenuItem mniAcercaDe;
    private javax.swing.JMenuItem mniCarrera;
    private javax.swing.JMenuItem mniConserjeAbrir;
    private javax.swing.JMenuItem mniConserjeEditar;
    private javax.swing.JMenuItem mniConserjeEliminar;
    private javax.swing.JMenuItem mniConserjeGuardar;
    private javax.swing.JMenuItem mniConserjeNuevo;
    private javax.swing.JMenuItem mniConserjeVisualizar;
    private javax.swing.JMenuItem mniDocenteAbrir;
    private javax.swing.JMenuItem mniDocenteEditar;
    private javax.swing.JMenuItem mniDocenteEliminar;
    private javax.swing.JMenuItem mniDocenteGuardar;
    private javax.swing.JMenuItem mniDocenteNuevo;
    private javax.swing.JMenuItem mniDocenteVisualizar;
    private javax.swing.JMenu mniEditar;
    private javax.swing.JMenu mniEliminar;
    private javax.swing.JMenuItem mniEstudianteAbrir;
    private javax.swing.JMenuItem mniEstudianteEditar;
    private javax.swing.JMenuItem mniEstudianteEliminar;
    private javax.swing.JMenuItem mniEstudianteGuardar;
    private javax.swing.JMenuItem mniEstudianteNuevo;
    private javax.swing.JMenuItem mniEstudianteVisualizar;
    private javax.swing.JMenu mniFiltrar;
    private javax.swing.JMenu mniGuardar;
    private javax.swing.JMenu mniGuardarB;
    private javax.swing.JMenuItem mniGuardarBConserje;
    private javax.swing.JMenuItem mniGuardarBDocente;
    private javax.swing.JMenuItem mniGuardarBEstudiante;
    private javax.swing.JMenuItem mniLeerConserje;
    private javax.swing.JMenuItem mniLeerDocente;
    private javax.swing.JMenuItem mniLeerEstudiante;
    private javax.swing.JMenu mniNuevo;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenu mniVisualizar;
    // End of variables declaration//GEN-END:variables
}

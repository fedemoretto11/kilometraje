package com.moretto.kilometraje.igu;

import java.awt.Dimension;
import javax.swing.JFrame;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnAgregarRegistro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnAgregarVehiculo = new javax.swing.JMenuItem();
        btnModificarEliminarVehiculo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnAgregarEmpleado = new javax.swing.JMenuItem();
        btnModificarEliminarEmpleado = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnReporteEmpleado = new javax.swing.JMenuItem();
        btnReporteVehiculo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1520, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 826, Short.MAX_VALUE)
        );

        jMenu1.setText("Registros");

        btnAgregarRegistro.setText("Agregar");
        btnAgregarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(btnAgregarRegistro);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Vehiculos");

        btnAgregarVehiculo.setText("Agregar");
        btnAgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVehiculoActionPerformed(evt);
            }
        });
        jMenu2.add(btnAgregarVehiculo);

        btnModificarEliminarVehiculo.setText("Modificar / Eliminar");
        btnModificarEliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEliminarVehiculoActionPerformed(evt);
            }
        });
        jMenu2.add(btnModificarEliminarVehiculo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Empleados");

        btnAgregarEmpleado.setText("Agregar");
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });
        jMenu3.add(btnAgregarEmpleado);

        btnModificarEliminarEmpleado.setText("Modficar / Eliminar");
        btnModificarEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEliminarEmpleadoActionPerformed(evt);
            }
        });
        jMenu3.add(btnModificarEliminarEmpleado);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reportes");

        btnReporteEmpleado.setText("Por Empleado");
        btnReporteEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteEmpleadoActionPerformed(evt);
            }
        });
        jMenu4.add(btnReporteEmpleado);

        btnReporteVehiculo.setText("Por Vehiculo");
        btnReporteVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteVehiculoActionPerformed(evt);
            }
        });
        jMenu4.add(btnReporteVehiculo);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRegistroActionPerformed
        // TODO add your handling code here:
        AgregarRegistro agregarRegistro = new AgregarRegistro();
        agregarRegistro.setVisible(true);
        agregarRegistro.setLocationRelativeTo(this);
        agregarRegistro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        agregarRegistro.setTitle("Agregar Registro");
        
    }//GEN-LAST:event_btnAgregarRegistroActionPerformed

    private void btnAgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVehiculoActionPerformed
        // TODO add your handling code here:
        AgregarVehiculo agregarVehiculo = new AgregarVehiculo();
        agregarVehiculo.setVisible(true);
        agregarVehiculo.setLocationRelativeTo(this);
        agregarVehiculo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        agregarVehiculo.setTitle("Agregar Vehiculo");
    }//GEN-LAST:event_btnAgregarVehiculoActionPerformed

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        // TODO add your handling code here:
        AgregarEmpleado agregarEmpleado = new AgregarEmpleado();
        agregarEmpleado.setVisible(true);
        agregarEmpleado.setLocationRelativeTo(this);
        agregarEmpleado.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        agregarEmpleado.setTitle("Agregar Empleado");
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btnModificarEliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEliminarVehiculoActionPerformed
        // TODO add your handling code here:
        ModificarEliminarVehiculo modificarEliminarVehiculo = new ModificarEliminarVehiculo();
        modificarEliminarVehiculo.setVisible(true);
        modificarEliminarVehiculo.setLocationRelativeTo(this);
        modificarEliminarVehiculo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        modificarEliminarVehiculo.setTitle("Modificar / Eliminar Vehiculo");
    }//GEN-LAST:event_btnModificarEliminarVehiculoActionPerformed

    private void btnModificarEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEliminarEmpleadoActionPerformed
        // TODO add your handling code here:
        ModificarEliminarEmpleado modificarEliminarEmpleado = new ModificarEliminarEmpleado();
        modificarEliminarEmpleado.setVisible(true);
        modificarEliminarEmpleado.setLocationRelativeTo(this);
        modificarEliminarEmpleado.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        modificarEliminarEmpleado.setTitle("Modificar / Eliminar Empleado");
    }//GEN-LAST:event_btnModificarEliminarEmpleadoActionPerformed

    private void btnReporteEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteEmpleadoActionPerformed
        // TODO add your handling code here:
        ReportesPorEmpleado reportes = new ReportesPorEmpleado();
        reportes.setVisible(true);
        reportes.setLocationRelativeTo(this);
        reportes.setMinimumSize(new Dimension(1300,797));
        reportes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        reportes.setTitle("Reportes");

    }//GEN-LAST:event_btnReporteEmpleadoActionPerformed

    private void btnReporteVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteVehiculoActionPerformed
        // TODO add your handling code here:
        ReportesPorVehiculo reportesVehiculo = new ReportesPorVehiculo();
        reportesVehiculo.setVisible(true);
        reportesVehiculo.setLocationRelativeTo(this);
        reportesVehiculo.setMinimumSize(new Dimension(1300,797));
        reportesVehiculo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        reportesVehiculo.setTitle("Reportes");
        
    }//GEN-LAST:event_btnReporteVehiculoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAgregarEmpleado;
    private javax.swing.JMenuItem btnAgregarRegistro;
    private javax.swing.JMenuItem btnAgregarVehiculo;
    private javax.swing.JMenuItem btnModificarEliminarEmpleado;
    private javax.swing.JMenuItem btnModificarEliminarVehiculo;
    private javax.swing.JMenuItem btnReporteEmpleado;
    private javax.swing.JMenuItem btnReporteVehiculo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

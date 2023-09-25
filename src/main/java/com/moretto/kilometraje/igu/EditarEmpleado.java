package com.moretto.kilometraje.igu;

import com.moretto.kilometraje.entidades.Empleado;
import com.moretto.kilometraje.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class EditarEmpleado extends javax.swing.JFrame {

    Controladora controladora = null;
    Empleado empleadoEdicion = null;
    
    public EditarEmpleado(Empleado empleado) {
        controladora = new Controladora();
        empleadoEdicion = empleado;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panePatente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputDni = new javax.swing.JTextField();
        panelMarca = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        panelModelo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        inputApellido = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setPreferredSize(new java.awt.Dimension(1195, 745));

        titulo.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 36)); // NOI18N
        titulo.setText("Editar Empleado");

        panePatente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel2.setText("Ingrese el DNI: ");

        inputDni.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        inputDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panePatenteLayout = new javax.swing.GroupLayout(panePatente);
        panePatente.setLayout(panePatenteLayout);
        panePatenteLayout.setHorizontalGroup(
            panePatenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panePatenteLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(inputDni, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panePatenteLayout.setVerticalGroup(
            panePatenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panePatenteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panePatenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputDni, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelMarca.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel3.setText("Ingrese el nombre: ");

        inputNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        inputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNombreActionPerformed(evt);
            }
        });
        inputNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputNombreKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelMarcaLayout = new javax.swing.GroupLayout(panelMarca);
        panelMarca.setLayout(panelMarcaLayout);
        panelMarcaLayout.setHorizontalGroup(
            panelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcaLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMarcaLayout.setVerticalGroup(
            panelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelModelo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel4.setText("Ingrese el apellido: ");

        inputApellido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        inputApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputApellidoActionPerformed(evt);
            }
        });
        inputApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputApellidoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelModeloLayout = new javax.swing.GroupLayout(panelModelo);
        panelModelo.setLayout(panelModeloLayout);
        panelModeloLayout.setHorizontalGroup(
            panelModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModeloLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(inputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelModeloLayout.setVerticalGroup(
            panelModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModeloLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        btnGuardar.setText("EDITAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/escoba.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volver.png"))); // NOI18N
        jButton3.setText("VOLVER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panePatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(179, 179, 179))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(panePatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1183, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void inputApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputApellidoActionPerformed

    private void inputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNombreActionPerformed

    private void inputDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDniActionPerformed

    private void inputNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNombreKeyReleased
        // TODO add your handling code here:
        inputNombre.setText(inputNombre.getText().toUpperCase());
    }//GEN-LAST:event_inputNombreKeyReleased

    private void inputApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputApellidoKeyReleased
        // TODO add your handling code here:
        inputApellido.setText(inputApellido.getText().toUpperCase());
    }//GEN-LAST:event_inputApellidoKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try {
            Integer dni = Integer.parseInt(inputDni.getText());
            String nombre = inputNombre.getText();
            String apellido = inputApellido.getText();
            
            if (confirmarEntrada("Desea guardar el cambio en el empleado", "Confirmar") == 1) {
                if(controladora.buscarEmpleado(dni) != null) {
                    controladora.editarEmpleado(dni, nombre, apellido);
                    mostrarMensaje("Empleado editado con exito", "Info", "Guardado exitoso");
                    limparCampos();
                } else {
                     mostrarMensaje("Error al editar el empleado solicitado", "Error", "Error al cargar");
                }
                
            }
        } catch (Exception e) {
            mostrarMensaje("Error al cargar, verifique los campos", "Error", "Error al cargar");
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        completarCampos(empleadoEdicion);
    }//GEN-LAST:event_formWindowOpened

    
    
    
    private void completarCampos(Empleado empleado) {
        inputDni.setText(empleado.getDni().toString());
        inputNombre.setText(empleado.getNombre());
        inputApellido.setText(empleado.getApellido());
    }
    
    private void limparCampos() {
        inputApellido.setText("");
        inputDni.setText("");
        inputNombre.setText("");
    }

    private void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    private Integer confirmarEntrada(String mensaje, String titulo) {
        Object [] opciones = {"Si", "No"};
        JOptionPane optionPane = new JOptionPane(mensaje);
        optionPane.setOptionType(JOptionPane.YES_NO_OPTION);
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        optionPane.setOptions(opciones);
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
        Object valorSeleccionado = optionPane.getValue();
        if(valorSeleccionado != null) {
            if(valorSeleccionado.toString().equals("Si")) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField inputApellido;
    private javax.swing.JTextField inputDni;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panePatente;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelMarca;
    private javax.swing.JPanel panelModelo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    
}
